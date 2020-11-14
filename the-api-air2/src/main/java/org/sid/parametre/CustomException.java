package org.sid.parametre;

import java.util.HashMap;

public class CustomException extends  Exception {
    public static final int SQL_ERREUR = 10; //exception requete sql
    public static final int USER_ERREUR = 20; // erreur de l'utilisateur
    public static final int JNDI_ERREUR = 30; //exception requete sql
    
    private int numErreur;
    private HashMap<String, String> messages;

    public CustomException() {
        messages = new HashMap<>();
    }

    public CustomException(int numErreur, HashMap<String, String> messages) {
        this.numErreur = numErreur;
        this.messages = messages;
    }

    public CustomException(int numErreur, HashMap<String, String> messages, String message) {
        super(message);
        this.numErreur = numErreur;
        this.messages = messages;
    }

    public int getNumErreur() {
        return numErreur;
    }

    public void setNumErreur(int numErreur) {
        this.numErreur = numErreur;
    }

    public HashMap<String, String> getMessages() {
        return messages;
    }

    public void setMessages(HashMap<String, String> messages) {
        this.messages = messages;
    }
    
    public String getInfo(String clef){
        return messages.get(clef);
    }
}
