package agente;

import agente.Sala.Estado;


/** 
 * O agente aspirador de pó simples.
 * **/

public class ReflexaoSimplesAspiradorPo implements Agente<AspiradorDePo, Operacao> {
	
	/**
	 * Acionar se não estiver ligado, limpar local se estiver sujo, 
	 * mover para o outro local se o atual estiver limpo.
	 * **/

	public Operacao executar (AspiradorDePo asp) {
		
		if (asp.getLocalizacao().getEstadoSala() == Estado.SUJO){
			asp.getLocalizacao().setEstadoSala(Estado.LIMPO);
			return Operacao.SUGAR;
		} 
		else if (asp.getLocalizacao() ==  ){
			 asp.setLocalizacao(asp.getAmbiente().salaB);
			return Operacao.IR_PARA_ESQUERDA;
		} else {
			asp.setLocalizacao(asp.getAmbiente().salaA);
			return Operacao.IR_PARA_DIREITA;
		}

	}

	


}
