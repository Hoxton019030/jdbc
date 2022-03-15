import java.beans.Customizer;
import java.beans.PropertyChangeListener;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.function.Consumer;

public class DriverRegDemo2 {
public static void main(String[] args) {
	System.setProperty("JDBC", "com.microsoft.sqlserver.jdbc.SQLServerDriver");
	
	Enumeration<Driver> drivers =DriverManager.getDrivers();
	Iterator<Driver> asIterator = drivers.asIterator();
	asIterator.forEachRemaining()

}
}
