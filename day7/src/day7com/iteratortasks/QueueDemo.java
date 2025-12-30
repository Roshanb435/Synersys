package day7com.iteratortasks;

import java.util.*;

public class QueueDemo {
	
	public static void main(String[] args) 
	{
		Queue<String> q= new PriorityQueue<>();
		q.offer("Roshan");
		q.offer("RR");
		q.poll();
		q.peek();
		System.out.println(q);
		Deque<String> q1=new ArrayDeque<>();
		q1.offer("RPsj");
		System.out.println(q1);
		
	
	}
}
