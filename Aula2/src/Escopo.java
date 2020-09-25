
public class Escopo {

	
	//Campo a nível da instância, acessível por qualquer método da classe
	static int x=1;
	
	public static void main(String[] args) {
		
		int x = 5; //variável local, visível no método main
		
		System.out.println("Variável X do método main: " + x);
		System.out.println("Variável S da instância: " + Escopo.x);
		
		useLocalVariable();
		useLocalVariable();
	}
	
	//Método que cria e inicializa uma variável local, vísivel apenas dentro do método
	public static void useLocalVariable() {
		int x=25;
		
		System.out.println("Variável X do método useLocalVariable: " +x);
		x++; //incrementa 1 no valor da variável local
		System.out.println("Variável X do método useLocalVariable após o incremento: " + x);
		System.out.println("Variável X da instáncia: " + Escopo.x);
		Escopo.x++; //incrementa 1 no valor da variável da instância
	}

}
