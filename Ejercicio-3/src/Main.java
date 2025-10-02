


import java.util.Scanner;

public class Main {

    private static String askName(Scanner sc){
    System.out.println("Please type your name: ");

    String name = sc.next();
    System.out.println("Hello "+name+"!");
    return name;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Countries.loadData();
        System.out.println("--Let's test your geography knowledge. Are you ready?--");
        String userName=askName(sc);

       Quiz.askRandomCountry(userName);






    }


}
