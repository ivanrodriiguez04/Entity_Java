package Servicios;

import Daos.Acceso;
import Daos.Colecciones;
import Daos.Editoriales;
import Daos.Estado_Prestamo;
import Daos.Generos;
import Daos.Libros;
import Daos.Prestamos;
import Daos.Usuario;
import jakarta.persistence.EntityManager;

public class Insertar {
	public void InsertarUsuario(EntityManager em,Usuario usu){
		em.getTransaction().begin();
		em.persist(usu);
		em.getTransaction().commit();
		
	}
	public void InsertarAcceso(EntityManager em,Acceso acceso){
		em.getTransaction().begin();
		em.persist(acceso);
		em.getTransaction().commit();
	}
	public void InsertarLibro(EntityManager em,Libros libro){
		em.getTransaction().begin();
		em.persist(libro);
		em.getTransaction().commit();
	}
	
	public void InsertarColeccion(EntityManager em,Colecciones coleccion){
		em.getTransaction().begin();
		em.persist(coleccion);
		em.getTransaction().commit();
	}
	public void InsertarPrestamos(EntityManager em,Prestamos prestamo){
		em.getTransaction().begin();
		em.persist(prestamo);
		em.getTransaction().commit();
	}
	public void InsertarEditorial(EntityManager em,Editoriales editorial){
		em.getTransaction().begin();
		em.persist(editorial);
		em.getTransaction().commit();
	}
	public void InsertarGenero(EntityManager em,Generos genero){
		em.getTransaction().begin();
		em.persist(genero);
		em.getTransaction().commit();
	}
	public void InsertarEstadoPrestamo(EntityManager em,Estado_Prestamo estapres){
		em.getTransaction().begin();
		em.persist(estapres);
		em.getTransaction().commit();
	}
}
