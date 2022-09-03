package com.polovyi.ivan.tutorials;

public class GitCherryPickWithRealExample {

    public static void main(String[] args) {

        methodDeployedInProduction();

        methodFromFeature1();

        methodFromFeature2();

    }

    private static void methodDeployedInProduction() {
        System.out.println("Production code!");
    }

    private static void methodFromFeature1() {
        System.out.println("Awesome feature 1!");
    }

    private static void methodFromFeature2() {
        System.out.println("Awesome feature 2!");
    }
}
