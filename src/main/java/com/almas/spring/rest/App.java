package com.almas.spring.rest;

import com.almas.spring.rest.configuration.MyConfig;
import com.almas.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication=context.getBean("communication", Communication.class);

//        List<Employee> allEmployees=communication.getAllEmployees();
//        System.out.println(allEmployees);

//        Employee empByID=communication.getEmployee(1);
//        System.out.println(empByID);
//
//        Employee emp=new Employee("Jeki","Chan","Sales",150);
//        emp.setId(11);
//        communication.saveEmployee(emp);

        communication.deleteEmployee(11);
    }
}
