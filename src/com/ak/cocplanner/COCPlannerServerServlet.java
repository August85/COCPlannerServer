package com.ak.cocplanner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ak.model.User;

@SuppressWarnings("serial")
public class COCPlannerServerServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		User user1 = new User("abhimanyu", "august");
		User user2 = new User("avinash", "archer");
		User user3 = new User("anoop", "ace");
		User user4 = new User("vishnu", "colorlessking");
		User user5 = new User("kava", "bawa");
		User user6 = new User("siddesh", "sid");
		User user7 = new User("onkar", "onkar");
		User user8 = new User("kelaboy", "prasanna");
		User user9 = new User("prasad", "luffy");
		User user10 = new User("suraj", "dracosura");
		List<User> userList = new ArrayList<User>();
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		userList.add(user4);
		userList.add(user5);
		userList.add(user6);
		userList.add(user7);
		userList.add(user8);
		userList.add(user9);
		userList.add(user10);
		resp.getWriter().println(userList.toString());
	}
}
