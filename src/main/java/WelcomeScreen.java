import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class WelcomeScreen {
    public static void main(String[] args) throws IOException {

        //First screen (Welcome Screen):
        System.out.println("Welcome to currency convertor!");
        System.out.println("Please choose an option (1/2):");
        System.out.println("1. Dollars to Shekels.");
        System.out.println("2. Shekels to Dollars.");

        while (true)
        {Scanner choiceMade = new Scanner(System.in);
        int choice = choiceMade.nextInt();
        if (choice > 2 || choice < 1)
        {System.out.println("Invalid Choice, please try again.");
        Scanner choiceMade2 = new Scanner(System.in);
        int choice2 = choiceMade2.nextInt();continue;}
        else if (choice == 2 || choice == 1)
        {System.out.println("Please enter an amount to convert:");break;}}

        Scanner amountSelected = new Scanner(System.in);
        double input = amountSelected.nextDouble();

        USD turnStatic = new USD();
        Coin ILSValue = CoinFactory.getUSDInstance(Coins.USD);
        double value1 = turnStatic.calculate(input);

        Coin USDValue = CoinFactory.getILSInstance(Coins.ILS);
        double value2 = turnStatic.calculate(input);

        //Third screen (Result Screen):

        //Question 1: Right now it prints the two of them no matter the option.
        //I want only one of the values to be printed (according to the selected option).
        System.out.println(value1);
        System.out.println(value2);
        System.out.println("Start over? Y/N");

        //Question 2: How do I make the program restart without the "Welcome" text?
        //Question 3: If I type in Y or N, I don't get the prints that I want, why?
        Scanner YesOrNo = new Scanner(System.in);
        String YN = YesOrNo.next();
        if (YN == "Y"){System.out.println();}
        else if (YN == "N"){System.out.println("Thanks for using our currency convertor!");}

        //Question 4: I don't get a printed list of last results.
        //The results also aren't getting saved in the file.
        double[] previousResultsList = {};
        for (double Results : previousResultsList) {
            System.out.println(Results);}

        String filePath = "C:\\Users\\888\\Desktop\\Results.txt";
        String content = new String(Files.readAllBytes(Paths.get(filePath)));
        System.out.println(content);
    }
}
