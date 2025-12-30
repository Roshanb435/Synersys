package com.exceptions1;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileNotFoundDemo {

	public static void main(String[] args) {
		try {
		FileOutputStream fout=new FileOutputStream("C://Users/Bonagiri Roshan/Desktop/Work/demo.txt");
		System.out.println("file is created");
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		finally {
			System.out.println("Main end");
		}
		

	}

}
