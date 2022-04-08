//En esta clase vamos a usar la dependencia mysql-conector que descargamos y añadimos en el archivo pom.xml
//con ayuda de esa dependencia vamos a conectar java con mysql para gestionar una base de datos:
package com.mensajes.app.mensajes;

import java.io.Console;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	//Con este metodo vamos a conectarnos a la base de datos y probar la conexion:
	public Connection getConection() {
		Connection conection= null;
		
		try {//Intentamos hacer la conexión
			//con la clase DriveManager y su metodo getConnection() hacemos la conexion a la base de datos
			//Dentro de los argumentos de del metodo agregamos el siguiente esquema para conectarnos a la DB:
			//En el primer parametro agregamos la ruta en donde arranca el servicio de nuestra base de datos + zona horaria
			//En el segundo parametro agregamos el usuario de la base de datos
			//Y en el tercer parametro colocamos la contraseña de esa base de datos si es que tiene:
			conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app?serverTimezone=UTC", "root","12345");
			
			//Validamos si la conexión se realiza:
			if(conection!= null) {//Si conectamos
				System.out.println("Conexión exitosa");
			}
			
		}catch(SQLException e) {//Este tipo de excepcion nos indica un mensaje cuando la base de datos no se ha podido conectar
			System.out.println(e);
			
		}
		
		return conection;
	}
}
