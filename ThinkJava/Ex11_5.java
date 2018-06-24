class Rational {
    private int num;
    private int den;

    Rational() {
        num = 0;
        den = 1;
    }
    Rational(int num, int den) {
        this.num = num;
        this.den = den;
    }

    public void printRational() {
        System.out.println(num + "/" + den);
    }
    public String toString() {
        return String.format("%d / %d", num, den);
    }
    public void negate() {
        if (num < 0 && den > 0) {
            num = 0-num;
        }
        else if (num < 0 && den < 0) {
            num = 0-num;
        }
        else if (num > 0 && den < 0) {
            den = 0-den;   
        }
        else if (num > 0 && den > 0) {
            num = 0 - num;
        }
    }
    public void invert() {
        int temp = num;
        num = den;
        den = temp;
    }
    public double toDouble() {
        return (double)num / den;
    }
    private int findGCD() {
        int gcd = 1;
        if (num < den) {
            for (int i = 2; i <= num; i++) {
                if (num % i == 0 && den % i == 0 && i > gcd) {
                    gcd = i;
                }
            }
        }
        else {
            for (int i = 2; i <= den; i++) {
                if (num % i == 0 && den % i == 0 && i > gcd) {
                    gcd = i;
                }
            }  
        }
        return gcd;
    }
    public Rational reduce() {
        int gcd = findGCD();
        return new Rational(num/gcd, den/gcd);
    }

    private int findLCM(Rational r) {
        int lcm = 1;
        
        if (this.den < r.den) {
            int i = 1;
            while ((r.den * i % this.den) != 0) {
                i++;
            }
            lcm = r.den * i;
        }
        else {
            int i = 1;
            while ((this.den * i % r.den) != 0) {
                i++;
            }
            lcm = this.den * i;
        }
        return lcm;
    }
    public Rational add(Rational r) {
        int lcm = findLCM(r);
        int newNum = this.num * (lcm / this.den) + r.num * (lcm / r.den);
        return new Rational(newNum, lcm).reduce(); 
    }
}

class Ex11_5 {
    
    public static void main(String[] args) {
        Rational r = new Rational(3, 8);
        System.out.println(r);
        //r.printRational();
        //r.negate();
        //r.invert();
        //System.out.println(r.toDouble());
        //System.out.println(r.reduce());
        System.out.println(r.add(new Rational(2, 4)));
    }
}