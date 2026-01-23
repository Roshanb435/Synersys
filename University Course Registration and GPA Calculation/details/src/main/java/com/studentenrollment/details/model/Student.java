package com.studentenrollment.details.model;

import java.util.Objects;

public class Student {
    private int studentId;
    private String studentName;
    
    
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	@Override
	public int hashCode() {
		return Objects.hash(studentId, studentName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return studentId == other.studentId && Objects.equals(studentName, other.studentName);
	}
    
}
