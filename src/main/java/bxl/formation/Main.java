package bxl.formation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(new File( new ResourceLoader().getResourceFile("file.txt") ))){

            System.out.println( sc.nextLine() );

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
