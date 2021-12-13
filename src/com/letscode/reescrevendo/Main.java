package com.letscode.reescrevendo;

import com.letscode.reescrevendo.service.Reversao;
import com.letscode.reescrevendo.utils.Impressora;
import com.letscode.reescrevendo.utils.Leitor;

public class Main {

    public static void main(String[] args) {
	// write your code here


        String palavra =  Leitor.escanearString();
        String palavraInvertida = Reversao.inverterString(palavra);

        Impressora.imprimirResultado(palavraInvertida);

    }
}
