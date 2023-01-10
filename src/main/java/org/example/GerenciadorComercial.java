package org.example;

public class GerenciadorComercial  extends Gerenciador{

    public GerenciadorComercial(Gerenciador superior) {
        listaEmails.add(TipoEmailComercial.getTipoEmailComercial());
        setGerenciadorSeguinte(superior);
    }
    @Override
    public String getMessage() {
        return "Enviado para departamento comercial.";
    }
}