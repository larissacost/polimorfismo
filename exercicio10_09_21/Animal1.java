package exercicio10_09_21;

public class Animal1 {
	private String Nome;
	private int Idade;
    private String Som;
    
    
	public Animal1(String nome, int idade) {
		Nome = nome;
		Idade = idade;
	}
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public int getIdade() {
		return Idade;
	}
	public void setIdade(int idade) {
		Idade = idade;
	}
	public String getSom() {
		return Som;
	}
	public void setSom(final String som) {
		Som = "fez barulho";
	}
	

}
