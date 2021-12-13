package com.letscode.reescrevendo.utils;

import java.util.Scanner;

public class Leitor {

    private static Scanner sc = new Scanner(System.in);

    public static String escanearString() {
        Impressora.imprimirSolicitacaoString();
        return sc.nextLine();
    }


}
