package com.codewithcarrington;

public class ControlFlow {
    public static void main(String[] args) {
        int x =1;
        int y =1;
        System.out.println(x == y);

        int temperature = 12;
        boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println(isWarm);//Returns false

        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
        System.out.println(isEligible);
    }
}
