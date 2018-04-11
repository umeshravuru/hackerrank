import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class String_Chains {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        String data [] = new String[n];
        for(int i =0;i<n;i++){
            data[i] = s.nextLine();
        }

        longestChain(data);



    }

    public static int longestChain(String[] words) {
        Set<String> data = new HashSet<>();

        for(int i =0;i<words.length;i++){
            data.add(words[i]);
        }
        int ans =0;
        for(int i =0;i<words.length;i++){
            for(int j =0;j<words[i].length();j++){
                String tem = words[i];
                String now = tem.substring(0,j)+tem.substring(j+1,tem.length());
                System.out.println(now);
            }
        }




        return 0;
    }



}