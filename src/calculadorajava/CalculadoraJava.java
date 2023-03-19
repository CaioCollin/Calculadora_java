package calculadorajava;

import java.util.Scanner;

public class CalculadoraJava {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       Operadores();
//       Aqui da pra colocar Scanner passando as informação para o met Contrutor;
       Calcular c1 = new Calcular(19,2,4);      
        
    }
    
    public static void Operadores(){
        System.out.println("Operadores");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão \n\n");
    }
    
}
