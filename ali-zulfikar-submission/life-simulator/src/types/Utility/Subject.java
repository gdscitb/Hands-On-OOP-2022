package types.Utility;

public enum Subject {
    MATHS("Maths", 3),
    ENGLISH("English", 2),
    SCIENCE("Science", 4),
    HISTORY("History", 1),
    GEOGRAPHY("Geography", 1),
    PHYSICAL_EDUCATION("Physical Education", 1),
    MUSIC("Music", 2);

    private final String subject;
    private final int hours;
    Subject(String subject, int hours) {
        this.subject = subject;
        this.hours = hours;
    }

    public String getSubject() {
        return subject;
    }

    public int getHours() {
        return hours;
    }

    public static void printAll() {
        for (Subject subject : Subject.values()) {
            System.out.println(subject.getSubject() + " " + subject.getHours());
        }
    }
}
