package com.revature.app;

import com.revature.beans.Person;
import com.revature.util.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class App_01 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();

        Person p1 = new Person("Caleb", "Sword");
        System.out.println("Person before saving: "+p1);
        int id = (Integer) session.save(p1);

        session.getTransaction().commit();
        System.out.println("Saved successfully");

        System.out.println("p1 :"+p1.toString());
        System.out.println("id of the saved person: "+id);
    }
}
