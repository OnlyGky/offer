package offer.offer_6;

public class P310_Test_65_1 {
    int Add(int num1, int num2){
        int sum, carry;
        do{
            sum = num1 ^ num2;//异或
            carry = (num1 & num2) << 1; //右移拿到进位
            num1 = sum;
            num2 =carry;
        }
        while (num2 != 0);
        return num1;
    }
}
