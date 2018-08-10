package Challenge2;

public class ClosestNumbers {

    public int minDistance(int[] A) {

        if (A.length <= 1) {
            return -1;
        }

        int minDistance;

        if (A[0] >= A[1]){
            minDistance = A[0]-A[1];
        } else {
            minDistance = A[1]-A[0];
        }

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (i!=j && A[i]>= A[j] && A[i]-A[j]<minDistance){
                    minDistance = A[i]-A[j];
                } else if (i!=j && A[j]>=A[i] && A[j]-A[i]<minDistance){
                    minDistance = A[j] - A[i];
                }
            }
        }

        return minDistance;

    }

}
