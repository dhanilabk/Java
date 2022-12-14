package learningPackage;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

public class twoB_EmailValidation {
	public static boolean isValid(String email)
    {
        String emailRegex1 = "^[a-zA-Z0-9+_&*-]+(?:\\."+ "[a-zA-Z0-9_+&*-]+)*@" +
                            "(?:[a-zA-Z0-9]+\\.)+[a-z" +
                            "A-Z]{2,7}$";
        String emailRegex2 = "^[a-zA-Z0-9]+(?:\\.)"+ "*@" +
                "(?:[a-zA-Z0-9]+\\.)+[a-z" +
                "A-Z]{2,7}$";
                              
 String emailRegex= "^[a-zA-Z0-9]+(?:\\."+ "[a-zA-Z0-9])*@" +
         "(?:[a-zA-Z0-9]+\\.)+"+"[a-zA-Z]{2,7}$";
        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }
}
