class FrequencyCounter {
    public static void main(String []args){
        int [] arr=new int[10];
        int []prob={0,0,1,3,5,6,7,4,3,2,7,9,5,0};
        for(int i:prob){
            arr[i]++;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(i+"-->"+arr[i]);
        }
       
    }
}