package com.aluracursos.radioalura.modelos;

public class Cancion extends Audio {
    private String album;
    private String artista;
    private String genero;

    @Override  //sustitución del método heredado
    public int getClasificacion() {
        if (getTotalMeGusta() > 5000) {
            return 8;
        } else {
            return 4;
        }
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


}
