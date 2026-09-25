public class unaryoperator {
    public static void main(String[] args) {
        int a = 10;
        a = a++;
        
        int b = 20;
        b = ++b;

        System.out.println(a); 
        System.out.println(b);


        int c = 30;
        c = --c;

        int d = 40;
        d = d--;
        System.out.println(c);
        System.out.println(d);
    }
}
