package exercicio10_09_21;

public class Cavalo1 extends Animal1 {

	private double peso;
	private double altura;
	
	public Cavalo1(double peso,double altura,String nome, int idade) 
	{
		super(nome, idade);
		this.peso = peso;
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	@Override
	public String getSom()
	{
		return "\nO cavalo "+super.getNome()+super.getSom();
	}
	public void CorreCavalo()
	   {
		   
		   System.out.println("\nO cavalo "+getNome()+" está correndo");
	   }
}
