package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.Event;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EventData {//will contain static methods and properties
    //need a place to put events(data structure of some type)
    private static final Map<Integer, Event> events = new HashMap<>();

    //should be able to get all events
    public static Collection<Event> getAll(){
        return events.values();
    }
    //get a single event
    public static Event getByID(int id){
        return events.get(id);
    }
    //add an event
    public static void add(Event event){
        events.put(event.getId(), event);
    }

    //remove an event
    public static void remove(int id){
        events.remove(id);
    }
}
