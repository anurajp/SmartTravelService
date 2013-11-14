package com.nomads.smarttravel;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.nomads.smarttravel.controller.UserManager;
import com.nomads.smarttravel.controller.UserManagerImpl;
import com.nomads.smarttravel.model.User;


@SuppressWarnings("serial")
public class AddOrUpdateUserServlet extends HttpServlet {
	private UserManager userManager = new UserManagerImpl();
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		String userJson = (String) req.getAttribute("userJson");
		User user = new Gson().fromJson(userJson, User.class);
		userManager.addOrUpdateUser(user);
	}
}