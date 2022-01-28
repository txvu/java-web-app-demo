package com.example.java_web_app_demo;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;

public class ParamServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String copyrightYear = getServletConfig().getInitParameter("copyRightYear");

		if (copyrightYear != null) {
			System.out.println(copyrightYear);
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{

	}
}
