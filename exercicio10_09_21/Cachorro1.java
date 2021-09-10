package exercicio10_09_21;

public class Cachorro1 extends  Animal1 {
	private String raca;
	private String dono;
	private String endereco;
	
	
	public Cachorro1(String raca, String dono, String endereco,String nome, int idade) {
		super(nome, idade);
		this.raca = raca;
		this.dono = dono;
		this.endereco = endereco;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	@Override
	public String getSom()
	{
		return "\nO cachorro "+super.getNome()+super.getSom();
	}
	public void CorreCachorro()
	   {
		   
		   System.out.println("\nO cachorro "+super.getNome()+" está correndo");
	   }
	
}
