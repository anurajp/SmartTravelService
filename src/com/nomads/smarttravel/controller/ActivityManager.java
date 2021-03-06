package com.nomads.smarttravel.controller;

import com.nomads.smarttravel.model.Action;

public interface ActivityManager {
	void eventActionOnUser(String eventId, String userId, Action action, String fbAuthToken);

	void userActionOnEvent(String eventId, String userId, Action action, String fbAuthToken);
}
