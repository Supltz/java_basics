import java.util.*;
import java.time.*;
public class Employee {
    private static int id=0;
    private String name="";
    private double salary=0;
    private LocalDate date;
//    {
//        id=0;
//        id++;
//    }
    public Employee(){}
    public  Employee(String name,double salary, int year,int month,int day)
    {
        this.name=name;
        this.salary=salary;
        this.date=LocalDate.of(year,month,day);
    }
    public Employee(String name,double salary)
    {
        this(name,salary,1,1,1);

    }
    public Employee(String name)
    {
        this(name,0,1,1,1);

    }
    public int getid(){
        id++;
        return id;
    }
    public String getname(){return this.name;}
    public LocalDate getDate(){return this.date;}
    public double getSalary(){return this.salary;}
    public boolean equals(Object o)    //如果两个对象equals()方法相等则它们的hashCode返回值一定要相同，如果两个对象的hashCode返回值相同，但它们的equals()方法不一定相等。

    //两个对象的hashCode()返回值相等不能判断这两个对象是相等的，但两个对象的hashcode()返回值不相等则可以判定两个对象一定不相等。
    {
        if(this==o){return true;}   //检测是不是同一对象,地址啥的都完全一样，就直接一样了
        if(o==null){return false;}
        if(o instanceof Employee)
        {
            Employee other=(Employee) o;
            if(other.name==this.name)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else{
            return false;
        }
    }
    public int hashcode(){
        return Objects.hash(name,salary);
    }
    public String toString(){
        return getClass().getName()+"[name="+name+",salary="+salary+",date"+date+"]";
    }
}
