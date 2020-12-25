public class no5 {
    public static void main(String[] args) {
        int a =5;
        for (int x=1; x<=5; x++){
            for (int b=2; b<=x; b++){
                System.out.print(" ");
            }
            for (int y=a; y>=x; y--){
                System.out.print(y);
            }
            for (int z=x+1; z<=a; z++){
                System.out.print(z);
            }
            System.out.print("\n");
        }
    }

}
