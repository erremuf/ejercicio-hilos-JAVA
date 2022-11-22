package com.aepi;

import java.io.File;
import java.util.Timer;

import com.claseshilos.ClaseHilosDos;
import com.claseshilos.ClaseHilosUno;
import com.clasetimer.Contador;

public class EjercicioHilos {

	public static void main(String[] args) throws InterruptedException {
		
		ClaseHilosUno hiloUno = new ClaseHilosUno("Subproceso 1");
		ClaseHilosDos hiloDos = new ClaseHilosDos("Subproceso 2");
		Contador contador = new Contador();
		
		contador.timer();
		hiloDos.setPriority(10);
		hiloUno.start();
		hiloDos.start();
				
				

	}

}
