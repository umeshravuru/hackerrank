package com.toptal.jogger.service;

public class Decode_The_Message {


    public static void main(String[] args) {

        String now = "UMESH";
        for(int i =0;i<now.length();i++){
            System.out.println((int)now.charAt(i));
        }
        now = encode(now);
        for(int i =0;i<now.length();i++){
            System.out.println((int)now.charAt(i));
        }
        System.out.println(encode("UMESH"));
        System.out.println(decode(now));
    }


    private static String encode(String text) {
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            b.append(c += c + i);
        }
        return b.reverse().toString();
    }

    private static String decode(String text) {
        String bString = new StringBuilder(text).reverse().toString();
        StringBuilder ans = new StringBuilder();
        for(int i =0;i< bString.length() ; i++){
            ans.append((char)((bString.charAt(i)-i)/2));
        }
        return ans.toString();
    }
}
