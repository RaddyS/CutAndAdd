import java.util.ArrayList;
import java.util.Scanner;

public class CutAndAdd {

    public static int counter = 0;

    //TODO: overall clean up the code look ove LOC and other performance issues & do more testing
    //TODO: work on a solution regarding the counter to re started when done one game as it count up if starting the program from main class.


    public static void runCutAdd() { // this exe. the main business operation method of the program takes input controls
        //, and prints output
        //TODO: Include control over user input to allow only for values that are less than the total amount of characters in a string
        //TODO: Control of data type input to prevent system failure

        Scanner sc = new Scanner(System.in);
        String theReturnString;
        String stringInput;



        System.out.println("Enter a whole word without any spaces please");
        stringInput = sc.next();
        totalNumberOfChar(stringInput);// calling the method to see the output & to explore use in control,
        // must include print statement to see values

        int mInput;
        System.out.println("Player M turn to enter a number less then " + totalNumberOfChar(stringInput));
        String mIn = sc.next();
        mInput = Integer.parseInt(mIn);
        totalNumberOfChar(mIn);

        int nInput;
        System.out.println("Player N turn to enter a number less then " + totalNumberOfChar(stringInput));
        String nIn = sc.next();
        nInput = Integer.parseInt(nIn);
        totalNumberOfChar(nIn);


        System.out.println("Input: " + stringInput);
        ArrayList<Integer> list = new ArrayList<>();


        theReturnString = moveBy(stringInput, mInput);
        list.add(1);
        if(!stringInput.equals(theReturnString)){
            theReturnString = moveBy(theReturnString, nInput);
            list.add(1);
            if(!stringInput.equals(theReturnString)){
                System.out.println("Player M turn to enter a number less then " + totalNumberOfChar(stringInput));
                mInput = Integer.parseInt(sc.next());

                theReturnString = moveBy(theReturnString, mInput);
                list.add(1);

                if(!stringInput.equals(theReturnString)){
                    System.out.println("Player N turn to enter a number less then " + totalNumberOfChar(stringInput));
                    nInput = Integer.parseInt(sc.next());

                    theReturnString = moveBy(theReturnString, nInput);
                    list.add(1);

                }

            }

        }else{
            Integer theInteger = sumTotal(list);
            System.out.println("Output: " + theInteger);


        }


        Integer theInteger = sumTotal(list);
        System.out.println("Output: " + theInteger);

    }


    public static String moveBy(String aStringInput, int aInputNumber){// this provided the required string movement for back
        //to front based on the user input, it used substring as string are immutable

        String theStringInput = aStringInput;
        int theInputNumber = aInputNumber;

        String theOutput;
        String theBucket;
        String thePostBucket;
        String thePostPostBucket;

        theBucket = theStringInput.substring(0, theStringInput.length() - theInputNumber);
        thePostBucket = theStringInput.substring(theStringInput.length() - theInputNumber);
        thePostPostBucket = thePostBucket + theBucket;
        theOutput = thePostPostBucket;


        counter++;

        System.out.println("turn " + counter + ":" +   theOutput);
        return theOutput;



    }

    public static Integer sumTotal(ArrayList<Integer> arrayList){ // this give the total sum of iteration by input i.e.
        //the total amount of turns to get the string to the original form based on the input
        int sum = 0;
        ArrayList<Integer> list = arrayList;
        for(Integer i : list){
            sum = sum + i;
        }
        return sum;
    }

    public static long totalNumberOfChar(String inString ){// this get gives the total number of characters if a string
        //TODO: work on implementation of the method for input control & see if the white spaces should be ignored.
        String inputString;
        inputString = inString;

        long totalNumberOfCharacters = inputString.chars().count(); // this is a stream not used now
        return totalNumberOfCharacters;
    }

}
