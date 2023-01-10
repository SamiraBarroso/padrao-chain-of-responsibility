package org.example;

public class TipoEmailSpam implements TipoEmail{
    private static TipoEmailSpam tipoEmailSpam = new TipoEmailSpam();

    private TipoEmailSpam() {};

    public static TipoEmailSpam getTipoEmailSpam() {
        return tipoEmailSpam;
    }
}
