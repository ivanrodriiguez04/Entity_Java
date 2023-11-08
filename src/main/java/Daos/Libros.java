package Daos;

import java.util.List;

import jakarta.persistence.Access;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="libros", schema="gbp_pracional")
public class Libros {
	
	//Atributos
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_libro",nullable=false)
	private long idLibro;

	@Column(name="isbn_libro")
	private String isbnLiro;
	
	@Column(name="titulo_libro")
	private String tituloLibro;
	
	@Column(name="edicion_libro")
	private String edicionLibro;
	
	@Column(name="cantidad_libro")
	private int cantidadLibro;
	
	@ManyToOne
	@JoinColumn(name="id_editorial")
	Editoriales editoriales;
	
	@ManyToOne
	@JoinColumn(name="id_genero")
	Generos generos;
	
	@ManyToOne
	@JoinColumn(name="id_colecciones")
	Colecciones colecciones;
	
	@ManyToMany(mappedBy = "prestamoLibro")
	 private List<Prestamos> prestamo;
	 
	@ManyToMany(cascade = {
	        CascadeType.PERSIST,
	        CascadeType.MERGE
	    })
	    @JoinTable(
	        name = "Rel_Autores_Libros",schema="gbp_operacional",
	        joinColumns = @JoinColumn(name = "id_libro"),
	        inverseJoinColumns = @JoinColumn(name = "id_autor")
	    )
	    private List<Autor> libroAutor;
	
	//Constuctores
	public Libros(long idLibro, String isbnLiro, String tituloLibro, String edicionLibro, int cantidadLibro,
			Editoriales editoriales, Generos generos, Colecciones colecciones) {
		super();
		this.idLibro = idLibro;
		this.isbnLiro = isbnLiro;
		this.tituloLibro = tituloLibro;
		this.edicionLibro = edicionLibro;
		this.cantidadLibro = cantidadLibro;
		this.editoriales = editoriales;
		this.generos = generos;
		this.colecciones = colecciones;
	}
	
	public Libros() {
		super();
		// TODO Auto-generated constructor stub
	}
}
