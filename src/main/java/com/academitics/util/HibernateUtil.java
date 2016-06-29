
package com.academitics.util;

//import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/*import com.icesoft.icefaces.tutorial.crud.hibernate.Course;
import com.icesoft.icefaces.tutorial.crud.hibernate.Student;
import com.sicin.hibernate.Cliente;
import com.sicin.hibernate.TipoCliente;*/

public class HibernateUtil {
	
    private static final SessionFactory sessionFactory = buildSessionFactory();

       
    private static SessionFactory buildSessionFactory() {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
        	SessionFactory f = new Configuration().configure().buildSessionFactory();
            return f;
        }
        catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

}