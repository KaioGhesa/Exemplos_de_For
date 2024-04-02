package exemplos_for;
import java.util.Scanner;


public class Exemplo_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
		for (int i = 0; i <5; i++){
                    //Nesse caso o for esta sendo utilizado para pedir para usuario 5 vezes digitar numero
			System.out.println("Digite um numero: ");
			int numero = in.nextInt();
			if(numero %2 ==1) {
				System.out.println(numero + " e impar");
			} else {
				System.out.println(numero + " e par");
			}
    }
    }
}
