public class Method3 {
    int M;
    public static void main(String args[]){

        Method3 obj = new Method3();

        
        obj.M = 3;
        
        System.out.println("Value of M before calling increment() is :"+obj.M);
        increment(obj);
        System.out.println("Value of M after calling increment() is:"+obj.M);

        System.out.println("After object");
        increment(obj);
        System.out.println("Value of M after calling increment() is:"+obj.M);
    }

    public static void increment(Method3 a){
        System.out.println("Value of a before incrementing is "+a.M);
        a.M = a.M+1;
        System.out.println("value of a after incrementing is "+a.M);
    }

}
