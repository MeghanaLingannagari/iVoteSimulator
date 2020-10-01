//setting up the student blueprints
import java.util.*;
public class Student {
    public String name;
    public String studentId;
    public boolean isCorrect;
    public char mcAnswer;
    public boolean tfAnswer;

    public Student(String name, String studentId, boolean isCorrect, char mcAnswer, boolean tfAnswer) {
        this.name = name;
        this.studentId = studentId;
        this.isCorrect = isCorrect;
        this.mcAnswer = mcAnswer;
        this.tfAnswer = tfAnswer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }

    public char getMcAnswer() {
        return mcAnswer;
    }

    public void setMcAnswer(char mcAnswer) {
        this.mcAnswer = mcAnswer;
    }

    public boolean isTfAnswer() {
        return tfAnswer;
    }

    public void setTfAnswer(boolean tfAnswer) {
        this.tfAnswer = tfAnswer;
    }
}


