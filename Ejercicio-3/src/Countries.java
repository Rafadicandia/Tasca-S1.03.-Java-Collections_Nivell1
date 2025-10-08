import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Countries {

    static HashMap<String, String> capitalCities = new HashMap<>();

    public static void loadData(){
        File myObj = new File("./files/countries.txt");

        // try-with-resources: Scanner will be closed automatically
        try (
                Scanner myReader = new Scanner(myObj)) {
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] parts = data.split(" ");
                String country = parts[0];
                String capital = parts[1];
                capitalCities.put(country, capital);
            }
        } catch (
                FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }





}
