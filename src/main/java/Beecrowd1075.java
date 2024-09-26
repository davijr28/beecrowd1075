
import java.util.Scanner;

public class Beecrowd1075 {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        
        //declarar variável
        int N;
        
        //ler variável
        N = scanner.nextInt();
        
        //verificar a condição e mostrar no console
        for (int i = 1; i < 10000; i++) {
            if (i % N == 2) {
                System.out.println(i);
            }
        }
    }
}
