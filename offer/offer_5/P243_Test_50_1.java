package offer.offer_5;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class P243_Test_50_1 {

    public static void main(String[] args) {
        System.out.println(new P243_Test_50_1().FirstNotRepeatingChar("aabbzddcff"));
    }

    public int FirstNotRepeatingChar(String str) {
        int[] words = new int[58];
        for(int i = 0;i<str.length();i++){

            words[((int)str.charAt(i))-65] += 1;
        }
        for(int i=0;i<str.length();i++){//遍历的是str的值
            if(words[((int)str.charAt(i))-65]==1){
                return i;
        }}
        return -1;
    }

//    char FirstNotRepeatingChar(String str){
//        if (str == null)
//            return 0;
//        int[] table = new int[256];
//        for (int i = 0;i < 256; i++){
//            table[i] = 0;
//        }
//        for (int i = 0; i < str.length(); i++){
//            table[str.charAt(i)]++;
//        }
//        for (int i = 0; i < str.length(); i++){
//            if (table[str.charAt(i)] == 1){
//                return str.charAt(i);
//            }
//        }
//        return 0;
//    }
}
