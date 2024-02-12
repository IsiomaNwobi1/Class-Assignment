package week1_curriculum_activities.task2;

import java.io.*;
import java.util.Arrays;

public class CSVReader {

    //the goal is to create a file and be able to read from that file
    public static void main(String[] args) {

        //first check if your file exists.
        File file = new File("src/main/java/week1_curriculum_activities/task2/StudentList - Sheet1.csv");
        boolean exist = file.exists();
        System.out.println(exist);

        // Next, check the length of your file.
        long size = file.length();
        System.out.println(size);

        //now we want to read from that file. To be able to read a file, we need a reader buffer class.
        //File extends BufferReader extends Reader
        try {
            BufferedReader buffer = new BufferedReader(new FileReader(file));
            String line = "";

            while ((line = buffer.readLine()) != null) {
                String[] array = line.split(",");
                System.out.println(Arrays.toString(array));

                //this is to print just 1 line in the file
                //String line == buffer.readLine();
                //while(line !=Null);
                //String[] array = line.split(",");
                //System.out.println(line);
                //line = buffer.readLine();

                //this is to print out only students name
                //System.out.println("Students name: " + array[0]);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
