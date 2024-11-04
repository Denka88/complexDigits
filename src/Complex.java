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
        return x + " + " + y + "i";
    }

    public Complex sum(Complex c){

        int newX = this.x+c.getX();
        int newY = this.y+c.getY();

        return new Complex(newX, newY);
        
    }

    public Complex sub(Complex c){

        int newX = this.x-c.getX();
        int newY = this.y-c.getY();

        return new Complex(newX, newY);

    }

    public Complex mul(Complex c){

        int newX = this.x*c.getX() - this.y*c.getY();
        int newY = this.x*c.getY() + c.getX()*this.y;

        return new Complex(newX, newY);

    }

}
