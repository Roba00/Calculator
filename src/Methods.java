import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.lang.InterruptedException;

public class Methods
{
    public void Add() throws InterruptedException
    {
        Scanner addSc = new Scanner(System.in);
        System.out.println("Put an integer here to add.");
        int firstAddend = addSc.nextInt();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("What should I add this number to?");
        int secondAddend = addSc.nextInt();
        int sum = firstAddend + secondAddend;
        TimeUnit.SECONDS.sleep(1);
        System.out.println("The sum is " + sum);
        TimeUnit.SECONDS.sleep(1);
    }

    public void Subtract() throws InterruptedException
    {
        Scanner subtractSc = new Scanner(System.in);
        System.out.println("Put an integer here to subtract.");
        int minuend = subtractSc.nextInt();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("What should I subtract this number to?");
        int subtracthend = subtractSc.nextInt();
        int difference = minuend - subtracthend;
        TimeUnit.SECONDS.sleep(1);
        System.out.println("The difference is " + difference);
        TimeUnit.SECONDS.sleep(1);
    }

    public void Multiply() throws InterruptedException
    {
        Scanner multiplySc = new Scanner(System.in);
        System.out.println("Put an integer here to multiply.");
        int firstFactor = multiplySc.nextInt();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("What should I multiply this integer to?");
        int secondFactor = multiplySc.nextInt();
        int product = firstFactor * secondFactor;
        TimeUnit.SECONDS.sleep(1);
        System.out.println("The product is " + product);
        TimeUnit.SECONDS.sleep(1);
    }

    public void Divide() throws InterruptedException
    {
        Scanner divideSc = new Scanner(System.in);
        System.out.println("Put an integer here to divide.");
        int dividend = divideSc.nextInt();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("What should I divide this number to?");
        int divisor = divideSc.nextInt();
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        TimeUnit.SECONDS.sleep(1);
        System.out.println("The quotient is " + quotient + " with a remainder of " + remainder);
        TimeUnit.SECONDS.sleep(1);
    }
}