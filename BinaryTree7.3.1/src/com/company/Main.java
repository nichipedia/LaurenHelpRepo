package com.company;
import java.util.Scanner;
import java.io.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter file name: ");
        String fileName = in.nextLine();
        String line = null;
        try
        {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null)
            {
                System.out.println(line);
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch (java.io.IOException e)
        {
            System.out.println("");
        }

        System.out.println();
    }

}
