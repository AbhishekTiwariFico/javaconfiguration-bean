package main;

import configuration.configure;
import model.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationAccess {
    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext cntx = new AnnotationConfigApplicationContext(configure.class);
        Employee employee = cntx.getBean(Employee.class);
        employee.show();
    }
}
