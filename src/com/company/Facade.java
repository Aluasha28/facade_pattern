package com.company;

public class Facade {

    private Database database;
    private XML xml;
    private JSON json;

    public Facade() {
        database = new Database();
        xml = new XML();
        json = new JSON();
    }

    public boolean startProcess(
            String userName) {

        if (!database.checkConnect()) {
            System.err.println(
                    "Error connect");
            return false;
        }

        String inf = database
                .getInformation(userName);
        database.saveLog();

        xml.savaData(inf);
        if (!xml.validate()) {
            System.err.println(
                    "Incomplete data");
            return false;
        }

        json.sendData(inf);
        return true;

    }
}
