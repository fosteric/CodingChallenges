package Challenge2;

public class AccountNumbers {

    public int rearrangeAcctNum(int A) {
        int aLength = String.valueOf(A).length();
        int solution = 0;
        for(int i=aLength-2; i>=0; i-=2){
            solution += (A % 10) * Math.pow(10, i);
            A /= 10;
            System.out.println(solution);
        }

        int x;

        if(aLength % 2 == 0){
            x = 1;
        } else {
            x = 0;
        }

        for(int j=x; j<=aLength; j+=2){
            solution += (A % 10) * Math.pow(10, j);
            A /= 10;
            System.out.println(solution);
        }
        return solution;
    }
}