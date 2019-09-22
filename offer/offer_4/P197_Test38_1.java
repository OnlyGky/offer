package offer.offer_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class P197_Test38_1 {
    public static void main(String[] args) {
       new P197_Test38_1(). Permutation("123");
    }
    public ArrayList<String> Permutation(String str) {
        if(str==null || str.length() < 1)
            return new ArrayList<String>();
        ArrayList<String> list = new ArrayList<String>();

        char [] c = str.toCharArray();
        change(c,0,list);
        Collections.sort(list);
        return list;
    }
    void change(char[] str,int index, ArrayList<String> list){
        if (index == str.length-1){
            if (!list.contains(String.valueOf(str))){
                list.add(String.valueOf(str));
                System.out.println(String.valueOf(str));
            }
        }else {//index表示固定当前这个数并与它后面的数进行交换
            for (int i = index; i <= str.length-1;i++){

                swap(str, index, i);
                change(str, index+1, list);
                swap(str, index, i);


            }
        }
    }

    void swap(char[] str, int start, int end){
        char a = str[start];
        str[start] = str[end];
        str[end] = a;
    }
    static boolean ifSwap(char []result,int k,int end) {
        for(int i=k;i<end;i++) {
            if(result[i]==result[end])
                return false;
        }
        return true;

    }
}
