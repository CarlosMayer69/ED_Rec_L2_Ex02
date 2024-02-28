package view;
 
import controller.ResDivRecController;
 
public class Principal {
 
	public static void main(String[] args) {
 
		ResDivRecController rd = new ResDivRecController();
 
		int dividendo = 25;
		int divisor = 3;
		int restoDivisao = rd.restoDivisao(dividendo, divisor);
 
		System.out.print(restoDivisao);
 
	}
}
