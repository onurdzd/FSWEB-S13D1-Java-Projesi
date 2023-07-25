public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Kopek kopek1=new Kopek();
        System.out.println(kopek1.shouldWakeUp (true,1));
        System.out.println(kopek1.shouldWakeUp (false,2));
        System.out.println(kopek1.shouldWakeUp (true,8));
        System.out.println(kopek1.shouldWakeUp (true,-1));

        System.out.println("////////////");

        System.out.println( Yas.hasTeen(9, 99, 19));
        System.out.println( Yas.hasTeen(23,15,42));
        System.out.println( Yas.hasTeen(22,23,34));

        System.out.println("////////////");

        System.out.println( Kedi.isCatPlaying(true,10));
        System.out.println( Kedi.isCatPlaying(false,36));
        System.out.println( Kedi.isCatPlaying(false,35));

        System.out.println("////////////");

        System.out.println( AreaCalculate.area(5.0,4.0));
        System.out.println( AreaCalculate.area(-1.0,4.0));

        System.out.println("////////////");

        System.out.println( AreaCalculate.areaCircle(5.0));
        System.out.println( AreaCalculate.areaCircle(-1.0));
    }
}