package ListaDeLibros;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		 	Autor marquez = new Autor("Gabriel Garcia Marquez", "gabo@email.com", 'M');
	        Autor tolkien = new Autor("J. R. R. Tolkien", "tolkien@email.com", 'M');
	        Autor orwell = new Autor("George Orwell", "orwell@email.com", 'M');
	        Autor huxley = new Autor("Aldous Huxley", "huxley@email.com", 'M');
	        Autor austen = new Autor("Jane Austen", "austen@email.com", 'F');
	        Autor dostoyevski = new Autor("Fiodor Dostoyevski", "dostoyevski@email.com", 'M');
	        Autor nabokov = new Autor("Vladimir Nabokov", "nabokov@email.com", 'M');
	        Autor joyce = new Autor("James Joyce", "joyce@email.com", 'M');
	        Autor flaubert = new Autor("Gustave Flaubert", "flaubert@email.com", 'M');
	        Autor proust = new Autor("Marcel Proust", "proust@email.com", 'M');
	        Autor cervantes = new Autor("Miguel de Cervantes", "cervantes@email.com", 'M');
	        Autor wilde = new Autor("Oscar Wilde", "wilde@email.com", 'M');
	        Autor exupery = new Autor("Antoine de Saint-Exupéry", "exupery@email.com", 'M');
	        Autor faulkner = new Autor("William Faulkner", "faulkner@email.com", 'M');
	        Autor swift = new Autor("Jonathan Swift", "swift@email.com", 'M');
	        Autor golden = new Autor("Arthur Golden", "golden@email.com", 'M');
	        Autor collins = new Autor("Suzanne Collins", "collins@email.com", 'F');
	        Autor rowling = new Autor("J. K. Rowling", "rowling@email.com", 'F');
	        Autor hugo = new Autor("Victor Hugo", "hugo@email.com", 'M');
	        Autor lewis = new Autor("C. S. Lewis", "lewis@email.com", 'M');
	        
	        Libro cienAnos = new Libro(1, "Cien anos de soledad", marquez, 200, 400);
	        Libro senorAnillos = new Libro(2, "El senor de los anillos", tolkien, 1500, 1200);
	        Libro libro1984 = new Libro(3, "1984", orwell, 500, 300);
	        Libro mundoFeliz = new Libro(4, "Un mundo feliz", huxley, 320, 500);
	        Libro orgulloPrejuicio = new Libro(5, "Orgullo y prejuicio", austen, 130, 700);
	        Libro crimenCastigo = new Libro(6, "Crimen y castigo", dostoyevski, 230, 540);
	        Libro lolita = new Libro(7, "Lolita", nabokov, 140, 456);
	        Libro ulises = new Libro(8, "Ulises", joyce, 158, 400);
	        Libro madameBovary = new Libro(9, "Madame Bovary", flaubert, 120, 430);
	        Libro tiempoPerdido = new Libro(10, "En busca del tiempo perdido", proust, 345, 450);
	        Libro donQuijote = new Libro(11, "Don Quijote de la Mancha", cervantes, 340, 123);
	        Libro retratoDorianGray = new Libro(12, "El retrato de Dorian Gray", wilde, 125, 67);
	        Libro principito = new Libro(13, "El Principito", exupery, 259, 345);
	        Libro ruidoFuria = new Libro(14, "El ruido y la furia", faulkner, 134, 246);
	        Libro viajesGulliver = new Libro(15, "Los viajes de Gulliver", swift, 186, 234);
	        Libro memoriasGeisha = new Libro(16, "Memorias de una geisha", golden, 195, 234);
	        Libro juegosHambre = new Libro(17, "Los juegos del hambre", collins, 181, 234);
	        Libro harryPotter = new Libro(18, "Harry Potter y la piedra filosofal", rowling, 650, 4000);
	        Libro miserables = new Libro(19, "Los miserables", hugo, 23, 245);
	        Libro cronicasNarnia = new Libro(20, "Las cronicas de Narnia", lewis, 456, 444);
	        
	        SistemaDeLibros sistemaDeLibros = new SistemaDeLibros();
	        sistemaDeLibros.agregarLibro(cienAnos, marquez);
	        sistemaDeLibros.agregarLibro(senorAnillos, tolkien);
	        sistemaDeLibros.agregarLibro(libro1984, orwell);
	        sistemaDeLibros.agregarLibro(mundoFeliz, huxley);
	        sistemaDeLibros.agregarLibro(orgulloPrejuicio, austen);
	        sistemaDeLibros.agregarLibro(crimenCastigo, dostoyevski);
	        sistemaDeLibros.agregarLibro(lolita, nabokov);
	        sistemaDeLibros.agregarLibro(ulises, joyce);
	        sistemaDeLibros.agregarLibro(madameBovary, flaubert);
	        sistemaDeLibros.agregarLibro(tiempoPerdido, proust);
	        sistemaDeLibros.agregarLibro(donQuijote, cervantes);
	        sistemaDeLibros.agregarLibro(retratoDorianGray, wilde);
	        sistemaDeLibros.agregarLibro(principito, exupery);
	        sistemaDeLibros.agregarLibro(ruidoFuria, faulkner);
	        sistemaDeLibros.agregarLibro(viajesGulliver, swift);
	        sistemaDeLibros.agregarLibro(memoriasGeisha, golden);
	        sistemaDeLibros.agregarLibro(juegosHambre, collins);	
	        sistemaDeLibros.agregarLibro(harryPotter, rowling);
	        sistemaDeLibros.agregarLibro(miserables, hugo);
	        sistemaDeLibros.agregarLibro(cronicasNarnia, lewis);
	        

	        Scanner scanner = new Scanner(System.in);

	        int opcion;
	        boolean exit = false;
	        do {
	            mostrarMenu();
	            System.out.print("\nSeleccione una operacion: ");
	            opcion = scanner.nextInt();
	            scanner.nextLine();

	            switch (opcion) {
	            case 1:
	                sistemaDeLibros.mostrarListaDeLibros();
	                System.out.println("\n");
	                break;

	            case 2:
	                agregarLibroConAutor(scanner, sistemaDeLibros);
	                break;
	            case 3:
	            	sistemaDeLibros.mostrarListaDeLibros();
	                System.out.println("Ingrese el numero del libro que desea eliminar:");
	                int numeroLibroEliminar = scanner.nextInt();
	                sistemaDeLibros.eliminarLibro(numeroLibroEliminar);
	                break;
	            case 4:
	                sistemaDeLibros.mostrarListaDeLibros();
	                editarLibro(scanner, sistemaDeLibros);
	                break;
	            case 5:
	                System.out.println("Ingrese el titulo del libro que desea buscar:");
	                String tituloBuscar = scanner.nextLine();
	                Libro libroEncontrado = sistemaDeLibros.buscarPorTitulo(tituloBuscar);
	                if (libroEncontrado != null) {
	                    System.out.println("Libro encontrado:\n " + libroEncontrado + "\n");
	                } else {
	                    System.out.println("Libro no encontrado.\n");
	                }
	                break;
	            case 6:
	                buscarAutorPorLibro(scanner, sistemaDeLibros);
	                break;
	                case 7:
	                    sistemaDeLibros.ordenarPorAutor();
	                    break;
	                case 8:
	                    exit = true;
	                    System.out.println("Saliendo del programa. ¡Hasta luego!");
	                    break;
	                default:
	                    System.out.println("Opcion no valida. Intentelo de nuevo.");
	            }

	        } while (!exit);
	    }

	private static int contadorLibros = 21;
	private static void agregarLibroConAutor(Scanner scanner, SistemaDeLibros sistemaDeLibros) {
	    System.out.println("Ingrese el titulo del libro:");
	    String titulo = scanner.nextLine();

	    System.out.println("Ingrese el precio del libro:");
	    double precio = scanner.nextDouble();

	    System.out.println("Ingrese la cantidad disponible del libro:");
	    int cantidad = scanner.nextInt();

	    scanner.nextLine(); 

	    System.out.println("Ingrese el nombre del autor:");
	    String nombreAutor = scanner.next();
	    scanner.nextLine();

	    System.out.println("Ingrese el correo electrónico del autor:");
	    String emailAutor = scanner.nextLine();

	    System.out.println("Ingrese el genero del autor (M/F):");
	    char generoAutor = scanner.next().charAt(0);

	    Autor autor = new Autor(nombreAutor, emailAutor, generoAutor);
	    
	    int numeroLibroNuevo = contadorLibros++;

	    Libro libro = new Libro(numeroLibroNuevo, titulo, autor, precio, cantidad);
	    
	    sistemaDeLibros.agregarLibro(libro, autor);
	    System.out.println("Libro agregado exitosamente.");
	}


		
		private static void editarLibro(Scanner scanner, SistemaDeLibros sistemaDeLibros) {
	    System.out.println("\nIngrese el numero del libro que desea editar:");
	    int numeroLibroEditar = scanner.nextInt();
	    scanner.nextLine();

	    Libro libroExistente = sistemaDeLibros.buscarPorNumero(numeroLibroEditar);

	    if (libroExistente != null) {
	        System.out.println("Ingrese el nuevo precio del libro:");
	        double nuevoPrecio = scanner.nextDouble();

	        System.out.println("Ingrese la nueva cantidad disponible del libro:");
	        int nuevaCantidad = scanner.nextInt();

	        sistemaDeLibros.editarLibro(numeroLibroEditar, nuevoPrecio, nuevaCantidad);
	        System.out.println("Libro editado exitosamente.");
	    } else {
	        System.out.println("Libro con numero " + numeroLibroEditar + " no encontrado.");
	    }
	}

	    
	    
		private static void buscarAutorPorLibro(Scanner scanner, SistemaDeLibros sistemaDeLibros) {
		    System.out.println("Ingrese el titulo del libro para encontrar el autor:");
		    String tituloBuscarAutor = scanner.nextLine();
		    Libro libroAutor = sistemaDeLibros.buscarPorTitulo(tituloBuscarAutor);

		    if (libroAutor != null) {
		        Autor autor = sistemaDeLibros.getAutorPorLibro(libroAutor);
		        System.out.println("El autor de '" + libroAutor.getName() + "' es: " + autor.getName());
		    } else {
		        System.out.println("Libro no encontrado.");
		    }
		}

	   
		private static void mostrarMenu() {
	        System.out.println("\tMENU DE OPCIONES");
	        System.out.println("1. Mostrar la lista de libros");
	        System.out.println("2. Agregar un libro y asignar el autor del libro");
	        System.out.println("3. Eliminar un libro");
	        System.out.println("4. Editar un libro");
	        System.out.println("5. Buscar un libro por titulo");
	        System.out.println("6. Buscar el autor dado un libro");
	        System.out.println("7. Ordenar los libros por autor");
	        System.out.println("8. Salir");
	    }
	}

