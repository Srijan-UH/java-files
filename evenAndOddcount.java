public class evenAndOddcount{
    public static void main(String[] args) {
        int eventCount=0;
        int oddCount=0;
        int number=12345;

        while(number>0){
            int digit=number%10;
           
            if(digit%2==0){
                eventCount++;
            }
            else{
                oddCount++;
            }
            number/=10;
        }
        System.out.println("even count is "+eventCount);
        System.out.println("odd count is "+oddCount);
    }
}