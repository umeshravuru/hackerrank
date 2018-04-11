import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Weighted_Uniform_Strings {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String data = s.nextLine();

        Map<Character, Integer> mapper1 = new HashMap<>();

        int n = Integer.parseInt(s.nextLine());

        int now = 0;
        for(int i =1;i<data.length();i++){
            if(data.charAt(i-1) == data.charAt(i)){
                now++;
            }
            else
            {
                if(mapper1.get(data.charAt(i-1))!=null) {
                    if (mapper1.get(data.charAt(i - 1)) < now + 1) {
                        mapper1.put(data.charAt(i - 1), now + 1);
                    }
                }
                else
                {
                    mapper1.put(data.charAt(i-1),now+1);
                }
                now=0;
            }
        }

        if(mapper1.get(data.charAt(data.length()-1))!=null) {
            if (mapper1.get(data.charAt(data.length() - 1)) < now + 1) {
                mapper1.put(data.charAt(data.length() - 1), now + 1);
            }
        }
        else
        {
            mapper1.put(data.charAt(data.length()-1),now+1);
        }

        System.out.println(mapper1);

        for(int i =0;i<n;i++){
            int che = 0;
            int numbe = Integer.parseInt(s.nextLine());
            for(Character key : mapper1.keySet()){
                if(numbe%((int)key - 96) == 0){
                    int tem = numbe/((int)key - 96);
                    if(tem<=mapper1.get(key))
                    {
                        che = 1;
                        break;
                    }
                }
            }
            if(che == 1)
                System.out.println("Yes");
            else
                System.out.println("No");

        }




    }
}
