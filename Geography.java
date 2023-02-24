import java.util.Scanner;

public class Geography {

    private static int counter = 0;

    public static void firstGeographyQuestion() {
        System.out.println("What is the name of the tallest mountain in the world?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        switch (answer) {
            case "Mount Everest":
                System.out.println("You are correct");
                counter++;
                return;
            default:
                System.out.println("Your answer " + answer + " is incorrect correct answer was Mount Everest");
        }

    }

    public static void secondGeographyQuestion() {
        System.out.println("Which country has the largest population in the world?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        switch (answer) {
            case "China":
                System.out.println("Your answer is correct");
                return;
            default:
                System.out.println("Your answer " + answer + " is incorrect correct answer was China");
        }
    }

    public static void thirdGeographyQuestion() {
        System.out.println("What are the names of the seven continents of the world?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        switch (answer) {
            case "Asia, Africa, North America, South America, Antarctica, Europe, Australia":
                System.out.println("Your answer is correct");
                return;
            default:
                System.out.println("Your answer " + answer + " is incorrect correct answer was" +
                        " Asia, Africa, North America, South America, Antarctica, Europe, Australia");
        }
    }

    public static void fourthGeographyQuestion() {
        System.out.println("What are the names of the five oceans of the world?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        switch (answer) {
            case " Atlantic, Pacific, Indian, Arctic, and the Antarctic":
                System.out.println("Your answer is correct");
                return;
            default:
                System.out.println("Your answer " + answer + " is incorrect " +
                        "correct answer was  Atlantic, Pacific, Indian, Arctic, and the Antarctic");
        }
    }

    public static void geography() {
        System.out.println("You will be provided with geography questions");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick question from (1 to 4) or press (0) to exit");
        int number = scanner.nextInt();
        switch (number) {
            case 0:
                return;
            case 1:
                firstGeographyQuestion();
                break;
            case 2:
                secondGeographyQuestion();
                break;
            case 3:
                thirdGeographyQuestion();
                break;
            case 4:
                fourthGeographyQuestion();
                break;
        }
    }

    public static int countPoints() {
        return counter;
    }
}
