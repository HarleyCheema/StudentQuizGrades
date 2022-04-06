package classroster.dto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harle
 */
public class Student {

    private String firstName;
    private String lastName;
    private final String studentId;
    // Programming Language + cohort month/year
    private List<Double> quiz = new ArrayList<>();

    public Student(String studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStudentId() {
        return studentId;
    }

    public List<Double> getQuiz() {
        return quiz;
    }

    public void setQuiz(List<Double> quizGrades) {
        for (Double grade : quizGrades){
            quiz.add(grade);
        }    
    }
}
