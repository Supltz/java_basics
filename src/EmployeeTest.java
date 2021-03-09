import java.time.*;

public class EmployeeTest
{
    public static void main(String[] args)
    {
        Employee[] staff=new Employee[3];
        staff[0]=new Employee("Carl Cracker0",75000,1987,12,15);
        staff[1]=new Employee("Carl Cracker1",2131200,1947,12,15);
        staff[2]=new Employee("Carl Cracker2",742350,1937,12,15);
        for(Employee e:staff)
        {
            e.raiseSalary(5);
        }
        for(Employee e:staff)
        {
            System.out.println("name="+e.getName()+"Salary="+e.getSalary());
        }
    }
}

class Employee
{
    private String name;
    private double salary;
    private LocalDate hireday;
    public Employee(String n,double s, int year,int month,int day)
    {
        name=n;
        salary=s;
        hireday=LocalDate.of(year,month,day);
    }
    public String getName()
    {
        return name;
    }
    public double getSalary()
    {
        return salary;
    }
    public LocalDate getHireday()
    {
        return hireday;
    }
    public void raiseSalary(double byPercent)
    {
        double raise=salary*byPercent/100;
        salary=salary+raise;
    }
}
