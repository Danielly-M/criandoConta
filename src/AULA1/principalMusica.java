package AULA1;

public class principalMusica {

	public static void main(String[] args) {
		Musica minhaMusica = new Musica();
		minhaMusica.titulo = "The game is over";
		minhaMusica.artista = "evanescence";
		minhaMusica.anoDeLancamento = 2000;
		
		minhaMusica.exibeFichaTecnica();
		minhaMusica.avalie(10);
		minhaMusica.avalie(8);
		minhaMusica.avalie(8.5);
		System.out.println(minhaMusica.avaliacao);
		System.out.println(minhaMusica.totalAvaliacoes);
		System.out.println(minhaMusica.mediaAvaliacao()); 
		
		
		
		
		
		
		

	}

}
