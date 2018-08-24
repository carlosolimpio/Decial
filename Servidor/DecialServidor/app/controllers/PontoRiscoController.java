package controllers;

import java.sql.Date;
import java.util.List;

import javax.persistence.OneToOne;

import com.fasterxml.jackson.databind.JsonNode;

import enums.RISCO;
import enums.STATUS;
import interceptors.ApiInterceptor;
import models.PontoRisco;
import models.Usuario;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import services.PontoRiscoService;
import services.UsuarioService;

@play.mvc.With({ ApiInterceptor.class })
public class PontoRiscoController extends Controller {
	
	
	public Result getAll()
	{
		List<PontoRisco> lpr = PontoRiscoService.getAll();
		
		return ok(Json.toJson(lpr));
	}
	
	public Result getById(Long id)
	{
		PontoRisco ponto = PontoRiscoService.getById(id);
		return  ok(Json.toJson(ponto));
	}
	
	public Result getByCep(String cep)
	{
		List<PontoRisco> ponto = PontoRiscoService.getByCep(cep);
		return  ok(Json.toJson(ponto));
	}
	
	public Result getByRisco(Integer risc)
	{
		RISCO risco = RISCO.values()[risc.intValue()];
		
		List<PontoRisco> ponto = PontoRiscoService.getByRisco(risco);
		return  ok(Json.toJson(ponto));
	}
	
	public Result delete(Long id)
	{
		PontoRisco ponto = PontoRiscoService.getById(id);
		
		if(ponto == null)
			return ok(Json.toJson(false));
		
		ponto.delete();
		return ok(Json.toJson(true));
	}
	
	public Result save(String cep, String solicitacaoBairro, String solicitacaoEndereco, String solicitacaoDescricao, String enderecoReferencia)
	{
		//JsonNode resultado = request().body().asJson();
		
		try
		{
			/*
			String cep = resultado.get("cep").asText();
			String solicitacaoBairro = resultado.get("solicitacaoBairro").asText();
			String solicitacaoEndereco = resultado.get("solicitacaoEndereco").asText();
			String solicitacaoDescricao = resultado.get("solicitacaoDescricao").asText();
			String enderecoReferencia = resultado.get("enderecoReferencia").asText(); 
			int statusAux = resultado.get("status").intValue();
			STATUS status = STATUS.values()[statusAux];
			Float latitude = resultado.get("latitude").floatValue();
			Float longitude = resultado.get("longitude").floatValue();
			Long processoNumero = resultado.get("processoNumero").longValue();
			Date dataSolicitacao = Date.valueOf(resultado.get("dataSolicitacao").asText());
			Date dataAceitacao = Date.valueOf(resultado.get("dataAceitacao").asText());
			int riscoAux = resultado.get("risco").intValue();
			RISCO risco = RISCO.values()[riscoAux];
			Long avaliadorID = resultado.get("avaliadorID").asLong();
			*/
		
			
			PontoRisco ponto = new PontoRisco(cep, solicitacaoBairro, solicitacaoEndereco, solicitacaoDescricao, enderecoReferencia);
			ponto.save();
			return ok(Json.toJson(ponto));
		}
		catch(Exception e)
		{
			return null;
		}
	}
	
	
	public Result update(Long id)
	{
JsonNode resultado = request().body().asJson();
		
		try
		{
			String cep = resultado.get("cep").asText();
			String solicitacaoBairro = resultado.get("solicitacaoBairro").asText();
			String solicitacaoEndereco = resultado.get("solicitacaoEndereco").asText();
			String solicitacaoDescricao = resultado.get("solicitacaoDescricao").asText();
			String enderecoReferencia = resultado.get("enderecoReferencia").asText(); 
			int statusAux = resultado.get("status").intValue();
			STATUS status = STATUS.values()[statusAux];
			Float latitude = resultado.get("latitude").floatValue();
			Float longitude = resultado.get("longitude").floatValue();
			Long processoNumero = resultado.get("processoNumero").longValue();
			Date dataSolicitacao = Date.valueOf(resultado.get("dataSolicitacao").asText());
			Date dataAceitacao = Date.valueOf(resultado.get("dataAceitacao").asText());
			int riscoAux = resultado.get("risco").intValue();
			RISCO risco = RISCO.values()[riscoAux];
			Long avaliadorID = resultado.get("avaliadorID").asLong();
			
			
			PontoRisco ponto = PontoRiscoService.getById(id);
			
			if(ponto == null)
				return null;
			
			ponto.setCep(cep);
			ponto.setSolicitacaoBairro(solicitacaoBairro);
			ponto.setSolicitacaoEndereco(solicitacaoEndereco);
			ponto.setSolicitacaoDescricao(solicitacaoDescricao);
			ponto.setEnderecoReferencia(enderecoReferencia);
			/*
			ponto.setStatus(status);
			ponto.setLatitude(latitude);
			ponto.setLongitude(longitude);
			ponto.setprocessoNumero(processoNumero);
			ponto.setDataAceitacao(dataAceitacao);
			ponto.setDataSolicitacao(dataSolicitacao);
			ponto.setRisco(risco);
			ponto.setAvaliadorID(avaliadorID);
			*/
			
			ponto.save();
			return ok(Json.toJson(ponto));
		}
		catch(Exception e)
		{
			return null;
		}
	}
	
}
