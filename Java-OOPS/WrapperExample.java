public class WrapperExample {
    public static void main(String[] args) {

        // Primitive data types
        int a = 10;
        double b = 20.5;
        char c = 'A';
        boolean d = true;

        // Converting primitives into wrapper objects (Autoboxing)
        Integer num = a;
        Double decimal = b;
        Character letter = c;
        Boolean value = d;

        System.out.println("Wrapper objects:");
        System.out.println("Integer: " + num);
        System.out.println("Double: " + decimal);
        System.out.println("Character: " + letter);
        System.out.println("Boolean: " + value);

        // Converting wrapper objects back into primitives (Unboxing)
        int x = num;
        double y = decimal;
        char ch = letter;
        boolean bo = value;
        

        System.out.println("\nAfter unboxing:");
        System.out.println("int: " + x);
        System.out.println("double: " + y);
        System.out.println("char : " + ch);
        System.out.println("boolean : " + bo);

    }
}