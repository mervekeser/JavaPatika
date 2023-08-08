import java.util.Scanner;
public class User {
    public static void main(String[] args) {
        //define the variables
        String userName = ("patika"), userName2, password2, password = ("12345");
        int userLogin;

        //
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("-------Sign In / Sign Up-------");
            System.out.println("1-) Sign Up");
            System.out.println("2-) Sign In");
            System.out.println("3-) Forgot Password?");
            System.out.println("0-) Exit");
            userLogin = input.nextInt();
            input.nextLine();

            switch(userLogin){
                case 1:
                        System.out.print("Enter your username:");
                        userName = input.nextLine();
                        System.out.print("Enter your password:");
                        password = input.nextLine();
                        System.out.println("The account has been successfully created");
                break;
                case 2:
                        System.out.print("Enter your username:");
                        userName2 = input.nextLine();
                        System.out.print("Enter your password:");
                        password2 = input.nextLine();

                        if(userName2.equals(userName) && password2.equals(password)){
                            System.out.println("Login Successful");
                        }
                        else {
                            System.out.println("Login Unsuccessful");
                        }

                break;
                case 3:
                        System.out.print("Enter your username:");
                        userName2 = input.nextLine();
                        System.out.print("Enter your password:");
                        password2 = input.nextLine();

                        if(userName2.equals(userName) && (password2.equals(password))){
                            System.out.println("Enter another password");
                        }
                        else{
                            System.out.println("The account has been successfully created");
                            boolean passwordSuccessful = false;
                            System.out.println("Sign In");
                            System.out.print("Enter your username:");
                            userName2 = input.nextLine();

                            password = password2;
                             while(!passwordSuccessful) {
                                 System.out.print("Enter your password:");
                                 password2 = input.nextLine();
                                 if (password.equals(password2)) {
                                     passwordSuccessful = true;
                                     System.out.println("Login Successful");

                                 }
                                 else{
                                     System.out.println("Wrong password!");
                                 }
                             }
                        }
                break;
            }
        }
        while(userLogin!=0);

    }
}
