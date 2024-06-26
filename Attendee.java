public class Attendee {
    private String id;
    private String name;
    private String email;

    public Attendee(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
    @Override
    public String toString() {
        return "Attendee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
