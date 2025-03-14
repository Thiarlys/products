package Aplication;

import Entities.Merchandise;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Merchandise product01 = new Merchandise();
        System.out.println("Entre com os dados da mercadoria ");
        System.out.println("Nome ");
        product01.name = sc.nextLine();
        System.out.println("Preço ");
        product01.price = sc.nextDouble();
        System.out.println("Quantidade ");
        product01.quantity = sc.nextInt();

        System.out.println();
        System.out.println("Informações do estoque: " + product01);

        System.out.println("Entre com a quantidade que deseja adicionar do estoque: ");
        int quantityAdd = sc.nextInt();
        product01.addProducts(quantityAdd);
        System.out.println();
        System.out.println("Informações do estooque atualizadas: " + product01);

        System.out.println("Entre com a quantidade que deseja remover do estoque: ");
        int quantityRemove = sc.nextInt();
        product01.removeProducts(quantityRemove);
        System.out.println();
        System.out.println("Informações do estooque atualizadas: " + product01);

        sc.close();
    }
}