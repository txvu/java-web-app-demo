package com.example.java_web_app_demo.model;

// POJO: plain old java object
// Java Bean

// 1. Implements Serializable
// 2. No arg constructor
// 3. Private members with getter and getters


import java.io.Serializable;

public class Person implements Serializable
{
	private String firstName;
	private String lastName;
	private int age;

	public Person() {
		this.firstName = "Unknown";
		this.lastName = "Unknown";
		this.age = 0;
	}

	public Person(String firstName, String lastName, int age)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getFirstName()
	{
		return firstName;
	}
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
}
