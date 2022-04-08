/*En este proyecto avamos a conectar java conmysql para gestionar la base de datos en donde vamos almacenar
mensajes*/
package com.mensajes.app.mensajes;

import java.sql.Connection;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){

    	Conexion conexion= new Conexion();
    	
    	//Estre try nos va a devolver un objeto de tipo conexión que tendra la ejecucion a la conexion a la DB
    	try(Connection conection= conexion.getConection()) {
    	
    	}catch(Exception e) {
    		System.out.println(e);
    	}
    }
}
