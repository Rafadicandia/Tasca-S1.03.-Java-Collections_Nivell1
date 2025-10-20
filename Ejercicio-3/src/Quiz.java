import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static java.util.Collections.shuffle;

public class Quiz {

    static Scanner sc = new Scanner(System.in);

    public static void askRandomCountry(String userName){
        int answerCounter=0;
        int questionsCounter=0;


        while(questionsCounter<10){
            // Get a random entry from the HashMap.
            String[] arrayKeys = Countries.capitalCities.keySet().toArray(new String[0]);
            String randomCountry = arrayKeys[new Random().nextInt(arrayKeys.length)];
            System.out.println("Do you know the capital of " + randomCountry+"?");
            String answer = sc.next();
            String normalizedCapital = Countries.capitalCities.get(randomCountry).toLowerCase().trim();
            String normalizedAnswer = answer.toLowerCase().trim();

            if(normalizedAnswer.equals(normalizedCapital)){
                System.out.println("Congratulations!! "+answer+" is the correct answer.");
                answerCounter++;
                questionsCounter++;
                System.out.println("You have "+answerCounter+"/10");

            }else{
                System.out.println("wrong answer");
                System.out.println("The capital of "+randomCountry+" is: "+Countries.capitalCities.get(randomCountry));
                System.out.println("You have "+answerCounter+"/10");
                questionsCounter++;
            }
            if(questionsCounter==10){
                System.out.println(userName+" you ran out of possibilities!");
                System.out.println("** Final score **");
                System.out.println(answerCounter+"/10");

            }
        }
        FileExport.exportAnswerToFile(userName, answerCounter);



    }

}
