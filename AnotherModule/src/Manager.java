import java.util.Objects;

public class Manager extends Employee {
    private static int id=0;
    private double bonus;
    public Manager(){}
    public  Manager(String name, double salary,double bonus,int year,int month, int day){
        super(name,salary,year,month,day);
        this.bonus=bonus;
    }
    public  Manager(String name, double salary,int year,int month, int day){
        super(name,salary,year,month,day);
    }

    public double getSalary() {
        return bonus+super.getSalary();//这是否破坏了封装性？
    }
    public int getid(){
        id++;
        return id;
    }
    public boolean equals(Object o)
    {
        if(super.equals(o)==true)
        {
            Manager other=(Manager) o;
            if(other.getSalary()==this.getSalary())
            {
                return true;
            }
            else {
                return false;
            }
        }
        else
        {
            return false;
        }

    }
    public int hashcode(){
        return Objects.hash(super.getname(),this.getSalary());
    }
    public String toString(){
        return super.toString()+",bonus="+bonus;
    }
}
