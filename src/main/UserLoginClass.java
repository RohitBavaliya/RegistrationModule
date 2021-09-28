package main;

import app.ApplicationContext;
import valid.ValidateValues;

import java.util.Scanner;

public class UserLoginClass {

    public boolean login()
    {
        System.out.println("----------Welcome to Login Page------------");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your email id:");
        String email = sc.next();

        if(!ValidateValues.validateString(email))
        {
            return false;
        }

        System.out.println("Enter your password:");
        String password = sc.next();

        if(!ValidateValues.validateString(password))
        {
            return false;
        }

        if (processEmailAnPasswordValidation(email,password))
        {
            return true;
        }
        return false;
    }

    private boolean processEmailAnPasswordValidation(String email, String password)
    {
        if(ApplicationContext.getDataList().isEmpty()){
            if(isEmailPasswordExist(ApplicationContext.getDataContext(),email,password)){
                return true;
            }
        }else{
            for (ApplicationContext dataObj : ApplicationContext.getDataList()) {
                if(isEmailPasswordExist(dataObj,email,password)){
                    return true;
                }

            }
        }
        return false;
    }

    private boolean isEmailPasswordExist(ApplicationContext dataObj,String email, String password){
        if(email.equals(dataObj.getEmail()) &&
                password.equals(dataObj.getPassword())){
            return true;
        }
        return false;
    }
}
