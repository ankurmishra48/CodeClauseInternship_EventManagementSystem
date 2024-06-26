import java.util.Scanner;

public class Mainn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EventService eventService = new EventService();
        AttendeeService attendeeService = new AttendeeService();

        while (true) {
            System.out.println("1. Create Event");
            System.out.println("2. List Events");
            System.out.println("3. Add Session to Event");
            System.out.println("4. Register Attendee");
            System.out.println("5. List Attendees");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter Event ID: ");
                    String eventId = scanner.nextLine();
                    System.out.println("Enter Event Title: ");
                    String eventTitle = scanner.nextLine();
                    System.out.println("Enter Event Description: ");
                    String eventDescription = scanner.nextLine();
                    System.out.println("Enter Event Date: ");
                    String eventDate = scanner.nextLine();
                    eventService.createEvent(eventId, eventTitle, eventDescription, eventDate);
                    break;
                case 2:
                    for (Event event : eventService.getAllEvents()) {
                        System.out.println(event);
                    }
                    break;
                case 3:
                    System.out.println("Enter Event ID to add Session: ");
                    String sessionEventId = scanner.nextLine();
                    System.out.println("Enter Session ID: ");
                    String sessionId = scanner.nextLine();
                    System.out.println("Enter Session Title: ");
                    String sessionTitle = scanner.nextLine();
                    System.out.println("Enter Session Start Time: ");
                    String sessionStartTime = scanner.nextLine();
                    System.out.println("Enter Session End Time: ");
                    String sessionEndTime = scanner.nextLine();
                    Session session = new Session(sessionId, sessionTitle, sessionStartTime, sessionEndTime);
                    eventService.addSessionToEvent(sessionEventId, session);
                    break;
                case 4:
                    System.out.println("Enter Attendee ID: ");
                    String attendeeId = scanner.nextLine();
                    System.out.println("Enter Attendee Name: ");
                    String attendeeName = scanner.nextLine();
                    System.out.println("Enter Attendee Email: ");
                    String attendeeEmail = scanner.nextLine();
                    attendeeService.registerAttendee(attendeeId, attendeeName, attendeeEmail);
                    break;
                case 5:
                    for (Attendee attendee : attendeeService.getAllAttendees()) {
                        System.out.println(attendee);
                    }
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
