package com.studentenrollment.details.model;

import java.util.Objects;

public class Course implements Comparable<Course> {

    private int courseId;
    private String courseName;
    private int credits;

    public int getCourseId() {
		return courseId;
	}



	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}



	public String getCourseName() {
		return courseName;
	}



	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}



	public int getCredits() {
		return credits;
	}



	public void setCredits(int credits) {
		this.credits = credits;
	}



	@Override
	public int hashCode() {
		return Objects.hash(courseId, courseName, credits);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return courseId == other.courseId && Objects.equals(courseName, other.courseName) && credits == other.credits;
	}



	@Override
    public int compareTo(Course c) {
        return this.credits - c.credits;
    }
}
