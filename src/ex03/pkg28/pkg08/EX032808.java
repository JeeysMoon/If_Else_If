/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex03.pkg28.pkg08;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class EX032808 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double nota1, nota2, nota3, media;
        int peso1,peso2,peso3;
        Scanner leitor = new Scanner (System.in);
        
        System.out.print("Digite a primeira nota: ");
        nota1 = leitor.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        nota2 = leitor.nextDouble();
        
        System.out.print("Digite a terceira nota: ");
        nota3 = leitor.nextDouble();
        
        media = (nota1 * 2 + nota2 * 3 + nota3 * 5 / 10);
        System.out.println("Media: " + media);
        
        if (media >= 7) {
            System.out.println("O aluno está aprovado!");
        } else if (media >= 6) {
            System.out.println("O aluno irá para a avaliação final");
        } else {
            System.out.println("O aluno está reprovado");
        }
        
    }
    
}
