public class Main {
    public static void main(String[] args) {
    }

    public static int sumFirstAndLastDigit(int num) {
        if (num < 0) {
            return -1;
        }

        int lastDigit = num % 10;
        int tempNum = num;

        int firstDigit = 0;

        if (num >= 10) {
            while (tempNum > 0) {

                tempNum /= 10;
                if (tempNum > 0 && tempNum < 10) {
                    firstDigit = tempNum;
                }
            }
            return firstDigit + lastDigit;
        }

        return num + num;
    }
}

