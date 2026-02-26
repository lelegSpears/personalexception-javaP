package exceptions;

public class DomainException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public DomainException(String message, Throwable cause) { // Mensagem e Causa do Erro
    super(message, cause);
}
	

}

