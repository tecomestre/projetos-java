package agente;

public interface Agente <Percepcao, Acao>{

	
	/**
	 * Retorna a ação que o agente deve fazer, dada a:
	 * Percepção (Atual). Um implementador desta interface provavelmente irá 
	 * adicionar a percepção atual em sua base de conhecimento interno e, assim,
	 * ser capaz de esocolher uma ação baseado no histórico de perceção atual
	 */
	Acao executar(Percepcao p);
}
