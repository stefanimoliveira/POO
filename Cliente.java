/*Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */

package POO;

public class Cliente {
	private String nome;
	private String carro;
	
	public Cliente(String nome,String carro)
	{
		this.nome=nome;
		this.carro=carro;
		
	}
	public void mostrarInfo()
	{
		System.out.println("\nNome do clente: "+nome+"\n possui um "+carro);
				
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCarro() {
		return carro;
	}
	public void setCarro(String carro) {
		this.carro = carro;
	}
	
	
}
