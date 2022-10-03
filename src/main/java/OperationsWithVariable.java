public class OperationsWithVariable {

    public static void main(String[] args) {

        byte byte1 = 127; // 8 бит (-128/127)
        short short1 = 32766; // 16 бит (-32768/32767)
        int int1 = 1000; // 32 бита (-2 147 483 647/ 2 147 483 647)
        int int2 = 2000;
        long long1 = 125000; // 64 бита (-2^63/ 2^63 -1)
        double double1 = 6.7; // 32 бита (4.9*10^-324 / 1.7976931348623157*10^308)
        float float1 = 3.3f; // 64 бита (1.4*10^-38 / 3.4*10^38)

        // Математичские операции
        System.out.println(byte1 + short1);
        System.out.println(int1 - int2);
        System.out.println(long1 / int2);
        System.out.println(double1 % float1);
        System.out.println(int1 * int2);
        System.out.println(int1 + double1);

        // Логические операции
        System.out.println(int1 >= int2);
        System.out.println(int1 < int2 && double1 > float1);
        System.out.println(long1 < int2 || short1 > byte1);

        // Переполнения при вычислениях
        int int3 = Integer.MAX_VALUE-1;
        for (int i = 0; i < 3; i++, int3++);
        System.out.println(int3);
    }
}
