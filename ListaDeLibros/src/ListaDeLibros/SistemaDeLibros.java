package ListaDeLibros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SistemaDeLibros {
    private List<Libro> listaLibro;
    private int contadorLibros;

    public SistemaDeLibros() {
        this.listaLibro = new ArrayList<>();
        this.contadorLibros = 1; 
    }
    
	public int getContadorLibros() {
		return contadorLibros++;
	}



    public void mostrarListaDeLibros() {

            System.out.printf("%1s%-40s%-30s%-10s%-10s\n", "N    ", "Nombre del Libro", "Autor", "Precio", "Cantidad");

        
            for (Libro libro : listaLibro) {
                System.out.printf("%-5d%-40s%-30s%-10.2f%-10d\n",
                        libro.getNumero(),
                        libro.getName(),
                        libro.getAutor().getName(),
                        libro.getPrice(),
                        libro.getQty());
            }
    }
 
   
    	public void agregarLibro(Libro libro, Autor autor) {
        libro.setNumero(contadorLibros++);
        listaLibro.add(libro);
   	}


	    public void eliminarLibro(int numeroLibro) {
	        for (Libro libro : listaLibro) {
	            if (libro.getNumero() == numeroLibro) {
	                listaLibro.remove(libro);
	                System.out.println("Libro Borrado\n" + libro.getName());
	                return;
	            }
	        }
	        System.out.println("Book with number " + numeroLibro + " not found.");
	    }

	    public void editarLibro(int numeroLibro, double precioNuevo, int qtyNuevo) {
	        for (Libro libro : listaLibro) {
	            if (libro.getNumero() == numeroLibro) {
	                libro.setPrice(precioNuevo);
	                libro.setQty(qtyNuevo);
	                System.out.println("Libro editado exitosamente:  " + libro.getName()+ "\n");
	                return;
	            }
	        }
	        System.out.println("Numero de libro " + numeroLibro + " no encotrado\n.");
	    }

	
	    public Libro buscarPorTitulo(String titulo) {
	        for (Libro libro : listaLibro) {
	            if (libro.getName().equalsIgnoreCase(titulo)) {
	                return libro;
	            }
	        }
	        return null;
	    }



	    public Autor getAutorPorLibro(Libro libro) {
	        return libro.getAutor();
	    }

	    public void ordenarPorAutor() {
	        Collections.sort(listaLibro, Comparator.comparing(b -> b.getAutor().getName()));
	        System.out.println("Books sorted by author.");
	    }
			
			public Libro buscarPorNumero(int numeroLibro) {
			    for (Libro libro : listaLibro) {
			        if (libro.getNumero() == numeroLibro) {
			            return libro;
			        }
			    }
			    return null; // Si no se encuentra el libro con el número proporcionado
			}
		public void ordenarPorNumero() {
		    Collections.sort(listaLibro, Comparator.comparingInt(Libro::getNumero));
		    System.out.println("Books sorted by number.");
		}


	    
	}

