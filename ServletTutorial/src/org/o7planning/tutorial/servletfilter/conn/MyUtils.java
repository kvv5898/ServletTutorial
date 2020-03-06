package org.o7planning.tutorial.servletfilter.conn;
 
import java.sql.Connection;
 
import javax.servlet.ServletRequest;
 
public class MyUtils {
 
    public static final String ATT_NAME = "MY_CONNECTION_ATTRIBUTE";
 
    // ��������� ������ Connection � ������� (attribute) � request.
    // ����������� ���������� ���������� ������ �� ����� ������� (request)
    // �� ��� ���, ����� ������ ������������ ���������� ������������.
    public static void storeConnection(ServletRequest request, Connection conn) {
        request.setAttribute(ATT_NAME, conn);
    }
 
    // �������� ������ Connection ����������� � �������� request.
    public static Connection getStoredConnection(ServletRequest request) {
        Connection conn = (Connection) request.getAttribute(ATT_NAME);
        return conn;
    }
}