package Uppgift6;

import java.util.Scanner;
/**
 */

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int point = 0;
        int sum = 0;
        String answer="";

        System.out.print("Nämn en av rollerna som finns inom Scrum");
        answer = input.next();
        if (answer.equalsIgnoreCase("Product owner") ||
                answer.equalsIgnoreCase("Scrum master" )
                || answer.equalsIgnoreCase ("Utvecklingsteamet")){
            point++;
        }
        System.out.print("Nämn en av ceremonierna som finns inom Scrum");
        answer = input.next();
        if (answer.equalsIgnoreCase("Sprintplanering")
                || answer.equalsIgnoreCase("Stand up")
                || answer.equalsIgnoreCase("Demo")
                || answer.equalsIgnoreCase("Stand up")) {
            point++;
        }
        System.out.print("Vad är rekommenderat max antal personer i ett team?");
        answer = input.next();
        if (answer.equalsIgnoreCase("9")){

            point++;
        }
        System.out.print("Scrum har ett dokument där ALL info om Scrum finns, " +
                "vad heter dokumentet?");
        answer = input.next();
        if (answer.equalsIgnoreCase("Scrum")){

            point++;
        }
        System.out.print("Vem är det enda personen får avbryta en Sprint?");
        answer = input.next();
        if (answer.equalsIgnoreCase("Scrum master")) {

            point++;
        }
        sum = +point;

        System.out.println("Du fick " + sum);

        if (sum < 3) {
            System.out.println("Du får läsa på mer");
        } else if (sum == 5) {
            System.out.println("Du fick alla rätt, GRATTIS!");
        }

    }
}
