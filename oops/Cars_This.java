package oops;

public class Cars_This {
    String color;
    String model;
    int year;

    void insertData(String color, String model, int year) {
        this.color = color; // 'this' refers to the current object
        this.model = model;
        this.year = year;
    }

    void displayData() {
        System.out.println(color + " " + model + " " + year);
    }

    public static void main(String[] args) {
        Cars_This car1 = new Cars_This();
        Cars_This car2 = new Cars_This();
        Cars_This car3 = new Cars_This();
        car1.insertData("red", "BMW", 2020);
        car2.insertData("green", "Toyota", 2025);
        car3.insertData("blue", "Mercedes", 2022);
        car1.displayData();
        car2.displayData();
        car3.displayData();
    }
}