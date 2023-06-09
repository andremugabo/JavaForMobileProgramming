public class Break {
    public static void main(String args[]){
        int count = 0;
        while(count < 11){
            System.out.println("Count is :"+count);
            count++;
            if(count == 5){
                break;
            }
        }
    }
}
