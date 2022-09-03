package com.polovyi.ivan.tutorials;

public class GitCherryPickWithRealExample {

    public static void main(String[] args) {

        methodDeployedInProduction();

        methodFromFeature3();

    }

    private static void methodDeployedInProduction() {
        System.out.println("Production code!");
    }

    private static void methodFromFeature3() {
        System.out.println("Awesome feature 3!");
    }

}
