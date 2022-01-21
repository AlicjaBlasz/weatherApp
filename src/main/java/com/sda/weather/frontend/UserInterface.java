package com.sda.weather.frontend;


import java.util.Scanner;

public class UserInterface {

    public void run() {
        System.out.println("Application is running. \n");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to your personal weather app. What would You like to do?");
            System.out.println("1.Add location.");
            System.out.println("2.Display all added locations.");
            System.out.println("3.See current  weather forecast.");
            System.out.println("0.Quit application.");

            int optionNumber = scanner.nextInt();

            switch (optionNumber) {
                case 1:
                    addLocation();
                    break;
                case 2:
                    getAllLocations();
                    break;
                case 3:
                    getCurrentForecast();
                    break;
                case 0:
                    return;
            }
            System.out.println();


        }
    }

    private void addLocation() {
        //...
    }

    private void getAllLocations() {
        //...
    }

    private void getCurrentForecast() {
        //..
    }
}
