package context;

import java.util.ArrayList;
import java.util.List;

public class ComplainContext {
    private int id;
    private String title;
    private String description;
    private String address;
    private long mobileNo;
    private int userId;

    private static List<ComplainContext> complainList = new ArrayList<>();
    private static ComplainContext complainContext = new ComplainContext();


    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }


    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }


    public String getDescription() {
        return this.description;
    }
    public void setDescription(String description) {
        this.description = description;
    }


    public String getAddress() {
        return this.address;
    }
    public void setAddress(String address) {
        this.address = address;
    }


    public long getMobileNo() {
        return this.mobileNo;
    }
    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }


    public int getUserId() {
        return this.userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }


    public static List<ComplainContext> getComplainList(){
        return complainList;
    }

    public static void setComplainList(List<ComplainContext> complainList){
        complainList.addAll(complainList);
    }

    public static ComplainContext getComplainContext(){
        return complainContext;
    }

    public static void setComplainContext(ComplainContext complainContext){
        ComplainContext.complainContext = complainContext;
    }


}
