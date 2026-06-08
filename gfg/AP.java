package gfg;

public class AP {
    import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        int an;
        an = a + (n - 1) * d;
        System.out.println(an);
    }
}

}
