
import java.util.Scanner;

public class History {
    private static int counter = 0;

    public static void firstHistoryQuestion() {
        System.out.println("The United States bought Alaska from which country?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        switch (answer) {
            case "Russia":
                System.out.println("You are correct");
                counter++;
                return;
            default:
                counter--;
                System.out.println("Your answer " + answer + " is incorrect correct answer was Russia");
        }

    }

    public static void secondHistoryQuestion() {
        System.out.println("Who was the fourth president of the United States?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        switch (answer) {
            case "James Madison":
                System.out.println("Your answer is correct");
                counter++;
                return;
            default:
                counter--;
                System.out.println("Your answer " + answer + " is incorrect correct answer was James Madison");
        }
    }

    public static void thirdHistoryQuestion() {
        System.out.println("Which era marked a switch from agricultural practices to industrial practices?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        switch (answer) {
            case "The Industrial Revolution":
                System.out.println("Your answer is correct");
                counter++;
                return;
            default:
                counter--;
                System.out.println("Your answer " + answer + " is incorrect correct answer was The Industrial Revolution");
        }
    }

    public static void fourthHistoryQuestion() {
        System.out.println("What was the name of the series of programs and projects President Franklin D. Roosevelt " +
                "enacted during The Great Depression?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        switch (answer) {
            case "The New Deal":
                System.out.println("Your answer is correct");
                counter++;
                return;
            default:
                counter--;
                System.out.println("Your answer " + answer + " is incorrect correct answer was The New Deal");
        }
    }

    public static void historyQuestions() {
        System.out.println("You will be provided with history questions");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick question from (1 to 4) or press (0) to exit");
        int number = scanner.nextInt();
        switch (number) {
            case 0:
                return;
            case 1:
                firstHistoryQuestion();
                break;
            case 2:
                secondHistoryQuestion();
                break;
            case 3:
                thirdHistoryQuestion();
                break;
            case 4:
                fourthHistoryQuestion();
                break;
        }
    }

    public static int countPoints() {
        return counter;
    }
}
