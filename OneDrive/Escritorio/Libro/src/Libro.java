public class Libro {
    private String libro;
    private String autor;
    private int numeroDecopias;
    private int prestados;

    public Libro(String libro, String autor, int numeroDecopias, int prestados) {
        this.libro = libro;
        this.autor = autor;
        this.numeroDecopias = numeroDecopias;
        this.prestados = prestados;
    }

    public boolean prestamo() {
        if (prestados < numeroDecopias) { 
            prestados++;
            return true;
        } else {
            System.out.println("No hay copias disponibles para préstamo.");
            return false;
        }
    }

    public boolean devolucion() {
        if (prestados > 0) { 
            prestados--;
            return true;
        } else {
            System.out.println("No hay préstamos registrados para devolver.");
            return false;
        }
    }

    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroDecopias() {
        return numeroDecopias;
    }

    public void setNumeroDecopias(int numeroDecopias) {
        this.numeroDecopias = numeroDecopias;
    }

    public int getPrestados() {
        return prestados;
    }

    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }

    @Override
    public String toString() {
        return "Libro: " + libro + "\nAutor: " + autor + "\nCopias: " + numeroDecopias + "\nPrestados: " + prestados;
    }
}
