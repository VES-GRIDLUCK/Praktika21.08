class Circle {
    private double r;
    private double pi = 3.14;
    private double S;
    private double P;

    public Circle(int r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = 5;
    }

    public double getS() {
        S = pi * (r * r);
        return S;
    }

    public void setS(double s) {
        S = s;
    }

    public double getP() {
        P = (pi * r) * 2;
        return P;
    }

    public void setP(double p) {
        P = p;
    }
}



