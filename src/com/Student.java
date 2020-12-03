package com;

import java.util.Scanner;

class Student {
	public void toshow() {
		String name;							//学生的姓名	
		int num;							    //学生的学号
		String sex;							    //学生的性别
		int age;								//学生的年龄
		String grade;							//学生的班级
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("姓名：");
	    name=sc.next();
		System.out.println("编号：");
	    num=sc.nextInt();
		System.out.println("性别：");
	    sex=sc.next();
		System.out.println("年龄");
	    age=sc.nextInt();
		System.out.println("班级：");
	    grade=sc.next();

	   
	    System.out.println("姓名："+name+"编号："+num+"性别："+sex+"年龄："+age+"班级："+grade);
	
		
	}
	
}
