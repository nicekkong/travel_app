package com.je.travel.util;


public class ValidateUtil {


    public static boolean isLongFormat(String strLong) {

        try {
            Long.parseLong(strLong);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

}
