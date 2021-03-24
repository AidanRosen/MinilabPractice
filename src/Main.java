import java.util.Scanner;

public class Main {

    int totalIndex = 0;

    public static void main(String args[]){ //this is just THE syntax for a main method. That's just how java is


        //Program Eullers Method

        //Program an algorithm you've seen in life. Less creative and conflicting with the whole year but whatever. https://www.javatpoint.com/java-main-method

        //Use Mr. Lantsbergers labs!111!!11

        Scanner nthScanner = new Scanner(System.in); //nth as in nth term for iterations

        System.out.println("How many iterations should occur?"); //replace this print with a thymeLeaf input once you transition to the web
        int nthTerms = nthScanner.nextInt();

        FibonacciSequence goldenRatio = new FibonacciSequence();
        System.out.println("Your term at Fibonacci iteration number " + nthTerms + " is " + goldenRatio.fibonacci(nthTerms, 0, 0));

        RepeatedMath mathMachine = new RepeatedMath();

        System.out.println("\n\n\n" + "What base are you raising to a power?");
        int usedBase = nthScanner.nextInt();
        System.out.println("\nHow many powers of your number?"); //replace this print with a thymeLeaf input once you transition to the web
        nthTerms = nthScanner.nextInt();
        System.out.println("\n" + mathMachine.exponentiation(nthTerms, usedBase, usedBase)); //Move Java stuff to a website after your java stuff is ready (Java first, HTML second)


        System.out.println("\n\n\nWhat is your first factor? ");
        int factorOne = nthScanner.nextInt();
        System.out.println("\nWhat is your second factor? ");
        int factorTwo = nthScanner.nextInt();
        System.out.println("\n\n" + mathMachine.multiplication(factorOne, factorTwo, factorTwo));

        PalindromePractice stringReverser = new PalindromePractice();
        System.out.println(stringReverser.stringInput("abda"));
    }


    //Maybe I should do a recursive series calculator
}
