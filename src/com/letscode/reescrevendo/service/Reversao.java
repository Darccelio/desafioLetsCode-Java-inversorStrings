package com.letscode.reescrevendo.service;

//import com.letscode.reescrevendo.utils.Leitor;

public class Reversao {

//   private static String palavra =  Leitor.escanearString();

   public static String inverterString(String palavra ) {

       StringBuilder novaPalavra = new StringBuilder();

       for(int i=palavra.length()-1; i>0; i--) {
           novaPalavra.append(palavra.charAt(i));
       }

       return novaPalavra.toString();

   }
}
