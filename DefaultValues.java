class PrimitiveDefaults {
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean bool;

    void showDefaults() {
        System.out.println("Default byte value: " + b);
        System.out.println("Default short value: " + s);
        System.out.println("Default int value: " + i);
        System.out.println("Default long value: " + l);
        System.out.println("Default float value: " + f);
        System.out.println("Default double value: " + d);
        System.out.println("Default char value: '" + c + "'");
        System.out.println("Default boolean value: " + bool);
    }
}

public class DefaultValues {
    public static void main(String[] args) {
        PrimitiveDefaults obj = new PrimitiveDefaults();
        obj.showDefaults();
    }
}
