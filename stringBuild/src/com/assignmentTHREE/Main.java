package com.assignmentTHREE;


public class Main {

    public static void main(String[] args) {
        StringBuilder b1 = new StringBuilder(); // default initial capacity = 16
        StringBuilder b2 = new StringBuilder(10);
        StringBuilder b3 = new StringBuilder("Hello, world");
        b3.trimToSize();
        System.out.println(b1 + "\n" + b2+ "\n "+ b3 );
        System.out.println("b1.capacity() = "+b1.capacity() + "\n" + "b2.capacity() = " + b2.capacity()+
                "\n "+"b3.capacity() = "+ b3.capacity() );

        b3.delete(0, 5);
        System.out.println(b3);
        b3.replace(0,1, "Hi,");
        System.out.println(b3);
        b2 =b3;
        System.out.println(b2==b3);
        System.out.println("b2 = b3");
        System.out.println("b2 = " +b2 + "\n b3 =  "+b3);
        b2.reverse();
        System.out.println("b2 = "+b2  + "\n b3 =  "+b3 );

        int L = b2.length();
        for(int i =0; i<L; i++)
        {
            System.out.println("b2[" + i + "] = " + b2.charAt(i));
        }
        b2.append(b2);
        System.out.println(b3);



    }
}
