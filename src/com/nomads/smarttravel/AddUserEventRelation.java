/**
 * 
 */
package com.nomads.smarttravel;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nomads.smarttravel.controller.ActivityManager;
import com.nomads.smarttravel.controller.ActivityManagerImpl;
import com.nomads.smarttravel.model.Action;

/**
 * @author anurajp
 *
 */
public class AddUserEventRelation {
	private ActivityManager activityManager = new ActivityManagerImpl();
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		String userId = (String) req.getAttribute("userId");
		String eventId = (String) req.getAttribute("eventId");
		Action action = (Action) req.getAttribute("action");
		activityManager.eventActionOnUser(eventId, userId, action);
	}
}
