package javacore_interview;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExamples {
    public static void main(String[] args) {
        System.out.println("Not valid results");
        validateUserName("#asqw_172");
        validateEmail("tetswewf.asdadsasd.com");
        validateUserPassword("P");
        validateTimeIn24("11:00 am");
        validateTimeIn12("23:00 am");

        System.out.println("Valid results");
        validateUserName("emacs");
        validateEmail("user@gmail.com");
        validateUserPassword("P@s$w0rd");
        validateTimeIn24("11:00");
        validateTimeIn12("1:00am");
    }

    private static void validateTimeIn12(String time) {
        Pattern pattern;
        Matcher matcher;
        String regexp = "(1[012]|[1-9]):[0-5][0-9](\\\\s)?(?i)(am|pm)";
//        (				#  start of group #1
//        1[012]		#  start with 10, 11, 12
//        |				#  or
//        [1-9]			#  start with 1,2,...9
//        )				#  end of group #1
//        :				#  follow by a semi colon (:)
//        [0-5][0-9]	#  follw by 0..5 and 0..9, which means 00 to 59
//        (\\s)?		#  follow by a white space (optional)
//        (?i)		    #  next checking is case insensitive
//        (am|pm)	    #  follow by am or pm
        pattern = Pattern.compile(regexp);
        matcher = pattern.matcher(time);
        System.out.println("Your time in 12 format is : " + matcher.matches());
    }

    private static void validateTimeIn24(String time) {
        Pattern pattern;
        Matcher matcher;
        String regexp = "([01]?[0-9]|2[0-3]):[0-5][0-9]";
//        (				#  start of group #1
//        [01]?[0-9]	#  start with 0-9,1-9,00-09,10-19
//        |				#  or
//        2[0-3]		#  start with 20-23
//        )				#  end of group #1
//        :				#  follow by a semi colon (:)
//        [0-5][0-9]	#  follw by 0..5 and 0..9, which means 00 to 59
        pattern = Pattern.compile(regexp);
        matcher = pattern.matcher(time);
        System.out.println("Your time in 24 format is : " + matcher.matches());
    }

    private static void validateUserPassword(String password) {
        Pattern pattern;
        Matcher matcher;
        String regexp = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";
//        (			    # Start of group
//        (?=.*\d)		#   must contains one digit from 0-9
//        (?=.*[a-z])	#   must contains one lowercase characters
//        (?=.*[A-Z])	#   must contains one uppercase characters
//        (?=.*[@#$%])	#   must contains one special symbols in the list "@#$%"
//        .		        #   match anything with previous condition checking
//        {6,20}	    #   length at least 6 characters and maximum of 20
//        )			    #   End of group
        pattern = Pattern.compile(regexp);
        matcher = pattern.matcher(password);
        System.out.println("Your password is : " + matcher.matches());
    }

    private static void validateEmail(String email) {
        Pattern pattern;
        Matcher matcher;
        String regexp = "";


        pattern = Pattern.compile(regexp);
        matcher = pattern.matcher(email);
        System.out.println("Your email is : " + matcher.matches());
    }

    private static void validateUserName(String username) {
        Pattern pattern;
        Matcher matcher;
        String regexp = "^[a-z0-9_-]{3,15}$";
//        ^                    # Start of the line
//        [a-z0-9_-]	       # Match characters and symbols in the list, a-z, 0-9, underscore, hyphen
//        {3,15}               # Length at least 3 characters and maximum length of 15
//        $                    # End of the line

        pattern = Pattern.compile(regexp);
        matcher = pattern.matcher(username);
        System.out.println("Your username is : " + matcher.matches());
    }
}