package com;

/**
 * Created by dmitriy on 15.01.2016.
 */
public class Buildings {


    public String type(double height) {
        String kind = "no data";
        if (height >= 5 && height <= 7) {
            kind = "private 1 floor house";
        } else if (height > 7 && height <= 50) {
            kind = "high-rise building";
        } else if (height > 50) {
            kind = "skyscraper";
        }
        return kind;
    }

    public int numberOfFloors(double height) {
        double number = height / 3.5;
        int iNumber = (int) number;
        return iNumber;
    }

    public double weightOfBuilding(double height, double width, double length, String material) {
        double weight = 0;
        if (material.equals("metal")) {
            weight = height * width * length * 1;
        } else if (material.equals("metal and plastic")){
            weight = height * width * length * 0.5;
        } else if (material.equals("concrete")){
            weight = height * width * length * 1.5;
        }

        return weight;
    }

    public double squareOfBuilding(double width, double length) {
        double square;
        square = width * length;
        return square;
    }



    public String Permission(double height, double weight){
        String perm = "No permission";
        if(height >= 50 && weight < 150000){
            perm = "permission to build in the centre";
        } else if (height > 10 && height < 50 && weight <54000){
            perm = "permission to build  in the suburbs";
        } else if ( height <= 10){
            perm = "permission to build in private sector";
        }
        return perm;

    }

    public String nameOfBuilding (String nameOfBuilding, String nameOfOwner) {
        String name = nameOfBuilding + " by " + nameOfOwner;
        return name;
    }
}



