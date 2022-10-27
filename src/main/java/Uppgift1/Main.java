package Uppgift1;

import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


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


        }

}
