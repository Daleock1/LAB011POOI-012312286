package ListaDeLibros;

public class Libro {
		
		int numero;
		String name;
		Autor autor;
		double price;
		int qty;

		
		public Libro(int numero, String name, Autor autor, double price, int qty) {
			super();
			this.numero = numero;
			this.name = name;
			this.autor = autor;
			this.price = price;
			this.qty = qty;
		}
		public int getNumero() {
			
			return numero;
		}
	    public void setNumero(int numero) {
	        this.numero = numero;
	    }
		public String getName() {
			return name;
		}
		public Autor getAutor() {
			return autor;
		}

		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public int getQty() {
			return qty;
		}
		public void setQty(int qty) {
			this.qty = qty;
		}

		@Override
		public String toString() {
			return name + " by " + autor ;
		}

}
