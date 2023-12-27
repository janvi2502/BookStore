package com.bookstore.controller.admin.user;

import java.io.IOException;

import com.bookstore.controller.BaseServlet;
import com.bookstore.service.UserServices;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/admin/create_user")
public class CreateUserServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		UserServices userServices = new UserServices(entityManager, request,response);
		userServices.createUser();
	}


}
