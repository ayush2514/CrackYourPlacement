package Strings;
import java.util.*;
public class CompleteStringCompression {
     public static int compress(char[] chars) {
        Map<Character,Integer> hs=new HashMap<>();
         String sb="";
        if(chars.length==1)
            return 1; 
        else  {
            for(int i=0;i<chars.length;i++)  {
                if(hs.containsKey(chars[i])) {
                     hs.put(chars[i],hs.get(chars[i])+1);
                }
                else
                    hs.put(chars[i],1);
            }
        }
            for(Character s:hs.keySet()) {
                if(hs.get(s)==1) {
                sb+=Character.toString(s);
                }
                else {
                    sb+=Character.toString(s);
                    sb+=Integer.toString(hs.get(s));
            }
            }
         for(int i=0;i<sb.length();i++)
             chars[i]=sb.charAt(i);
        return sb.length();
     }
    }
