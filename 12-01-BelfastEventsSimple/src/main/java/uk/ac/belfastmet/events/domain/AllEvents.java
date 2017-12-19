package uk.ac.belfastmet.events.domain;

import java.util.ArrayList;


public class AllEvents
{
	private ArrayList<Event> events = new ArrayList<Event>();

	public AllEvents()
	{
		
	}
	
	public AllEvents(ArrayList<Event> events)
	{
		this.events = events;
	}
	
	//getters and setters
	public ArrayList<Event> getEvents()
	{
		return events;
	}

	public void setAllEvents(ArrayList<Event> events)
	{
		this.events = events;
	}
}