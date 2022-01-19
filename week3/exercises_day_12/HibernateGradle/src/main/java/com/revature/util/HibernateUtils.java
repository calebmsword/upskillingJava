package com.revature.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtils {
    static StandardServiceRegistry ssr = null;
    static Metadata metadata = null;
    static SessionFactory sessionFactory = null;

    public static SessionFactory getSessionFactory() {
        if (ssr == null) {
            ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
            metadata = new MetadataSources(ssr).getMetadataBuilder().build();
            sessionFactory = metadata.getSessionFactoryBuilder().build();
        }
        return sessionFactory;
    }

    protected HibernateUtils() {

    }
}
