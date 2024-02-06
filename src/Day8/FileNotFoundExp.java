package Day8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFoundExp {
    public static void main(String[] args) {
        String filename = "my_file.txt"; // Replace with the actual filename

        try {
            // Create a Scanner object to read from the file
            Scanner File = new Scanner(new File(filename));

            // Read data from the file
            while (File.hasNextLine()) {
                String line = File.nextLine();
                System.out.println(line);
            }

            File.close();
        } catch (FileNotFoundException e) {
            // Catch the exception if the file is not found
            System.out.println("Error: The file '" + filename + "' was not found.");

        }
        try {
            // Create a Scanner object to read from the file
            Scanner File = new Scanner(new File(filename));

            // Read data from the file
            while (File.hasNextLine()) {
                String line = File.nextLine();
                System.out.println(line);
            }

            File.close();
        } catch (FileNotFoundException e) {
            // Catch the exception if the file is not found
            System.out.println("Error : Try to Research Another File");

        }
        }

    }

