public class test {
    public static void main(String[] args) {
        int num = 4;
        float flo = 4.3f;
        double d = 1.8;
        int count = 0;
        if (num == flo) count++;
        if (((int) (flo + d)) == ((int) flo + (int) d)) count += 2;
        System.out.println(count);


    }
}
