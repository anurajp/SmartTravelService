package com.nomads.smarttravel.controller;

import com.nomads.smarttravel.datastore.Datastore;
import com.nomads.smarttravel.datastore.DatastoreImpl;
import com.nomads.smarttravel.model.Event;

public class EventManagerImpl implements EventManager {
	private Datastore datastore = new DatastoreImpl();
	private PostActivityExecutor postActivityExecutor = new PostActivityExecutorImpl();
	
	@Override
	public void addOrUpdateEvent(Event event) {
		datastore.saveEvent(event);
		postActivityExecutor.update(event);
	}
	
	@Override
	public Event getEvent(String eventId) {
		return datastore.retrieveEvent(eventId);
	}

	public Datastore getDatastore() {
		return datastore;
	}

	public void setDatastore(Datastore datastore) {
		this.datastore = datastore;
	}

}
