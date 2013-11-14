package com.nomads.smarttravel.datastore;

import com.nomads.smarttravel.model.Event;
import com.nomads.smarttravel.model.User;

public interface Datastore {
	void saveUser(User user);
	User retrieveUser(String user);
	void saveEvent(Event event);
	Event retrieveEvent(String eventId);
}
