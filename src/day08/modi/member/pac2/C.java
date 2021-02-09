package day08.modi.member.pac2;

import day08.modi.member.pac1.A;

public class C {

    public C() {
        A a = new A();

        a.f1 = 1;
        //a.f2 = 2; // default
        //a.f3 = 3; // private

        a.m1();
        //a.m2(); // default
        //a.m3(); // private

    }
}
