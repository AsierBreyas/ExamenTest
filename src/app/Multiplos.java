package app;
import java.util.ArrayList;
import java.util.List;

public class Multiplos {
   public int getNumero(String n){
        String frase = n.trim();
       if((frase.equalsIgnoreCase("uno")) || (frase == "1")){
           return 1;
       }else if((frase.equalsIgnoreCase("dos")) || (frase == "2")){
           return 2;
       }else if((frase.equalsIgnoreCase("tres"))|| (frase == "3")){
           return 3;
       }else if((frase.equalsIgnoreCase("cuatro")) || (frase == "4")){
           return 4;
       }else if((frase.equalsIgnoreCase("cinco")) || (frase == "5")){
           return 5;
       }else if((frase.equalsIgnoreCase("seis"))|| (frase == "6")){
           return 6;
       }else if((frase.equalsIgnoreCase("siete")) || (frase == "7")){
           return 7;
       }else if((frase.equalsIgnoreCase("ocho")) || (frase == "8")){
           return 8;
       }else if((frase.equalsIgnoreCase("nueve")) || (frase == "9")){
           return 9;
       }else{
           return 0;
       }
   }
    public List<Integer> calcNum(String[] str ) {
        List<Integer> valores = new ArrayList<Integer>();
        for(int i=0;i<str.length;i++){
           valores.add(getNumero(str[i]));
        }
        return valores;
    }
    public List<Double>patata(int[] n, int a){
        List<Double> valores = new ArrayList<Double>();
        double aux = 0;
        double div = 0;
        for(int i=0;i<n.length;i++){
            aux = (double)(n[i]);
            div = a/aux;
            valores.add(aux * div);
         }
         return valores;
    }
    double to2dec(double valor) {
        return Math.floor(valor * 100) / 100d;
    }
}
