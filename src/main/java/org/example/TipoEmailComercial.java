package org.example;

public class TipoEmailComercial implements TipoEmail{
    private static TipoEmailComercial tipoEmailComercial = new TipoEmailComercial();

    private TipoEmailComercial() {};

    public static TipoEmailComercial getTipoEmailComercial() {
        return tipoEmailComercial;
    }
}
