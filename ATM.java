import java.util.*;

public class ATM { // class nae always should be your file name

    public static void main(String[] args) {

        int pin = 1234; // pin number //code arrangement shift+alt+f
        int balance = 10000; // current avail balance

        int Addamount = 0; // deposite
        int Takeamount = 0; // withdraw

        String name;

        Scanner scanner = new Scanner(System.in);

        // we have to enter the pin number in output
        System.out.println("Enter Your Pin Number");

        int password = scanner.nextInt(); // nextint is an function to get a number interger in a scanner

        if (password == pin) // to get the user pin to our condition
        {
            System.out.println("Enter Your Name");
            name = scanner.next();
            System.out.println("Welcome " + name);

            while (true) {
                System.out.println("Press 1 To  Chech your Balance");
                System.out.println("Press 2 To  Add Amount");
                System.out.println("Press 3 To  Take Amount");
                System.out.println("Press 4 For Reciept");
                System.out.println("Press 5 To  Exit!");

                int opt = scanner.nextInt();
                switch (opt) {
                    case 1:
                        System.out.println("Your Current Balance Is " + balance);
                        break;

                    case 2:
                        System.out.println("How Much Amount Do You Want To Add To Your Account");
                        Addamount = scanner.nextInt();
                        System.out.println("Successfully Credited!!!");
                        balance = Addamount + balance; // 10000 + 100 = 10100
                        break;

                    // to see the particular function in code press Ctrl+function keyword name we
                    // used

                    case 3:
                        System.out.println("How Much Amount You Want To Withdraw");
                        Takeamount = scanner.nextInt();
                        if (Takeamount > balance) {
                            System.out.println("Your Balance Is Insufficient");
                            System.out.println("Try Less Than Your Avail Balance");
                        } else {
                            System.out.println("Successfully Withdrawn!!!");
                            balance = balance - Takeamount; // balance = 10100 10100-100 = 10000
                        }
                        break;

                    case 4:

                        System.out.println("Welcome To All In One Mini ATM");
                        System.out.println("Available Balace Is " + balance);
                        System.out.println("Amount Deposited     " + Addamount);
                        System.out.println("Amount Withdrawn     " + Takeamount);
                        System.out.println("Thank You!!! Visit Again...");

                        break;
                    default:
                        System.out.println("Press The Number Below 5");
                        break;
                }
                if (opt == 5) {
                    System.out.println("Thank You!!!");
                    break;
                }

            }
        } else {
            System.out.println("Ops!!! Sorry... Transaction Failed Due To Wrong Pin Number");
        }

    }

}
