package app;

import main.UserLoginClass;
import main.UserRegistrationClass;

import java.util.Scanner;

public class ApplicationStartup {
    public static void main(String[] args) {
        System.out.println("\n\n\nWelcome to Brainy Beams..."+"\n\n\n\n");
        Scanner sc = new Scanner(System.in);
        int choice;


        try {
            do{
                System.out.println("\n\n-----------Enter 1 for Regestraion, Enter 2 for Login and Enter 3 for Exit-----------\n\n ");
                System.out.println("Enter your choice: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        UserRegistrationClass obj = new UserRegistrationClass();
                        boolean isSuccess = obj.register();
                        if(isSuccess)
                        {

                            System.out.println("\n Hii "+ApplicationContext.getDataContext().getFirstName()+" You Registred Successfully!!\n\n\n\n\n");
                            break;
                        }
                        else{
                            System.out.println("Regestration Fail!!!\n\n");
                            break;
                        }
                    case 2:
                        UserLoginClass userLoginObj = new UserLoginClass();
                        while (!userLoginObj.login()) {
                            System.out.println("\n\n Envalid Email or Password \n\n");
                        }
                        System.out.println("-------------Login Successfull------------\n\n");
                        break;
                    case 3:
                        System.out.println("---------Thank you -------\n\n");
                        break;
                    default:
                        System.out.println("Please Enter Valid Choice-----\n");
                        break;
                }
            }while(choice !=3);
        } catch (Exception e) {
            System.out.println("\n\nSomething went wrong !!!! Please enter valid Details.....");
            main(null);
        }
    }
}
