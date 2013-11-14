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
public interface PostActivityExecutor {
	void update(User user, Event event, String authToken);

	void update(Event event, String authToken);

	void update(TravelInfo travelInfo, String authToken);
}
