package vt10;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;

public class ConnectDB {

	private final String BBDD;
	private final String USER;
	private final String PASSWORD;
	
	public ConnectDB() {
		
		BBDD = "jdbc:mysql://localhost:3306/";
		USER = "root";
		PASSWORD = "";
	}
	
	public ConnectDB(String bbdd, String user, String password) {
		super();
		BBDD = bbdd;
		USER = user;
		PASSWORD = password;
	}
	
	public void connectToDB() throws SQLException {
		
		Connection connect = DriverManager.getConnection(BBDD, USER, PASSWORD);
	
		Statement sentencia = connect.createStatement();
		
		//Eliminamos el esquema si existe
		String ifExists = "DROP SCHEMA IF EXISTS vt09_m03b;";
		sentencia.executeUpdate(ifExists);
		
		//Creamos el nuevo esquema
		String crearDB = "CREATE DATABASE vt09_m03b;";
		sentencia.executeUpdate(crearDB);
		
		//Usamos el nuevo esquema
		String use = "use vt09_m03b;";
		sentencia.executeUpdate(use);
		
		//Creamos una tabla
		String crearTabla = "CREATE TABLE Alumnos(id_alumno INT AUTO_INCREMENT PRIMARY KEY, nombre varchar(50) NOT NULL);";
		sentencia.executeUpdate(crearTabla);
		
		//Insertamos nombres
		String insert = "INSERT INTO Alumnos(nombre) VALUES(\"Adrian\"),(\"Ana\"),(\"Ivan\"),(\"Gustavo\"),(\"Cristina\");";
		sentencia.executeUpdate(insert);
		
		//Consulta
		String res = "Select * from Alumnos";
		ResultSet result = sentencia.executeQuery(res);
		
		//Guardamos los datos en una lista
		List<Alumno> alumnoList = new ArrayList<>();
		
		//Los recorremos
		while (result.next()) {
			
			Alumno alumno = new Alumno((long) result.getInt("id_alumno"), result.getString(2));
			alumnoList.add(alumno);
		}
		
		for	(Alumno alumno: alumnoList) {
			System.out.println(alumno.toString());
		}
		
		//Cerramos el result, la sentencia y la conexion
		result.close();
		sentencia.close();
		connect.close();
	}
		
	

	
	
	
}
