package offer.offer_5;

public class p236_Test_48_1 {

    int longestSubstrint(String str){
        int curLength = 0;
        int maxLength = 0;
        int[] postion = new int[26];
        for (int i = 0;i < 26; i++){
            postion[i] = 1;
        }
        for (int i = 0;i <str.length(); i++){
            int preIndex = postion[str.charAt(i)-'a'];
            if (preIndex < 0 || i - preIndex > curLength) //当前字符从未出现过或者不在当前子串之内
                ++curLength;
            else {
                if (curLength > maxLength)  //
                    maxLength = curLength;
                curLength = i - preIndex; //表示当前长度为两次出现字符的距离
            }
            postion[str.charAt(i)-'a'] = i;  //存储每个字符上次出现的下标
        }
        if (curLength > maxLength){
            maxLength = curLength;
        }
        return maxLength;
    }
}
