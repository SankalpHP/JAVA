package StringBuilderAndBuffer;

public class SB {

    public static void main(String[] args) {

        String str = "Sankalp";
//        System.out.println(str.toUpperCase());
//
//        StringBuilder builder = new StringBuilder(str);

       // System.out.println(builder.reverse());
        //System.out.println(builder.append("s"));
        //System.out.println(builder.charAt(0));

        StringBuffer stringBuffer = new StringBuffer(str);
        //System.out.println(stringBuffer.reverse());
        System.out.println(stringBuffer.codePointAt(1));
        System.out.println(stringBuffer.codePointBefore(3));
        System.out.println(stringBuffer.deleteCharAt(5));
        System.out.println(stringBuffer.length());

    }
}
