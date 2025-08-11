
import java.util.*;
public class ToggleCharecters {
    public static void main(String[] args) {
        String gtr="pHYsics";
        StringBuilder str=new StringBuilder(gtr);
        for(int i=0;i<str.length();i++){
            boolean flag=true;
            char ch=str.charAt(i);
            int ascii=(int)ch;


            if(ascii>=97) flag=false;
            if(flag==true)
            {
                ascii+=32;
                char dh=(char)ascii;
                str.setCharAt(i,dh);
            }
            else{
                ascii-=32;
                char dh=(char)ascii;
                 str.setCharAt(i,dh);

            }
        }
        System.out.println(str.toString());
    }
    
}
