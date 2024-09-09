package ClasseFilme;

public class Titulo {

	private String nome;
	private int anoDeLancamento;
	private double somaAvaliacao;
	private boolean incluidoNoPlano;
	private int totalDeAvaliacoes;
	private int duracaoEmMinutos;
	
	//encapsulamento
	public int getTotalDeAvaliacoes() {
		return totalDeAvaliacoes; 
	}
	public String getNome() {
		    return nome;

	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnoDeLancamento() {
	    return anoDeLancamento;
	}
	
	public void setAnoDeLancamento(int anoDeLancamento) {
		this.anoDeLancamento = anoDeLancamento;
	}
	
	public boolean getIncluidoNoPlano() {
	    return incluidoNoPlano;
	}
	public void setIncluidoNoPlano(boolean incluidoNoPlano) {
		this.incluidoNoPlano = incluidoNoPlano;
	}
	public int getDuracaoEmMinutos() {
	    return duracaoEmMinutos;
	}
	public void setDuracaoEmMinutos(int duracaoEmMinutos) {
		this.duracaoEmMinutos = duracaoEmMinutos;
	}
	public void exibeFichaTecnica() {
		//criando método
		System.out.println("Nome do filme: " + nome);
		System.out.println("Ano de lançamento: " + anoDeLancamento);
	}
	public void avalia(double nota) {
		somaAvaliacao += nota;
		totalDeAvaliacoes++;
	}
	public double pegamedia() {
		return somaAvaliacao / totalDeAvaliacoes;
	}
}


