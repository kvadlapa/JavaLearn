package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

/*

        This is for entering data into database/ Creation
        Student s1=new Student();
        s1.setRollNo(108);
        s1.setsAge(34);
        s1.setsName("Sahesh");
        System.out.println(s1);

        Configuration cfg=new Configuration();
        cfg.addAnnotatedClass(Student.class);
        cfg.configure();
        SessionFactory sf = cfg.buildSessionFactory();
        //Same meaning as above
        //SessionFactory sf1= new Configuration().addAnnotatedClass(Student.class).configure().buildSessionFactory();
        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(s1);
        //session.save(s1); save is dericated since version 6

        transaction.commit();
        session.close();
        sf.close();
*/
    /*
        //Data Retrieval
        Student s1=new Student();
        s1.setRollNo(108);
        s1.setsAge(34);
        s1.setsName("Sahesh");
        System.out.println(s1);

        Student s2= null;

        SessionFactory sf= new Configuration().addAnnotatedClass(Student.class).configure().buildSessionFactory();
        Session session = sf.openSession();

        s2= session.get(Student.class, 102);

        //Don't need this for data fetching
        //Transaction transaction = session.beginTransaction();



        session.persist(s1);

        session.close();
        sf.close();

        System.out.println(s2.getsAge());

     */
        //Data Updation
        Student s1=new Student();
        s1.setRollNo(108);
        s1.setsAge(39);
        s1.setsName("Dogesh");
        System.out.println(s1);

        SessionFactory sf= new Configuration().addAnnotatedClass(Student.class).configure().buildSessionFactory();
        Session session = sf.openSession();

        Transaction transaction=session.beginTransaction();
        session.merge(s1);
        transaction.commit();

        session.close();
        sf.close();

        //For data Deletion we use remove method and pass the object into it.
        //If you don't know the object just fetch it using get method and pass it
        //session.remove(s1);


    }
}
