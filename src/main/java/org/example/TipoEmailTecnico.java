package org.example;

public class TipoEmailTecnico implements TipoEmail {

    private static TipoEmailTecnico tipoEmailTecnico = new TipoEmailTecnico();

    private TipoEmailTecnico() {};

    public static TipoEmailTecnico getTipoEmailTecnico() {
        return tipoEmailTecnico;
    }
}
