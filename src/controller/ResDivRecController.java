/* 
* 2. 
* Criar uma fun��o recursiva que receba o dividendo e o divisor 
* de uma opera��o de divis�o e, por subtra��es, 
* exiba o resto da divis�o.
* 
*/
 
package controller;
 
	public class ResDivRecController {
		
		public ResDivRecController() {
			super();
	}
		
		public int restoDivisao(int dividendo, int divisor) {
			
		//Condi��o de Parada
		if(dividendo < divisor) {
			return dividendo;
		} else {
			return restoDivisao (dividendo - divisor, divisor);
		}
	}
 
}