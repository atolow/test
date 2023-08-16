package fc.java.course2.part1;

import fc.java.model2.Connection;
import fc.java.model2.MsqlDriver;
import fc.java.model2.MysqlDriver;
import fc.java.model2.OracleDriver;

public class DataBaseConnection {
    public static void main(String[] args) {
        //oracle DB접속
        Connection conn=new OracleDriver();
        conn.getConnection("jdbc.oracle","root","manner");

        conn=new MysqlDriver();
        conn.getConnection("jdbc.mysql","root","manner");

        conn=new MsqlDriver();
        conn.getConnection("jdbc.mssql","root","manner");
    }
}
