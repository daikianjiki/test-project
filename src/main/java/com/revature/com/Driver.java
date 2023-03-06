package com.revature.com;

public class Driver {

    public static void main(String[] args) {
        // check the length

        if (args.length > 0)
            System.out.println("Hello world from " + args[0]);
        else
            System.out.println("Hello world, again");
    }
}
