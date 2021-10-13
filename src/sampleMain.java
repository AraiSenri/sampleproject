public class sampleMain {

    public static void main(String... args){

        System.out.println("hello intellij");
        int a = 0;
        int b = 0;
        for(int i = 0; i < 10; i++){
            System.out.println(a * i + b);
            a += 3;
            b += 5;
        }
    }
}
