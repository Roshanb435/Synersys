package com.studentenrollment.details.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
import java.util.stream.IntStream;

import com.studentenrollment.details.model.Course;
import com.studentenrollment.details.model.Student;

public class UniversityDAO {

    public List<Course> fetchAllCourses() throws Exception 
    {
        List<Course> list = new ArrayList<>();
        Connection con = DBUtil.getConnection();
        PreparedStatement ps = con.prepareStatement("select * FROM course");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Course c = new Course();
            c.setCourseId(rs.getInt("course_id"));
            c.setCourseName(rs.getString("course_name"));
            c.setCredits(rs.getInt("credits"));
            list.add(c);
        }
        return list;
    }

    public void saveStudent(Student s) throws Exception 
    {
        Connection con = DBUtil.getConnection();
        PreparedStatement check =con.prepareStatement("select student_id from student where student_id=?");
        check.setInt(1, s.getStudentId());
        ResultSet rs = check.executeQuery();
        if (!rs.next()) {
            PreparedStatement ps =
                con.prepareStatement("insert into student values (?,?)");
            ps.setInt(1, s.getStudentId());
            ps.setString(2, s.getStudentName());
            ps.executeUpdate();
        }

    }

    public void saveEnrollments(Map<Student, List<Course>> studentCourses,Map<Course, List<Integer>> courseGrades ) throws Exception 
    {
    	
        Connection con = DBUtil.getConnection();
        for (Map.Entry<Student, List<Course>> entry : studentCourses.entrySet()) 
        {
            Student s = entry.getKey();
            for (Course c : entry.getValue()) 
            {
                int grade = courseGrades.get(c).get(0);
                PreparedStatement ps = con.prepareStatement("insert into enrollment values (?,?,?)");
                ps.setInt(1, s.getStudentId());
                ps.setInt(2, c.getCourseId());
                ps.setInt(3, grade);
                ps.executeUpdate();
            }
        }
     
    }

    public String getReport(int studentId) throws Exception 
    {

        Connection con = DBUtil.getConnection();
        PreparedStatement ps =
            con.prepareStatement(
                """
                select c.credits, e.grade, s.student_name
                from student s
                join enrollment e on s.student_id = e.student_id
                join course c on e.course_id = c.course_id
                where s.student_id = ?
                """
            );
        ps.setInt(1, studentId);

        ResultSet rs = ps.executeQuery();

        List<Integer> credits = new ArrayList<>();
        List<Integer> grades = new ArrayList<>();
        String name = "";

        while (rs.next()) {
            name = rs.getString(3);
            credits.add(rs.getInt(1));
            grades.add(rs.getInt(2));
        }
        con.close();

        if (grades.isEmpty()) {
            return "No courses enrolled for this student";
        }

        int totalCredits =
            credits.stream().mapToInt(i -> i).sum();

        double weightedSum = 0;
        for (int i = 0; i < grades.size(); i++) {
            weightedSum += grades.get(i) * credits.get(i);
        }

        double cgpa = weightedSum / totalCredits;

        return """
        Student Name: %s
        Courses Enrolled: %d
        Total Credits: %d
        Calculated GPA: %.2f
        """.formatted(name,grades.size(),totalCredits,cgpa);
    }

}
