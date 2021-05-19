package code.Lotto;

import java.util.Arrays;
import java.util.Random;

public class LottoZahlen2 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int [] lottoZahlen = new int[7];
		
			for (int i=0; i<lottoZahlen.length; i++) {
				lottoZahlen[i]=random.nextInt(49)+1;
			}
			Arrays.sort(lottoZahlen);
			
			for(int i=1; i<lottoZahlen.length; i++) {
				if(i>1) {
					System.out.println();
				}
				//System.out.println(lottoZahlen[i]);
				System.out.printf(" Zahl " +"%d"+"= "+"%d",i,lottoZahlen[i]);
			}
		
	}

}
