public class sum {
    public static void main(String[] args) {
        int no=12345;
        int sum=0;

        while (no>0) {
            int digit=no%10;

            sum=sum+digit;

            no/=10;
            
        }
        System.out.println(sum);
    }
}
