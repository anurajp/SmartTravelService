/**
 * 
 */
package com.nomads.smarttravel.controller;

import com.nomads.smarttravel.model.Event;
import com.nomads.smarttravel.model.TravelInfo;
import com.nomads.smarttravel.model.User;

/**
 * @author anurajp
 *
 */
public class PostActivityExecutorImpl implements PostActivityExecutor {

	@Override
	public void update(User user, Event event, String authToken) {
		Utils.postEventToFb(user, event, authToken);
	}

	@Override
	public void update(Event event, String authToken) {
		Utils.postEventToFb(event, authToken);
		
	}

	@Override
	public void update(TravelInfo travelInfo, String authToken) {
		Utils.postEventToFb(travelInfo, authToken);
		
	}

}
