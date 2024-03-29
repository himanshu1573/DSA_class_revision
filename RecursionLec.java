class RecursionLec {
    public static void fibbo(int a, int b, int n){
       if(n==0){
        return;
       }
       System.out.println(a);
       fibbo(b,a+b,n-1);
    }
    public static void main(String ags[]){
       int a=0;
       int b=1;
       fibbo(a,b,6);
    }
}