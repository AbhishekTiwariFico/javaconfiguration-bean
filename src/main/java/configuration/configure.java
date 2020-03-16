package configuration;

import model.DateFormat;
import model.Department;
import model.Employee;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.text.ParseException;
import java.util.Date;

@Configuration
@PropertySource("classpath:property.properties")
public class configure {
    @Value("${name}")
    private String name;
    @Value("${age}")
    private int age;
    @Value("${salary}")
    private double salary;
    @Bean
    public Employee employee() throws ParseException {
        return new Employee(name,age,salary,department());
    }

    @Bean
    public Department department() throws ParseException {
        return new Department("scsit",dateFormat());
    }

 //   @Bean
    public Date dateFormat() throws ParseException {
        return new DateFormat().getDate("dd-MM-yyyy","12-02-2019");
    }
}
