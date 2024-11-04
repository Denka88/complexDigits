public class Main {
    public static void main(String[] args) {

        Complex first = new Complex(4, 3);
        Complex second = new Complex(2, 5);

        Complex testSum = first.sum(second);
        System.out.println(testSum.str());

        Complex testSub = first.sub(second);
        System.out.println(testSub.str());

        Complex testMul = first.mul(second);
        System.out.println(testMul.str());

        Complex testDiv = first.div(second);
        System.out.println(testDiv.str());

        System.out.println(testSum.absComplex());
        
    }
}