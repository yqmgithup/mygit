public class IsPalindrome {

    public static void isPalindrome(){
        int x=10101;
        boolean b=false;
        int reversex=0;
        while(x>reversex){
            reversex=reversex*10+x%10;
            x=x/10;
        }
        System.out.println(reversex);
        System.out.println(x);
        b=(reversex/10==x||reversex==x);
        System.out.println(b);

    }

    public static void main(String args[]){
        int x=1010111;
        boolean b=false;
        String s=(new StringBuilder(x+"")).reverse().toString();
        b = (x+"").equals(s);
        //System.out.println(b);
        IsPalindrome.isPalindrome();
    }
}
