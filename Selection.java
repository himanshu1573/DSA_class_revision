import java.util.*;
class Selection {
    public static void main(String []args){
        int []arr={5,4,3,2,1};
        for(int i=0;i<arr.length-1;i++){
            int small=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[small]>arr[j]){
                    small=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[small];
            arr[small]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}