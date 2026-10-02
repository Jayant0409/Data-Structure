package Strings;



public class checkPalindromicSubstring {
    public static void main(String[] args) {

        String s = "abcdcba";
int count =0;
        int n = s.length();
        for(int i =0; i<n; i++){
            String str ="";
            for(int j=i+1;j<=n;j++) {
                str = s.substring(i, j);

                int x = 0;
                int y = str.length() - 1;
                int flag = 1;
                while (x < y) {
                    char f = str.charAt(x);
                    char l = str.charAt(y);
                    if (f != l) {
                        flag = -1;
                        break;
                    }
                    x++;
                    y--;
                }
                if (flag == 1) {
                    count++;
                }


            }


        }
        System.out.println(count);
    }
}
