import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        File file = new File("Exercise1.txt");
        File file1 = new File("Exercise3.txt");

        try {
            //---------------
            // Exercise 1
            //---------------
            FileWriter writer = new FileWriter(file);
            writer.write("This is my first exercise");
            writer.close();


            //---------------
            // Exercise 2
            //---------------
            FileReader reader = new FileReader(file);
            int fileContent;
            while ((fileContent = reader.read()) != -1) {
                System.out.print((char) fileContent);
            }
            System.out.println("");
            reader.close();


            //---------------
            // Exercise 2 (File read using Scanner)
            //---------------
            Scanner file_reader = new Scanner(file);
            while (file_reader.hasNextLine()) {
                String text = file_reader.nextLine();
                System.out.println(text);
            }


            //---------------
            // Exercise 3
            //---------------
            double[] array = {1.2, 2.5, 3.6, 12.5};
            FileWriter writer1 = new FileWriter(file1);

            int i = 0;
            while (i < array.length) {
                String strDouble = String.valueOf(array[i]);
                writer1.write(strDouble + "\n");
                i++;
            }
            writer1.close();
            file_reader.close();


            //---------------
            // Exercise 4
            //---------------
            Scanner file_reader1 = new Scanner(file1);

            String[] array1 = new String[100];
            int index = 0;
            while (file_reader1.hasNextLine()) {
                String text = file_reader1.nextLine();
                array1[index] = text;
                index++;
            }
            file_reader1.close();

            for (int j = 0; j < index; j++) {
                System.out.println(array1[j] + " ");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}