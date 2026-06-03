public class Participant {
    /*
    required fields:
    
    - getters/setters
        - name
        - grade
        - studentID
        - activities
        - score

        - constructor

    - toString()
        - Example: Participant p = new Participant("Ava", 11, 2045, {“Robotics”, “Basketball”, “Debate”}, 95);
    */

    private String name;
    private int grade;
    private int studentID;
    private String activities;
    private int score;

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getActivities() {
        return activities;
    }

    public int getScore() {
        return score;
    }
}