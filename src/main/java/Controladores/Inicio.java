package Controladores;

import Daos.Acceso;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/*
 * Clase principal de la aplicacion
 * 20102023 -> irm
 */
public class Inicio {
	/*
	 * Metodo principal de la aplicacion
	 * 20102023 -> irm
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Acceso acceso = new Acceso("Usu","Acceso usuarios biblioteca");
		Acceso acceso2 = new Acceso("Emp","Empleados biblioteca");
		insert.InsertarAcceso(em, acceso);
	}

}
