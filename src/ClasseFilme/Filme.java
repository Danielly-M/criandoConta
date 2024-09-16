package ClasseFilme;
import java.util.Scanner; 
public class Filme extends Titulo{
	private String diretor;
	
	public String getDiretor() {
		return diretor;
	}
	public void setDiretor(String diretor){
		this.diretor = diretor;
	}
	
	
	@Override //SOBRE ESCRITA DE MÉTODO toString
	public String toString() {
		return "Filme: " + this.getNome() + "(" + this.getAnoDeLancamento() + ")";
	}
	
	
	}
	


//Classe auxiliar onde declaro as variáveis e métodos