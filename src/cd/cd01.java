package cd;



public class cd01 {
    public static void main(String[] args) {
        String str1 = "1234";
        String str2 = "5";

        System.out.println(sum(str1, str2));
    }
    private static String sum(String a,String b){
        int n = a.length()-1;
        int m = b.length()-1;
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        while (n>=0&&m>=0){
            int tmp = a.charAt(n)-'0'+b.charAt(m)- '0'+carry;
            carry=tmp/10;
            sb.insert(0,tmp%10);
            n--;
            m--;
        }
        while (n>=0){
            int tmp = a.charAt(n)-'0'+carry;
            carry=tmp/10;
            sb.insert(0,tmp%10);
            n--;
        }
        while (m>=0){
            int tmp = a.charAt(m)-'0'+carry;
            carry=tmp/10;
            sb.insert(0,tmp%10);
            m--;
        }
        if(carry>0){
            sb.insert(0,carry);
        }
        return sb.toString();

    }
}
