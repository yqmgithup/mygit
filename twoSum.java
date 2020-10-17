import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class twoSum {

    public int[] twosum1(int nums[],int target){
        int num[]=new int []{0,0};
        for(int i=0;i<nums.length;i++){
            for(int j=1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    num[0]=i;
                    num[1]=j;
                }
            }
        }

        return num;
    }

    public Map<Integer,Integer> twosum2(int nums[],int target){
        Map<Integer,Integer> map= new HashMap<>();
        Map<Integer,Integer> map1= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                map1.put(map.get(target-nums[i]),i);
            }
            map.put(nums[i],i);
        }
        return map1;
    }

    public static void main(String args[]){
        int target=9;
        int[] nums= {2,7,12,17};
        twoSum ts=new twoSum();
        int[] tss=ts.twosum1(nums,target);
        Map<Integer,Integer> maps=new HashMap<>();
        maps=ts.twosum2(nums,target);
        System.out.format("%d,%d",tss[0],tss[1]);
        for (Integer value : maps.values()) {

            System.out.println("Value = " + value);

        }




        }
}
