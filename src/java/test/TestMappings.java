/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;


import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Criteria;
import org.hibernate.Session;
import java.util.List;
import java.util.ListIterator;

import employees.Employee;


/**
 *
 * @author i-am-prinx
 */
public class TestMappings {
    // A simple class to test that hibernate configurations is properly set
    public static void main(String[] args){
        Configuration configuration = new Configuration();
        configuration.configure();
        SessionFactory fac = configuration.buildSessionFactory();
        Session session = fac.openSession();
        Criteria criteria = session.createCriteria(Employee.class);
        
        List emp = criteria.list();
        ListIterator<Employee> iterator = emp.listIterator();
        
        while(iterator.hasNext()){
            Employee employee =  iterator.next();
            System.out.println(employee.getFullName());
            System.out.println(employee.getEmail());
            System.out.println(employee.getDateJoined());
        }
    }
}
    