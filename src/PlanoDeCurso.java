public class PlanoDeCurso {

	private String ementa;
	private String conteudoProgramatico;
	private String objetivosEspecificos;
	private String objetivosProgramaticos;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((conteudoProgramatico == null) ? 0 : conteudoProgramatico
						.hashCode());
		result = prime * result + ((ementa == null) ? 0 : ementa.hashCode());
		result = prime
				* result
				+ ((objetivosEspecificos == null) ? 0 : objetivosEspecificos
						.hashCode());
		result = prime
				* result
				+ ((objetivosProgramaticos == null) ? 0
						: objetivosProgramaticos.hashCode());
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
		PlanoDeCurso other = (PlanoDeCurso) obj;
		if (conteudoProgramatico == null) {
			if (other.conteudoProgramatico != null)
				return false;
		} else if (!conteudoProgramatico.equals(other.conteudoProgramatico))
			return false;
		if (ementa == null) {
			if (other.ementa != null)
				return false;
		} else if (!ementa.equals(other.ementa))
			return false;
		if (objetivosEspecificos == null) {
			if (other.objetivosEspecificos != null)
				return false;
		} else if (!objetivosEspecificos.equals(other.objetivosEspecificos))
			return false;
		if (objetivosProgramaticos == null) {
			if (other.objetivosProgramaticos != null)
				return false;
		} else if (!objetivosProgramaticos.equals(other.objetivosProgramaticos))
			return false;
		return true;
	}

	public PlanoDeCurso(String ementa, String conteudoProgramatico,
			String objetivosEspecificos, String obetivosProgramaticos) {
		this.ementa = ementa;
		this.conteudoProgramatico = conteudoProgramatico;
		this.objetivosEspecificos = objetivosEspecificos;
		this.objetivosProgramaticos = obetivosProgramaticos;

	}

	public PlanoDeCurso() {
		// TODO Auto-generated constructor stub
	}

	public String getEmenta() {
		return ementa;
	}

	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}

	public String getConteudoProgramatico() {
		return conteudoProgramatico;
	}

	public void setConteudoProgramatico(String conteudoProgramatico) {
		this.conteudoProgramatico = conteudoProgramatico;
	}

	public String getObjetivosEspecificos() {
		return objetivosEspecificos;
	}

	public void setObjetivosEspecificos(String objetivosEspecificos) {
		this.objetivosEspecificos = objetivosEspecificos;
	}

	public String getObjetivosProgramaticos() {
		return objetivosProgramaticos;
	}

	public void setObjetivosProgramaticos(String obetivosProgramaticos) {
		this.objetivosProgramaticos = obetivosProgramaticos;
	}

}
