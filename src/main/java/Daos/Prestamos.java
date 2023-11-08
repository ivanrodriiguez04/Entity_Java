package Daos;

import java.util.Calendar;

import jakarta.persistence.Access;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="prestamos", schema="gbp_pracional")
public class Prestamos {
	//Atributos
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_prestamo",nullable=false)
	private long idPrestamo;
	
	@Column(name="fch_inicio_prestamo")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar fchInicioPrestamo;
	
	@Column(name="fch_fin_prestamo")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar fchFinPrestamo;
	
	@Column(name="fch_entrega_prestamo")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar fchEntregaPrestamo;
	
	@ManyToOne
	@JoinColumn(name="id_usuario")
	Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name="id_libro")
	Libros libros;
	
	@ManyToOne
	@JoinColumn(name="id_estado_prestamo")
	Estado_Prestamo estado_prestamo;
	
	//Constructores
	public Prestamos(long idPrestamo, Calendar fchInicioPrestamo, Calendar fchFinPrestamo, Calendar fchEntregaPrestamo,
			Usuario usuario, Libros libros, Estado_Prestamo estados_prestamos) {
		super();
		this.idPrestamo = idPrestamo;
		this.fchInicioPrestamo = fchInicioPrestamo;
		this.fchFinPrestamo = fchFinPrestamo;
		this.fchEntregaPrestamo = fchEntregaPrestamo;
		this.usuario = usuario;
		this.libros = libros;
		this.estado_prestamo = estado_prestamo;
	}
	
	public Prestamos() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
