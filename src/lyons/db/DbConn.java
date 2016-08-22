package lyons.db;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
/**
 * 连接oracle数据库
 * @author lyons(zhanglei)
 */
public final class DbConn
{
	public static  Connection getconn()
	{
		Connection conn = null;
		
		String user   = "root";
		String passwd = "root";
		String url = "jdbc:mysql://localhost:3306/orcl?" + "user=root&password=root&useUnicode=true&characterEncoding=UTF8";//orcl为oracle数据库实例名字

		//已加载完驱动
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("success");
			conn = DriverManager.getConnection(url,user,passwd);
		}catch (SQLException e)
		{
			e.printStackTrace();
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		return conn;
	}

}
