package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

	private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://localhost:3306/rpgdata";
	private static final String USER = "root";
	private static final String PASS = "";
	private Connection conn = null;
	private Statement stmt = null;

	// public static void main(String[] args) {
	// Database db = new Database();
	// System.out.print("_________");
	// db.destory();
	// }

	public Database() {
		initialize();
	}

	private void initialize() {
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			stmt = conn.createStatement();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public void destory() {
		try {
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void addSkills(String name, String description, int mana,
			int damage, String target, String elementalAffinity) {
		try {
			String sql;
			sql = "Insert into Skills(Name, Description, Mana, Damage, Target, Elemental_Affinity) values ( '" + name + "','" + description
					+ "'," + mana + "," + damage + ",'" + target + "','"
					+ elementalAffinity + "')";
			stmt.executeUpdate(sql);

		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}