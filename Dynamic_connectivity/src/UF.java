public class UF {
    private int[] id;
    private int count;
    private int N;

    public UF(int N) {
        this.N=N;
        count = N;
        id=new int[N];
        for (int i = 0; i < N; i++)
        {
            id[i]=i;
        }

    }

    public int getCount() {
        return count;
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    public int find(int p) {
        while(p!=id[p])  //爬枝，找根
            p=id[p];
        return p;
//        return id[p];
    }

    public void union(int p, int q) {
//        int pid=id[p];   //这里必须拿两个变量在这里把初始值给存住，否则后面pid的值回随着循环更新，会一直变化
//        int qid=id[q];
        int pRoot = find(p);
        int qRoot = find(q);
        if (pRoot == qRoot)
            return;
        id[pRoot] = qRoot; //这里有一个抢根得操作，后来的根自动成为前面的总根
        count--;
//        if (pid == qid)
//            return;
//        for (int i = 0; i < N; i++) {
//            if (id[i] == pid)
//                id[i] = qid;
//            count--;
//    }
        }
    }

