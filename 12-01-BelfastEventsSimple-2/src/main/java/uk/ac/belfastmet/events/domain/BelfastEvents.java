package uk.ac.belfastmet.events.domain;

import java.util.ArrayList;

public class BelfastEvents
{
	private ArrayList<Event> allEvents = new ArrayList<Event>();

	public BelfastEvents()
	{
		
	}
	
	public BelfastEvents(ArrayList<Event> allEvents)
	{
		this.allEvents = allEvents;
	}
	
	//getters and setters
	public ArrayList<Event> getAllEvents()
	{
		return allEvents;
	}

	public void setAllEvents(ArrayList<Event> allEvents)
	{
		this.allEvents = allEvents;
	}
}
