package no.hvl.dat100;

public class OppgaveO1B {

	public static void main(String[] args) {
		 int[][] matriseK = {{0,0,1,1,1,1,0,0},
                 {0,1,0,0,0,0,1,0},
                 {0,1,0,0,0,0,1,0},
                 {0,0,1,1,1,1,0,0},
                 {0,1,0,0,0,0,1,0},
                 {0,1,0,0,0,0,1,0},
                 {0,1,0,0,0,0,1,0},
                 {0,0,1,1,1,1,0,0}};
		 int[][] matriseTest = 
			 	{{1,2,3},
                 {4,5,6},
                 {7,8,9}};
		 int[][] matriseTest2 = 
			 	{{1,2,3},
              {4,5,6},
              {7,7,9}};
		 
	
	}
		
		
		public static void skrivUtv1(int[][] matrise) {
			for (int[] i : matrise) {
				for (int j : i) {
					System.out.println(j);
				}
			}
		}
		
		public static String tilStreng(int[][] matrise) {
			String tilString = "";
			for (int i = 0; i < matrise.length; i++) {
				for(int j = 0; j < matrise[i].length; j++) {
					tilString += matrise[i][j];
				}
				tilString += "\n";
			}
			return tilString;
	}
		
		public static int[][] skaler(int tall, int[][] matrise){
			int[][] nyMatrise = new int[matrise.length][matrise.length];
			for (int i = 0; i < matrise.length; i++) {
				for(int j = 0; j < matrise[i].length; j++) {
					nyMatrise[i][j] = matrise[i][j] * tall;
				}
			}
			return nyMatrise;
		}
		
		public static boolean erLik(int[][] mat1, int[][] mat2) {
			for (int i = 0; i < mat1.length; i++) {
				for(int j = 0; j < mat1[i].length; j++) {
					if (mat1[i][j] != mat2[i][j]) {
						System.out.println("false");
						return false;
					}
				}
			}
			System.out.println("true");
			return true;
		}

}

