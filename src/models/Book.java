package models;

public class Book implements Comparable<Book> {
    private String titulo;
    private String autor;
    private int anio;

    public Book(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnio() {
        return anio;
    }

    @Override
    public String toString() {
        return "\ntitulo:" + titulo + ", autor:" + autor + ", anio:" + anio + ".";
    }

    

    @Override
    public int compareTo(Book o) {
        int comp= o.titulo.compareTo(this.titulo);
        if(comp!=0){
            return comp;
        }
        return Integer.compare(this.anio, o.anio);
    }

    
    
}
