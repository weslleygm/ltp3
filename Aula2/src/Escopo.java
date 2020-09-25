
public class Escopo {

	
	//Campo a n�vel da inst�ncia, acess�vel por qualquer m�todo da classe
	static int x=1;
	
	public static void main(String[] args) {
		
		int x = 5; //vari�vel local, vis�vel no m�todo main
		
		System.out.println("Vari�vel X do m�todo main: " + x);
		System.out.println("Vari�vel S da inst�ncia: " + Escopo.x);
		
		useLocalVariable();
		useLocalVariable();
	}
	
	//M�todo que cria e inicializa uma vari�vel local, v�sivel apenas dentro do m�todo
	public static void useLocalVariable() {
		int x=25;
		
		System.out.println("Vari�vel X do m�todo useLocalVariable: " +x);
		x++; //incrementa 1 no valor da vari�vel local
		System.out.println("Vari�vel X do m�todo useLocalVariable ap�s o incremento: " + x);
		System.out.println("Vari�vel X da inst�ncia: " + Escopo.x);
		Escopo.x++; //incrementa 1 no valor da vari�vel da inst�ncia
	}

}
