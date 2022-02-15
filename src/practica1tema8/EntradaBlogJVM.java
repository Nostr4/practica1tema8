package practica1tema8;

/*Clase para manejar las entradas de un blog.
 * La clase se creó el 15/2/2022 por Juan Manuel Vázquez.
 * Esta es la versión 2.3
 */

/**
 * 
 * @author nombre del autor
 *
 */
public class EntradaBlogJVM {	
	/**
	 * Error desconocido
	 */
	public static char separador=':';
	private int id;
	private String texto;
	private String autor;
	
/**
 * 
 * @param id identificador
 * @param autor nombre del autor
 * @param texto titulo
 * @throws IllegalArgumentException error del identificador
 */
	public EntradaBlogJVM(int id,String autor,String texto)throws IllegalArgumentException{
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
	
	/**
	 * 
	 * @return Devuelve el número de la entrada
	 */
	public int getId(){
		return this.id;
	}
	
	/**
	 * 
	 * @return devuelve el texto completo de la entrada
	 */
	public String getTexto(){
		return this.texto;
	}
	
	/**
	 * 
	 * @return devuelve el nombre del autor de la entrada en mayúsculas
	 */
	public String getAutor(){
		return this.autor.toUpperCase();
	}
	
	/**
	 * 
	 * @return devuelve el nombre del autor. Ya no se usa. Mejor ver getAutor
	 */
	public String devuelveAutor(){
		return this.autor;
	}
	
	/**
	 * 
	 * @param args No tiene porqué tener argumentos.
	 */
	public static void main(String[] args) {
                //Modificar.
		EntradaBlogJVM e1=new EntradaBlogJVM (3,"Ana","Últimas noticias, está disponible BixBy 2.0");
		System.out.println(e1);
	}
}
