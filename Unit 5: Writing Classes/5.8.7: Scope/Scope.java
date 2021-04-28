public class Scope {
    private int a;
    private int b;
    private int c;

    public Scope() {
        a = 5;
        b = 10;
        c = 15;
    }

    public void printScope() {
        System.out.println("a = " + getA());
        System.out.println("b = " + getB());
        System.out.println("c = " + getC());
        System.out.println("d = " + getD());
        System.out.println("e = " + getE());
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getD(){
        int d = a + c;
        return d;
    }

    public int getE() {
        int e = b + c;
        return e;
    }
}
