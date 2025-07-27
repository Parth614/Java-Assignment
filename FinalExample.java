/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/







class Base {
    final void show() {
        System.out.println("This is a final method.");
    }
}

class Derived extends Base {
    // void show() {} 
    void display() {
        System.out.println("Derived class method");
    }
}

public class FinalExample {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.show();   
        d.display(); 
    }
}








