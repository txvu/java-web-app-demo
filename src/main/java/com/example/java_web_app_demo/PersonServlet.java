package com.example.java_web_app_demo;

import com.example.java_web_app_demo.model.Person;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "PersonServlet", value = "/person")
public class PersonServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// Sample link: localhost:8082/person?firstName=Isaac&lastName=Vu&age=29

		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String age = request.getParameter("age");

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
			request.setAttribute("person", new Person());
		}
		else
		{
			request.setAttribute("person", new Person(firstName, lastName, Integer.parseInt(age)));
		}

		getServletContext().getRequestDispatcher("/name.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{

	}
}
