import java.util.ArrayList;
import java.util.Arrays;

public class PrimeDirective{
    public boolean isPrime(int number){
        if(number == 2){
            return true;
        }else if (number < 2){
            return false;
        }
 for (int c = 2; c < number; c++){
    if (number % c == 0){
        return false;
    }
 } 
 return true;
    }
    public ArrayList<Integer> onlyPrime (int[] numbers) {
        ArrayList<Integer> prime = new ArrayList<Integer>();
        for (int numero : numbers) {
            if (isPrime(numero)) {
                prime.add(numero);
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        PrimeDirective prime = new PrimeDirective();
        PrimeDirective primes = new PrimeDirective();
        int[] number = {1,5,7,2,61,51,21,97,1115};
        System.out.println(primes.onlyPrime(number));
    }

}