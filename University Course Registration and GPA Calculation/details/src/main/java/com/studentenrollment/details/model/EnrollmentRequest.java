package com.studentenrollment.details.model;

import java.util.List;

public class EnrollmentRequest {

    private Student student;
    private List<CourseGrade> courses;

    public Student getStudent() {
		return student;
	}



	public void setStudent(Student student) {
		this.student = student;
	}



	public List<CourseGrade> getCourses() {
		return courses;
	}



	public void setCourses(List<CourseGrade> courses) {
		this.courses = courses;
	}



	public static class CourseGrade {
        private int courseId;
        private int grade;
		public int getCourseId() {
			return courseId;
		}
		public void setCourseId(int courseId) {
			this.courseId = courseId;
		}
		public int getGrade() {
			return grade;
		}
		public void setGrade(int grade) {
			this.grade = grade;
		}


    }
}
