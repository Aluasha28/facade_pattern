package com.company;

public class Database {

    public boolean checkConnect() {
        System.out.println("Check the connect");
        return true;
    }

    public String getInformation(
            String nameUser) {

        System.out.println(
                "Downloading user information");
        return nameUser;
    }

    public void saveLog() {
        System.out.println("Save log");
    }
}
