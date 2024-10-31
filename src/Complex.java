public class Complex {

    private int x;
    private int y;

    public Complex() {
    }

    public Complex(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String str(){
        return y+"+"+x+"i";
    }

    public int sum(Complex c){

        int x = this.x+c.getX();

        return 0;


    }

}
