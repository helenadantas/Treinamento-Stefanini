package treinamento.api.dto;



import javax.validation.constraints.NotBlank;

import treinamento.api.model.Categoria;


public class CategoriaDTO {

	@NotBlank(message = "{nome.nao-nulo}")
	private String nome;

	public Categoria transformaParaObjeto(String nome) {
		return new Categoria(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
