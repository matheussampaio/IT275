package main;

class A {
    String s1 = "A";
}

class B extends A {
    String s1 = "B";
}

class C extends B {
    String s1 = "C";
}

class D {
    static void m1(A x) {
        System.out.print(x.s1);
    }

    static void m1(B x) {
        System.out.print(x.s1);
    }

    static void m1(C x) {
        System.out.print(x.s1);
    }

    public static void main(String[] args) {
        A a;
        B b;
        C c;
        a = b = c = new C();
        m1(a);
        m1(b);
        m1(c);
    }
}