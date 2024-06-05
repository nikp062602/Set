package com.example.set_exercise;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication {
    public static void main(String[] args) {
        String[] firstarray = new String[]{"2", "4", "10", "11", "12"};
        String[] secondarray = new String[]{"30", "2", "4", "55", "80","Hola","Chao"};
        String[] thirdarray = new String[]{"2", "33", "55", "Hola"};

        findUniqueElements(firstarray, secondarray, thirdarray);
    }

    public static void findUniqueElements(String[] firstarray, String[] secondarray, String[] thirdarray) {
        for (String element : firstarray) {
            if (!containsElement(element, secondarray) && !containsElement(element, thirdarray)) {
                System.out.println("Elemento único encontrado: " + element);
            }
        }
        for (String element : secondarray) {
            if (!containsElement(element, firstarray) && !containsElement(element, thirdarray)) {
                System.out.println("Elemento único encontrado: " + element);
            }
        }
        for (String element : thirdarray) {
            if (!containsElement(element, firstarray) && !containsElement(element, secondarray)) {
                System.out.println("Elemento único encontrado: " + element);
            }
        }
    }

    public static boolean containsElement(String element, String[] array) {
        for (String item : array) {
            if (item.equals(element)) {
                return true;
            }
        }
        return false;
    }
}