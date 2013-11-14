/**
 * 
 */
package com.nomads.smarttravel.controller;

import com.nomads.smarttravel.model.TravelInfo;
import com.nomads.smarttravel.model.User;

/**
 * @author anurajp
 *
 */
public interface UserManager {
	User addOrUpdateUser(User user);
	User getUser(String userId);
}
