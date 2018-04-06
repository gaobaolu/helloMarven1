/**
 * 
 */
package com.gbl.helloMarven1;

/**
 * @author gbl
 *
 */
public class Student {
	
	String name;
	String address;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}



	/**
	 * 
	 */
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public String sayHello()
	{
		return "HelloWorld";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        System.out.println(new Student().sayHello());		
	}

}
