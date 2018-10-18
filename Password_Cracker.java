package webScrap.org.webScrap;

import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Password_Cracker {

	private static List<String> isValidPass(String pass, String[] dict){
        Set<String> st = new HashSet<String>();
        for(String str: dict){
            st.add(str);
        }
        List<String> validPassSeq = new ArrayList<String>();
          validPassHelp(pass,st,0,new HashSet<Integer>(),validPassSeq);
        return validPassSeq;
    }
    
    private static boolean validPassHelp(String pwd,Set<String> dict, int idx, Set<Integer> invalid,List<String> result){
        if(idx == pwd.length()){
            return true;
        }
        if(invalid.contains(idx)){
            return false;
        }
        for(int i = idx; i < pwd.length(); i++){
            String sub = pwd.substring(idx, i + 1);
            if(dict.contains(sub)){
                result.add(sub);
                boolean ret = validPassHelp(pwd,dict,i + 1,invalid,result);
                if(ret){
                    return true;
                }
                result.remove(result.size() - 1);
            }
        }
        invalid.add(idx);
        return false;
    }

    public static void main(String[] args) throws FileNotFoundException {
//       BufferedReader rdr = new BufferedReader(new InputStreamReader(System.in));
       BufferedReader rdr = new BufferedReader(new FileReader(
				"/Users/UXR08UQ/Desktop/testData.txt"));

        
        try{
            int n = Integer.parseInt(rdr.readLine());
            while( n > 0){
                int numWords = Integer.parseInt(rdr.readLine());
                String[] wrds = rdr.readLine().split(" ");
                String q = rdr.readLine();
                List<String> res = isValidPass(q.trim(),wrds);
                if(res.isEmpty()){
                    System.out.println("WRONG PASSWORD");
                }else{
                   for(int i = 0; i < res.size(); i++){
                       System.out.print(res.get(i) + " ");
                   }
                    System.out.print('\n');
                }
                n--;
                
            }
    }catch(Exception ex){
            
        }
    }
}