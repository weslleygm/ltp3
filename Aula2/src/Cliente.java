
public class Cliente {
	
	private int codigoCliente;
	private String nome;
	private int cpf;
	private char sexo;
	private String telefone;
	
	//Construtor sem parâmetros
	public Cliente() {
		
	}
	
	//Construtor com todos os parametros
	public Cliente(int clidigoCliente, String nome, int cpf, char sexo, String telefone) {
		this.codigoCliente = codigoCliente;
		this.nome = nome;
		this.cpf = cpf;
		this.sexo = sexo;
		this.telefone = telefone;
	}
	
	public int getCodigoCliente() {
		return codigoCliente;
	}
	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	

}
