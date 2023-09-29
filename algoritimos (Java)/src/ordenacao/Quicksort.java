package ordenacao;

import util.Util;

public class Quicksort {
	public static void main(String[] args) {
		//int arranjo[] = {4,1,3,2,16,9,10,14,8,7};
		int arranjo[] = Util.createArranjo(10_000_000, 100_000_000);
		long tempo = quicksort(arranjo);
		System.out.printf("Fim (Correto: %s, Tempo: %,3d ns)\n",Util.isCorrect(arranjo) ? "Sim" : "Não", tempo);
		if(arranjo.length <10) Util.imprimirArray(arranjo);
	}
	
	public static long quicksort(int A[]) {
		
		long inicio = System.nanoTime();
		
		quicksort(A,0,A.length-1);
		
		return System.nanoTime() - inicio;
	}
	
	public static void quicksort(int A[],int p, int r) {		
		
		if(p<r) {
			int q = partition(A,p,r);
			quicksort(A,p,q-1);
			quicksort(A,q+1,r);
		}
		
	}

	public static int partition(int[] A, int p, int r) {
		int x = A[r];
		int i = p-1;
		
		for(int j = p; j<r; j++) if(A[j]<=x) Util.trocar(A, ++i, j);
		
		Util.trocar(A, ++i, r);

		return i;
	}
}
