package com.xtra.hibernate.mapping.many_to_many;

import com.xtra.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.Arrays;

public class StoreData {

    public static void main(String[] args) {

        Laptop laptop = new Laptop();
        laptop.setModel("Apple");

        Student student = new Student();
        student.setCourse("MBA");
        student.setName("Ankit");
        laptop.getStudents().add(student);

        Session session = HibernateUtil.buildSessionFactory(new ArrayList<Class>(Arrays.asList(Laptop.class, Student.class))).openSession();
        Transaction transaction = session.beginTransaction();

        session.save(laptop);
        session.save(student);

        transaction.commit();
        session.close();
        HibernateUtil.shutdown();

        System.out.println("Student : \n" + student);
        System.out.println("Laptop : \n" + laptop);
    }
}
