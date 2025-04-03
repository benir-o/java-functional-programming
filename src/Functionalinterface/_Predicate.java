package Functionalinterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        //The non-functional way
        System.out.println("Without predicate");
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("09532450000"));

        System.out.println("With predicate");
        System.out.println(isPhoneNumberValid.test("07000000000"));

        System.out.println(
                "Is phone Number valid and contains number 3= "+
                isPhoneNumberValid.and(containsNumber3).test("0900035567"));
        System.out.println(
                "Is phone Number valid and contains number 3= "+
                        isPhoneNumberValid.and(containsNumber3).test("07345678901"));
    }


    static  Predicate<String> isPhoneNumberValid=
            phoneNumber->
            phoneNumber.startsWith("07")&&phoneNumber.length()==11;

    static Predicate<String> containsNumber3= phoneNumber->
            phoneNumber.contains("3");
    static boolean isPhoneNumberValid(String PhoneNumber){
        return PhoneNumber.startsWith("07") && PhoneNumber.length()==11;
    }
}
