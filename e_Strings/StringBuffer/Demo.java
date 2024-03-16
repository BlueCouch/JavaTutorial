package StringBuffer;

public class Demo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(); //16 bytes
        System.out.println(sb.capacity());

        sb.append("Append");

    }
}
