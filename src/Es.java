public class Es {
    public static void main(String[] args) {
        int[] arrayOfInts = new int[10];
        int a = 1;
        for (int i = 0; i < arrayOfInts.length; i++) {
            arrayOfInts[i] = a;
            a+=2;
        }
        for (int current : arrayOfInts) {
            System.out.print(current + ", ");
        }
        // 3 задание
        int[] aoi = new int[10];
        for (int i = 0; i < arrayOfInts.length; i++) {
            arrayOfInts[i] = (i + 1) * 2 ;
        }
        for (int current : arrayOfInts) {
            System.out.print(current + ", ");
        }
        // 2 задание
        int[] aok = new int[10];
        for (int i = 0; i < arrayOfInts.length; i++) {
            arrayOfInts[i] = i + 1 ;
        }
        for (int current : arrayOfInts) {
            System.out.print(current + ", ");
        }
        // 1 задание
        int[] aop = new int[10];
        for (int i = 0; i < arrayOfInts.length; i++) {
            arrayOfInts[i] = i + 1 ;
        }
        for (int current : arrayOfInts) {
            System.out.print(current + ", ");
        }
        //4 задание

    }
}
