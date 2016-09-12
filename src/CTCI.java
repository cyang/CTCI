public class CTCI {
	public static void main(String[] args) {
		System.out.print("yo");
	}
	
    public static boolean isUniqueDigits(int input) {
        int check = 0;
        while (input > 0) {
            int curr = input % 10;
            if ((check & (1 << curr))!= 0) {
                return false;
            }
            check |= (1 << curr);
            input /= 10;
        }
        return true;
    }

    public static boolean isUniqueChars(String input) {
        int check = 0;
        for(int i = 0; i < input.length(); i++) {
            int curr = input.charAt(i) - 'a';

            if ((check & (1 << curr))!= 0) {
                return false;
            }
            check |= (1 << curr);
        }
        return true;
    }

    public static int euclideanGCD(int n1, int n2) {
        if (n2 > n1) {
            int temp = n2;
            n2 = n1;
            n1 = temp;
        }

        int remainder = 0;
        while(true) {
            remainder = n1%n2;
            if (remainder == 0) {return n2;}
            n1 = n2;
            n2 = remainder;
        }
    }
}
