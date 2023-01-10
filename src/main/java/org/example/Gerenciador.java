package org.example;

import java.util.ArrayList;

public abstract class Gerenciador {

    protected Gerenciador gerenciadorSeguinte;
    protected ArrayList listaEmails = new ArrayList<>();

    public Gerenciador getGerenciadorSeguinte() {
        return gerenciadorSeguinte;
    }

    public void setGerenciadorSeguinte(Gerenciador gerenciadorSeguinte) {
        this.gerenciadorSeguinte = gerenciadorSeguinte;
    }

    public abstract String getMessage();
    public  String redirecionar(Email email){
        if (listaEmails.contains(email.getTipoEmail())) {
            return getMessage();
        }
        else {
            if (gerenciadorSeguinte != null) {
                return gerenciadorSeguinte.redirecionar(email);
            }
            else
            {
                return "Sem redirecionamento";
            }
        }
    }

}


