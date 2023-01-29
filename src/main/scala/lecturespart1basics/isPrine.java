package lecturespart1basics;

class Main {
    public static void main(String[] args) {
        int num = 3;
        boolean isPrime = true; //default
        for (int i=2; i<=Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("This is a prime number");
        } else {
            System.out.println("This number is not prime");
        }
    }
}