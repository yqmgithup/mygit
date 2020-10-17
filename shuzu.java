public class shuzu {
    public static void main(String args[]){
        int[] a = {1,2,3};//静态初始化
        int[] b = new int[5];//动态初始化，确定长度
        Person[] p = new Person[2];

        Person p1 = new Person();
        Person p2 = new Person();

        p[0] = p1;
        p[1] = p2;
        System.out.println(p[1].getName("p1"));
        for(int i=0;i<b.length;i++){
            System.out.println(a[i]);
            System.out.println(b[i]);
        }

    }
}
