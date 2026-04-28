package adaptations;

import java.sql.*;
public class DBconn {
    Connection conn ;
    public Statement stat ;
    DBconn(){
        try {

            conn = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","adaptations","abc");
            stat = conn.createStatement();            
        } catch (SQLException ex) {
               ex.getMessage();
        }
}}
