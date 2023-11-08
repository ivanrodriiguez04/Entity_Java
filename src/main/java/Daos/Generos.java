package Daos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="generos", schema="gbp_operacional")
public class Generos {

	//Atributos
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_genero",nullable=false)
	private long idGenero;
	
	@Column(name="nombre_genero")
	private String nombreGenero;
	
	@Column(name="descripcion_genero")
	private String descripcionGenero;
	
	
	//Constructores
	public Generos() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Generos(long idGenero, String nombreGenero, String descripcionGenero) {
		super();
		this.idGenero = idGenero;
		this.nombreGenero = nombreGenero;
		this.descripcionGenero = descripcionGenero;
	}
}
