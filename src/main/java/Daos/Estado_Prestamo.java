package Daos;

import java.util.Calendar;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="estados_Prestamos", schema="gbp_almacen")
public class Estado_Prestamo {

	//Atributos
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_estado_prestamo", nullable=false)
	private long id_estado_prestamo;

	@Column(name="fch_inicio_prestamo")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar fchIniPresta;

	@Column(name="fch_fin_prestamo")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar fchFinPresta;
	
	@Column(name="fch_entrega_prestamo")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar fchEntrePresta;
	
	@OneToMany(mappedBy="estadoPresta")
	List<Prestamos> PrestamoEstado;
	
	//GET
	public Calendar getFchEntrePresta() {
		return fchEntrePresta;
	}
	
	//CONSTRUCTORES
		public Estado_Prestamo() {
			super();
		}
		public Estado_Prestamo(Calendar fchIniPresta, Calendar fchFinPresta,
				Calendar fchEntrePresta, List<Prestamos> prestamoEstado) {
			super();
			this.fchIniPresta = fchIniPresta;
			this.fchFinPresta = fchFinPresta;
			this.fchEntrePresta = fchEntrePresta;
			PrestamoEstado = prestamoEstado;
		}
}
