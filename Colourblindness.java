import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B {
    static int check(Character ch){
        if(ch == 'G' || ch == 'B'){
            return 0;
        }else{
            return 1;
        }
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while (T --> 0){
            int n = Integer.parseInt(br.readLine());

            boolean check = true;

            String s1 = br.readLine();
            String s2 = br.readLine();

            for(int i = 0; i < n; i++){
                if(check(s1.charAt(i)) != check(s2.charAt(i))){
                    check = false;
                    break;
                }
            }

            if(check){
                sb.append("YES").append('\n');
            }else {
                sb.append("NO").append('\n');
            }
        }
        System.out.println(sb);
    }
}
