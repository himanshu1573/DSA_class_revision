import java.util.ArrayList;
class ArrayListEX {
    public static void main(String args[]){
        ArrayList <Integer> list=new ArrayList<>();
        // add
        list.add(4);
        list.add(5);
        list.add(3);
        list.add(8); 
        list.add(9);
        
        for(int i=0;i<list.size()-1;i++){
            int min = i;
            for(int j= i+1; j<list.size(); j++){
                if(list.get(i)>list.get(j)){
                    min = j;
                }
            }
            int temp = list.get(i);
            list.set(i,list.get(min));
            list.set(min,temp);
        }
        System.out.print(list);
            
    }
}