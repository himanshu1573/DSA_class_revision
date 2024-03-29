import java.util.*;
class Methods {
    public static void main(String []args){
        // toString 
        //int [] arr= {1,2,3,4};
        // System.out.println(Arrays.toString(arr));
        // copy of the array
        //int [] arr1=arr;
        //arr1[2]=6; // shallow copy
        // System.out.println(Arrays.toString(arr1));
        // System.out.println(Arrays.toString(arr));
        // deep copy  and copyOf methods 
        // int []arr2= Arrays.copyOf(arr,arr.length);
        // arr2[2]=3;
        // System.out.println(Arrays.toString(arr2));
        // System.out.println(Arrays.toString(arr));
        //  int [] filling= {100,100,100,100};
        int [] filling= new int[10];
        Arrays.fill(filling,100);
        System.out.println(filling);
        for(int i=0;i<filling.length;i++){
            System.out.print(filling[i]+" ");
        }
        
    }
}