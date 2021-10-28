package by.itacademy.javaenterprise.connection;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;



import java.sql.Connection;
import java.sql.SQLException;


public class DataSource2 {


    private static HikariDataSource ds;
    private static DataSource2 dataSource2;

    private DataSource2() {}

    public static DataSource2 getDS(){
            if (dataSource2 == null) {
                synchronized (DataSource2.class) {
                    if (dataSource2 == null) {
                        dataSource2 = new DataSource2();
                    }
                }
            }

            return dataSource2;
    }

    public  Connection getConnection() throws SQLException {
        return ds.getConnection();
    }

    public void setHikariDataSource(HikariDataSource ds) {
        this.ds = ds;
    }

}
