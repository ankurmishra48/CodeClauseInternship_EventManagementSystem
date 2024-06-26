import java.util.ArrayList;
import java.util.List;

public class Event {
    private String id;
    private String title;
    private String description;
    private String date;
    private List<Session> sessions;

    public Event(String id, String title, String description, String date) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.date = date;
        this.sessions = new ArrayList<>();
    }
    public void addSession(Session session) {
        this.sessions.add(session);
    }
    @Override
    public String toString() {
        return "Event{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", date='" + date + '\'' +
                ", sessions=" + sessions +
                '}';
    }

    public Object getId() {
        throw new UnsupportedOperationException("Unimplemented method 'getId'");
    }
}
