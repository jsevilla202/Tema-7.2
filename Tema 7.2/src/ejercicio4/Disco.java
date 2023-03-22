package ejercicio4;
/**
 * Clase con las funciones de Disco
 * @author Jaime Sevilla
 *
 */
public class Disco {
	/**
	 * Codigo del disco, por defecto LIBRE
	 */
	String codigo;
	/**
	 * Autor del disco
	 */
	String autor;
	/**
	 * Titulo del disco
	 */
	String titulo;
	/**
	 * Genero del disco
	 */
	String genero;
	/**
	 * Duración del disco
	 */
	int duracion;
	/**
	 * Constructor por defecto
	 */
	public Disco() {
		super();
		codigo  = "LIBRE";
	}
	/**
	 * Constructor con todos los parámetros
	 * @param codigo Valor para el parametro codigo dado por el usuario
	 * @param autor Valor para el parametro autor dado por el usuario
	 * @param titulo Valor para el parametro titulo dado por el usuario
	 * @param genero Valor para el parametro genero dado por el usuario
	 * @param duracion Valor para el parametro duracion dado por el usuario
	 */
	public Disco(String codigo, String autor, String titulo, String genero, int duracion) {
		super();
		this.codigo = codigo;
		this.autor = autor;
		this.titulo = titulo;
		this.genero = genero;
		this.duracion = duracion;
	}
	/**
	 * Constructor copia
	 * @param d Objeto diferente
	 */
	public Disco(Disco d) {
		super();
		this.codigo = d.codigo;
		this.autor = d.autor;
		this.titulo = d.titulo;
		this.genero = d.genero;
		this.duracion = d.duracion;
	}
	/**
	 * Getter de codigo
	 * @return Devuelve el valor de codigo
	 */
	public String getCodigo() {
		return codigo;
	}
	/**
	 * Setter de codigo
	 * @param codigo  Valor para el parametro codigo dado por el usuario
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	/**
	 * Getter de Autor
	 * @return Devuelve el valor de Autor
	 */
	public String getAutor() {
		return autor;
	}
	/**
	 * Setter de Autor
	 * @param autor  Valor para el parametro autor dado por el usuario
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}
	/**
	 * Getter de Titulo
	 * @return Devuelve el valro de Titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * Setter de Titulo
	 * @param titulo  Valor para el parametro titulo dado por el usuario
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * Getter de Genero
	 * @return Devuelve el valor de genero
	 */
	public String getGenero() {
		return genero;
	}
	/**
	 * Setter de Genero
	 * @param genero  Valor para el parametro genero dado por el usuario
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}
	/**
	 * Getter de Duracion
	 * @return Devuelve el valor de Duracion
	 */
	public int getDuracion() {
		return duracion;
	}
	/**
	 * Setter de Duracion
	 * @param duracion  Valor para el parametro duracion dado por el usuario
	 */
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	@Override
	/**
	 * Funcion para pasar todos loas parametros a string
	 */
	public String toString() {
		return "Disco [codigo=" + codigo + ", autor=" + autor + ", titulo=" + titulo + ", genero=" + genero
				+ ", duracion=" + duracion + "]";
	}
	
	

}
