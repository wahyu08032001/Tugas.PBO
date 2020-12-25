public class no2 {
    public static void main(String[] args) {
        int a=4;
        for (int x=1; x<=a; x++) {
            for (int y = a - x; y <= 5; y++) {
                if (y == 1 || y == 3 || y == 5) {
                    System.out.print("X ");
                } else
                    System.out.print("0 ");
            }
            for (int z = 3; z >= x; z--) {
                if (z==3 || z==1) {
                    System.out.print("0 ");
                }else
                    System.out.print("X ");
            }
            System.out.print("\n");
        }
    }

}