/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unbosque.controller;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 *
 * @author englinx
 */
public class Cliente extends Thread{
    // initialize socket and input output streams 
	 private Socket socket;
	    private ServerSocket server; 
	    private Scanner sn;
	    private DataOutputStream out;
	    private DataInputStream in; //Input stream from server
	    private String address;
	    private int port;
	  
	    // constructor to put ip address and port 
	    public Cliente(String address, int port){ 
	    	// initialize socket and input output streams 
	        this.socket= null;
	        this.server=null;
	        this.sn=new Scanner(System.in);
	        this.out= null;
	        this.address=address;
	        this.port=port;
	        
	        
	      
	    }
	    
	    @Override
	    public void run() {
	    	
	    	// string to read message from input 
	        String line = ""; 
	  
	    	// keep reading until "Over" is input 
	        while (!line.equals("Over")) 
	        { 
	        	 // establish a connection 
	        	try
	            { 
	        		this.socket = new Socket(this.address, this.port); 
	                System.out.println("Connected"); 
	            
	                // sends output to the socket 
	                this.out = new DataOutputStream(socket.getOutputStream()); 
	        		
	        		//line = this.input.readLine(); 
	                line=sn.next();
	                this.out.writeUTF(line);
	                //close socket and output stream
	                this.out.close(); 
	                this.socket.close(); 
	                //Create a serverSocket to wait message from server
	                this.server = new ServerSocket(this.port+1);
	    	        this.socket = server.accept(); 
	    	        System.out.println("Received message:"); 
	    	        // takes input from the client socket 
	    	        this.in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
	                //Print in server the client message
	                System.out.println(in.readUTF());
	                this.in.close();
	                this.server.close();
	            } 
	            catch(IOException i) 
	            { 
	                System.out.println(i); 
	            } 
	        } 
	        // close the connection 
	        try
	        { 
	            out.close(); 
	            socket.close(); 
	        } 
	        catch(IOException i) 
	        { 
	            System.out.println(i); 
	        } 
	    	
	    }
	    public void enviarDatos(String nombre, String apellido, int edad, long cedula, String cargo) {
	        try {
	            // Establecer conexión con el servidor
	            this.socket = new Socket(this.address, this.port);
	            System.out.println("Conectado al servidor");

	            // Enviar datos al servidor
	            this.out = new DataOutputStream(socket.getOutputStream());
	            this.out.writeUTF(nombre);
	            this.out.writeUTF(apellido);
	            this.out.writeInt(edad);
	            this.out.writeLong(cedula);
	            this.out.writeUTF(cargo);
	            System.out.println("Datos enviados al servidor");

	            // Cerrar la conexión con el servidor
	            this.out.close();
	            this.socket.close();
	        } catch(IOException i) {
	            System.out.println(i);
	        }
	    }
}
