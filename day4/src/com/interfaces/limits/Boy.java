package com.interfaces.limits;

public class Boy implements Games,Test,Girl {
				void hello(){
					System.out.println("Hello from boy");
							}

@Override
			public void maths() {
					System.out.println("maths pass");
								}


@Override
			public void pass() {
					System.out.println("Girl pass all subjects");
								}	

@Override
			public void volleyball() {
					System.out.println("Volleyball Qualified");
									}
		public static void main(String []args)
			{
				Boy b= new Boy();
				b.hello();
				b.volleyball();
				Games.badminton();
				b.maths();
				Test.social();
				b.pass();
				Girl.play();


			}


}
