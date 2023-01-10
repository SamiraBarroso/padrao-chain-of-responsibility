package org.example;

public class Email {
    private TipoEmail tipoEmail;

    public Email(TipoEmail tipoEmail) {
        this.tipoEmail = tipoEmail;
    }

    public TipoEmail getTipoEmail() {
        return tipoEmail;
    }

    public void setTipoEmail(TipoEmail tipoEmail) {
        this.tipoEmail = tipoEmail;
    }
}
