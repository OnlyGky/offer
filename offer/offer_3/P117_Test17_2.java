package offer.offer_3;

public class P117_Test17_2 {
    public static void main(String[] args) {
        new P117_Test17_2().PrintToMaxOfDigits(3);
    }

    /**
     * 就是递归产生001，002 ---999
     * @param n
     */
    private void PrintToMaxOfDigits(int n) {
        if(n<0)
            return;
        char []number = new char[n];
        for(int i=0;i<10;i++){
            number[0] = (char) ('0'+i);
            PrintToMaxOfDigitsRecursively(number,n,0);

        }
    }

    private void PrintToMaxOfDigitsRecursively(char[] number, int length, int index) {
        if(index >= length-1){
            PrintNumber(number);
            return;
        }
        for(int i=0;i<10;i++){
            number[index+1]= (char) (i+'0');
            PrintToMaxOfDigitsRecursively(number,length,index+1);
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
}
