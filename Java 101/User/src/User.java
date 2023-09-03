import java.util.Scanner;
public class User {
    public static void main(String[] args) {
        //Define the variables
        String userNameMain = ("patika"), userNameTemp, passwordTemp, passwordMain = ("12345");
        int userLogin;

        //Login section
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
                    userNameMain = input.nextLine();
                    System.out.print("Enter your password:");
                    passwordMain = input.nextLine();
                    System.out.println("The account has been successfully created");
                    break;
                case 2:
                    System.out.print("Enter your username:");
                    userNameTemp = input.nextLine();
                    System.out.print("Enter your password:");
                    passwordTemp = input.nextLine();

                    if(userNameTemp.equals(userNameMain) && passwordTemp.equals(passwordMain)){
                        System.out.println("Login Successful");
                    }
                    else {
                        System.out.println("Login Unsuccessful");
                    }

                    break;
                case 3:
                    System.out.print("Enter your username:");
                    userNameTemp = input.nextLine();
                    System.out.print("Enter your password:");
                    passwordTemp = input.nextLine();

                    if(userNameTemp.equals(userNameMain) && (passwordTemp.equals(passwordMain))){
                        System.out.println("Enter another password");
                    }
                    else{
                        System.out.println("The account has been successfully created");
                        boolean passwordSuccessful = false;
                        System.out.println("Sign In");
                        System.out.print("Enter your username:");
                        userNameTemp = input.nextLine();

                        passwordMain = passwordTemp;
                        while(!passwordSuccessful) {
                            System.out.print("Enter your password:");
                            passwordTemp = input.nextLine();
                            if (passwordMain.equals(passwordTemp)) {
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
