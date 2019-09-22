package offer.offer_2;

public class P32_Test2_1 {
    private static P32_Test2_1 p;
    private P32_Test2_1(){}
    private static class Inner{
        private static P32_Test2_1 p = new P32_Test2_1();
    }
    private static P32_Test2_1 getP(){
        return Inner.p;
    }


}
