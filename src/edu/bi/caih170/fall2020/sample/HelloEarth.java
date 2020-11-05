package edu.bi.caih170.fall2020.sample;

public class HelloEarth {

    public static void main(String[] args) {
        String name = "Stranger";
        if (args.length > 0) {
            name = args[0];
        }
        System.out.println("Hello, " + name + "!");
    }
}
