import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class al_2438 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());//한줄 입력받음

        br.close();

        for(int i = 1; i <= N; i++){
            for(int j = 0; j < i; j++){
                System.out.printf("*");
            }
            System.out.println(" ");
        }
    }
}
