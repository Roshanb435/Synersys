package com.studentenrollment.details.controller;

import java.util.*;

import org.springframework.web.bind.annotation.*;

import com.studentenrollment.details.dao.UniversityDAO;
import com.studentenrollment.details.model.Course;
import com.studentenrollment.details.model.EnrollmentRequest;
import com.studentenrollment.details.model.Student;

@RestController
@RequestMapping("/university")
public class UniversityController {

    private final UniversityDAO dao = new UniversityDAO();

    @GetMapping("/courses")
    public List<Course> viewCourses() throws Exception 
    {
        return dao.fetchAllCourses();
    }

    @PostMapping("/register")
    public String register(@RequestBody EnrollmentRequest req) throws Exception {
        Student student = req.getStudent();
        List<Course> allCourses = dao.fetchAllCourses();

        List<Course> selectedCourses = new ArrayList<>();
        Map<Course, List<Integer>> courseGrades = new HashMap<>();

        for (EnrollmentRequest.CourseGrade cg : req.getCourses()) 
        {
            for (Course c : allCourses) 
            {
                if (c.getCourseId() == cg.getCourseId()) 
                {
                    selectedCourses.add(c);
                    courseGrades.put(c,List.of(cg.getGrade()));
                }
            }
        }

        Map<Student, List<Course>> studentCourseMap = new HashMap<>();
        studentCourseMap.put(student, selectedCourses);
        dao.saveStudent(student);
        dao.saveEnrollments(studentCourseMap, courseGrades);

        return "Student Registered and Enrolled Successfully";
    }

    @GetMapping("/report/{id}")
    public String report(@PathVariable int id) throws Exception 
    {
        return dao.getReport(id);
    }
}
