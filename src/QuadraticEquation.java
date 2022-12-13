public class QuadraticEquation {
    private double a, b, c;
    double delta,d;
    QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double Delta() {
        d = b * b - 4 * a * c;
        return d;
    }

    public void calculator() {
        if (this.Delta() < 0) System.out.println("phương trình vô nghiệm");
        if (this.Delta() == 0) {
            double x = -b / (a * 2);
            System.out.println("phương trình có nghiệm kép: " + x);
        }
        if (this.Delta() > 0) {
            double x1 = (-b + Math.pow(this.Delta(),0.5)) / (2 * a);
            double x2 = (-b - Math.pow(this.Delta(),0.5)) / (2 * a);
            System.out.println("phương tình có 2 nghiệm x1: " + x1 + " và x2: " + x2);
        }
    }
}