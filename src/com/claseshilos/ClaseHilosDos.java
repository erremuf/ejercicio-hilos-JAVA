package com.claseshilos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ClaseHilosDos extends Thread  {
	
	String fichero = "ficheroTres.txt";
	String linea;

	public ClaseHilosDos (String nombre) {	
		super(nombre);	
	}
	
	@Override
	public void run() {
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(fichero));
			
			while((linea = br.readLine()) != null) {
				System.out.println("Imprimiendo " + getName() + ":\n" + linea);
				sleep(200);
			}
			System.out.println("\n¡" + getName() + " terminado!\n");
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado\n" + e);
		} catch (IOException e) {
			System.out.println("Algo va malamente...\n" + e);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
