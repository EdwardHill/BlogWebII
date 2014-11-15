package miniblog.negocio.entidades;

import java.util.Date;

public class Comentario {
	private String nome_visistante;
	private String comentario;
	private Date data;
	private int id_comentario;
	static int cont=0;
	public Comentario(String nome_visistante, String comentario, Date data) {
		this.id_comentario= ++cont;
		this.nome_visistante = nome_visistante;
		this.comentario = comentario;
		this.data = data;
	}

	public int getId_comentario() {
		return id_comentario;
	}

	public void setId_comentario(int id_comentario) {
		this.id_comentario = id_comentario;
	}

	public String getNome_visistante() {
		return nome_visistante;

	}

	public void setNome_visistante(String nome_visistante) {
		this.nome_visistante = nome_visistante;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

}
