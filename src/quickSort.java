import java.util.Scanner;


public class quickSort {

	public static boolean menor(int a, int b) {
		return a < b;
	}
	
	public static int[] quickSort(int[] vetor, int l, int r){
		int i = 0;
		if(r <= l)
			return null;
		//paticiona o vetor em 2 partes
		i = particiona(vetor,l,r);
		//chama o quicksort com  a metade a direita do vetor
        quickSort(vetor, l, i - 1);
        //chama o quicksort com a metade a esquerda do vetor;
        quickSort(vetor, i, r);	
		return vetor;
		
	}
	
	public static int particiona(int[] vetor, int l, int r){
		int i = l, j = r, pivo = 0, aux = 0;
		pivo = vetor[(l + r) / 2];
		while (i <= j) {
			//roda o while enquanto o valor da posição for
			//menor que o valor do pivo
            while (vetor[i] < pivo)
                  i++;
          //roda o while enquanto o valor da posição for 
          //maior que o valor do pivo
            while (vetor[j] > pivo)
                  j--;
            //quando os contadores se crusão, encontro lugar do pivo
            if (i <= j) {
                  aux = vetor[i];
                  vetor[i] = vetor[j];
                  vetor[j] = aux;
                  i++;
                  j--;
            }
      }		
		return i;
	}
	
	public static void main(String[] args) {
		
		int[] vetor = new int[10];	
		
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Elemento vetor[" +(i+1)+"]");
			vetor[i] = teclado.nextInt();
		}
		teclado.close();

		quickSort(vetor,0,9);
		
		//imprime o vetor com o resultado ordenado
		System.out.println();
		for (int k = 0; k < vetor.length; k++) {
			System.out.print(vetor[k] + " ");
		}
		
	}

}
