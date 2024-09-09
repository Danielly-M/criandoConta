package desafioaulaII;

public class AlunoDesafio {
	 	private double somaNotas;  // Soma de todas as notas
	    private int totalNotas;    // Contador de notas inseridas
	    private String nome;

	    public void exibeMediaDoAluno() {
	        System.out.println("Nome do aluno: " + nome);
	        System.out.println("Média: " + pegaMedia());  // Mostra a média correta
	    }

	    public double getSomaNotas() {
	        return somaNotas;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public int getTotalNotas() {
	        return totalNotas;
	    }

	    // Método para adicionar uma nova nota
	    public void adicionaNota(double novaNota) {
	        somaNotas += novaNota;  // Acumula a soma das notas
	        totalNotas++;           // Incrementa o contador de notas
	    }

	    // Método para calcular a média
	    public double pegaMedia() {
	        if (totalNotas == 0) {
	            return 0;  // Evita divisão por zero
	        }
	        return somaNotas / totalNotas;  // Retorna a média
	    }
	}
