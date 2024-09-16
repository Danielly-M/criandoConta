package ClasseFilme;

import java.util.ArrayList;

import calcularTempo.CalculadoraDeTempo;

public class Principal {
	public static void main(String[] args) {
		Filme meuFilme = new Filme();
		meuFilme.setNome("O poderoso chefão");
		meuFilme.setAnoDeLancamento(1998);
		meuFilme.setDuracaoEmMinutos(188);
		System.out.println("Duração em minutos: " + meuFilme.getDuracaoEmMinutos());
		
		
		meuFilme.exibeFichaTecnica();  //chamando método com objeto + o método
		meuFilme.avalia(8);
		meuFilme.avalia(5);
		meuFilme.avalia(10);
		System.out.println("Total de avalições: " + meuFilme.getTotalDeAvaliacoes());
		System.out.println(meuFilme.pegamedia());
		
		
		Serie lost = new Serie();
		lost.setNome("Lost");
		lost.setAnoDeLancamento(2000);
		lost.exibeFichaTecnica();
		lost.setTemporadas(10);
		lost.setEpisodiosPorTemporada(10);
		lost.setMinutosPorEpisodio(50);
		System.out.println("Duração para maratonar lost: " + lost.getDuracaoEmMinutos());
		
		
		Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

		CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
		calculadora.inclui(meuFilme);
		calculadora.getTempoTotal();
		calculadora.inclui(lost);
		System.out.println(calculadora.getTempoTotal());
		
		
		var filmeDoPaulo = new Filme();
		filmeDoPaulo.setNome("Dogville");
		filmeDoPaulo.setDuracaoEmMinutos(200);
		filmeDoPaulo.setAnoDeLancamento(2003);
		filmeDoPaulo.avalia(10);
		
		ArrayList<Filme> listaDeFilmes = new ArrayList<>();
		listaDeFilmes.add(filmeDoPaulo);
		listaDeFilmes.add(outroFilme);
		listaDeFilmes.add(meuFilme);
		System.out.println("Tamanho da lista: "+ listaDeFilmes.size());
		System.out.println("Primeiro filme " + listaDeFilmes.get(0).toString());
		
		
	}
}


//classe principal crio objetos e chamo os métodos da classe principal;