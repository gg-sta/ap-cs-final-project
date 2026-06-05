import java.util.ArrayList;

public class Participant {
    /*
    required fields:

    - constructor

    - getters/setters
        - name
        - grade
        - studentID
        - activities
        - score


    - toString()
        - Example: Participant p = new Participant("Ava", 11, 2045, {“Robotics”, “Basketball”, “Debate”}, 95);
    */

    private String name;
    private int grade;
    private int studentID;
    private String activities;
    private int score;

    //constructor
    public Participant(String n, int g, int id, String a, int s) {
        name = n;
        grade = g;
        studentID = id;
        activities = a;
        score = s;
    }
    
    //getters
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

    // Setters
    public void setName(String n)
    {
        name = n;
    }

    public void setGrade(int g)
    {
        grade = g;
    }

    public void setStudentID(int id)
    {
        studentID = id;
    }

    public void setActivities(String a)
    {
        activities = a;
    }

    public void setScore(int s)
    {
        score = s;
    }
}