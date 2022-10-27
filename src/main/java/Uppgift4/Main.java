package Uppgift4;

import Uppgift3.Person;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)throws IOException {
        Scanner input = new Scanner(System.in);
        int quit = 0;
        List<Person> listOfPerson = new ArrayList<>();
        List<Person> allPerson = new ArrayList<>();
        ObjectMapper mapper = new ObjectMapper();
        Path personPath = Paths.get("src/main/resources/person.json");
        Person person = new Person();
        if (personPath.toFile().exists()) {
            allPerson = List.of(mapper.readValue(personPath.toFile(), Person[].class));

        }


        do {
            System.out.println("Do you want to add more?, " +
                    "press 1 to quit or press 2 to continue!");
            quit = input.nextInt();
            if (quit == 2) {
                System.out.println("What is your firstname?");
                String firstname = input.next();
                person.setFirstName(firstname);

                System.out.println("What is your lastname?");
                String lastname = input.next();
                person.setLastName(lastname);

                System.out.println("What is your favoritemovie?");
                String favoritemovie = input.next();
                person.setFavouriteMovie(favoritemovie);

            }
        } while (quit != 1);

        listOfPerson.add(person);
        mapper.writeValue(personPath.toFile(), listOfPerson);
        Person[] allPersons;
        allPersons = mapper.readValue(personPath.toFile(),
                Person[].class);

        for(Person read: allPersons){
            System.out.println(read.getFirstName());
            System.out.println(read.getLastName());
            System.out.println(read.getFavouriteMovie());
        }


    }





}
