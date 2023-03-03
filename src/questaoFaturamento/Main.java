package questaoFaturamento;

public class Main {

	public static void main(String[] args) {
		
		double sp = 67836.43;
		double rj = 36678.66;
		double mg = 29229.88;
		double es = 27165.48;
		double outros = 19849.53;
		
		double total = sp + rj + mg +es + outros;
		
		double percentSp = (sp * 100) / total;
		double percentRj = (rj * 100) / total;
		double percentMg = (mg * 100) / total;
		double percentEs = (es * 100) / total;
		double percentOutros = (outros * 100) / total;
		
		System.out.println("SP - "+sp);
		System.out.println("RJ - "+rj);
		System.out.println("MG - "+mg);
		System.out.println("ES - "+es);
		System.out.println("Outros - "+outros);
		System.out.println("--------------------------");
		System.out.printf("SP - %.2f \n", percentSp);
		System.out.printf("RJ - %.2f \n", percentRj);
		System.out.printf("Mg - %.2f \n", percentMg);
		System.out.printf("ES - %.2f \n", percentEs);
		System.out.printf("Outros - %.2f \n", percentOutros);

	}

}
