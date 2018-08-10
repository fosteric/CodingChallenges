package Challenge3;

import java.util.Arrays;
import java.util.stream.Stream;


public class RotateCharsRight {


    public char[] rotateNumbersRightByArrays(char[] arrToRotate, int rotation) {
        int trueRotation = findTrueRotation(arrToRotate.length, rotation);
        char[] newArray1 = Arrays.copyOfRange(arrToRotate, arrToRotate.length - trueRotation, arrToRotate.length);
        char[] newArray2 = Arrays.copyOfRange(arrToRotate, 0, arrToRotate.length - trueRotation);
        char[] returnArray = Arrays.copyOf(newArray1, newArray1.length + newArray2.length);
        System.arraycopy(newArray2, 0, returnArray, newArray1.length, newArray2.length);
        return returnArray;
    }

    public char[] rotateNumbersRightByStream(char[] arrToRotate, int rotation) {
        int trueRotation = findTrueRotation(arrToRotate.length, rotation);
        Character[] characterArr = convertCharArrToCharacterArr(arrToRotate);
        Stream<Character> streamOfArrayPart1 = Arrays.stream(characterArr, arrToRotate.length-trueRotation, arrToRotate.length);
        Stream<Character> streamOfArrayPart2 = Arrays.stream(characterArr, 0, arrToRotate.length - trueRotation);
        Stream<Character> returnStream = Stream.concat(streamOfArrayPart1, streamOfArrayPart2);
        return convertCharacterArrToCharArr(returnStream.toArray(Character[]::new));
    }

    public char[] rotateNumbersRight(char[] arrToRotate, int rotation) {
        int trueRotation = findTrueRotation(arrToRotate.length, rotation);
        char[] returnArr = new char[arrToRotate.length];
        for(int i=0; i<arrToRotate.length; i++){
            if(returnArr.length - trueRotation - i < returnArr.length)
            returnArr[i] = arrToRotate[returnArr.length - trueRotation - i];
        }
        return returnArr;
    }

    public Character[] convertCharArrToCharacterArr(char[] charArray){
        Character[] newArray = new Character[charArray.length];
        for (int i=0; i<charArray.length; i++){
            newArray[i] = Character.valueOf(charArray[i]);
        }
        return newArray;
    }

    public char[] convertCharacterArrToCharArr(Character[] characterArray){
        char[] newArray = new char[characterArray.length];
        for (int i=0; i<characterArray.length; i++){
            newArray[i] = new Character(characterArray[i]);
        }
        return newArray;
    }

    public int findTrueRotation(int arrayLength, int rotation){
        int trueRotation = rotation % arrayLength;
        if(trueRotation < 0 ){
            trueRotation += arrayLength;
        }
        return trueRotation;
    }

}
