package calcularTempo;

import ClasseFilme.Filme;
import ClasseFilme.Titulo;

public class CalculadoraDeTempo {
private int tempoTotal;

public int getTempoTotal() {
	return tempoTotal;
}
//public void setTempoTotal(int tempoTotal) {
	//this.tempoTotal = tempoTotal;
//}
 public void inclui(Titulo titulo) {
	 tempoTotal =+ titulo.getDuracaoEmMinutos();
 }

}
