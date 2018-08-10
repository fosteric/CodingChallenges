package C;

public class AccountNumbers {


    public static void main(String[] args) {

        AccountNumbers accountNumbers = new AccountNumbers();
        accountNumbers.solution(123456);
        System.out.println("-------------------");
        accountNumbers.solution(130);

    }

    public int solution(int A) {

        int aLength = String.valueOf(A).length();
        int solution = 0;

        for(int i=aLength-2; i>=0; i-=2){
            solution += (A % 10) * Math.pow(10, i);
            A /= 10;
            System.out.println(solution);
        }

        for(int i=1; i<=aLength; i+=2){
            solution += (A % 10) * Math.pow(10, i);
            A /= 10;
            System.out.println(solution);
        }

        return solution;

    }
}
