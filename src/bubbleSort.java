import java.util.Scanner;


public class bubbleSort {
	
	public static boolean menor(int a, int b) {
		return a < b;
	}
	
	public static void bolha(int[] vetor, int l, int r){
		int i, j;
		for(i = l; i < r; i++){
			for(j = r; j > i; j--){
				if(menor(vetor[j], vetor[j-1])){
					int aux = vetor[j-1];
					vetor[j-1] = vetor[j];
					vetor[j] = aux;
				}
			}
		}
		
		//imprime na tela
		for (int k = 0; k < 10; k++) {
			System.out.print(vetor[k] + " ");
		}
	}

	public static void main(String[] args) {
		
		int[] vetor = new int[10];	
		
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Elemento vetor[" +(i+1)+"]");
			vetor[i] = teclado.nextInt();
		}
		teclado.close();
		
		bolha(vetor,0,9);

	}

}
