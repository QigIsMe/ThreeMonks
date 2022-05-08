public class ThreeMonks {
    public static void main(String[] args) {
        int height1 = 180;
        int height2 = 210;
        int height3 = 165;
        int tempHeight = height1 > height2 ? height1 : height2;
        int maxHeight = tempHeight > height3 ? tempHeight : height3;
        System.out.println("maxHeight:" + maxHeight);
    }
}
