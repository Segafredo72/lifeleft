package exceptions;

public class LifeLeftFault {
    // code d'erreur
    private String faultCode;

    //message d'erreur
    private String faultString;

    //Tous les getters et setters des 2 attributs précédentes

    public String getFaultCode() {
        return faultCode;
    }

    public void setFaultCode(String faultCode) {
        this.faultCode = faultCode;
    }

    public String getFaultString() {
        return faultString;
    }

    public void setFaultString(String faultString) {
        this.faultString = faultString;
    }
}
