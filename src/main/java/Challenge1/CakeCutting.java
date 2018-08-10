package Challenge1;

import java.util.HashSet;
import java.util.Set;

public class CakeCutting {

    public int answer(String s){
        Set<String> matchTest = new HashSet<String>();
        for (int sliceSize=1; sliceSize < s.length(); sliceSize++) {
            int i = 0;
            int counter = 1;
            matchTest.add(s.substring(i, i+sliceSize));
            while(i + sliceSize <= s.length() && !matchTest.add(s.substring(i, i+sliceSize))){
                if (counter == s.length()/sliceSize){
                    return s.length()/sliceSize;
                }
                i+=sliceSize;
                counter++;
            }
        }
        if(s.length()==1){
            return 1;
        } else {
            return -1;
        }
    }
}
