package com.revature;

import com.revature.beans.Employee;
import com.revature.util.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class App_02 {
    public static void main(String[] args) {
//        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
//        Metadata metadata = new MetadataSources(ssr).getMetadataBuilder().build();
//        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        Employee employee1 = new Employee("Caleb", "Sword");
        Employee employee2 = new Employee("John", "Smith");
        Employee employee3 = new Employee("My", "Mom");

        session.save(employee1);
        session.save(employee2);
        session.save(employee3);

        Employee employee = session.find(Employee.class, 2);
        if(employee != null) {
            employee.setFirstName("My");
            employee.setLastName("Mom");
            employee.setFirstName("Your");
            session.delete(employee);
        }

        transaction.commit();

        session.close();
    }
}
