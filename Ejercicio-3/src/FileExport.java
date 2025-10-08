
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;

public class FileExport {
    public static void exportAnswerToFile(String userName, int answerCounter){

        try {
            FileWriter userFile = new FileWriter("./files/classification.txt");
            userFile.write(userName+" your final score was "+answerCounter+"/10");
            userFile.close();  // must close manually
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
