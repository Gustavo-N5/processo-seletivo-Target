package questaoFibonacci;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
	
	private List<Integer> listaFibonacci = new ArrayList<>();
	
	public String verificaFibonacci(int numero) {
		
		listaFibonacci.add(0);
		listaFibonacci.add(1);
		
		for (int i = 1; numero >= listaFibonacci.size(); i++) {
			Integer anterior = listaFibonacci.get(i-1);
			Integer atual = listaFibonacci.get(i);
			Integer novo = anterior + atual;
			
			listaFibonacci.add(novo);
			
		}
		
		for (int i = 0; i < listaFibonacci.size(); i++) {
			if (listaFibonacci.get(i) == numero) {
				return "Este número pertence a sequencia de Fibonacci !!!";
			}
		}
		return "Este número não pertence a sequencia de Fibonacci !!!";
	}
	
}
