package Uppgift3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstname = "";
        String lastname = "";
        String favoritemovie = "";
        int quit=0;
        List<Person> listOfPerson = new ArrayList<Person>();
        Person person = new Person();

        do {
            System.out.println("Do you want to add more?, " +
                    "press 1 to quit or press 2 to continue!");
            quit=input.nextInt();
            if(quit==2) {
                System.out.println("What is your firstname?");
                firstname = input.next();
                person.setFirstName(firstname);

                System.out.println("What is your lastname?");
                lastname = input.next();
                person.setLastName(lastname);


                System.out.println("What is your favoritemovie?");
                favoritemovie = input.next();
                person.setFavouriteMovie(favoritemovie);
            }
        } while (quit!=1);
        listOfPerson.add(person);

        for(Person read: listOfPerson){
            System.out.println("Person firstname is: " + read.getFirstName());
            System.out.println("Person lastname is: " + read.getLastName());
            System.out.println("Person favoritemovie is: " + read.getFavouriteMovie());
        }




    }
}
