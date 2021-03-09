import java.util.*;
public class EmployeeTest {
    public static void main(String[] arg){
        ArrayList<Employee> staffs=new ArrayList<>(20);
        ArrayList<Manager>  managers=new ArrayList<>(20);
        staffs.add(new Employee("Rone"));
        staffs.add(new Employee("Draco",13000));
        staffs.add(new Employee("Harry",2000,2010,1,1));
        managers.add(new Manager("Draco",2000,2012,1,1));
        managers.add(new Manager("Draco",1000,1000,2020,12,12));
        System.out.println(staffs.size()+","+managers.size());
        staffs.trimToSize();
        managers.trimToSize();
        for(Employee e:staffs)
        {
            //System.out.println("id:"+e.getid()+"   "+"name:"+e.getname()+"   "+"salary:"+e.getSalary()+"   "+"Date:"+e.getDate());
            System.out.println(e);
        }
        for(Manager m:managers)
        {
            System.out.println(m);
            // System.out.println("id:"+m.getid()+"   "+"name:"+m.getname()+"   "+"salary:"+m.getSalary()+"   "+"Date:"+m.getDate());
        }

//            System.out.println(managers[0].equals(managers[1]));
//        System.out.println(managers[0].hashcode()==managers[1].hashcode());
            //System.out.println(managers[0].equals(managers[1]));
    }
}
