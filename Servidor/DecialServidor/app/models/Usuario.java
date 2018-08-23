package models;



import java.awt.image.BufferedImage;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.avaje.ebean.Model;

import enums.TIPOUSUARIO;

@Entity
@Table(name="usuario")
public class Usuario extends Model{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String login;
	private String senha;
	private String email;
	private String nome;
	private String sobreNome;
	private String rua;
	private String cidade;
	private String pais;
	private String cep;
	private TIPOUSUARIO tipo;
	private String sobreMim;
	private String caminhoImagem;
	
	public Usuario( String login, String senha, String email, String nome, String sobreNome, String rua, String cidade, String pais, String cep, TIPOUSUARIO tipo, String sobreMim, String caminhoImagem)
	{
		this.login = login;
		this.senha = senha;
		this.email = email;
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.rua = rua;
		this.cidade = cidade;
		this.pais = pais;
		this.cep = cep;
		this.setTipo(tipo);
		this.sobreMim = sobreMim;
		this.caminhoImagem = caminhoImagem;
	}

	public Usuario() {
		
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobreNome() {
		return sobreNome;
	}
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}

	public TIPOUSUARIO getTipo() {
		return tipo;
	}

	public void setTipo(TIPOUSUARIO tipo) {
		this.tipo = tipo;
	}

	public String getSobreMim() {
		return sobreMim;
	}

	public void setSobreMim(String sobreMim) {
		this.sobreMim = sobreMim;
	}

	public String getCaminhoImagem() {
		return caminhoImagem;
	}

	public void setCaminhoImagem(String caminhoImagem) {
		this.caminhoImagem = caminhoImagem;
	}
	
	
}

