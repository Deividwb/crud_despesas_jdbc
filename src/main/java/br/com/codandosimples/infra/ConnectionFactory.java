package br.com.codandosimples.infra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private ConnectionFactory(){}

    public static Connection getConnection(){
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/despesasdb?useTimezone=true&serverTimezone=GMT","root","");
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}
