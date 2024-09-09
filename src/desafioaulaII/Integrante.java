package desafioaulaII;

public class Integrante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        AlunoDesafio aluno = new AlunoDesafio();
		        
		        aluno.setNome("Marco");
		        
		        // Adicionando notas corretamente
		        aluno.adicionaNota(8);
		        aluno.adicionaNota(7.7);
		        aluno.adicionaNota(6.5);
		        
		        // Exibe a média do aluno
		        aluno.exibeMediaDoAluno();
		    }
	}

