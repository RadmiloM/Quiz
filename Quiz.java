import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {
        StartGame.start();
        Scanner scanner = new Scanner(System.in);
        PickTopic.printTopic();
        try {
            int number = scanner.nextInt();
            while (number != 0) {
                switch (number) {
                    case 1:
                        History.historyQuestions();
                        break;
                    case 2:
                        Geography.geography();
                        break;
                    case 3:
                        Sport.sport();
                        break;
                    case 4:
                        Psychology.psychology();
                        break;

                }
                PickTopic.printTopic();
                number = scanner.nextInt();
            }
        }catch (InputMismatchException e){
            System.out.println("You must enter number");
            return;
        }

        int final_result = FinalOutput.countPoints(History.countPoints()
                , Geography.countPoints()
                , Sport.countPoints()
                , Psychology.countPoints());
        FinalOutput.finalResult(final_result);
        EndGame.end();
    }
}
