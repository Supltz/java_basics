import java.util.*;
public class UFtest {
    public static  void main(String[] args)
    {
        int p=0;
        int q=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入总长度：");
        int N=scan.nextInt();
        UF uf=new UF(N);
        System.out.print("请输入想要连接的两个节点（以空格隔开，以#结束）,没输入的默认不连接:");
        String Str=new String(scan.nextLine());   // 这里nextInt()用完之后 会自动有一个回车\n，如果直接获取的话就会报错。
        while(true)   //这里必须要用break 判断条件不好弄
        {
            Str=scan.nextLine();
            if(Str.equals("#"))
                break;
            String[] Str_arr=Str.split(" ");
            p=Integer.parseInt(Str_arr[0]);
            q=Integer.parseInt(Str_arr[1]);
            uf.union(p,q);
        }
        System.out.println("请输入想测试连接的两个值（#结束）：");
        while(true) {
            Str = scan.nextLine();
            if(Str.equals("#"))
                break;
            String[] Str_arr = Str.split(" ");
            p = Integer.parseInt(Str_arr[0]);
            q = Integer.parseInt(Str_arr[1]);
            System.out.println(uf.connected(p, q));
        }
        System.out.println("请输入想获得其标识符的值(#结束)：");
        while(true) {
             Str=scan.nextLine();
            if(Str.equals("#"))
                break;
            p = Integer.parseInt(Str);
            System.out.println(uf.find(p));
        }
        System.out.println(uf.getCount());
    }
}
