package Clases;

import java.util.ArrayList;
import java.util.List;

public class AvisoGeneral {
    private List<String> avisos; // Lista para guardar avisos

    public AvisoGeneral() {
        avisos = new ArrayList<>();
    }

    public void agregarAviso(String titulo, String mensaje) {
        avisos.add("📢 " + titulo + ": " + mensaje); // Agregar aviso a la lista
    }

    public List<String> getAvisos() {
        return avisos;
    }
    
    /*
    private String titulo;
    private String mensaje;
    
    public void Anuncio(String titulo) {
        this.mensaje = mensaje;
        this.titulo = titulo;
    }

    public String getMensaje() {
        return mensaje;
    }
    
    public String getTitulo() {
        return titulo;
    }
    */
    
    
}
