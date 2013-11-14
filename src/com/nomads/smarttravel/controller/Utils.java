package com.nomads.smarttravel.controller;

import java.util.Date;

import com.nomads.smarttravel.model.Event;
import com.nomads.smarttravel.model.TravelInfo;
import com.nomads.smarttravel.model.User;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import com.restfb.types.FacebookType;
import com.restfb.util.StringUtils;

public class Utils {

	public static void postEventToFb( Event event, String fbAuthToken){
		if(StringUtils.isBlank(fbAuthToken)){
			fbAuthToken="CAAHwZBe2yFVABACN8bztRfPYOZB6cS6Gu5QedD3cfc6rYZCqhzHxcrqY7UZBPfc8HpeuwzTzF5mDNlYJw53htsGIsndweycLVqT84NIZBzOetBRwYeuBCXCjpeiCMLI2wqeQIYUrRZAZBh4pDsZC6zlSv8ZBq39zjSnH3PuLo2FST1i9RCHCSiZAjfjKXSiqDncOEZD";
		}
		FacebookClient facebookClient = new DefaultFacebookClient(fbAuthToken);
		Date startDate = event.getStartDate();
		Date endDate = event.getEndDate();
		FacebookType publishEventResponse = facebookClient.publish("me/events", FacebookType.class,
				Parameter.with("name", event.getEventName()), Parameter.with("start_time", startDate),
				Parameter.with("end_time",endDate ),Parameter.with("location", event.getLocation()),Parameter.with("privacy", "SECRET"));

		System.out.println("Published event ID: " + publishEventResponse.getId());

	}

	public static void postEventToFb(User user, Event event, String authToken) {
		FacebookClient facebookClient = new DefaultFacebookClient(authToken);
		Date startDate = event.getStartDate();
		Date endDate = event.getEndDate();
		FacebookType publishEventResponse = facebookClient.publish("me/events", FacebookType.class,
				Parameter.with("name", event.getEventName()), Parameter.with("start_time", startDate),
				Parameter.with("end_time",endDate ),Parameter.with("location", event.getLocation()),Parameter.with("privacy", "SECRET"));

		System.out.println("Published event ID: " + publishEventResponse.getId());
		
	}

	public static void postEventToFb(TravelInfo travelInfo, String authToken) {
		FacebookClient facebookClient = new DefaultFacebookClient(authToken);
		String connection = "me/feed";
	       FacebookType publishMessageResponse =
	                 facebookClient.publish(connection, FacebookType.class,
	                   Parameter.with("message", "helo ..:)"));
		
	}

}
