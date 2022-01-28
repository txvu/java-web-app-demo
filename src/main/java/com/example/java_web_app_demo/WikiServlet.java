package com.example.java_web_app_demo;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "WikiServlet", value = { "/wiki", "/banana" })
public class WikiServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
//		getServletContext().getRequestDispatcher("/wiki.jsp").forward(request, response);
		getServletContext().getRequestDispatcher("/banana.html").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{

	}
}
