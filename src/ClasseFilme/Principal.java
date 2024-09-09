package ClasseFilme;

import calcularTempo.CalculadoraDeTempo;

public class Principal {
	public static void main(String[] args) {
		Filme meuFilme = new Filme();
		meuFilme.setNome("O NOME DO FILME");
		meuFilme.setAnoDeLancamento(1998);
		meuFilme.setDuracaoEmMinutos(188);
		
		meuFilme.exibeFichaTecnica();  //chamando método com objeto + o método
		meuFilme.avalia(8);
		meuFilme.avalia(5);
		meuFilme.avalia(10);
		//System.out.println(meuFilme.somaAvaliacao);
		//System.out.println(meuFilme.totalDeAvaliacoes);
		//System.out.println(meuFilme.pegamedia());
		
		
		Serie lost = new Serie();
		lost.setNome("Lost");
		lost.setAnoDeLancamento(2000);
		lost.exibeFichaTecnica();
		lost.setTemporadas(10);
		lost.setEpisodiosPorTemporada(10);
		lost.setMinutosPorEpisodio(50);
		System.out.println("Duração para maratonar lost: " + lost.getDuracaoEmMinutos());
		
		CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
		calculadora.inclui(meuFilme);
		calculadora.getTempoTotal();
		calculadora.inclui(lost);
		System.out.println(calculadora.getTempoTotal());
	}
}


//classe principal crio objetos e chamo os métodos da classe principal;