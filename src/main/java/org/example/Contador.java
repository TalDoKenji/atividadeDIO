package org.example;

import org.example.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();


        try {
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException exception) {
            System.out.println("O primeiro parâmetro é inválidos, pois é menor que o segundo");
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if(parametroUm < parametroDois)
            throw new ParametrosInvalidosException("O primeiro parâmetro é inválido, pois é menor que o segundo");
        int contagem = parametroUm - parametroDois;
            for(int i = 1 ; i <= contagem ; i++) {
                System.out.println("Número: " + i);
        }
    }
}