public class W02_PrintingPatterns {

    public static void trianglePattern1(int n){
        int count = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++) {
                count++;
                System.out.print(count + "* ");
            }
            System.out.println();
        }
    }

    public static void printPascalTriangle(int n){
        for(int i = 1; i <= n; i++){
            int currentValue = 1;
            for(int j = 1; j <= i; j++) {
                System.out.print(currentValue + " ");
                currentValue = currentValue * (i-j)/j;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //trianglePattern1(5);
        printPascalTriangle(5);
    }
}
