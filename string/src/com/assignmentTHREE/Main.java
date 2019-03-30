package com.assignmentTHREE;

public class Main {

    public static void main(String[] args) {
        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean

        String s1 = "This is a String";

        String s2= s1 + "and a string";

        String s3 = s1 + " \71";

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        int i1 = 10;
        String num = "250.55";
        System.out.println(num);
        System.out.println(num+10);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("//////////////////////////////////////////////////////////");
        char[] c = {'h', 'e', 'l', 'l','o'};
        char[] c1 = {'a', 'b', 'c', 'd','e', 'f', 'g'};
        char[] c2 = new char[5];
        c2[0] = '0';

        String a1 = new String();
        String a2 = new String(s1);
        String a3 =  new String(c);
        String a4 = new String( c, 2, 3 ); //starting from index 2, take 3 char
        System.out.println("a1 is "+a1 );
        System.out.println("a2 is "+ a2);
        System.out.println(  "a3 is "+ a3);
        System.out.println("a4 is "+a4);


        System.out.println("\n" + "a3[1] is "+ a3.charAt(1)); //a3[1] doesn't work in java

        //copied a2 to c2
        a2.getChars(0,4, c2, 1 );

        System.out.println("c2 contains :");
        for(int i =0; i <5; i++){
            System.out.println(c2[i]);
        }

        String empty = new String();

        System.out.println(a1.equals(c2) );
        if(a1.equals(empty)){
            System.out.println("a1 and empty have the same value");
        }
        if(a1 == empty){
            System.out.println("a1 and empty have the same reference");
        }

        // a2 = "This is a Sting "
        String a5 = new String("this");
        System.out.println( a2.regionMatches(true,0, a5, 0,4 ) );

        if(a2.startsWith(a5,0))
        {
            System.out.println( "a2 is start with a5");
        }
        else {
            System.out.println( "a2 is not start with a5");
        }

        System.out.println(a2.endsWith("g") );
        int a =  a2.endsWith("1") ? a2.indexOf('s') : a2.indexOf("is",3 );
        System.out.println(a);




    }
}
