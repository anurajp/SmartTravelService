/**
 * 
 */
package com.nomads.smarttravel.controller;

import com.nomads.smarttravel.model.Event;

/**
 * @author anurajp
 *
 */
public interface EventManager {
	void addOrUpdateEvent(Event event);
	Event getEvent(String eventId);
}
