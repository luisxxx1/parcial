public class LibroMain {
    public static void main(String[] args) {
        Libro librito1 = new Libro("Mil Maneras", "Luis", 3, 2);
        
        System.out.println(librito1); 
        
        System.out.println("\nprestamo ");
        librito1.prestamo();  
        
        System.out.println("\nEstado actual:");
        System.out.println(librito1); 
        
        System.out.println("\n devolver");
        librito1.devolucion();  
        
        System.out.println("\nEstado final:");
        System.out.println(librito1);  
    }
}
