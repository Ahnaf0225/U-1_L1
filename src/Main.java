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

        double tipamount = bill * ((double)tip / 100); //gives the unestimated tip amount
        double t = tipamount % 0.01;
        double acctipamount = tipamount - t;

        System.out.println(acctipamount);












    }


}