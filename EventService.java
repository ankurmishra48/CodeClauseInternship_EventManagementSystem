import java.util.ArrayList;
import java.util.List;

public class EventService {
    private List<Event> events;

    public EventService() {
        this.events = new ArrayList<>();
    }

    public void createEvent(String id, String title, String description, String date) {
        Event event = new Event(id, title, description, date);
        events.add(event);
    }

    public List<Event> getAllEvents() {
        return events;
    }

    public Event getEventById(String id) {
        for (Event event : events) {
            if (event.getId().equals(id)) {
                return event;
            }
        }
        return null;
    }

    public void addSessionToEvent(String eventId, Session session) {
        Event event = getEventById(eventId);
        if (event != null) {
            event.addSession(session);
        }
    }
}
