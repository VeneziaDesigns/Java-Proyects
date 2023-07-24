package vt02;

import java.util.Random;

public class Dado {

	public static void main(String[] args) {
		
		int[] dado = new int[6];
		int[] res = new int[10000];
		double[] por = new double [6];
		
		Random random = new Random();
		
		for (int i = 0; i<res.length; i++) {
			res[i] = random.nextInt(1, 7);
			//res[i] = (int) (Math.random() *6 + 1);
			
			switch (res[i]) {
			case 1:
				dado[0]++;
			break;	
			case 2:
				dado[1]++;
			break;
			case 3:
				dado[2]++;
			break;
			case 4:
				dado[3]++;
			break;
			case 5:
				dado[4]++;
			break;
			case 6:
				dado[5]++;
			break;
				
			}
		}	
		
		for (int i = 0; i<por.length; i++) {
			por[i] = (double) (dado[i] * 100) / 10000;
			System.out.println("El "+(i+1)+" ha salido "+dado[i]+ " veces con un " + por[i] + " porciento");
		}
	}

}
