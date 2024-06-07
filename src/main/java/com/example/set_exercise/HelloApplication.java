package com.example.set_exercise;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import java.util.Scanner;

public class HelloApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número de escalones: ");
        int escalones = scanner.nextInt();

        if (escalones == 0) {
            System.out.println("__");
        } else if (escalones>0) {
            for (int i = 0; i<escalones; i++) {
                for (int j = 0; j<escalones-i-1; j++) {
                    System.out.print("  ");
                }
                System.out.println("_|");
            }
        } else {
            escalones = -escalones;
            for (int i = 0; i < escalones; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("  ");
                }
                System.out.println("|_");
            }
        }

        scanner.close();
    }
}