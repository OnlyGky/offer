package offer.offer_6;

public class P284_Test_58_1 {

    public String ReverseSentence(String str){
        if (str == null)
            return str;
        String reverseDtr = reverse(str);
        String[] splitString = reverseDtr.split(" ");
        String resultString = "";
        for (String string : splitString){
            resultString = resultString + reverse(string)+" ";
        }
        return resultString;
    }
    private String reverse(String string) {

        char[] array = string.toCharArray();
        int i = 0;
        int j = array.length - 1;

        while (i < j) {
            char tem = array[i];
            array[i] = array[j];
            array[j] = tem;

            i++;
            j--;
        }
        return String.valueOf(array);
    }
}
