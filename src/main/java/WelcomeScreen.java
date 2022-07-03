import javax.swing.*;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class WelcomeScreen {
    public static void main(String[] args) throws IOException {

        showWelcome();

        getInput();

        System.out.println("Want to start over? Y/N");

        doOver();
    }

    private static void showWelcome() {
        System.out.println("Welcome to currency convertor!");
        System.out.println("Please choose an option (1/2):");
        System.out.println("1. Dollars to Shekels.");
        System.out.println("2. Shekels to Dollars.");
    }

    private static void getInput() {
        while (true)
        {Scanner choiceMade = new Scanner(System.in);
        int choice = choiceMade.nextInt();
        if (choice > 2 || choice < 1)
        {System.out.println("Invalid Choice, please try again.");
        Scanner choiceMade2 = new Scanner(System.in);
        int choice2 = choiceMade2.nextInt();continue;}
        else if (choice == 1)
        {System.out.println("Please enter an amount to convert");
        Scanner amountSelected = new Scanner(System.in);
        double input = amountSelected.nextDouble();
        USD turnStatic = new USD();
        Coin ILSValue = CoinFactory.getUSDInstance(Coins.USD);
        double value1 = turnStatic.calculate(input);
        System.out.println(value1);
        ArrayList<Double> previousResultsList = new ArrayList<>();
        previousResultsList.add(value1);break;}
        else if (choice == 2)
        {System.out.println("Please enter an amount to convert");
        Scanner amountSelected = new Scanner(System.in);
        double input = amountSelected.nextDouble();
        ILS turnStatic2 = new ILS();
        Coin USDValue = CoinFactory.getILSInstance(Coins.ILS);
        double value2 = turnStatic2.calculate(input);
        System.out.println(value2);
        ArrayList<Double> previousResultsList = new ArrayList<>();
        previousResultsList.add(value2);break;}}
    }

    private static void regetInput()
    {while (true)
    {System.out.println("Please choose an option (1/2):");
    System.out.println("1. Dollars to Shekels.");
    System.out.println("2. Shekels to Dollars.");
    Scanner choiceMade = new Scanner(System.in);
    int choice = choiceMade.nextInt();
    if (choice > 2 || choice < 1)
    {System.out.println("Invalid Choice, please try again.");
    Scanner choiceMade2 = new Scanner(System.in);
    int choice2 = choiceMade2.nextInt();continue;}
    else if (choice == 1)
    {System.out.println("Please enter an amount to convert");
    Scanner amountSelected = new Scanner(System.in);
    double input = amountSelected.nextDouble();
    USD turnStatic = new USD();
    Coin ILSValue = CoinFactory.getUSDInstance(Coins.USD);
    double value1 = turnStatic.calculate(input);
    System.out.println(value1);
    ArrayList<Double> previousResultsList = new ArrayList<>();
    previousResultsList.add(value1);
    previousResultsList.forEach(System.out::println);break;}
    else if (choice == 2)
    {System.out.println("Please enter an amount to convert");
    Scanner amountSelected = new Scanner(System.in);
    double input = amountSelected.nextDouble();
    ILS turnStatic2 = new ILS();
    Coin USDValue = CoinFactory.getILSInstance(Coins.ILS);
    double value2 = turnStatic2.calculate(input);
    System.out.println(value2);
    ArrayList<Double> previousResultsList = new ArrayList<>();
    previousResultsList.add(value2);
    previousResultsList.forEach(System.out::println);break;}}}

    private static void doOver()
    {while (true)
    {Scanner YesOrNo = new Scanner(System.in);
    String YN = YesOrNo.next();
    if (!YN.equalsIgnoreCase("Y") && !YN.equalsIgnoreCase("N"))
    {System.out.println("Invalid Choice, please try again.");
    Scanner YesOrNo2 = new Scanner(System.in);
    String YN2 = YesOrNo2.next();continue;}
    else if (YN.equals("Y"))
    {regetInput();
    System.out.println("Want to start over? Y/N");break;}
    else if (YN.equals("N"))
    {System.out.println("Thanks for using our currency convertor!");break;}}}
}
