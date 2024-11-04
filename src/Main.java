public class Main {
    public static void main(String[] args) {

        Complex first = new Complex(4, 3);
        Complex second = new Complex(2, 5);

        
//        sum
        Complex testSum = first.sum(second);
        System.out.println(testSum.str());

//        sub
        Complex testSub = first.sub(second);
        System.out.println(testSub.str());

//        mul
        Complex testMul = first.mul(second);
        System.out.println(testMul.str());

//        div
        Complex testDiv = first.div(second);
        System.out.println(testDiv.str());

//        модуль
        System.out.println(testSum.absComplex());

//        сравнение
        System.out.println(testSum.equals(testMul));
    }
}