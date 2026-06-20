package Week1;

public class CountDigit {
    public static void main(String[] args) {
        int number = 1204;
        int count = 0;
        while(number > 0){
            int lastDigit = number % 10;
            count += 1;
            number /= 10;
        }
        System.out.println(count);
    }
}
