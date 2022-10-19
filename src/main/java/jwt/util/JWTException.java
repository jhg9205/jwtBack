package jwt.util;

public class JWTException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public JWTException() {
        super();
    }

// 커밋충돌 갈게여ㅛ





    // 나 다른거 진행중;; develop
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