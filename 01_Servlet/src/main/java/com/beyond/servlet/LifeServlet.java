package com.beyond.servlet;

import java.io.IOException;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/life.do")
public class LifeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LifeServlet() {
    	System.out.println("LifeServlet 생성");
    	
    }     
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init() - 호출");
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("service() - 호출");
		
		// 요청 방식에 따라 doGet(), doPost() 메소드 호출
		super.service(request, response);
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet() - 호출");
	}

    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	System.out.println("doPost() - 호출");
	}

	@Override
	public void destroy() {
		System.out.println("destroy() - 호출");
	}
}