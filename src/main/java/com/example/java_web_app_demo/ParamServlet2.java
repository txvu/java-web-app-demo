package com.example.java_web_app_demo;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "ParamServlet2", value = "/param2", initParams = {@WebInitParam(name = "copyrightYear", value = "2012")})
public class ParamServlet2 extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String copyrightYear = getServletConfig().getInitParameter("copyrightYear");

		if (copyrightYear != null) {
			System.out.println(copyrightYear);
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{

	}
}
