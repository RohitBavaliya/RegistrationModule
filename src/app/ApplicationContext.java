package app;

import java.util.ArrayList;
import java.util.List;

public class ApplicationContext {
    private static List<ApplicationContext> dataList = new ArrayList<>();
    private static ApplicationContext dataContext = new ApplicationContext();

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private long mobileNo;

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }
    public String getEmail(){
        return email;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
    public String getPassword(){
        return password;
    }

    public void setMobileNo(long mobileNo)
    {
        this.mobileNo = mobileNo;
    }
    public long getMobileNo(){
        return mobileNo;
    }

    public static List<ApplicationContext> getDataList()
    {
        return dataList;
    }
    public static void setDataList(List<ApplicationContext> newDataList)
    {
        dataList.addAll(newDataList);
    }
    public static ApplicationContext getDataContext()
    {
        return dataContext;
    }
    public static void setDataContext(ApplicationContext dataContext)
    {
        ApplicationContext.dataContext = dataContext;
    }

    @Override
    public String toString() {

        return "ApplicationContext [FirstName =" + firstName + ", LastName =" +lastName
                + ", Email =" + email + ", Password =" + password +", MobileNo =" +mobileNo +"]";
    }
}
