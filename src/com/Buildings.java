package com;

/**
 * Created by dmitriy on 15.01.2016.
 */
public class Buildings {
    String kind ;
    int numberOfFloors;
    double weightOfBuilding;
    double squareOfBuilding;
    String permission;
    String nameAndOwner;

    public Buildings(String name, String owner, double height, double width, double length, String material) {
        System.out.println("Building information:");
        System.out.print("Name: ");
        System.out.println(setNameOfBuilding(name, owner));
        System.out.print("Type of building: ");
        System.out.println(getType(height));
        System.out.print("Number of floors: ");
        System.out.println(getNumberOfFloors(height));
        System.out.print("Permission: ");
        System.out.println(checkPermission(height, getWeightOfBuilding(height, width, length, material)));
        System.out.print("Weight: ");
        System.out.println(getWeightOfBuilding(height, width, length, material));
        System.out.print("Square: ");
        System.out.println(getSquareOfBuilding(width, length));
    }

    public String getType(double height) {
        String kind = "no data";
        if (height >= 5 && height <= 7) {
            kind = "private 1 floor house";
        } else if (height > 7 && height <= 50) {
            kind = "high-rise building";
        } else if (height > 50) {
            kind = "skyscraper";
        }
        this.kind = kind;
        return kind;
    }

    public int getNumberOfFloors(double height) {
        double number = height / 3.5;
        int numberOfFloors = (int) number;
        this.numberOfFloors = numberOfFloors;
        return numberOfFloors;
    }

    public double getWeightOfBuilding(double height, double width, double length, String material) {
        double weight = 0;
        switch (material) {
            case "metal":
                weight = height * width * length * 1;
                break;
            case "metal and plastic":
                weight = height * width * length * 0.5;
                break;
            case "concrete":
                weight = height * width * length * 1.5;
                break;
        }

        this.weightOfBuilding = weight;

        return weight;
    }

    public double getSquareOfBuilding(double width, double length) {
        double square;
        square = width * length;
        this.squareOfBuilding = square;
        return square;
    }



    public String checkPermission(double height, double weight){
        String perm = "No permission";
        if(height >= 50 && weight < 150000){
            perm = "permission to build in the centre";
        } else if (height > 10 && height < 50 && weight <54000){
            perm = "permission to build  in the suburbs";
        } else if ( height <= 10){
            perm = "permission to build in private sector";
        }
        this.permission = perm;
        return perm;

    }

    public String setNameOfBuilding (String nameOfBuilding, String nameOfOwner) {
        String name = nameOfBuilding + " by " + nameOfOwner;
        this.nameAndOwner = name;
        return name;
    }
}





