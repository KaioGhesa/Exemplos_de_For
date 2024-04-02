package exemplos_for;
import java.util.Scanner;

public class Exemplos_For {
    
    /*Exemplo 1 de For 
    Nesse exemplo podemos ver que o usuario digita um
    numero 5 vezes, e o sistema faz esse numero vezes 3
    **/

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
		for (int i = 0;i <5; i++) {
//Nesse caso o for esta sendo utilizado para pedir para usuario 5 vezes digitar numero
		System.out.println("Digite um numero:");
		int numero = in.nextInt();
                
		int resultado = numero *3;
                //O resultado é a soma do numero que usario disponibilizou vezes 3 e ira aparecer 5x
                
		System.out.println(numero + "* 3 = " + resultado);
		}
    }
    
}
