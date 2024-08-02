package com.tplink.question2;

public class primeCounter1 {
    public int countPrime(int n) {
        if(n<2){
            throw new IllegalArgumentException("n must be greater than 2");
        }

        int count = 0;
        for(int i = 2; i <= n; i++){
            if(isPrime(i)){
                count++;
            }
        }
        return count;
    }

    private boolean isPrime(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
