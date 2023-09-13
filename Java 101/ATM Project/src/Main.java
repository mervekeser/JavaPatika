import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        String userName, password;
        int right = 3;
        int balance = 1500;
        int select;
        Scanner input = new Scanner(System.in);
        while (right > 0) {
            System.out.print("Please enter your username:");
            userName = input.nextLine();
            System.out.print("Please enter your password:");
            password = input.nextLine();

            if(userName.equals("patika") && password.equals("dev123")){
                System.out.println("Welcome to Patika Bank");
                do {
                    System.out.println("1-)Withdraw Money\n"+
                                        "2-)Deposit Money\n"+
                                        "3-)Check Balance\n"+
                                        "4-)Log Out");
                    System.out.print("Please select the process you want:");
                    select = input.nextInt();

                    switch (select){
                        case 1:
                            System.out.print("Specify the amount of money you want to withdraw:");
                            int price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Specify the amount of money you want to deposit:");
                            int priceDep = input.nextInt();
                            if (priceDep > balance) {
                                System.out.println("Insufficient Balance");
                            } else {
                                balance -= priceDep;
                            }
                            break;
                        case 3:
                            System.out.println("Your Balance:" +balance);
                            break;
                    }
                }
                while(select!=4);
                System.out.println("See you again soon");
                break;
            }
            else{
                right--;
                System.out.println("Wrong Username or Password! Try again.");
                if (right == 0) {
                    System.out.println("Your account has been blocked. Please contact the bank.");
                } else {
                    System.out.println("Your remaining right: " + right);
                }
            }
        }
    }
}
