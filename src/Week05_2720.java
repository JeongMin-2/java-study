import java.io.*;

public class Week05_2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int c = Integer.parseInt(br.readLine());

            int q = c/25;
            c = c % 25;
            int d = c/10;
            c = c % 10;
            int n = c/5;
            c = c % 5;
            int p = c;

            bw.write(q+" "+d+" "+n+" "+p);
            bw.newLine();
        }
        bw.flush();

    }

}
