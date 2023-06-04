public class CastToString {
    public static void main(String args[]){
        int i = 2;
        double d =7.0555;
        String s2 = String.valueOf(i);
        String s3 = Integer.toString(i);
        String s4 = Double.toString(d);

        System.out.println(" i with valueOf is :"+s2);
        System.out.println(" i with using toString is: "+s3);
        System.out.println(" d with toString is :"+s4);


    }
}
