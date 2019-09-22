package offer.offer_6;

public class P286_Test_58_2 {
    public String ReverseSentence(String str) {
        if(str == null || str.length() == 0 || str.trim().equals(""))
            return str;

        String[] strs = str.split(" ");
        str = "";
        
        for(int i= strs.length-1; i>0;i--){
            str+=strs[i]+" ";
        }
        str+=strs[0];
        return str;
    }

    public String LeftRotateString(String str, int n){
        if(str == null || str.length() < 2 || str.length() <= n){
            return str;
        }

        char[] charArray = str.toCharArray();

        //翻转前n个字符
        reverse(charArray, 0, n-1);

        //翻转后面剩余的字符
        reverse(charArray, n, charArray.length-1);

        //整体翻转
        reverse(charArray, 0, charArray.length-1);

        return String.valueOf(charArray);
    }

    //翻转字符串函数
    private void reverse(char[] array, int start, int end) {

        while (start < end) {
            char temp = array[start];
            array[start++] = array[end];
            array[end--] = temp;
        }
    }
}
