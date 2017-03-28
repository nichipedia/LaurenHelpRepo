package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {
        String fileName = "fun.txt";
        String line = null;

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null)
            {
                System.out.println(line);
            }
        } catch (FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch (java.io.IOException e)
        {
            System.out.println("io");
        }
    }
}





