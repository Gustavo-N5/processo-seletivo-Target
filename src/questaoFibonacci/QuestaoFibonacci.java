package questaoFibonacci;


import java.util.Scanner;

public class QuestaoFibonacci {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Digite um valor e veja se ele pertence a sequesncia de Fibonacci: ");
//		int numero = sc.nextInt();
//		
		Fibonacci fibonacci = new Fibonacci();
		
		System.out.println(fibonacci.verificaFibonacci(1000));
		
//		sc.close();
	}

}
