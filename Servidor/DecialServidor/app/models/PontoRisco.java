package models;


import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.avaje.ebean.Model;

import enums.RISCO;
import enums.STATUS;

@Entity
@Table(name="ponto_risco")
public class PontoRisco extends Model{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String cep;
	private String solicitacaoBairro;
	private String solicitacaoEndereco;
	private String solicitacaoDescricao;
	private String enderecoReferencia;
	private STATUS status;
	private Float latitude;
	private Float longitude;
	private Long processoNumero;
	private Date dataSolicitacao;
	private Date dataAceitacao;
	private RISCO risco;
	
	private Long avaliadorID;
	
	public PontoRisco(String cep, String solicitacaoBairro, String solicitacaoEndereco, String solicitacaoDescricao, String enderecoReferencia,
			STATUS status, Float latitude, Float longitude, Long processoNumero, Date dataSolicitacao, Date dataAceitacao , RISCO risco, Long avaliadorID)
	{
		this.cep = cep;
		this.solicitacaoBairro = solicitacaoBairro;
		this.solicitacaoEndereco = solicitacaoEndereco;
		this.solicitacaoDescricao = solicitacaoDescricao;
		this.enderecoReferencia = enderecoReferencia;
		this.status = status;
		this.latitude = latitude;
		this.longitude = longitude;
		this.processoNumero = processoNumero;
		this.dataAceitacao = dataAceitacao;
		this.risco = risco;
		this.avaliadorID = avaliadorID;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSolicitacaoBairro() {
		return solicitacaoBairro;
	}
	public void setSolicitacaoBairro(String solicitacaoBairro) {
		this.solicitacaoBairro = solicitacaoBairro;
	}
	public String getSolicitacaoEndereco() {
		return solicitacaoEndereco;
	}
	public void setSolicitacaoEndereco(String solicitacaoEndereco) {
		this.solicitacaoEndereco = solicitacaoEndereco;
	}
	
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getSolicitacaoDescricao() {
		return solicitacaoDescricao;
	}
	public void setSolicitacaoDescricao(String solicitacaoDescricao) {
		this.solicitacaoDescricao = solicitacaoDescricao;
	}
	public String getEnderecoReferencia() {
		return enderecoReferencia;
	}
	public void setEnderecoReferencia(String enderecoReferencia) {
		this.enderecoReferencia = enderecoReferencia;
	}
	public STATUS getStatus() {
		return status;
	}
	public void setStatus(STATUS status) {
		this.status = status;
	}
	public Float getLatitude() {
		return latitude;
	}
	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}
	public Float getLongitude() {
		return longitude;
	}
	public void setLongitude(Float longitude) {
		this.longitude = longitude;
	}
	public Long getprocessoNumero() {
		return processoNumero;
	}
	public void setprocessoNumero(Long processoNumero) {
		this.processoNumero = processoNumero;
	}
	public Date getDataSolicitacao() {
		return dataSolicitacao;
	}
	public void setDataSolicitacao(Date dataSolicitacao) {
		this.dataSolicitacao = dataSolicitacao;
	}
	public Date getDataAceitacao() {
		return dataAceitacao;
	}
	public void setDataAceitacao(Date dataAceitacao) {
		this.dataAceitacao = dataAceitacao;
	}
	public RISCO getRisco() {
		return risco;
	}
	public void setRisco(RISCO risco) {
		this.risco = risco;
	}
	public Long getAvaliadorID() {
		return avaliadorID;
	}
	public void setAvaliadorID(Long avaliadorID) {
		this.avaliadorID = avaliadorID;
	}
	
}
