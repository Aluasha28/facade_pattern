package com.company;

public class Main {

    public static void main(String[] args) {

        String user = "Grzegorz Kawalec"
                + " -> Facade pattern";
        Facade facade = new Facade();
        if (facade.startProcess(user)) {
            System.out.println(
                    "*** Completed ***");
        }

    }
}
