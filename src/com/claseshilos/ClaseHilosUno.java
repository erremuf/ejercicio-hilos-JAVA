package com.claseshilos;

import java.io.*;

public class ClaseHilosUno extends Thread {
	
	String fichero = "ficheroUno.txt";
	String ficheroDos = "ficheroDos.txt";
	String linea;
	
	public ClaseHilosUno (String nombre) {
		super(nombre);	
	}
	
	@Override
	public void run() {
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(fichero));	
			BufferedWriter bw = new BufferedWriter(new FileWriter(ficheroDos, true));
		
			while((linea=br.readLine()) != null) {
				bw.write(linea);
				bw.newLine();
				System.out.println("Trabajando en " + getName());
				sleep(100);
			}
			System.out.println("\n¡" + getName() + " completado con éxito!\n");
			br.close();
			bw.close();
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado" + e);
		} catch (IOException e) {
			System.out.println("La operación no se ha podido completar y será interrumpida" + e);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	

}
	

