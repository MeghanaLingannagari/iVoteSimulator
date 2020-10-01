//setting up the questions blueprints
public class Question {
    public String question; //asking the question here
    //A-E are for storing the options chosen by the student from MC Questions
    public String A;
    public String B;
    public String C;
    public String D;
    public String E;
    public String correctAnswer; //stores the correct answer of the question
    //t and f are for storing the options chosen by the student from T/F Questions
    public boolean t;
    public boolean f;
    public boolean cA; //stores the correct answer of the question
    public String type; //is it a MC or T/F question

    //two constructors, for the two types of questions
    public Question(String question, String A, String B, String C, String D, String E, String correctAnswer, String type) {
        this.question = question;
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
        this.E = E;
        this.correctAnswer = correctAnswer;
        this.type = "Multiple Choice";
    }

    public Question(String question, boolean t, boolean f, boolean cA, String type) {
        this.question = question;
        this.t = true;
        this.f = false;
        this.cA = cA;
        this.type = "True/False";
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getA() {
        return A;
    }

    public void setA(String a) {
        A = a;
    }

    public String getB() {
        return B;
    }

    public void setB(String b) {
        B = b;
    }

    public String getC() {
        return C;
    }

    public void setC(String c) {
        C = c;
    }

    public String getD() {
        return D;
    }

    public void setD(String d) {
        D = d;
    }

    public String getE() {
        return E;
    }

    public void setE(String e) {
        E = e;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public boolean isT() {
        return t;
    }

    public void setT(boolean t) {
        this.t = t;
    }

    public boolean isF() {
        return f;
    }

    public void setF(boolean f) {
        this.f = f;
    }

    public boolean iscA() {
        return cA;
    }

    public void setcA(boolean cA) {
        this.cA = cA;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
