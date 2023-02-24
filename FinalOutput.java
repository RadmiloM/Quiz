public class FinalOutput {

    public static void finalResult(int counter){
        switch (counter){
            case 0:
                System.out.println("You can do it better next time");
                break;
            case 1:
                System.out.println("Your result is decent");
                break;
            case 2:
                System.out.println("Your result is good");
                break;
            case 3:
                System.out.println("Your result is getting better");
                break;
            case 4:
                System.out.println("Your result is very good");
                break;
            case 5:
                System.out.println("Your result is great");
                break;
            default:
                System.out.println("Your result is exceptional");
                break;
        }
    }

    public static int countPoints(int history,int geography,int sport,int psychology){
        return history + geography + sport + psychology;
    }
}
