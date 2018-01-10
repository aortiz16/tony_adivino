/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasimple;

/**
 *
 * @author aortiz16
 */
public class EntradaBlogAO{
	/*Clase para manejar las entradas de un blog.
	 * La clase se cre� el 21/3/1999 por Ana L�pez.
	 * Esta es la versi�n 2.3
	 */
	//Modificar.
	public class EntradaBlog+INICIALES {
		//separador es el ccar�cter que separa ENTRADA DE del
		//nombre del autor
		
		public static char separador=':';
		private int id;
		private String texto;
		private String autor;
		
		//Constructor de la clase. recibe el n�mero de entrada, el nombre del autor
		//de la entrada y el texto que contiene la entrada. Si el n�mero de entrada
		//es negativo, lanza una excepci�n.
		public EntradaBlog(int id,String autor,String texto)throws IllegalArgumentException{
			if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
			this.id=id;
			this.autor=autor;
			this.texto=texto;
		}
		@Override
		public String toString(){
			String cad="";
			cad+="\nENTRADA DE"+separador+autor;
			cad+="\n "+texto;
			return cad;
		}
		
		//Devuelve el n�mero de la entrada
		public int getId(){
			return this.id;
		}
		
		//devuelve el texto completo de la entrada
		public String getTexto(){
			return this.texto;
		}
		
		//devuelve el nombre del autor de la entrada en may�sculas
		public String getAutor(){
			return this.autor.toUpperCase();
		}
		
		//devuelve el nombre del autor. Ya no se usa. Mejor ver getAutor
		public String devuelveAutor(){
			return this.autor;
		}
		
		//No tiene porqu� tener argumentos.
		public static void main(String[] args) {
	                //Modificar.
			EntradaBlog+INICIALES e1=new EntradaBlog+INICIALES (-3,"ana","�ltimas noticias, est� disponible BixBy 2.0");
			System.out.println(e1);
		}
	}	
}


public class Listasimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
