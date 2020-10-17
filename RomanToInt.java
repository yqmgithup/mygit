public class RomanToInt {

    public static void main(String args[]){

        int sum=0;
        String s = "IV";
        int preNum = getValue(s.charAt(0));
        for(int i=1;i<s.length();i++){
            int num = getValue(s.charAt(i));
            if(preNum<num){
                sum = sum - preNum;
            }else{
                sum = sum + preNum;
            }
            preNum = num;
        }
        sum = sum +preNum;
        System.out.println(sum);


    }

    private static int getValue(char ch){
        switch(ch){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
