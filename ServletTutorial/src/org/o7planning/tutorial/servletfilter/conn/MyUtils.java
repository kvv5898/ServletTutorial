package org.o7planning.tutorial.servletfilter.conn;
 
import java.sql.Connection;
 
import javax.servlet.ServletRequest;
 
public class MyUtils {
 
    public static final String ATT_NAME = "MY_CONNECTION_ATTRIBUTE";
 
    // Сохранить объект Connection в атрибут (attribute) в request.
    // Сохраненная информация существует только во время запроса (request)
    // до тех пор, когда данные возвращаются приложению пользователя.
    public static void storeConnection(ServletRequest request, Connection conn) {
        request.setAttribute(ATT_NAME, conn);
    }
 
    // Получить объект Connection сохраненный в атрибуте request.
    public static Connection getStoredConnection(ServletRequest request) {
        Connection conn = (Connection) request.getAttribute(ATT_NAME);
        return conn;
    }
}