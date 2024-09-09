package AULA1;

public class Musica {
	 String titulo;
	 String artista;
	 int anoDeLancamento;
	 double avaliacao;
	 int totalAvaliacoes;
	 
	 void exibeFichaTecnica() {
		 System.out.println("Nome da música: " + titulo);
		 System.out.println("Nome do artista: " + artista);
	 }
	 void avalie(double nota) {
		 avaliacao += nota;
		 totalAvaliacoes++;
	 }
	
	
	double mediaAvaliacao() {
		return avaliacao / totalAvaliacoes;
}
}