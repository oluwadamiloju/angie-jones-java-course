package chapter13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) throws IOException {
//        createANewFile();
//        numbersExceptionHandling();
        createNewFileRethrow();
    }

    private static void createNewFileRethrow() throws IOException{
        File file = new File("resources/nonexistent.txt");
        file.createNewFile();
    }

    private static void numbersExceptionHandling() {
        File file = new File("resources/numbers.txt");

        try(Scanner fileReader = new Scanner(file)) {
            while(fileReader.hasNext()) {
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        } catch (FileNotFoundException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }

    private static void createANewFile() {
        File file = new File("resources/nonexistent.txt");
        try {
            file.createNewFile();
        } catch (IOException e){
            System.out.println("Directory does not exist");
            e.printStackTrace();
        }
    }
}
