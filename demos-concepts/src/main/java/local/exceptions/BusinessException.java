package local.exceptions;

public class BusinessException extends Exception {

    ErrorCodes code;

    BusinessException(ErrorCodes code,String mensage) {
       super(); 
    }
        

    BusinessException(ErrorCodes code,String mensage Throwable cause) {
        super(message, cause);
        this.code = code;
    }
        

    private String generateMessage(ErrorCodes code, ) {
       getMessage();
       code;
}



enum ErrorCodes {
    ERROR_EVEN("No se admiten números pares"),
    ERROR_NEGATIVE("No se admiten números negativos");
    ERROR_ZERO("No se puede dividir por cero")
}
