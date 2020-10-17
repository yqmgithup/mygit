public class Reverse {
    public static void main(String args[]){
        int x=-2147483647;
        int res=0;
        while(x!=0){
            int t=x%10;
            int newres=res*10+t;
            //不能写成newres-t！=res*10，这样res*10已结益处了
            //为什么益处会变成负数：整数在内存中使用的是补码的形式表示，最高位是符号位，0表示正数，1表示负数。
            if((newres-t)/10!=res){
                System.out.println(0);
                System.out.println(newres);
                System.out.println(res);
                System.out.println(t);
            }
            x=x/10;
            res=newres;
            System.out.println(res);
        }
        System.out.println(2147483647+1);
    }
}
