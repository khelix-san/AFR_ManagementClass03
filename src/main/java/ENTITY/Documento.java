package ENTITY;

import java.util.Date;

public class Documento {
    private String nDocumento;
    private String tipo;
    private Date emissione;
    private String note;
    private String cf;
    private String matricola;

    public Documento(){}

    public Documento(String nDocumento, String tipo, Date emissione, String note, String cf, String matricola) {
        this.nDocumento = nDocumento;
        this.tipo = tipo;
        this.emissione = emissione;
        this.note = note;
        this.cf = cf;
        this.matricola = matricola;
    }

    public String getnDocumento() {
        return nDocumento;
    }

    public void setnDocumento(String nDocumento) {
        this.nDocumento.equals(nDocumento);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getEmissione() {
        return emissione;
    }

    public void setEmissione(Date emissione) {
        this.emissione = emissione;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getCf() {
        return cf;
    }

    public void setCf(String cf) {
        this.cf = cf;
    }

    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "nDocumento=" + nDocumento +
                ", tipo='" + tipo + '\'' +
                ", emissione=" + emissione +
                ", note='" + note + '\'' +
                ", cf='" + cf + '\'' +
                ", matricola='" + matricola + '\'' +
                '}';
    }
}