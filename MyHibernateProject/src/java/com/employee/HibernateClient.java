/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;
/**
 *
 * @author apere
 */

public class HibernateClient {
    
public static void main(String as[]) {
    Configuration cfg = new Configuration();
    cfg.configure();
    
    // Get Session Factory 
    SessionFactory sf=cfg.buildSessionFactory();
    
    // Get Session Object
    Session s = sf.openSession();
    
    // employee class object
    
    Employee emp = new Employee(14235, "Arturo", "art111@gmail.com");
    
    s.save(emp);
    
    // Start transaction
    Transaction tx = s.beginTransaction();
    tx.commit();
    
    // end session
    
    s.close();
    sf.close();
    System.out.println("New record created");
}    
}
