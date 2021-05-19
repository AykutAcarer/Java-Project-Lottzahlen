package code.Lotto;

import java.util.Collections;
import java.util.Random;
import java.util.TreeSet;

public class LottoZahlen {

	public static void main(String[] args) {
		
		/* Lottozahlen in ein TreeSet */
		
		Random random = new Random();
		
		/* anlegen ein TreeSet */
		/* sollten kein doppelte Zahl auftreten  dafür sollten wir TreeSet benutzen, 
		 * denn TreeSet geben doppelte Zahl nicht frei.*/
		
		TreeSet<Integer> lottoZahlen = new TreeSet<Integer>();
		
		/* fügen Zufallszahl zwischen 1 - 49 hin */
		
		for(int i=0; i<=6; i++) {
			lottoZahlen.add(random.nextInt(49)+1);	// sollten keine Zahl "0" auftreten
		}
			
		/* Ausgabe die Zahlen */
		
		System.out.print("Glückszahlen sind : ");
		for(int list:lottoZahlen) {
			System.out.printf(list+ " ");
		}
		
	
	}

}
