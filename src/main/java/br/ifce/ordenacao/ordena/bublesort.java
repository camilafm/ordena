/**
 * Camila Ferreira e 
 * Morgana Gomes
 * */

package br.ifce.ordenacao.ordena;

public class bublesort {
	public static void main(String[] args) {
		int[] vetor = {10,9,8,7,6,5,4,3,2,1,0};
		bublesort bs = new bublesort();
		bs.ordena(vetor);
		//   boolean troca = true;
		for(int num: vetor){
			System.out.print(num + " ");
			}
      }

	public int[] ordena(int[] vetor){
		int aux;
		int i, j;
		for ( i = 0; i < vetor.length - 1; i++){
			for ( j = 0; j < vetor.length - 1 - i; j++) {
				if (vetor[j] > vetor[j + 1]) {
					aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;
            	}
			}
		}
		return vetor;
	}
}
