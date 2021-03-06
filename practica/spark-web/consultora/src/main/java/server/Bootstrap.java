package server;

import java.math.BigDecimal;

import org.uqbarproject.jpa.java8.extras.EntityManagerOps;
import org.uqbarproject.jpa.java8.extras.WithGlobalEntityManager;
import org.uqbarproject.jpa.java8.extras.transaction.TransactionalOps;

import model.Consultora;
import model.Proyecto;

public class Bootstrap implements WithGlobalEntityManager, EntityManagerOps, TransactionalOps{
	
	public static void main(String[] args) {
		new Bootstrap().init();
	}
	
	public void init(){
		withTransaction(() ->{
			Proyecto proyecto1 = new Proyecto("Proyecto 1", new BigDecimal(1000));
			persist(proyecto1);

			Proyecto proyecto2 = new Proyecto("Proyecto 2", new BigDecimal(2000));
      persist(proyecto2);

      Proyecto proyecto3 = new Proyecto("Proyecto 3", new BigDecimal(3000));
      persist(proyecto3);

			Consultora consultora = new Consultora("Nombre consultora", 10);
			consultora.asignar(proyecto1);
			consultora.asignar(proyecto2);
			consultora.asignar(proyecto3);
			persist(consultora);
		});
	}
}
