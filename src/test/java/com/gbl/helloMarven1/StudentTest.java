package com.gbl.helloMarven1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StudentTest {

	public StudentTest() {
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void testSayHello()
	{
		System.out.println("hello");
		Student stu = new Student();
		String str = stu.sayHello();
		assertEquals("HelloWorld",str);
	}

}
