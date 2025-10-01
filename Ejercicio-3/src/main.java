/*Dado el archivo countrties.txt (revisa el apartado recursos) que contiene países y capitales.
El programa debe leer el archivo y guardar los datos en un HashMap<String, String>.
El programa pide el nombre del usuario/a, y después debe mostrar un país de forma aleatoria,
guardado en HashMap. Se trata de que el usuario debe escribir el nombre de la capital del país en cuestión.
Si acierta se le suma un punto. Esta acción se repite 10 veces. Una vez solicitadas las capitales de 10 países de forma aleatoria,
entonces debe guardarse en un fichero llamado classificacio.txt, el nombre del usuario y su puntuación.*/

import java.util.HashMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        HashMap<String, String> capitalCities = new HashMap<>();

        File myObj = new File("./files/countries.txt");

        // try-with-resources: Scanner will be closed automatically
        try (Scanner myReader = new Scanner(myObj)) {
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] parts = data.split(" ");
                String country = parts[0];
                String capital = parts[1];
                capitalCities.put(country, capital);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        System.out.println(capitalCities.keySet());
        System.out.println(capitalCities.values());

        //boolean	containsValue(Object value)
        //Returns true if this map maps one or more keys to the specified value.

    }
}
