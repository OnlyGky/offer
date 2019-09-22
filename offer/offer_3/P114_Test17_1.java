package offer.offer_3;

public class P114_Test17_1 {
    public static void main(String[] args) {
        new P114_Test17_1().PrintToMaxOfDigits(3);
    }

    void PrintToMaxOfDigits(int n){
        if(n<=0)
            return;
        char []number = new char[n];
        for(int i=0;i<n;i++){
            number[i] = '0';
        }
        while(!Increment(number)){
            PrintNumber(number);
            System.out.println();
        }
    }

    private void PrintNumber(char[] number) {
        boolean isBeginnung = true;
        int nlength = number.length;
        for(int i = 0;i<nlength;i++){
            if(isBeginnung && number[i]!='0') //当出现第一个非零数字之后 isBeginnung就永远为false
                isBeginnung = false;
            if (!isBeginnung){
                System.out.print(number[i]);
            }
        }
    }

    private boolean Increment(char[] number) {
        boolean isOverflow = false;
        int nTakeOver = 0;
        int nLength = number.length;

        for(int i = nLength-1;i>=0;i--){
            int nsum = number[i]-'0'+nTakeOver; //
            if(i == nLength-1){ //在最后一个值加 1
                nsum++;
            }
            if(nsum>=10){
                if(i == 0){
                    isOverflow = true;
                }
                else{
                    nsum-=10;
                    nTakeOver = 1; //进位
                    number[i] = (char) ('0'+nsum); //更新
                }
            }else {
                number[i] = (char) ('0'+nsum);
                break;
            }
        }
        return isOverflow;
    }

}
