import java.util.Scanner;

public class Insercao {

	public static boolean menor(int a, int b) {
		return a < b;
	}	

	public static void insercao(int[] vetor, int l, int r) {
		int i = 0;
		//coloca o menor elemento na primeira posição
		for (i = r; i > l; i--) {
			if (menor( vetor[i], vetor[i-1])) {
				int aux = vetor[i - 1];
				vetor[i - 1] = vetor[i];
				vetor[i] = aux;
			}
		}
		//ordena os elemento do vetor menos a primeira posição
		for (i = l + 2; i <= r; i++) {
			int j = i;
			int v = vetor[i];
			while (menor(v,vetor[j - 1])) {
				vetor[j] = vetor[j - 1];
				j--;
			}
			vetor[j] = v;

		}
		
		//imprime na tela
		for (int k = 0; k < 10; k++) {
			System.out.print(vetor[k] + " ");
		}
	}

	public static void main(String[] args) {

		int[] vetor = new int[10];
		Scanner teclado = new Scanner(System.in);
		for (int j = 0; j < 10; j++) {
			System.out.println("Digite um valor para vetor[" + (j + 1) + "]: ");
			vetor[j] = teclado.nextInt();
		}
		teclado.close();

		// chamada do metodo insercao
		insercao(vetor, 0, 9);

	}

}
