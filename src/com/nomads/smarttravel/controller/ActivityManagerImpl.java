/**
 * 
 */
package com.nomads.smarttravel.controller;

import com.nomads.smarttravel.model.Action;
import com.nomads.smarttravel.model.Event;
import com.nomads.smarttravel.model.User;

/**
 * @author anurajp
 *
 */
public class ActivityManagerImpl implements ActivityManager {
	private UserManager userManager = new UserManagerImpl();
	private EventManager eventManager = new EventManagerImpl();
	private PostActivityExecutor postActivityExecutor = new PostActivityExecutorImpl();
	
	@Override
	public void eventActionOnUser(String eventId, String userId, Action action) {
		User user = userManager.getUser(userId);
		Event event = eventManager.getEvent(eventId);
		update(user, event, action);
	}
	
	@Override
	public void userActionOnEvent(String eventId, String userId, Action action) {
		User user = userManager.getUser(userId);
		Event event = eventManager.getEvent(eventId);
		update(user, event, action);
	}
	
	private void update(User user, Event event, Action action) {
		String userId = user.getUserId();
		String eventId = event.getEventId();
		if(action == Action.ACCEPT) {
			event.getPendingUsers().remove(userId);
			event.getApprovedUsers().add(userId);
			user.getPendingEvents().remove(eventId);
			user.getApprovedEvents().add(eventId);
		} else if (action == Action.REJECT) {
			event.getPendingUsers().remove(userId);
			event.getRejectedUsers().add(userId);
			user.getPendingEvents().remove(eventId);
			user.getRejectedEvents().add(eventId);
		} else {
			event.getPendingUsers().add(userId);
			user.getPendingEvents().add(eventId);
		}
		userManager.addOrUpdateUser(user);
		eventManager.addOrUpdateEvent(event);
		postActivityExecutor.update(user, event);
	}

}
