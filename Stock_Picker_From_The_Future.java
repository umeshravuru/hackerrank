package com.toptal.jogger.service;

public class Stock_Picker_From_The_Future {

    public static void main(String[] args) {

        int data[] = {100,101,99,94,80,99,100,111,103,102,81,85,84,95,100,105,70,75,90,110,20};
        System.out.println(computeBestTransaction(data));

    }


    static String computeBestTransaction(int[] data) {

        int maxDiff = -1;
        int n = data.length;
        int maxRight = data[n - 1];
        int buyDay = 0;
        int sellDay = 0;
        int tempSellDate = 0;
        for (int i = n - 2; i >= 0; i--) {
            if (data[i] > maxRight) {
                maxRight = data[i];
                System.out.println(sellDay);
                tempSellDate = i + 1;
            } else {
                int diff = maxRight - data[i];
                if (diff > maxDiff) {
                    maxDiff = diff;
                    buyDay = i + 1;
                    sellDay = tempSellDate;
                }
            }
        }
        return new StringBuilder("BUY@").append(data[buyDay - 1]).append(" on day ").append(buyDay).append(" and SELL@").append(data[sellDay - 1]).append(" on day ").append(sellDay).append(".  For a profit of $").append(maxDiff).append(" per share!").toString();
    }

}
