package vt10;

import java.sql.SQLException;

public class BBDDMain {

	public static void main(String[] args) {

		//Creamos el objeto connect
		ConnectDB connect = new ConnectDB();
		
//Llamamos al metodo connectToDB utilizando un try catch
		try {
			connect.connectToDB();
		} catch (SQLException e) {
			System.err.println("No se ha podido conectar al servidor SQL");
			e.printStackTrace();
		}
	}

}
