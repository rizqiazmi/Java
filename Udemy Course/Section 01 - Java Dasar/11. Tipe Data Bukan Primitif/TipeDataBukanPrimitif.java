public class TipeDataBukanPrimitif {
    public static void main(String[] args) {

        Integer iniInteger = 100;
        long iniLong = 10000L;

        Byte iniByte = null;

        iniByte = 100;


        int iniInt = 100;

        Integer iniObject = iniInt;

        short iniShort = iniObject.shortValue();
        long iniLong2 = iniObject.longValue();
        float iniFloat = iniObject.floatValue();

        Long amount = 1000000L;

        System.out.println(iniByte);
        System.out.println(iniByte);
        System.out.println(iniShort);
        System.out.println(iniLong2);
        System.out.println(iniFloat);
        System.out.println(amount);

    }
}
