package main;

import app.ApplicationContext;
import valid.ValidateValues;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserRegistrationClass {
    Scanner sc = new Scanner(System.in);
    public boolean register()
    {
        System.out.println("--------------Ragistration Page------------\n");
        System.out.println("------- Press 1 for Enter more than one user details ------------");
        System.out.println("------- Press any for Enter Only your details --------- \n\n");
        System.out.print("Enter your choice: ");
        int options = sc.nextInt();

        if(options==1)
        {
            List<ApplicationContext> dataList = getUserBulkRegistrationDetails();
            if (dataList!=null && !dataList.isEmpty()) {
                ApplicationContext.setDataList(dataList);
                return true;
            }
        }else {
            ApplicationContext obj = getUserRegistrationDetails();
            if (obj != null) {
                ApplicationContext.getDataContext().setEmail(obj.getEmail());
                ApplicationContext.getDataContext().setFirstName(obj.getFirstName());
                ApplicationContext.getDataContext().setLastName(obj.getLastName());
                ApplicationContext.getDataContext().setMobileNo(obj.getMobileNo());
                ApplicationContext.getDataContext().setPassword(obj.getPassword());
                return true;
            }
        }
        return false;

    }


    public List<ApplicationContext> getUserBulkRegistrationDetails()
    {
        System.out.println("\n\n--------------------Welcome to Bulk Registration page--------------------");
        System.out.print("How many details you wan't to add: ");
        List<ApplicationContext> userDataList = new ArrayList<>();
        try {
            int no_records = sc.nextInt();
            for (int i = 1; i <= no_records; i++) {
                System.out.println("\n\nEnter User "+ i + " Details...\n\n" );
                ApplicationContext obj = getUserRegistrationDetails();
                if (obj!=null) {
                    userDataList.add(obj);
                    System.out.println("\n\nData Inserted Successfully!...");
                } else {
                    return null;
                }
            }
        } catch (Exception e) {
            System.out.println("\nSomething went wrong!!!");
            getUserBulkRegistrationDetails();
        }

        return userDataList;

    }
    public ApplicationContext getUserRegistrationDetails()
    {
        ApplicationContext obj = new ApplicationContext();
        boolean isValid = false;

        System.out.println("Enter your first name:");
        String firstName = sc.next();
        isValid = ValidateValues.validateString(firstName);
        if(isValid)
        {
            obj.setFirstName(firstName);
        }else{
            System.out.println("First Name is Empty!!!..");
            return null;
        }

        System.out.println("Enter your last name");
        String lastName = sc.next();
        isValid = ValidateValues.validateString(lastName);
        if(isValid)
        {
            obj.setLastName(lastName);;
        }else{
            System.out.println("Last Name is Empty!!!..");
            return null;
        }

        System.out.println("Enter your email id:");
        String email = sc.next();
        isValid = ValidateValues.validateString(email);
        if(isValid)
        {
            obj.setEmail(email);
        }else{
            System.out.println("email is Empty!!!..");
            return null;
        }

        System.out.println("Enter your password:");
        String password = sc.next();
        isValid = ValidateValues.validateString(password);
        if(isValid)
        {
            obj.setPassword(password);
        }else{
            System.out.println("password is Empty!!!..");
            return null;
        }

        System.out.println("Enter your mobile number:");
        Long mobileNo = sc.nextLong();
        isValid = ValidateValues.validateNumber(mobileNo);
        if(isValid)
        {
            obj.setMobileNo(mobileNo);
        }
        else{
            System.out.println("Envalid Mobile Number..");
            return null;
        }
        return obj;
    }

}
