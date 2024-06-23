public class Fib {
    public static void main(String[] args){
        int first = 0, second = 1, next;
        System.out.println(first);
        System.out.println(second);

        for(int i = 2; i <= 10; i++){
            next = first + second;
            first = second;
            second = next;
            System.out.println(next);

        }
    }
}
