package valid;

public class ValidateValues {
    public static boolean validateString(String value)
    {
        if(value!=null && !"".equals(value))
        {
            return true;
        }
        return false;
    }

    public static boolean validateNumber(Long num)
    {
        if(num != 0 && num > 6000000000l)
        {
            return true;
        }
        return false;
    }
}
