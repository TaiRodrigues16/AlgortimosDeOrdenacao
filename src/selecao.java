import java.util.Scanner;


public class selecao {
	
	public static boolean menor(int a, int b) {
		return a < b;
	}
	
	public static int[] selectionSort(int[] vetor, int l, int r){
		int i = 0, j = 0, aux = 0;
		for (i= l; i < r; i++) {
			int min = i;
			for(j = i+1; j <= r; j++){
				if(menor(vetor[j],vetor[min])){
					min = j;
				}				
			}
			aux = vetor[i];
			vetor[i]  = vetor[min];
			vetor[min] = aux;
		}
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
		vetor = selectionSort(vetor,0,9);
		
		//imprime o vetor com o resultado ordenado
		System.out.println();
		for (int k = 0; k < vetor.length; k++) {
			System.out.print(vetor[k] + " ");
		}
		
	}

}
