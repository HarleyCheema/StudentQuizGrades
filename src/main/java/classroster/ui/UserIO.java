package classroster.ui;

import java.util.List;

/**
 *
 * @author harle
 */
public interface UserIO {

    void print(String msg);

    String readString(String prompt);

    public List<Double> readQuizGrades(String msgPrompt);

    int readInt(String prompt);

    int readInt(String prompt, int min, int max);
}
