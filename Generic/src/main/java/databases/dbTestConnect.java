package databases;

import java.io.IOException;
import java.sql.SQLException;

public class dbTestConnect {
    public static void main(String [] args ) throws SQLException, IOException,ClassNotFoundException {

    ConnectToSqlDB connectToSqlDB= new ConnectToSqlDB();
    ConnectToSqlDB.connectToSqlDatabase();
    }}
