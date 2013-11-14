package com.nomads.smarttravel.datastore;

import com.nomads.smarttravel.model.Event;
import com.nomads.smarttravel.model.TravelInfo;
import com.nomads.smarttravel.model.User;

public interface Datastore {
	User saveUser(User user);
	User retrieveUser(String user);
	Event saveEvent(Event event);
	Event retrieveEvent(String eventId);
	TravelInfo saveTravelInfo(TravelInfo travelInfo);
	TravelInfo retrieveTravelInfo(String travelInfoId);
}
