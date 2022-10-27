package Uppgift2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Press 1 to type your name and 2 to quit");

        String answer=input.next();

        switch(answer){
            case"1":
                System.out.println("What is your name?");
                String name = input.next();
                char firstLetter = name.charAt(0);
                String string = Character.toString(firstLetter);
                if (string.equalsIgnoreCase("Ö")) {
                    System.out.println("Your name start with Ö and it is the last " +
                            "letter in alphabet");
                } else {

                    System.out.println("Your name start with " + firstLetter);

                }
                break;
            case"2":
                System.out.println("Good bye");

            default:
                System.out.println("Press 1 or 2");


        }



    }





}
