package com.example.drink.data;

public class DBProvider {
    public DBProvider(){
        try {
            Class.forName ("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println ("驅動程式啓動失敗,請確認mariaDB-java-Connector是否有載載入");
        }
    }
}
