import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Countries {

    static HashMap<String, String> capitalCities = new HashMap<>();
    private static final File FILE = new File("./files/countries.txt");

    public static void loadData(){


        // try-with-resources: Scanner will be closed automatically
        try (
                Scanner myReader = new Scanner(FILE)) {
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
