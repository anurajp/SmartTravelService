package com.nomads.smarttravel.controller;

import com.nomads.smarttravel.datastore.Datastore;
import com.nomads.smarttravel.datastore.DatastoreImpl;
import com.nomads.smarttravel.model.TravelInfo;

public class TravelInfoManagerImpl implements TravelInfoManager {
	private Datastore datastore = new DatastoreImpl();
	private PostActivityExecutor postActivityExecutor = new PostActivityExecutorImpl();
	
	@Override
	public TravelInfo addTravelInfo(TravelInfo travelInfo, String authToken) {
		TravelInfo ret = datastore.saveTravelInfo(travelInfo);
		postActivityExecutor.update(travelInfo, authToken);
		return ret;
	}

}
