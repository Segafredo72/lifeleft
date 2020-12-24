package exceptions;

import javax.xml.ws.WebFault;

@WebFault(name = "LifeLeftException")
public class LifeLeftException extends Exception {

    /*
    on déclare une instance de LifeLeftFault qu'on créée précédemment
    afin de récupérer ensuite les messages et codes d'erreurs à renvoyer dans cette exception
     */
    private LifeLeftFault fault;

    /*
    On crée un constructeur qui prend en paramètre un message d'erreur et un objet LifeLeftFault
    avec plus de détails sur l'erreur
    */
    public LifeLeftException(String message, LifeLeftFault fault) {
        super(message);
        this.fault = fault;
    }

    public LifeLeftException(String message, Throwable cause, LifeLeftFault fault) {
        super(message, cause);
        this.fault = fault;
    }

    public LifeLeftFault getFaultInfo() {
        return fault;
    }
}
