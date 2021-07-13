package com.example.demodata.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * TODO
 *
 * @Author: HuDaoquan
 * @Email: hudaoquan@enn.cn
 * @Date: 2020.10.20 16:39
 * @Version 1.0
 */
public class ConnectImpala {

    private static String daasJaas = "D:\\etc\\141krb\\daas_jaas.conf";

    private static String krb5 = "D:\\etc\\141krb\\krb5.conf";

    private static String url = "jdbc:impala://10.19.151.141:25004/originald;AuthMech=1;KrbRealm=HADOOP.COM;KrbHostFQDN=cluster-node-1;KrbServiceName=impala";

    public static final String JDBC_DRIVER = "com.cloudera.impala.jdbc41.Driver";

    public static void test(String sql) {

        Connection con = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        String CONNECTION_URL = url;
        System.setProperty("java.security.auth.login.config", daasJaas);
        System.setProperty("java.security.krb5.conf", krb5);
        try {
            Class.forName(JDBC_DRIVER);
            con = (Connection) DriverManager.getConnection(CONNECTION_URL);
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("result:" + rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally  {
            try {
                rs.close();
                ps.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        String sql = "show create table search_test768";
        test(sql);
    }
}
