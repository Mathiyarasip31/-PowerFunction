import java.util.Scanner;

public class powerfunctions {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int c= scanner.nextInt();
        System.out.println(findPowerFunction(a,b,c));
    }
    public static int findPowerFunction(int a, int b, int c){
        if(b == 1){
            return a % c;
        }
        return findPowerFunction(a, b - 1, c) * a % c;
    }
}
