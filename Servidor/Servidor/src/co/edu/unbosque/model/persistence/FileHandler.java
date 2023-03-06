package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Properties;
import java.util.Scanner;

public class FileHandler {

	private static File file;
	private static Scanner reader;
	private static PrintWriter writer;
	// Leer un archivo serealizado

	private static FileInputStream fis; // Archivo
	private static ObjectInputStream ois; // Lector

	// Escritura

	private static FileOutputStream fos; // archivo
	private static ObjectOutputStream oos; // escritor

	public static Object readSerializable(String filename) {
		try {
			System.out.println(System.getProperty("user.dir"));
			fis = new FileInputStream("src/co/edu/unbosque/model/persistence/" + filename);
			
		} catch (FileNotFoundException e) {
			System.out.println("Error en find file(Serializable - Read)");
			e.printStackTrace();
			
		}

		try {
			ois = new ObjectInputStream(fis);
		} catch (Exception e) {
			System.out.println("Error en reading (Serializable - Read)");
			e.printStackTrace();
		}
		Object aux = null;
		try {
			aux = ois.readObject();
		} catch (ClassNotFoundException e) {
			System.out.println("Error on integrity(Serializable - Read)");
		} catch (IOException e) {
			System.out.println("Error on Permissions (Serializable - Read)");
		}
		return aux;
	}

	public static void writeSerializable(Object o, String filename) {
		// Buscar el archivo
		try {
			fos = new FileOutputStream("src/co/edu/unbosque/model/persistence/" + filename);
		} catch (FileNotFoundException e) {
			System.out.println("File not found (Serializable)");
			System.out.println(e.getMessage());
		}
		// Corriendo el archivo y serializanso para escritura
		try {
			oos = new ObjectOutputStream(fos);
			// escribimos el objeto
			oos.writeObject(o);
		} catch (Exception e) {
			System.out.println("error en writing (Serializable)");
			System.out.println(e.getMessage());
		}
		try {
			oos.close();
			fos.close();
		} catch (IOException e) {
			System.out.println("error on closing file (serializable)");
			System.out.println(e.getMessage());
		}

	}

	public static String loadFile(String filename) {
		file = new File("src/co/edu/unbosque/model/persistence/" + filename);
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.out.println("can´t create new file");
				System.out.println(e.getMessage());
			}
		}
		String content = "";
		try {
			reader = new Scanner(file);
			while (reader.hasNext()) {
				content += reader.nextLine() + "\n";
			}
		} catch (FileNotFoundException e) {
			System.out.println("file don´t exists");
			e.printStackTrace();
		}
		reader.close();
		return content;

	}

	public static void writeFile(String filename, String content) {
		file = new File("src/co/edu/unbosque/model/persistence/" + filename);
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.out.println("can´t create new file");
				System.out.println(e.getMessage());
			}
		}
		try {
			writer = new PrintWriter(file);
			writer.print(content);
		} catch (FileNotFoundException e) {
			System.out.println("file don´t exists");
			e.printStackTrace();
		}
		writer.close();
	}
}
