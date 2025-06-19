class ParametrosInvalidosException extends Exception {

    // Construtor padrão sem argumentos
    public ParametrosInvalidosException() {
        super("O segundo parâmetro deve ser maior que o primeiro.");
    }

    // Construtor que aceita uma mensagem de erro personalizada
    public ParametrosInvalidosException(String message) {
        super(message);
    }

    // Construtor que aceita uma mensagem e uma causa (outra exceção que a originou)
    public ParametrosInvalidosException(String message, Throwable cause) {
        super(message, cause);
    }

    // Construtor que aceita apenas uma causa
    public ParametrosInvalidosException(Throwable cause) {
        super(cause);
    }
}