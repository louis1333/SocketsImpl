package co.edu.unbosque.controller;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import co.edu.unbosque.model.AspiranteDAOimpl;

public class Servidor extends Thread {
    private ServerSocket server;
    private int port;
    private String lista;
    private AspiranteDAOimpl asp;
    public Servidor(int port) {
        this.server = null;
        this.port = port;
        this.lista = "";
        asp = new AspiranteDAOimpl();
    }

    @Override
    public void run() {
        try {
            // initialize server socket
            this.server = new ServerSocket(this.port);
            System.out.println("Server started");
            System.out.println("Waiting for a client ...");

            // wait for incoming connections
            while (true) {
                Socket socket = server.accept();
                System.out.println("Client accepted");

                // start a new thread to handle the client
                new ClientHandler(socket).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // close the server socket when the server is stopped
            if (this.server != null) {
                try {
                    this.server.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public String getLista() {
        return lista;
    }

    public void setLista(String lista) {
        this.lista = lista;
    }

    private class ClientHandler extends Thread {
        private Socket socket;
        private DataInputStream in;
        private DataOutputStream out;

        public ClientHandler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            try {
                // initialize input and output streams
                this.in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
                this.out = new DataOutputStream(socket.getOutputStream());

                // read client message
                String line = in.readUTF();

                // print client message
                System.out.println("Client message: " + line);

                // process client message
                recibirDatos(line);

                // send response to client
                this.out.writeUTF("You sent this: " + line + " :D");

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                // close the client socket and input/output streams
                if (this.in != null) {
                    try {
                        this.in.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

                if (this.out != null) {
                    try {
                        this.out.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

                if (this.socket != null) {
                    try {
                        this.socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        public void recibirDatos(String line) {
            String[] lista = line.split(";");
            String nombre = lista[0];
            String apellido = lista[1];
            int edad = Integer.parseInt(lista[2]);
            long cedula = Long.parseLong(lista[3]);
            String cargo = lista[4];

            System.out.println(nombre);
            System.out.println(apellido);
            System.out.println(edad);
            System.out.println(cedula);
            System.out.println(cargo);
            asp.crear(nombre, apellido, edad, cedula, cargo);
        }
    }
}
