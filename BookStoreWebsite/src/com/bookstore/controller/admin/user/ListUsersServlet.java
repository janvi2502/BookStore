package com.bookstore.controller.admin.user;

import java.io.IOException;

import com.bookstore.controller.admin.BaseServlet;
import com.bookstore.service.UserServices;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/admin/list_users")
public class ListUsersServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

    public ListUsersServlet() {
    	super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserServices userServices = new UserServices(entityManager, request, response);
		userServices.listUser();
	}

}
