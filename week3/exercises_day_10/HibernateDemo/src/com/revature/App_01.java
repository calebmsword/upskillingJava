package com.revature;

import com.revature.beans.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import java.util.List;

public class App_01 {
    public static void main(String[] args) {
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata metadata = new MetadataSources(ssr).getMetadataBuilder().build();
        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
        Session session = sessionFactory.openSession();


         session.beginTransaction();

         Employee employee1 = new Employee("Caleb", "Sword");
         Employee employee2 = new Employee("John", "Smith");
         Employee employee3 = new Employee("My", "Mom");

         session.save(employee1);
         session.save(employee2);
         session.save(employee3);

         session.getTransaction().commit();
         System.out.println("Employee saved successfully");


        Employee emp = session.find(Employee.class, 1);
        System.out.println("Employee with id 1 is: "+emp.toString());

        Query query = session.createQuery("from Employee");
        List<Employee> employees = query.list();
        employees.stream()
                .forEach(System.out::println);

        session.close();
        sessionFactory.close();
    }
}
