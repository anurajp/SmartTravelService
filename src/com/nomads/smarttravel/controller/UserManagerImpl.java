package com.nomads.smarttravel.controller;

import com.nomads.smarttravel.datastore.Datastore;
import com.nomads.smarttravel.datastore.DatastoreImpl;
import com.nomads.smarttravel.model.User;

public class UserManagerImpl implements UserManager {
	private Datastore datastore = new DatastoreImpl();
	
	@Override
	public void addOrUpdateUser(User user) {
		datastore.saveUser(user);
	}

	@Override
	public User getUser(String userId) {
		return datastore.retrieveUser(userId);
	}

	public Datastore getDatastore() {
		return datastore;
	}

	public void setDatastore(Datastore datastore) {
		this.datastore = datastore;
	}
}
