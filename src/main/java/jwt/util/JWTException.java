package jwt.util;

public class JWTException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public JWTException() {
        super();
    }
    
    //깰꼼
    public JWTException(String message, Throwable cause) {
        super(message, cause);
    }

    public JWTException(String message) {
        super(message);
    }

    public JWTException(Throwable cause) {
        super(cause);
    }

}