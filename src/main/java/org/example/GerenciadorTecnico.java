package org.example;

public class GerenciadorTecnico extends Gerenciador{

    public GerenciadorTecnico(Gerenciador superior) {
        listaEmails.add(TipoEmailTecnico.getTipoEmailTecnico());
        setGerenciadorSeguinte(superior);
    }
    @Override
    public String getMessage() {
        return "Enviado para departamento técnico.";
    }
}
