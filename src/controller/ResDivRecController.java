/* 
* 2. 
* Criar uma função recursiva que receba o dividendo e o divisor 
* de uma operação de divisão e, por subtrações, 
* exiba o resto da divisão.
* 
*/
 
package controller;
 
	public class ResDivRecController {
		
		public ResDivRecController() {
			super();
	}
		
		public int restoDivisao(int dividendo, int divisor) {
			
		//Condição de Parada
		if(dividendo < divisor) {
			return dividendo;
		} else {
			return restoDivisao (dividendo - divisor, divisor);
		}
	}
 
}