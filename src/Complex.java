public class Complex {

    private double x;
    private double y;

    public Complex() {
    }

    public Complex(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String str(){
        return x + " + " + y + "i";
    }

    public Complex sum(Complex complex){

        double newX = this.x + complex.getX();
        double newY = this.y + complex.getY();

        return new Complex(newX, newY);
        
    }

    public Complex sub(Complex complex){

        double newX = this.x - complex.getX();
        double newY = this.y - complex.getY();

        return new Complex(newX, newY);

    }

    public Complex mul(Complex complex){

        double newX = this.x * complex.getX() - this.y * complex.getY();
        double newY = this.x * complex.getY() + complex.getX() * this.y;

        return new Complex(newX, newY);

    }

    public Complex div(Complex complex){

        double newX = ((this.x * complex.getX() + this.y * complex.getY()) / (Math.pow(complex.getX(), 2) + Math.pow(complex.getY(), 2)));
        double newY = ((this.y * complex.getX() - this.x * complex.getY()) / (Math.pow(complex.getX(), 2) + Math.pow(complex.getY(), 2)));

        return new Complex(newX, newY);

    }
    
    public double absComplex(){
        
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
        
    }
    
    public boolean equals(Complex complex){
        
        return this.absComplex() == complex.absComplex();
        
    }

}
