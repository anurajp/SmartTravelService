package com.nomads.smarttravel.datastore;

import javax.jdo.PersistenceManager;

import com.nomads.smarttravel.model.Event;
import com.nomads.smarttravel.model.TravelInfo;
import com.nomads.smarttravel.model.User;
//import java.util.logging.Logger;

public class DatastoreImpl implements Datastore{

	//private static final Logger log = Logger.getLogger(DatastoreImpl.class.getName());
	private static PersistenceManager pm;
	/*
	@Override
	public boolean put(QuestionObject question) {
		try {
			pm = PMF.get().getPersistenceManager();
			pm.makePersistent(question);
			Categories category = new Categories(question.getCategory(), "Sample Category");
			pm.makePersistent(category);
			return true;
		} catch (Exception e) {
			return false;
		} finally {
			pm.close();
		}
	}

	@Override
	public List<QuestionObject> getByCategory(String categoryParam) {
		pm = PMF.get().getPersistenceManager();
		Query q = pm.newQuery(QuestionObject.class);
		q.setFilter("category == categoryParam");
		q.declareParameters("String categoryParam");
		@SuppressWarnings("unchecked")
		List<QuestionObject> resultList = (List<QuestionObject>) q.execute(categoryParam);
		pm.close();
		return resultList;
	}
	

	@Override
	public List<String> getCategories() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String update(String key, String response) {
	    try {
	    	pm = PMF.get().getPersistenceManager();
			QuestionObject object = pm.getObjectById(QuestionObject.class, key);
			if(object == null)
				return "whaaaa";
			if(response.equals("positive"))
				object.setPositiveCount(object.getPositiveCount() + 1);
			else
				object.setNegativeCount(object.getNegativeCount() + 1);
		} catch (Exception e) {
			return e.getLocalizedMessage();
		} finally {
			pm.close();
		}
	    
	    return "Updated";
	}

	@Override
	public QuestionObject getQuestionById(Long qId) {
		pm = PMF.get().getPersistenceManager();
		QuestionObject returnVal = (QuestionObject) pm.getObjectById(QuestionObject.class, qId);
		pm.close();
		return returnVal;
	}*/

	@Override
	public User saveUser(User user) {
		try {
			pm = PMF.get().getPersistenceManager();
			return pm.makePersistent(user);
		} finally {
			pm.close();
		}
	}

	@Override
	public User retrieveUser(String userId) {
		pm = PMF.get().getPersistenceManager();
		try {
			return pm.getObjectById(User.class, userId);
		} finally {
			pm.close();
		}
	}

	@Override
	public Event saveEvent(Event event) {
		try {
			pm = PMF.get().getPersistenceManager();
			return pm.makePersistent(event);
		} finally {
			pm.close();
		}
		
	}

	@Override
	public Event retrieveEvent(String eventId) {
		pm = PMF.get().getPersistenceManager();
		try {
			return pm.getObjectById(Event.class, eventId);
		} finally {
			pm.close();
		}
	}

	@Override
	public TravelInfo saveTravelInfo(TravelInfo travelInfo) {
		try {
			pm = PMF.get().getPersistenceManager();
			return pm.makePersistent(travelInfo);
		} finally {
			pm.close();
		}
		
	}

	@Override
	public TravelInfo retrieveTravelInfo(String travelInfoId) {
		pm = PMF.get().getPersistenceManager();
		try {
			return pm.getObjectById(TravelInfo.class, travelInfoId);
		} finally {
			pm.close();
		}
	}
}
