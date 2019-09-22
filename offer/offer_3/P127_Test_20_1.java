package offer.offer_3;


public class P127_Test_20_1 {

    public boolean isNumeric(char[] str) {
        if(str == null || str.length < 1)
            return  false;
        int len = str.length;
        for (int i = 0; i < len; i++){
            if(str[i] =='+' || str[i] == '-')
                if(i != 0)
                    return false;
                else continue;
            if(str[i] == '.')
                return afterPoint(i+1, len,str);
            if(str[i] == 'e' || str[i] == 'E'){
                return afterE(i+1,len,str);
            }
            if( str[i] < '0' || str[i] > '9'){
                return false;
            }
        }
        return true;
    }

    private boolean afterE(int a, int len, char[] str) {
        if(len-a == 0){
            return false;
        }
        for(int i = a; i < len ; i++){
            //正负号只能出现在e之后第一位
            if(str[i] == '+' || str[i] == '-'){
                if(i != a){
                    return false;
                }else continue;
            }
            if(str[i] < '0' || str[i] > '9'){
                return false;
            }
        }
        return true;
    }

    private boolean afterPoint(int i, int len, char[] str) {
        if(len - i == 0 || str[i] < '0' || str[i] > '9')
            return false;
        for(int j = i; j < len; j++){
            if (str[j] == 'e' || str[j] == 'E')
                return afterE(j+1, len, str);
            if( str[j] < '0' || str[j] > '9'){
                return false;
            }
        }
        return true;
    }

}