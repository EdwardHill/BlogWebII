package miniblog.negocio.entidades;

import java.util.ArrayList;
import java.util.Date;

public class Postagem {
	private int id_postagem;
	private String titulo;
	private String conteudo;
	private String media;
	private Date data;
	private String fonte;
	private String autor;
	private String categoria;
	private int quantidade_visualizacao;
	private ArrayList <Comentario> comentarios;
	
	static int cont=0;
	
	
	
	
	public Postagem(String titulo, String conteudo, String media, Date data,
			String fonte, String autor, String categoria,
			int quantidade_visualizacao, ArrayList<Comentario> comentarios) {
		this.id_postagem= ++cont;
		this.titulo = titulo;
		this.conteudo = conteudo;
		this.media = media;
		this.data = data;
		this.fonte = fonte;
		this.autor = autor;
		this.categoria = categoria;
		this.quantidade_visualizacao = quantidade_visualizacao;
		this.comentarios = comentarios;
	}
	
	public Postagem(String titulo, String conteudo, String media, Date data,
			String fonte, String autor, String categoria,
			int quantidade_visualizacao) {
		this.id_postagem= ++cont;
		this.titulo = titulo;
		this.conteudo = conteudo;
		this.media = media;
		this.data = data;
		this.fonte = fonte;
		this.autor = autor;
		this.categoria = categoria;
		this.quantidade_visualizacao = quantidade_visualizacao;
	
	}
	public int getId_postagem() {
		return id_postagem;
	}

	public void setId_postagem(int id_postagem) {
		this.id_postagem = id_postagem;
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	public String getMedia() {
		return media;
	}
	public void setMedia(String media) {
		this.media = media;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getFonte() {
		return fonte;
	}
	public void setFonte(String fonte) {
		this.fonte = fonte;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getQuantidade_visualizacao() {
		return quantidade_visualizacao;
	}
	public void setQuantidade_visualizacao(int quantidade_visualizacao) {
		this.quantidade_visualizacao = quantidade_visualizacao;
	}
	public ArrayList<Comentario> getComentarios() {
		return comentarios;
	}
	public void setComentarios(ArrayList<Comentario> comentarios) {
		this.comentarios = comentarios;
	}
	
	
}
