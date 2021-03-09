import java.util.*;

public class ConstructorTest { //这里这个args指的好像是命令行中的参数
    public static void main(String[] args){   //1.静态方法在类定义的时候已经被装载和分配。而非静态方法在类定义时没有占用内存,只有在类被实例化成对象时,对象调用该方法才被分配内存。
        //2.静态方法可以使用“类名.方法名"的方式，也可以使用"对象名.方法名"的方式。而实例方法只有后面这种方式。也就是说，调用静态方法可以无需创建对象。
        //3.静态方法在访问本类的成员时，只允许访问静态成员（即静态成员变量和静态方法），而不允许访问实例成员变量和实例方法；实例方法则无此限制。
        //4.基于同样的道理，静态方法中也不能使用关键字this。
        // 不用每一次调用方法都要去new一个对象，调用就相对方便
        //5.而普通方法，会随着对象的调用而加载，当使用完毕，会自动释放掉空间。普通方法的好处是，动态规划了内存空间的使用，节省内存资源。静态方法，方便，运行快，而如果全部方法都用静态方法，那么每个方法都要有一个固定的空间，这样的话太占内存。
        //6.静态方法是不依赖具体的对象的，而多态是在运行时表现出来的特性，根据对象所属的类而表现出不同的属性，重写需要“对象所属类型”，但是静态方法是没有对象的，所以没法重写。（重写只存在于子类与父类中，重载存在于一个类中。）
        Employee_2[] staff=new Employee_2[3];  //一次性创建多个对象在staff数组里
        Employee_2 emp=new Employee_2("Draco",9595);//只创建一个对象
        staff[0] = new Employee_2();
        staff[1] = new Employee_2("Harry",909090);
        staff[2] = new Employee_2(6516);  //不同的构造方法
        for( Employee_2 e:staff) // for(a b:c)这种写法类似于Python，a是数据类型，c是那个数组，b是那个数组里的每一个value（枚举循环）
        {
            System.out.println("name="+e.getName()+",id="+e.getId()+",salary="+e.getSalary());
        }
        for(Employee_2 e:staff){
            System.out.println("name="+e.getName()+",id="+e.getId()+",salary="+e.getSalary());
        }
    }
}
class Employee_2{
    private static int nextId;   //静态属性
    private int id;
    private String name="";
    private double salary;
    static{
        Random generator=new Random();
        nextId=generator.nextInt(10000);
    }       //静态代码块，只在类加载的时候运行一次

    {
        id=nextId;     //这种代码块在每次调用类新建对象的时候都会运行
        nextId++;
    }
    public Employee_2(String n,double s){  //java函数中的传参全部都是按值传参（copy），不是按引用传参
        name=n;
        salary=s;
    }
    public Employee_2(double s){
        this("Employee_2 #"+nextId,s);
    } // this是指向对象本身的一个指针，this（）相当于调用本对象的构造方法this.调用对象属性。super指向父类对象，同理。
    public Employee_2(){}
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public int getId(){
        return  id;
    }
    public int getnextId(){
        return nextId;
    }

}
