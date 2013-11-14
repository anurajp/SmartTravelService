/**
 * 
 */
package com.nomads.smarttravel.controller;

import com.nomads.smarttravel.model.User;

/**
 * @author anurajp
 *
 */
public interface UserManager {
	void addOrUpdateUser(User user);
	User getUser(String userId);
}
