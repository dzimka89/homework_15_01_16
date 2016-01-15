package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by dmitriy on 15.01.2016.
 */
public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Buildings build = new Buildings();

        System.out.println("Enter height of building:");
        String sHeight = reader.readLine();
        double height = Integer.parseInt(sHeight);

        System.out.println("Enter width of building:");
        String sWidth = reader.readLine();
        double width = Integer.parseInt(sHeight);

        System.out.println("Enter length of building:");
        String sLength = reader.readLine();
        double lenght = Integer.parseInt(sHeight);

        System.out.println("Enter material(metal, metal and plastic, concrete) of building:");
        String material = reader.readLine();

        System.out.println("Enter name of building:");
        String name = reader.readLine();

        System.out.println("Enter owner(company or private person) of building:");
        String owner = reader.readLine();

        System.out.println("Building information:");
        System.out.print("Name: ");
        System.out.println(build.nameOfBuilding(name, owner));
        System.out.print("Type of building: ");
        System.out.println(build.type(height));
        System.out.print("Number of floors: ");
        System.out.println(build.numberOfFloors(height));
        System.out.print("Permission: ");
        System.out.println(build.Permission(height, build.weightOfBuilding(height, width, lenght, material)));
        System.out.print("Weight: ");
        System.out.println(build.weightOfBuilding(height, width, lenght, material));
        System.out.print("Square: ");
        System.out.println(build.squareOfBuilding(width, lenght));






    }
}
