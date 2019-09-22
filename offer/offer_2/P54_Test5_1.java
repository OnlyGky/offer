package offer.offer_2;

/**
 * 替换空格
 */
public class P54_Test5_1 {

    public String replaceSpace(StringBuffer str) {
        if (str == null)
            return null;
        char[] strs = String.valueOf(str).toCharArray();
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if (strs[i] == ' ')
                count++;
        }
        char[] fchar = new char[str.length() + count * 2];
        int len = str.length()-1;
        int len1 = str.length() + count * 2;
        while (len >= 0 && len1 >= 0 ){
            if (strs[len] == ' '){
                fchar[--len1] = '0';
                fchar[--len1] = '2';
                fchar[--len1] = '%';
                --len;
            }else {
                fchar[--len1] = strs[len];
                len--;
            }
        }
        return String.valueOf(fchar);
    }

    public static void main(String[] args) {
//        char []a = {'w','e',' ','a','r','e',' ', 'a','a','a',' '};
//        char []a = {'w','e',' ',' ',' ','a','r','e',' ', 'a','a','a',' '};
        char []a = {'w','e','a','r','e','a','a','a'};

        int count = 0;
        for(char b : a){
            if(b==' '){
                count++;
            }
        }
        int len2 = a.length+count*2-1;
        int len1 = a.length-1;
        char []b = new char[len2+1];
        while(len1>=0&&len2>=len1){
            if(a[len1]==' '){
                b[len2--]='0';
                b[len2--]='2';
                b[len2--]='%';
            }else{
                b[len2--]=a[len1];
            }
            --len1;
        }
        for(char c :b){
            System.out.print(c);
        }
    }
}
