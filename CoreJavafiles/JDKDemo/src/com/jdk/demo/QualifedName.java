package com.jdk.demo;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import java.lang.reflect.*;

class Student {
	private String name;
	private int rollNo;

	public String getName() {
		return name;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
}

public class QualifedName {
	public static void main(String args[]) {
		QualifedName s = new QualifedName();
		Class<? extends QualifedName> c = s.getClass();
		System.out.println(c.getName());
		Method[] m = c.getDeclaredMethods();
		for (int i = 0; i < m.length; i++)
			System.out.println(m[i]);
		Field[] f = c.getDeclaredFields();
		for (int i = 0; i < f.length; i++)
			System.out.println(f[i]);
	}
}