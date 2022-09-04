import java.io.*;
import java.util.*;

public class Bronze {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while (T --> 0){
            Set<Character>set = new HashSet<>();
            set.add('T');
            set.add('i');
            set.add('m');
            set.add('u');
            set.add('r');

            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();

            if(n == 5){
                boolean check = true;
                for(int i = 0; i < 5; i++){
                    char ch = s.charAt(i);
                    if(!set.contains(ch)){
                        check = false;
                        break;
                    }else{
                        set.remove(ch);
                    }
                }
                if(check){
                    sb.append("YES").append('\n');
                }else {
                    sb.append("NO").append('\n');
                }
            }else{
                sb.append("NO").append('\n');
            }
        }
        System.out.println(sb);
    }
}
