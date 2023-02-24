import java.util.Scanner;

public class Psychology {

    private static int counter = 0;

    public static void firstPsychologyQuestion() {
        System.out.println("What is the opposite of a Pessimist?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        switch (answer) {
            case "Optimist":
                System.out.println("You are correct");
                counter++;
                return;
            default:
                counter--;
                System.out.println("Your answer " + answer + " is incorrect correct answer was Optimist");
        }

    }

    public static void secondPsychologyQuestion() {
        System.out.println("What does CBT stand for?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        switch (answer) {
            case "Cognitive Behavioral Therapy":
                System.out.println("Your answer is correct");
                counter++;
                return;
            default:
                counter--;
                System.out.println("Your answer " + answer + " is incorrect correct answer was Cognitive Behavioral Therapy");
        }
    }

    public static void thirdPsychologyQuestion() {
        System.out.println("What is one of the biggest questions that child psychologists attempt to answer?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        switch (answer) {
            case "Nature Vs. Nurture.":
                System.out.println("Your answer is correct");
                counter++;
                return;
            default:
                counter--;
                System.out.println("Your answer " + answer + " is incorrect correct answer was Nature Vs. Nurture.");
        }
    }

    public static void fourthPsychologyQuestion() {
        System.out.println("What did the Bobo experiment find?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        switch (answer) {
            case "Children will learn and mimic aggression by observing adult behavior.":
                System.out.println("Your answer is correct");
                counter++;
                return;
            default:
                counter--;
                System.out.println("Your answer " + answer + " is incorrect correct answer was" +
                        " Children will learn and mimic aggression by observing adult behavior.");
        }
    }

    public static void psychology() {
        System.out.println("You will be provided with psychology questions");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick question from (1 to 4) or press (0) to exit");
        int number = scanner.nextInt();
        switch (number) {
            case 0:
                return;
            case 1:
                firstPsychologyQuestion();
                break;
            case 2:
                secondPsychologyQuestion();
                break;
            case 3:
                thirdPsychologyQuestion();
                break;
            case 4:
                fourthPsychologyQuestion();
                break;
        }
    }

    public static int countPoints() {
        return counter;
    }
}
