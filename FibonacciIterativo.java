

public class FibonacciIterativo {

    public static void main(String[] args) {

        int  a = 0, b = 1, c = 0, i;

        // Muestro el valor inicial


        for ( i = 0; i < 10; i++) {
            if (i < 9) {
                System.out.print(a + ", ");
                //primero sumamos
                c = a + b;
                //Despues, cambiamos la segunda variable por la primera
                a = b;
                //Por ultimo, cambiamos la suma por la segunda variable
                b = c;
            }else
                System.out.println(a);
        }
    }
}


