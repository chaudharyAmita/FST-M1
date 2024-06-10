package com.example;

public class Activity8 {
    public static void main(String[] args) {
        try {
            Activity8.exceptionTest("Great message");
            Activity8.exceptionTest(null);
        } catch (CustomException e) {
            e.printStackTrace();
            System.out.println("Error Message: "+e.getMessage());
        }

    }

    static void exceptionTest(String s) throws CustomException{
        if (s == null){ 
            throw new CustomException("String value is null");
        }else
            System.out.println(s);
    }

}
