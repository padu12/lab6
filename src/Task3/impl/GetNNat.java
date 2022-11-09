package Task3.impl;

import Task3.interfaces.TheInterface;

public class GetNNat implements TheInterface {
    public static int fold(int[] arr){
        int count=0;
        for(int i = 0; i<arr.length; i++){
            int count1 = 2;
            for(int l = 2; l<arr[i]; l++){
                if (arr[i]%l==0) count1++;
            }
            if (count1 != 2) count++;
//            System.out.println("arr[" + i + "] = " + count1);
        }
        return count;
    }
}
