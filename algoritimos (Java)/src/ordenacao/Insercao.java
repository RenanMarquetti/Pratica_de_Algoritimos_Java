package ordenacao;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class Insercao {
	
	public static void main(String[] args) {
		
		int tamanho = 10;
		
		int array[] = new int[tamanho];
		
		Random randon = new Random();
		
		for(int c = 0; c < array.length; c++) array[c] = randon.nextInt(tamanho*2);
		
		//int array[] = {5, 2, 4, 6, 1, 3};
		
		imprimir(array);
		
		ordenarPorInsersao(array);
		
		imprimir(array);
		
	}
	
	public static void imprimir(int array[]) {
		System.out.println(Arrays.toString(array));
	}
	
	public static void ordenarPorInsersao(int A[]) { //1_000_000; //Levou cerca de 334.414 ms.
		
		Date inicio = new Date();
		
		for(int j = 1; j < A.length; j++) {
			
			int chave = A[j];
			
			int i = j-1;
			
			while( i >= 0 && A[i] > chave) {

				A[i+1] = A[i--];
				//i = i-1;
				
			}
			
			A[i+1] = chave;
		}
		
		Date fim = new Date();
		
		System.out.printf("Levou cerca de %,d ms.\n",fim.getTime()-inicio.getTime());
		
	}
}
