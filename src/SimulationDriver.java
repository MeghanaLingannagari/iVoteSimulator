import java.util.ArrayList;

public class SimulationDriver {

    public static void main(String[] args){
        System.out.println("Let's begin the game!");
        System.out.println(" ");
        VotingService vs = new VotingService();
        System.out.println("Do you see your name and ID? ");
        vs.addStudents();
        vs.addQuestions();
        vs.showStudents();
        vs.answerQuestions();
        System.out.println(" ");
        System.out.println("**************** Question Statistics ****************");
        vs.statistics();
        System.out.println("Thanks for playing!");

    }
}
