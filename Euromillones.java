package TESTES.pruebas;

public class Euromillones {

    public static void main(String[]args){

        for (int i = 0; i < 5; i++) {
            double resultado = Math.floor(1+Math.random()*49);
            int total = (int) resultado;
            System.out.println(total);
        }
        System.out.println("");
        for (int i = 0; i < 2; i++) {
            double resultado = Math.floor(1+Math.random()*11);
            int total = (int) resultado;
            System.out.println(total);
        }


}
}