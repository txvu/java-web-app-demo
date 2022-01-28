package com.example.java_web_app_demo;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "NameServlet", value = "/name")
public class NameServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// Sample link: http://localhost:8082/name?firstName=Isaac&lastName=Vu&age=29

		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String age = request.getParameter("age");

		//		if (firstName == null || lastName == null) {
		//			System.out.println("A full name was not provided");
		//		} else {
		//			System.out.println("Hello " + firstName + " " + lastName);
		//		}

		StringBuilder error = new StringBuilder();

		if (firstName == null)
		{
			error.append("A first name as not provided");
		}
		else if (lastName == null)
		{
			error.append("A last name was not provided");
		}
		else if (age == null)
		{
			error.append(" Age was not provided");
		}

		if (error.length() > 0)
		{
			request.setAttribute("error", error.toString());
		} else {
			request.setAttribute("firstName", firstName);
			request.setAttribute("lastName", lastName);
			request.setAttribute("age", age);
		}

		getServletContext().getRequestDispatcher("/name.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
	}
}
