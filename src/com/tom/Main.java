package com.tom;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private String s;

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        System.out.println("Welcome to Parking lot Management System!");
        int func = 0;
        while (func != 4) {
            System.out.println("1)Car enter");
            System.out.println("2)Car leaveing");
            System.out.println("3)Status");
            System.out.println("4)Exit");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            func = Integer.parseInt(s);
            switch (func) {
                case 1:
                    System.out.println("Please enter Car ID");
                    String id = scanner.nextLine();
                    Car c = new Car(id);
                    cars.add(c);
                    System.out.println("Car added");
                    break;
                case 3:
                    for (Car car : cars) {
                        System.out.println(car.id + "/" + car.enter + "/" + car.leave);
                    }
                    break;
            }
        }
    }
}
