package com.assignmentTHREE;

public class Main {

    public static void main(String[] args) {
	    String s1 = new String("you are an idiot");
        System.out.println(s1);
        s1= s1.concat(", may be not.");
        System.out.println(s1);

        System.out.println(s1.substring(18,29));
        System.out.println(s1.substring(25));

        System.out.println(s1.lastIndexOf("t"));
        System.out.println(s1.lastIndexOf("t", 1));
        System.out.println(s1.repeat(3));

        String s2= String.valueOf((long)23333333);
        System.out.println(s2);

        System.out.println(s1.toUpperCase());
        s1 = "      "+s1;
        System.out.println(s1);
        s1= s1.trim();
        System.out.println(s1);

        String str1 = "hello";
        String str2 = new String("hello");
        String str3 = "hello";
        String str4 = new String("hello");;

        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str2==str4);
        // new allocated a new memory
        // declare with equal will result in same reference
    }
}
