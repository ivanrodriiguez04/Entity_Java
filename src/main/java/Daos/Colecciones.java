package Daos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="colecciones", schema="gbp_operacional")
public class Colecciones {

	//Atributos
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_coleccion",nullable=false)
	private long idColeccion;
	
	@Column(name="nombre_coleccion")
	private String nombreColeccion;
	
	//Constructores
	public Colecciones(long idColeccion, String nombreColeccion) {
		super();
		this.idColeccion = idColeccion;
		this.nombreColeccion = nombreColeccion;
	}
	
	public Colecciones() {
		super();
		// TODO Auto-generated constructor stub
	}
}
