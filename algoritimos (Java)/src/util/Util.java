package util;

import java.util.Arrays;
import java.util.Random;

public class Util {
	
	public static void imprimirArray(int array[]) {
		System.out.println(Arrays.toString(array));
	}
	
	public static int[] createArranjo(int tamanho, int max) {
		
		Random random = new Random();
		
		int arranjo[] = new int[tamanho];
		
		for(int c = 0; c < arranjo.length; c++) arranjo[c] = random.nextInt(max);
		
		return arranjo;
		
	}
	
	public static void trocar(int A[], int x, int y) {
		int reserva = A[x];
		A[x] = A[y];
		A[y] = reserva;

	}
	
	public static boolean isCorrect(int A[]) {

		int c = 0;
		
		while(c < A.length-1) if(A[c] > A[++c]) return false;
			
		return true;
	}
}
