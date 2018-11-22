import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.lang.InterruptedException;

public class Main {

    private static String continueCalculating;

    public static void main(String[] args) throws InterruptedException {
        Methods methodsTest = new Methods();
        Scanner continueScanner = new Scanner(System.in);

        while (true) {
            System.out.println("Which of the four calculations functions would you like me to use? (+ - * /)");
            Scanner functionSc = new Scanner(System.in);
            String function = functionSc.next();
            switch (function) {
                case "+":
                    methodsTest.Add();
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println();
                    System.out.println();
                    System.out.println("Would you like to continue calculating? (Y/N)");
                    continueCalculating = continueScanner.next();
                    switch (continueCalculating)
                    {
                        case "Y":
                            continue;
                        case "N":
                            System.out.println("Closing calculator...");
                            TimeUnit.SECONDS.sleep(1);
                            System.exit(0);
                        default:
                            System.out.println("Naughty you, are you trying to corrupt me? You have to use Y or N.");
                            TimeUnit.SECONDS.sleep(1);
                            System.out.println("Closing calculator...");
                            TimeUnit.SECONDS.sleep(1);
                            System.exit(0);
                    }
                    System.out.println();
                    System.out.println();
                    continue;

                case "-":
                    methodsTest.Subtract();
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println();
                    System.out.println();
                    System.out.println("Would you like to continue calculating? (Y/N)");
                    continueCalculating = continueScanner.next();
                    switch (continueCalculating)
                    {
                        case "Y":
                            continue;
                        case "N":
                            System.out.println("Closing calculator...");
                            TimeUnit.SECONDS.sleep(1);
                            System.exit(0);
                        default:
                            System.out.println("Naughty you, are you trying to corrupt me? You have to use Y or N.");
                            TimeUnit.SECONDS.sleep(1);
                            System.out.println("Closing calculator...");
                            TimeUnit.SECONDS.sleep(1);
                            System.exit(0);
                    }
                    System.out.println();
                    System.out.println();
                    continue;

                case "*":
                    methodsTest.Multiply();
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println();
                    System.out.println();
                    System.out.println("Would you like to continue calculating? (Y/N)");
                    continueCalculating = continueScanner.next();
                    switch (continueCalculating)
                    {
                        case "Y":
                            continue;
                        case "N":
                            System.out.println("Closing calculator...");
                            TimeUnit.SECONDS.sleep(1);
                            System.exit(0);
                        default:
                            System.out.println("Naughty you, are you trying to corrupt me? You have to use Y or N.");
                            TimeUnit.SECONDS.sleep(1);
                            System.out.println("Closing calculator...");
                            TimeUnit.SECONDS.sleep(1);
                            System.exit(0);
                    }
                    System.out.println();
                    System.out.println();
                    continue;

                case "/":
                    methodsTest.Divide();
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println();
                    System.out.println();
                    System.out.println("Would you like to continue calculating? (Y/N)");
                    continueCalculating = continueScanner.next();
                    switch (continueCalculating)
                    {
                        case "Y":
                            continue;
                        case "N":
                            System.out.println("Closing calculator...");
                            TimeUnit.SECONDS.sleep(1);
                            System.exit(0);
                        default:
                            System.out.println("Naughty you, are you trying to corrupt me? You have to use Y or N.");
                            TimeUnit.SECONDS.sleep(1);
                            System.out.println("Closing calculator...");
                            TimeUnit.SECONDS.sleep(1);
                            System.exit(0);
                    }
                    System.out.println();
                    System.out.println();
                    continue;

                default:
                    System.out.println("Naughty you, are you trying to corrupt me? You have to use one of these symbols: (+ - * /)");
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println();
                    System.out.println();
                    System.out.println("Would you like to continue calculating? (Y/N)");
                    continueCalculating = continueScanner.next();
                    switch (continueCalculating)
                    {
                        case "Y":
                            continue;
                        case "N":
                            System.out.println("Closing calculator...");
                            TimeUnit.SECONDS.sleep(1);
                            System.exit(0);
                        default:
                            System.out.println("Naughty you, are you trying to corrupt me? You have to use Y or N.");
                            TimeUnit.SECONDS.sleep(1);
                            System.out.println("Closing calculator...");
                            TimeUnit.SECONDS.sleep(1);
                            System.exit(0);
                    }
                    System.out.println();
                    System.out.println();
                    continue;
            }
        }
    }
}