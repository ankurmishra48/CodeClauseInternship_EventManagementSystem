import java.util.ArrayList;
import java.util.List;

public class AttendeeService {
    private List<Attendee> attendees;

    public AttendeeService() {
        this.attendees = new ArrayList<>();
    }

    public void registerAttendee(String id, String name, String email) {
        Attendee attendee = new Attendee(id, name, email);
        attendees.add(attendee);
    }

    public List<Attendee> getAllAttendees() {
        return attendees;
    }
}
