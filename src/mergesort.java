import java.util.Scanner;


public class mergesort {
	
	public static boolean menor(int a, int b) {
		return a < b;
	}
	
	public static int[] mergeSort(int[] vetor, int l, int r){
		//divide o vetor ao meio
		int m = (r+l)/2;
		//caso base
		if(r <= l)
			return null;
		//chama o mergeSort com a metada a esquerda do vetor
		mergeSort(vetor, l, m);
		//chama o mergeSort com a metade a direita do vetor
		mergeSort(vetor, m+1, r);
		//metodo que combina os 2 vetores
		vetor = merge(vetor,l,m,r);
		
		return vetor;
	}
	
	//intercala os elementos de forma de forma ordenada
	public static int[] merge(int[] vetor, int l, int m, int r){
		int i,j,k = 0;
		int tam = vetor.length;
		int[] aux = new int[tam];
		for (i = m+1;  i > l; i--) 
			aux[i-1] = vetor[i-1];
		for(j = m; j < r; j++)
			aux[r+m-j] = vetor[j+1];
		for(k = l; k <= r; k++)
			if(menor(aux[j], aux[i]))
				vetor[k] = aux[j--];
			else
				vetor[k] = aux[i++];
			
		return vetor;
	}

	public static void main(String[] args) {
		
		int[] vetor = new int[10];	
		
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Elemento vetor[" +(i+1)+"]");
			vetor[i] = teclado.nextInt();
		}
		teclado.close();
		
		vetor = mergeSort(vetor,0,9);
		
		//imprimi o vetor ordenado
		System.out.println();
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}

	}
}
