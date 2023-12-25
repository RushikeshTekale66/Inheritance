class C1 {
    int x = 50;
}

class C2 extends C1 {
    int y = 40;
}

public class inheritance {
    public static void main(String[] args) {
        C1 a = new C1();
        System.out.println(a.x);
        C2 b = new C2();
        System.out.println(b.x);
        System.out.println(b.y);
    }
}