package com.studentenrollment.details.exception;

public class NoCourseEnrolledException extends RuntimeException 
{
    public NoCourseEnrolledException() 
    {
        super("No courses enrolled");
    }
}
