public class Main {
    public static void main(String[] args) {

        Complex first = new Complex(4, 3);
        Complex second = new Complex(2, 5);
        
        Complex testSum = first.sum(second);

        System.out.println(testSum.str());
        
        
        

    }
}