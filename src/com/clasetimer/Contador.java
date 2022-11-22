package com.clasetimer;

import java.util.Timer;
import java.util.TimerTask;

public class Contador {
	public Contador() {
	}

	public void timer() {
		TimerTask timerTask = new TimerTask() {
			@Override
			public void run() {
				System.out.println("\nSOY UNA TAREA MOLESTA!!!!\n");
			}
		};
		
		Timer timer = new Timer();
			
		timer.scheduleAtFixedRate(timerTask, 0, 1000);
	
	}
}
