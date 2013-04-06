package br.com.ceres.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtil {
   
    private static final SessionFactory sessionfactory;
   
    public static final String HIBERNTATE_SESSION = "hibernate_session";
    
    static{
        try {
            System.out.println("Tentando abrir uma SF");
            Configuration configuration = new Configuration().configure(); 
            
            ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().
                    applySettings(configuration.getProperties()).buildServiceRegistry();
            sessionfactory = configuration.buildSessionFactory(serviceRegistry);
            
            System.out.println("Session Factory criada corretamente");
            
        } catch (Exception ex) {
            System.out.println("Ocorreu um erro ao inicioar a SessionFactory"+ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionfactory() {
        return sessionfactory;
    }
    
}
