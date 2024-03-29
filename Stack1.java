import java.util.Stack;
class Stack1 {
    public static void main(String args[]){
        Stack<Integer> stc= new Stack<>();
        stc.push(5);
        stc.push(6);
        stc.push(3);
        stc.push(3);
        stc.push(1);
        //peek
      //  int ele=stc.pop();
      //  System.out.println(ele);
     //System.out.println(stc.peek());
     //System.out.println(stc.size());
    //  while(!stc.empty()){
    //     System.out.println(stc.pop());
    //  }
    int len=stc.size();
     for(int i=0;i<len;i++){
        stc.pop();
     }
     System.out.println(stc.empty());

     System.out.println(stc.search(9));

    }
}