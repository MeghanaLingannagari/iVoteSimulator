import java.util.*;
public class VotingService {
    public ArrayList<Student> nameAndID = new ArrayList<>(); //an arraylist of the Student type
    public ArrayList<Question> question = new ArrayList<>(); //an arraylist of the Question type
    char[][] mc = new char[7][7]; //going to hold what each student answered
    int correctCounter = 0;


    public void addStudents() {
        //make Student objects to add to linked list
        Student s0 = new Student("Megan Ling", "10001234", false, 'F', false);
        Student s1 = new Student("Ricky Cass", "10005678", false, 'F', false);
        Student s2 = new Student("Kathleen Bonk", "10009123", false, 'F', false);
        Student s3 = new Student("Patty LaFoy", "10004567", false, 'F', false);
        Student s4 = new Student("Sam Fumabet", "10008912", false, 'F', false);
        Student s5 = new Student("Allyson Wang", "10003456", false, 'F', false);
        Student s6 = new Student("Skyler Camp", "10007891", false, 'F', false);

        //add to arraylist
        nameAndID.add(s0);
        nameAndID.add(s1);
        nameAndID.add(s2);
        nameAndID.add(s3);
        nameAndID.add(s4);
        nameAndID.add(s5);
        nameAndID.add(s6);
    }

    public void addQuestions() {
        //make Question objects for information relating to questions
        Question q1 = new Question("When was CPP founded? ", "A: 1920", "B: 1927", "C: 1938", "D: 1940", "E: 1942", "C: 1938", "Multiple Choice");
        Question q2 = new Question("How many colleges does CPP offer? ", "A: 6", "B: 7", "C: 8", "D: 9", "E: 10", "C: 8", "Multiple Choice");
        Question q3 = new Question("Who is CPP's mascot? ", "A: Billy the Bronco", "B: Bobby the Bronco", "C: Molly the Mustang", "D: Billy the Book", "E: No Mascot", "A: Billy the Bronco", "Multiple Choice");
        Question q4 = new Question("Which of the following is NOT a course offered in Computer Science? ", "A: Object Oriented Design and Programming", "B: Database Systems", "C: Artificial Intelligence", "D: Robotics", "E: Cryptography and Information Security", "D: Robotics", "Multiple Choice");
        Question q5 = new Question("How many GE section blocks are there in CPP? ", "A: 3", "B: 4", "C: 5", "D: 6", "E: 7", "C: 5", "Multiple Choice");

        Question q6 = new Question("TRUE or FALSE: CPP's colors are red and black. ", true, false, false, "True/False");
        Question q7 = new Question("TRUE or FALSE: CPP is the one of the two polytechnic schools in the CSU System. ", true, false, true, "True/False");

        //add to arraylist
        question.add(q1);
        question.add(q2);
        question.add(q3);
        question.add(q4);
        question.add(q5);
        question.add(q6);
        question.add(q7);
    }

    //printing out the name of each student and their ID's
    public void showStudents() {
        for (Student s : nameAndID) {
            System.out.println(s.getName() + " : " + s.getStudentId());
        }
    }

    public void answerQuestions() {
        int mcCounter = 0; //going keep track of number of questions, which question number you are on
        for (Question q : question) {
            int mcCounter2 = 0; //keeping track of each student and want it to reset after each question so for student 2 etc can do ques 1 etc
            //the first bracket is the question and second is the student
            System.out.println(" ");
            System.out.println(q.getQuestion());
            //for printing options
            if (q.getType().contains("Multiple Choice")) {
                System.out.println(q.getA() + " * " + q.getB() + " * " + q.getC() + " * " + q.getD() + " * " + q.getE());
            }
            else {
                System.out.println(q.isT() + " or " + q.isF() + " ?");
            }

            for (Student s : nameAndID) {
                if (q.getType().contains("Multiple Choice")) { //if the question is MC
                    //this is to simulate a student answering a question
                    Random r = new Random();
                    char mcAns = (char) (r.nextInt(4) + 'A'); //generate a random char option
                    mc[mcCounter][mcCounter2] = mcAns; //first [] has the question number and 2nd [] has student name and mcAns will be stored in there
                    System.out.println(s.getName() + " chose " + mcAns + " as their answer ");
                    //s.mcAnswer = mcAns; //to set the answer chosen by the student in nameAndID list s.mcAnswer
                    boolean questionResult = Objects.equals(mcAns, q.getCorrectAnswer()); //if the student's answer is equal to the correct answer
                    if (questionResult) { //if it is the correct answer
                        s.isCorrect = true; //to identify if the student got the question correct
                    } //no need for else statement because by default isCorrect is false

                } else { //if it is a T/F question
                    Random rand = new Random();
                    boolean tfAns = rand.nextBoolean();
                    System.out.println(s.getName() + " chose " + tfAns + " as their answer ");
                   if (tfAns) {
                       mc[mcCounter][mcCounter2] = 'a'; //for true
                   } else {
                       mc[mcCounter][mcCounter2] = 'b'; //for false
                    }
                   if (tfAns == q.cA) { //if it is the correct answer
                       s.isCorrect = true; //to identify if the student got the question correct
                    }
                }
                mcCounter2++;
            }
            mcCounter++;
            if (q.getType().contains("Multiple Choice")) {
                System.out.println("*** The correct answer is: " + q.getCorrectAnswer() + " ***");
            }
            else{
                System.out.println("*** The correct answer is: " + q.iscA() + " ***");
            }
        }
    }


    public void statistics() {
        int mcCounter = 0; //hold the question number
        for (Question q : question) {
            int mcCounter2 = 0; //student name for when we print the char array
            if (q.getType().contains("Multiple Choice")) {
                System.out.println(" ");
                System.out.println(q.getQuestion()); //print the MC question
                //how many students voted for each letter
                int Acount = 0;
                int Bcount = 0;
                int Ccount = 0;
                int Dcount = 0;
                int Ecount = 0;

                for(Student s: nameAndID) { //go through the mc char array to dissect which option was chosen how many times
                    //each respective counter increments when that option was chosen
                        if (s.mcAnswer == 'A'){
                            Acount++;
                        }
                        else if(s.mcAnswer == 'B'){
                            Bcount++;
                        }
                        else if(s.mcAnswer == 'C'){
                            Ccount++;
                        }
                        else if(s.mcAnswer == 'D'){
                            Dcount++;
                        }
                        else{
                            Ecount++;
                        }
                }
                System.out.println("The Number of students that voted for option A are: " + Acount);
                System.out.println("The Number of students that voted for option B are: " + Bcount);
                System.out.println("The Number of students that voted for option C are: " + Ccount);
                System.out.println("The Number of students that voted for option D are: " + Dcount);
                System.out.println("The Number of students that voted for option E are: " + Ecount);

            }
            else {
                System.out.println(" ");
                System.out.println(q.getQuestion()); //print the T/F question

                //how many students voted for each option
                int Tcount = 0;
                int Fcount = 0;
                for(Student s: nameAndID) { //loops throughout the nameAndID arraylist and looks for what each student chose for answers
                    //each respective counter increments when that option was chosen//question.size to get the number of questions
                        if (s.tfAnswer){
                            Tcount++;
                        }
                        else{
                            Fcount++;
                        }
                }
                System.out.println("The Number of students that voted True are: " + Tcount);
                System.out.println("The Number of students that voted False are: " + Fcount);
            }
            mcCounter2++;
            }
        mcCounter++;
        }
    }

