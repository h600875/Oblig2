package no.hvl.dat100;

public class OppgaveO1A {

	public static void main(String[] args) {
		int[] tabell1 = {1, 3, 5, 7, 9};
		int[] tabell2 = {2, 4, 6, 8, 10};

		int[] a = settSammen(tabell1, tabell2);
		skrivUt(a);
		
	}
	
	public static void skrivUt (int[] tabell) {
		for (int i : tabell) {
			System.out.println(i);
		}
	}
	
	public static String tilStreng (int[] tabell) {
		String nyStreng = "[";
		for (int i = 0; i < tabell.length - 1; i++) {
			nyStreng = nyStreng + tabell[i] + ",";
		}
		nyStreng = nyStreng + tabell[tabell.length - 1];
		nyStreng = nyStreng + "]";
		
		System.out.println(nyStreng);
		return nyStreng;
	}
	
	public static int forSum (int[] tabell) {
		int sum = 0;
		for (int i = 0; i < tabell.length; i++) {
			sum += tabell[i];
		}
		return sum;
	}
	
	public static int whileSum (int[] tabell) {
		int sum = 0;
		int i = 0;
		while (i < tabell.length) {
			sum += tabell[i];
			i++;
		}
		return sum;
	}
	
	public static int forUtvidetSum (int[] tabell) {
		int sum = 0;
		for (int i : tabell) {
			sum += i;
		}
		return sum;
	}
	
	public static boolean finnesTall (int[] tabell, int tall) {
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				return true;
				}
			}
		return false;
		}
	
	public static int posisjonTall (int[] tabell, int tall) {
		int retur = -1;
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				retur = i;
				return retur;
			}
		}
		return retur;
	}
	
	public static int[] reverser(int[] tabell) {
		int[] reversTabell = new int[tabell.length];
		for (int i = 0; i < tabell.length; i++) {
			reversTabell[i] = tabell[tabell.length - i - 1];
		}
		return reversTabell;
	}
	
	public static boolean erSortert (int[] tabell) {
		for (int i = 0; i < tabell.length - 1; i++) {
			if (tabell[i] > tabell[i+1]) {
				System.out.println("false");
				return false;
			}
		}
		System.out.println("true");
		return true;
	}
	
	public static int[] settSammen(int[] tabell1,int[] tabell2) {
		int[] sammenSatt = new int[tabell1.length + tabell2.length];
		for(int i = 0; i < tabell1.length; i++) {
			sammenSatt[i] = tabell1[i];
		}
		for(int i = tabell1.length, j = 0; i < sammenSatt.length; i++, j++) {
			sammenSatt[i] = tabell2[j];
		}
		
		return sammenSatt;
	}



}