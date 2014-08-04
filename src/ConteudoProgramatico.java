
public class ConteudoProgramatico {
	private int unidade;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((assunto == null) ? 0 : assunto.hashCode());
		result = prime * result
				+ ((horaAula == null) ? 0 : horaAula.hashCode());
		result = prime * result + unidade;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ConteudoProgramatico other = (ConteudoProgramatico) obj;
		if (assunto == null) {
			if (other.assunto != null)
				return false;
		} else if (!assunto.equals(other.assunto))
			return false;
		if (horaAula == null) {
			if (other.horaAula != null)
				return false;
		} else if (!horaAula.equals(other.horaAula))
			return false;
		if (unidade != other.unidade)
			return false;
		return true;
	}
	private String assunto;
	private String horaAula;
	
	public ConteudoProgramatico(int unidade, String assunto, String horaAula){
		this.unidade = unidade;
		this.assunto = assunto;
		this.horaAula = horaAula;
		
	}
	
	public ConteudoProgramatico() {
		// TODO Auto-generated constructor stub
	}

	
	
	
	public int getUnidade() {
		return unidade;
	}
	public void setUnidade(int unidade) {
		this.unidade = unidade;
	}
	public String getAssunto() {
		return assunto;
	}
	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	public String getHoraAula() {
		return horaAula;
	}
	public void setHoraAula(String horaAula) {
		this.horaAula = horaAula;
	}
}
