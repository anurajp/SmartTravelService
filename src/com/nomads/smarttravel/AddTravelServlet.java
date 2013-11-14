/**
 * 
 */
package com.nomads.smarttravel;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.nomads.smarttravel.controller.TravelInfoManager;
import com.nomads.smarttravel.controller.TravelInfoManagerImpl;
import com.nomads.smarttravel.controller.UserManager;
import com.nomads.smarttravel.controller.UserManagerImpl;
import com.nomads.smarttravel.model.TravelInfo;
import com.nomads.smarttravel.model.User;

/**
 * @author anurajp
 *
 */
public class AddTravelServlet {
	private UserManager userManager = new UserManagerImpl();
	private TravelInfoManager travelInfoManager = new TravelInfoManagerImpl();
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		String travelInfoJson = (String) req.getAttribute("travelInfoJson");
		TravelInfo travelInfo = new Gson().fromJson(travelInfoJson, TravelInfo.class);
		String authToken = (String) req.getAttribute("eventJson");
		travelInfo = travelInfoManager.addTravelInfo(travelInfo, authToken);
		User user = userManager.getUser(travelInfo.getUserId());
		List<String> travelInfos = user.getTravelInfoIds();
		travelInfos.add(travelInfo.getTravelId());
		userManager.addOrUpdateUser(user);
		//resp.setContentType("text/plain");
	}
}
