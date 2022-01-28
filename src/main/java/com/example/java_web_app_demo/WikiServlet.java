package com.example.java_web_app_demo;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "WikiServlet", value = { "/wiki", "/banana", "/google" })
public class WikiServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
//		getServletContext().getRequestDispatcher("/wiki.jsp").forward(request, response); // direct to file

//		getServletContext().getRequestDispatcher("/secondary").forward(request, response); // direct to servlet
		response.sendRedirect("/secondary"); // direct to servlet - actually change the url

//		response.sendRedirect("https://google.com"); // direct tp external website
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{

	}
}
