package Daos;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="autores", schema="gbp_operacional")
public class Autor {

	//Atributos
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_autor",nullable=false)
	private long idAutor;
	
	@Column(name="nombre_autor")
	private String nombreAutor;
	
	@Column(name="apellidos_autor")
	private String apellidosAutor;
	
	@ManyToMany(mappedBy="libroAutor")
	private List<Libros> libros;
	
	//Constructores
	public Autor(long idAutor, String nombreAutor, String apellidosAutor, List<Libros> libros) {
		super();
		this.idAutor = idAutor;
		this.nombreAutor = nombreAutor;
		this.apellidosAutor = apellidosAutor;
		this.libros = libros;
	}
	
	public Autor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
