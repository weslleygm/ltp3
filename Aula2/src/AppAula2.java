
public class AppAula2 {

	public static void main(String[] args) {
		
		//int x = 15;
		//int y = 10;
		
		//System.out.println("O resultado da soma é: "+calculo(x,y));
		
		Cliente cliente = new Cliente();
		definirCliente(cliente);
		System.out.println(cliente);

	}
	
	public static void definirCliente(Cliente cli) {
		cli.setNome("Cliente1");
		cli.setCpf(123456789);
		cli.setTelefone("3332-5566");
	}
	
	public static int calculo(int x, int y) {
		return x+y;
	}

}
