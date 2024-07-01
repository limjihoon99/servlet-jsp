package com.beyond.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

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
//		System.out.println(request.getContextPath());
//		System.out.println(request.getServletPath());
//		System.out.println(request.getServerName());
//		System.out.println(request.getServerPort());
//		System.out.println(request.getRemoteAddr());
		
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();		
		
		out.write("<!DOCTYPE html>");
		out.write("<html>");
		out.write("<body>");
		out.write("<h1>두 번째 서블릿이 반환한 내용</h1>");
		out.write("<p>현재 시간 : " + LocalDateTime.now().toString() + "</p>");
		out.write("</body>");
		out.write("</html>");		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
