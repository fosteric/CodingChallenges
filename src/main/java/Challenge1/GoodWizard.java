package Challenge1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GoodWizard {

    public void findMagicNumbers(int lowerBound, int upperBound){
        List<Integer> magicNums = new ArrayList<Integer>();
        for (int i=lowerBound; i<=upperBound; i++){
            if(digitsAreMagic(i)){
                magicNums.add(i);
            }
        }
        printMagicNumbers(magicNums);
    }

    private boolean digitsAreMagic(int i){
        Set<Integer> uniqueTest = new HashSet<Integer>();
        while(i>0){
            int j = i%10;
            if(!uniqueTest.add(j)){
                return false;
            }
            i=i/10;
        }
        int sum = 0;
        for(Integer digit : uniqueTest){
            if(digit % uniqueTest.size() == 0){
                return false;
            }
            sum += digit;
        }
        if(sum % uniqueTest.size() == 0){
            return true;
        }
        return false;
    }

    private void printMagicNumbers(List<Integer> magicNums){
        for(Integer i : magicNums) {
            System.out.println(i);
        }
    }

}
