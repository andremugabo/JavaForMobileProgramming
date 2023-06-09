public class Method2 {
    public static void main(String args[]){
        int a = 10;
        int b = 6;
        int c = equation1(a,b);
        System.out.println(" the value of the equation is :"+c);
    }

    public static int equation1(int a,int b){
        int t = (a+b)/2;
        return t;
    }
}
