package com.beyond.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// @WebServlet("/second.do")
//@WebServlet(name = "second", urlPatterns = "/second.do")
@WebServlet(name = "second", urlPatterns = {"/second.do", "/second2.do"})
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SecondServlet() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}
}