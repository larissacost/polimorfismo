package exercicio10_09_21;

public class Preguica1 extends Animal1{
	private String especie;
	private String origem;
	
	public Preguica1(String especie, String origem,String nome,int idade)
	{	
		super(nome, idade);
		this.especie = especie;
		this.origem = origem;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}
	@Override
	public String getSom() {
			return "\nA preguiça "+super.getNome()+super.getSom();
	}
	public void sobePreguica()
	   {
		   
		   System.out.println("\nA preguica "+getNome()+" está subindo na árvore");
	   }
	
}
	

