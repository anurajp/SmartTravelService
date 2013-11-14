package com.nomads.smarttravel;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.nomads.smarttravel.controller.EventManager;
import com.nomads.smarttravel.controller.EventManagerImpl;
import com.nomads.smarttravel.model.Event;

public class AddOrUpdateEventServlet {
	private EventManager eventManager = new EventManagerImpl();
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		String eventJson = (String) req.getAttribute("eventJson");
		Event event = new Gson().fromJson(eventJson, Event.class);
		event = eventManager.addOrUpdateEvent(event);
		resp.setContentType("text/plain");
		
	}
}
