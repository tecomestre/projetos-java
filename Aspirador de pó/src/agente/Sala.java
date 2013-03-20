package agente;


/**
 * @author thiago
 * 
 */
public class Sala  {

	private Estado estadoSala;  //Define o estado da sala (Limpo ou sujo)
				
	public static enum Estado{
		LIMPO, SUJO;	
	}
	
/*		Getters e Setters para o atributo 'estadoSala'		*/
	public Estado getEstadoSala() {
		return this.estadoSala;
	}
	public void setEstadoSala(Estado estadoSala) {
		this.estadoSala = estadoSala;
	}
}
