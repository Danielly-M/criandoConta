package ClasseFilme;

public class Serie extends Titulo{
	private int temporadas;
    private boolean ativa;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;
    //private int anoDeLancamento;
    
    
    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
   // public int getDataDeLancamento() {
    	//return dataDeLancamento;
   // }
   // public void setDataDeLancamento(int dataDeLnacamento) {
    	//this.dataDeLancamento = dataDeLancamento; 
   //s }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
      this.minutosPorEpisodio = minutosPorEpisodio;
    }
    //@override
    public int getDuracaoEmMinutos() {
    	return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }
}
