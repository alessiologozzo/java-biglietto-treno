package org.lessons.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("0.00");
		int distance = 0, age = 0;
		final double PRICE_PER_KM = 0.21;
		double ticketPrice = 0;

		distance = InputInterface.getInt(scanner, "Quanti km devi percorrere sul nostro treno?");
		age = InputInterface.getInt(scanner, "Quanti anni hai?");
		
		ticketPrice = distance * PRICE_PER_KM;
		
		if(age < 18)
			System.out.println("Il prezzo finale del tuo biglietto è di: " + formatter.format(ticketPrice - (ticketPrice * 20 / 100)) + "€. E' stato applicato uno sconto del 20% per i minorenni. Senza lo sconto il prezzo sarebbe stato di " + formatter.format(ticketPrice) + "€." + System.lineSeparator() + "Arrivederci!");
		else if(age > 65)
			System.out.println("Il prezzo finale del tuo biglietto è di: " + formatter.format(ticketPrice - (ticketPrice * 40 / 100)) + "€. E' stato applicato uno sconto del 40% per gli over 65. Senza lo sconto il prezzo sarebbe stato di " + formatter.format(ticketPrice) + "€." + System.lineSeparator() + "Arrivederci!");
		else
			System.out.println("Il prezzo finale del tuo biglietto è di: " + formatter.format(ticketPrice) + "€." + System.lineSeparator() + "Arrivederci!");
		
		
		scanner.close();
	}

}
