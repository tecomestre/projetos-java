package agente;


import java.util.ArrayList;

import agente.Sala.Estado;


public class AspiradorDePo extends ReflexaoSimplesAspiradorPo{

	private Sala localizacao;
	
	private Operacao operacao;
		
	public AspiradorDePo(){
		
	}
	
	public AspiradorDePo(Sala localizacao, Operacao operacao){
		this.setLocalizacao(localizacao); 
		this.setAcao(operacao);
	}

	public static void main(String[] args) {
		Sala salaA = new Sala();
		Sala salaB = new Sala();

		ArrayList<Sala> ambiente = new ArrayList<Sala>(); // um ambiente que tem salas
	
		ambiente.add(salaA);
		ambiente.add(salaB);
		
		Sala localizacao; // atributo usado para definir a localização aspirador de pó (em qual sala se encontra)
		Operacao operacao = Operacao.SAIR_DO_MODO_ESPERA;

		ambiente.get(0).setEstadoSala(Estado.SUJO); // configura a salaA para o estado sujo
		ambiente.get(1).setEstadoSala(Estado.LIMPO);// configura a salaB para o estado limpo
		localizacao = ambiente.get(0); 
		
		AspiradorDePo asp = new AspiradorDePo(localizacao, operacao); // define a localização e a ação ou modo de operacao do aspirador de pó
		
		while(asp.getOperacao() != Operacao.ENTRAR_EM_MODO_ESPERA){
			Operacao result = asp.executar(asp);
			System.out.println(result);
					
        }
	}
	

	public Operacao getOperacao() {
		return operacao;
	}
	public void setOperacao(Operacao operacao) {
		this.operacao = operacao;
	}
	public Sala getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(Sala localizacao) {
		this.localizacao = localizacao;
	}
	

		
}
