package miniblog.negocio.entidades;

import java.util.Date;

public class Autor {
	private int id_autor;
	private String nome;
	private String email;
	private String senha;
	private String sexo;
	private Date data_nascimento;
	private int quantidade_postagens;
	private String imagem_perfil;
	private String descricao_perfil;
	static int cont=0;
	
	public Autor(String nome, String email, String senha, String sexo,
			Date data_nascimento, int quantidade_postagens,
			String imagem_perfil, String descricao_perfil) {
		this.id_autor= ++cont;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.sexo = sexo;
		this.data_nascimento = data_nascimento;
		this.quantidade_postagens = quantidade_postagens;
		this.imagem_perfil = imagem_perfil;
		this.descricao_perfil = descricao_perfil;
		
	}
	
	public int getId_autor() {
		return id_autor;
	}
	public void setId_autor(int id_autor) {
		this.id_autor = id_autor;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Date getData_nascimento() {
		return data_nascimento;
	}
	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}
	public int getQuantidade_postagens() {
		return quantidade_postagens;
	}
	public void setQuantidade_postagens(int quantidade_postagens) {
		this.quantidade_postagens = quantidade_postagens;
	}
	public String getImagem_perfil() {
		return imagem_perfil;
	}
	public void setImagem_perfil(String imagem_perfil) {
		this.imagem_perfil = imagem_perfil;
	}
	public String getDescricao_perfil() {
		return descricao_perfil;
	}
	public void setDescricao_perfil(String descricao_perfil) {
		this.descricao_perfil = descricao_perfil;
	}

}
