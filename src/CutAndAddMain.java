import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CutAndAddMain {

 //TODO clean up more, work on the counter to stop adding on top continually if the program is not killed after the first use time

    static BufferedReader be = new BufferedReader(new InputStreamReader(System.in));//get the keyboard input

    public static void main(String[] args) throws Exception {
        String option = "";
        do { // using the do/w loop for input
            System.out.println("===============***** CutAndAdd *****==================");
            System.out.println("=============== Select your chose ====================");
            System.out.println("======================================================");
            System.out.println("To Run Cut and Add select => A ");
            System.out.println("To Exit select => B ");
            System.out.println("======================================================");

            option = be.readLine(); // reads the entire line
            System.out.println("\n");

            switch (option.toUpperCase()) {
                case "A":
                    cutAdd();
                    break;
                case "B":
                    System.out.println("***** I Thank You Very Much *****");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Option");

            }

        } while (!option.equals("B"));

    }

    public static void cutAdd(){// calls the method from the CutAndAdd class to be executed from main
        CutAndAdd.runCutAdd();
    }
}
