package co.com.devco.certification.hangout.util.enums;

/**
 * The enum Exception codes.
 *
 * @author Juan Pablo Gomez Monsalve
 */
public enum ExceptionCodes {
    /**
     * The Empty request.
     */
    EMPTY_REQUEST(0, "La consulta no generÃ³ ningÃºn resultado"),
    /**
     * The Utility class.
     */
    UTILITY_CLASS(1, "Clase de utilidades"),
    /**
     * The Missing header.
     */
    MISSING_HEADER(2, "Required header is missing"),
    /**
     * The Connection failed.
     */   
    VALUE_DIFFERENT(13, "E valor obtenido no es igual al esperado");

    private final int id;
    private final String msg;

    ExceptionCodes(int id, String msg) {
        this.id = id;
        this.msg = msg;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return this.id;
    }

    /**
     * Gets msg.
     *
     * @return the msg
     */
    public String getMsg() {
        return this.msg;
    }
}
