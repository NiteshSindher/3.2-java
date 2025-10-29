package com.example.hibernatecrud;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class StudentDAO {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();

        // Create
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        Student s = new Student();
        s.setName("John");
        s.setAge(21);
        s.setCourse("B.Tech");
        session.save(s);

        tx.commit();
        session.close();

        // Read
        session = factory.openSession();
        Student fetched = session.get(Student.class, s.getId());
        System.out.println("Fetched Student: " + fetched.getName());
        session.close();

        factory.close();
    }
}
