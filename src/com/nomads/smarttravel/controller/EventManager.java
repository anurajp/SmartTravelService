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
	Event addOrUpdateEvent(Event event);
	Event getEvent(String eventId);
}
