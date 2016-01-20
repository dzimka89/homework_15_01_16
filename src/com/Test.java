package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by dmitriy on 15.01.2016.
 */
public class Test {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter height of building:");
        String sHeight = reader.readLine();
        double height = Integer.parseInt(sHeight);

        System.out.println("Enter width of building:");
        String sWidth = reader.readLine();
        double width = Integer.parseInt(sWidth);

        System.out.println("Enter length of building:");
        String sLength = reader.readLine();
        double length = Integer.parseInt(sLength);

        System.out.println("Enter material(metal, metal and plastic, concrete) of building:");
        String material = reader.readLine();

        System.out.println("Enter name of building:");
        String name = reader.readLine();

        System.out.println("Enter owner(company or private person) of building:");
        String owner = reader.readLine();

        Buildings building = new Buildings(name, owner, height, width, length, material);
        

    }
}
