/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package códigos;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Códigos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);

        int[] vetor;
        int i;
        int menor = 0;
        int tamanho, posicao = 0;

        tamanho = scan.nextInt();

        vetor = new int[tamanho];

        for (i = 0; i < tamanho; i++) {
            vetor[i] = scan.nextInt();
        }
        for (i = 0; i < tamanho; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
                posicao = i;
            }

        }
        System.out.println("Menor valor: " + menor);
        System.out.println("Posicao: " + posicao);
    }
}
