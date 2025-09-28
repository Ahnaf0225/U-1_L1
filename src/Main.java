import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your bill: ");
        double bill = scan.nextDouble();
        scan.nextLine();

        System.out.print("Enter tip percent in whole numbers and without % sign: ");
        int tip = scan.nextInt();
        scan.nextLine();

        System.out.print("Number of people: ");
        int people = scan.nextInt();
        scan.nextLine();

        System.out.println();
        System.out.println("-----------------------------------------------");

        double tipamount = bill * ((double)tip / 100);      //gives the unestimated tip amount
        double t = tipamount % 0.01;                       //basically a way to isolate any number past the hundredth place
        double acctipamount = tipamount - t;              //subtracts the unestimated tip amount and any numbers past the hundredth place
                                                         //example: 123.456 - 0.006 (I don't actually know how to truly estimate)

        System.out.println("Total tip amount: $" + acctipamount);

        double totalbillamount = bill + acctipamount;
        System.out.println("Your total bill cost: $" + totalbillamount);

        double tipperperson = acctipamount / people;      //same thing as the directions for Tip Amount
        double tp = tipperperson % 0.01;
        double acctipperperson = tipperperson - tp;

        System.out.println("Tip per person: $" + acctipperperson);













    }


}