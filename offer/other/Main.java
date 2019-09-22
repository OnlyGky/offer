package offer.other;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

    }

    /**
     * 左旋转字符串
     * @param str
     * @param n
     * @return
     */
    public String LeftRotateString(String str,int n) {
        if(n == 0 ||str == null)
            return str;
        if(n > str.length())
            return str;
        char[] temp = str.toCharArray();
        str = "";
        for(int i = n; i<temp.length; i++ ){
            str+=temp[i];
        }
        for(int i = 0; i<n; i++){
            str+=temp[i];
        }
        return str;

    }

    /**
     * 把字符串转化为整数
     * @param str
     * @return
     */
    public int StrToInt(String str) {
        Integer re = null;
        try{
            re = Integer.valueOf(str);

        }catch (Exception e){
            return 0;
        }
        return re;
    }


    /**剑指offer 字符流中第一个不重复的数字
     Set<Character> set = new LinkedHashSet<>();
     public void Insert(char ch)
     {
     if(set.contains(ch)){
     set.remove(ch);
     }else set.add(ch);
     }
     //return the first appearence once char in current stringstream
     public char FirstAppearingOnce()
     {
     if (!set.isEmpty())
     for(char a : set){
     return a;
     }
     return '#';
     }
     **/

    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < array.length; i++){
            if(set.contains(array[i]))
                set.remove(array[i]);
            else set.add(array[i]);
        }

    }
}
