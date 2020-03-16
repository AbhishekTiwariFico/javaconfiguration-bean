package model;

public class Employee {
private  String name;
private  int age;
private double salary;
private Department department;

public Employee(String name,int age,double salary,Department department)
{
    this.name = name;
    this.age = age;
    this.salary = salary;
    this.department = department;
}
    public void show()
    {
        System.out.println("Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}');
        System.out.println(department);
    }
}
