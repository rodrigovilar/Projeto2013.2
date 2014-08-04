
public class Bibliografia {
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (basicaOuNao ? 1231 : 1237);
		result = prime * result + ((livro == null) ? 0 : livro.hashCode());
		result = prime * result + quantidade;
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
		Bibliografia other = (Bibliografia) obj;
		if (basicaOuNao != other.basicaOuNao)
			return false;
		if (livro == null) {
			if (other.livro != null)
				return false;
		} else if (!livro.equals(other.livro))
			return false;
		if (quantidade != other.quantidade)
			return false;
		return true;
	}
	private String livro;
	private int quantidade;
	private boolean basicaOuNao;
	
	public Bibliografia(String livro, int quantidade, boolean basicaOuNao){
		this.livro = livro;
		this.quantidade = quantidade;
		this.basicaOuNao = basicaOuNao;
		
	}
	
	public Bibliografia() {
		// TODO Auto-generated constructor stub
	}

	
	
	
	public String getLivro() {
		return livro;
	}
	public void setLivro(String livro) {
		this.livro = livro;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public boolean isBasicaOuNao() {
		return basicaOuNao;
	}
	public void setBasicaOuNao(boolean basicaOuNao) {
		this.basicaOuNao = basicaOuNao;
	}
	
}
