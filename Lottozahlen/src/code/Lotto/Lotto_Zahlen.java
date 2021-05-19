package code.Lotto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Lotto_Zahlen {

	public static void main(String[] args) {
		
		/* Lottozahlen in ein ArrayList */
		
		Random random = new Random();
		
		/* anlegen ein ArrayList */
		
		ArrayList<Integer> lottoZahlen = new ArrayList<Integer>();
		
		/* fügen Zufallszahl zwischen 1 - 49 hin */
		
		for(int i=0; i<=6; i++) {
			lottoZahlen.add(random.nextInt(49)+1);	// sollten keine Zahl "0" auftreten
		}
		
		/* Sortieren die Zahlen */
		Collections.sort(lottoZahlen);
		
		/* sollten kein doppelte Zahl auftreten */		
		/* erneuen eine Zufallszahl anstelle vorhergehede dieselben Zahl */
		
		for (int i=0; i<lottoZahlen.size()-1; i++) {
			for ( int j=0; j<lottoZahlen.size()-1-i; j++) {
				while(lottoZahlen.get(i)==lottoZahlen.get(i+1)) {
					int temp = random.nextInt(49)+1;
					lottoZahlen.set(i, lottoZahlen.get(i+1));
					lottoZahlen.set(i+1, temp);
							
				}
			}
		}
		/* Sortieren die Zahlen wieder */
		Collections.sort(lottoZahlen);
			
		/* Ausgabe die Zahlen */
		System.out.print("Glückszahlen sind : ");
		for(int list:lottoZahlen) {
			System.out.printf(list+ " ");
		}
		
	}

}
