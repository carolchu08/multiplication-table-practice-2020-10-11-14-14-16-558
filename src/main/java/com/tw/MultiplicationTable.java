package com.tw;
/*PDCA
P:
D:
C:
A:
*/

import com.sun.org.apache.xpath.internal.operations.Bool;

public class MultiplicationTable {
    public String generateMultiplicationTableWithRange(int startNumber, int endNumber) {
        boolean isValid;
        isValid = isValidInputNums(startNumber, endNumber);
        if(isValid) {
            String tableResult = "";
                tableResult = generateMultipleTable(startNumber, endNumber);
            return tableResult;
        }
        else{
            return null;
        }
    }
    public boolean isValidInputNums(int startNumber, int endNumber) {
        Boolean isstartNumberInRange;
        Boolean isendNumberInRange;

        Boolean compareResult;
        isstartNumberInRange = isInputNumsInRange(startNumber);
        isendNumberInRange = isInputNumsInRange(startNumber);
        compareResult = isEndNumLargerThanStartNum(startNumber, endNumber);
        if(isstartNumberInRange && isendNumberInRange && compareResult){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isInputNumsInRange(int input){
        if (input >= 1 && input <= 1000) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isEndNumLargerThanStartNum(int startNumber, int endNumber){
        if(endNumber>=startNumber) {
            return true;
        }
        else{
            return false;
        }
    }
    public String generateMultipleTable(int startNumber, int endNumber){
        String tableResult="";
        for(int i = startNumber; i<=endNumber; i++){
            if(i!=endNumber) {
                tableResult += generateMultipleLine(startNumber, i) + "\r\n";
            }
            else
                tableResult += generateMultipleLine(startNumber, i);
        }
        return tableResult;
    }
    public String generateMultipleLine(int startNum, int endNum){
        String multipleline="";
        for(int i= startNum ; i<=endNum; i++){
            if(i!=endNum) {
                multipleline += generateMultiplicationExpression(i, endNum) + "  ";
            }
            else
                multipleline += generateMultiplicationExpression(i, endNum);
        }
       return multipleline;
    }
    public String generateMultiplicationExpression(int operand, int iterate){
        String multiplicationExpression ="";
        multiplicationExpression = operand + "*" + iterate +"=" + operand*iterate;
        return multiplicationExpression;
    }


}
