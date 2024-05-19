
public class DoWhileLoop {
    public static void main(String[] args) {
        int sum = 0 ;
        int i = 0 ;
        do {
            sum = sum + i ;
            i++;
        } while(i<=100);
        System.out.println("sum is : "+sum);
    }
}
