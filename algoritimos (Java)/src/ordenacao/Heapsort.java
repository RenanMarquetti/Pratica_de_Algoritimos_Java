package ordenacao;

import util.Util;

public class Heapsort {
	
	public static void main(String[] args) {
		//int arranjo[] = {4,1,3,2,16,9,10,14,8,7};
		int arranjo[] = Util.createArranjo(10_000_000, 100_000_000);
		
//		System.out.println("Inicio");
//		Util.imprimirArray(arranjo);
		
		long tempo = heapsort(arranjo);

		System.out.printf("Fim (Correto: %s, Tempo: %,3d ns)\n",Util.isCorrect(arranjo) ? "Sim" : "Não", tempo);
//		Util.imprimirArray(arranjo);

		
	}

	static int tamHeap;
	
	public static long heapsort(int A[]) {
		
		long inicio = System.nanoTime();
		
		tamHeap = A.length;
		buildMaxHeap(A);
		
		for(int i = A.length-1; i > 0; i--) {
			Util.trocar(A,0,i);
			tamHeap--;
			maxHeapify(A,0);
		}
		
		return System.nanoTime() - inicio;
	}
	
	public static void buildMaxHeap(int A[]) {
		for(int i = tamHeap/2; i >= 0; i--) maxHeapify(A, i);
	}
	
	public static void maxHeapify(int A[], int i) {
		int l = i*2 +1;
		int r = l + 1;
		int maior = i;
		
		if(l < tamHeap && A[l] > A[maior]) maior = l;
		if(r < tamHeap && A[r] > A[maior]) maior = r;
		
		if(i != maior) {
			Util.trocar(A,i,maior);
			maxHeapify(A, maior);
		}
	}

}
