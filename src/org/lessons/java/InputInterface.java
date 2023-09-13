package org.lessons.java;

import java.util.Scanner;

public class InputInterface {
	public static int getInt(Scanner scanner, String requestMessage) {

		String inputValue;
		int x = 0;
		boolean inputSuccess = false;

		System.out.println(requestMessage);

		while (!inputSuccess) {
			inputValue = scanner.nextLine();
			try {
				x = Integer.parseInt(inputValue);

				if(x > 0)
					inputSuccess = true;
				else
					System.out.println("Errore! Devi inserire un numero intero maggiore di 0. Riprova");
				
			} catch (NumberFormatException e) {
				System.out.println("Errore! Devi inserire un numero intero valido. Riprova");
			}
		}

		return x;
	}
}
