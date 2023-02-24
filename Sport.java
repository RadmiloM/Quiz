import java.util.Scanner;

public class Sport {

    private static int counter = 0;

    public static void firstSportQuestion() {
        System.out.println("What’s the diameter of a basketball hoop in inches?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        switch (answer) {
            case "18 inches":
                System.out.println("You are correct");
                counter++;
                return;
            default:
                counter--;
                System.out.println("Your answer " + answer + " is incorrect correct answer was 18 inches");
        }

    }

    public static void secondSportQuestion() {
        System.out.println("The Olympics are held every how many years?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        switch (answer) {
            case "4 years":
                System.out.println("Your answer is correct");
                counter++;
                return;
            default:
                counter--;
                System.out.println("Your answer " + answer + " is incorrect correct answer was 4 years");
        }
    }

    public static void thirdSportQuestion() {
        System.out.println("What sport is best known as the ‘king of sports’?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        switch (answer) {
            case "Soccer":
                System.out.println("Your answer is correct");
                counter++;
                return;
            default:
                counter--;
                System.out.println("Your answer " + answer + " is incorrect correct answer was Soccer");
        }
    }

    public static void fourthSportQuestion() {
        System.out.println("What do you call it when a bowler makes three strikes in a row?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        switch (answer) {
            case "Turkey":
                System.out.println("Your answer is correct");
                counter++;
                return;
            default:
                counter--;
                System.out.println("Your answer " + answer + " is incorrect correct answer Turkey");
        }
    }

    public static void sport() {
        System.out.println("You will be provided with sport questions");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick question from (1 to 4) or press (0) to exit");
        int number = scanner.nextInt();
        switch (number) {
            case 0:
                return;
            case 1:
                firstSportQuestion();
                break;
            case 2:
                secondSportQuestion();
                break;
            case 3:
                thirdSportQuestion();
                break;
            case 4:
                fourthSportQuestion();
                break;
        }
    }

    public static int countPoints() {
        return counter;
    }
}
