public class Gjki{
    public static void main(String[] args) {
        int[] arrayOfInts = new int[10];
        // 3 задание
        int[] arrayOfInts5 = new int[10];
        for (int i = 0; i < arrayOfInts5.length; i++) {
        arrayOfInts5[i] = (i + 1) * 2 ;
        }
        for (int current : arrayOfInts5) {
        System.out.print(current + ", ");
        System.out.println(" ");
        }
        // 2 задание
        int[] arrayOfInts9 = new int[10];
        for (int i = 0; i < arrayOfInts9.length; i++) {
        arrayOfInts9[i] = i + 1 ;
        }
        for (int current : arrayOfInts9) {
        System.out.print(current + ", ");
        System.out.println(" ");
        }
        // 1 задание
        int[] arrayOfInts3 = new int[10];
        for (int i = 0; i < arrayOfInts3.length; i++) {
        arrayOfInts3[i] = i + 1 ;
        }
        for (int current : arrayOfInts3) {
        System.out.print(current + ", ");
        System.out.println(" ");
        }
        //5 задание
        int[] artrayOfInts8 = new int[10];
        for(int i = 0; i < artrayOfInts8.length; i++){
        if(i % 2 == 0) {
        artrayOfInts8[i] = 1;
        }
        else {
        artrayOfInts8[i] = -1;
        }
        }
        for(int current : artrayOfInts8){
        System.out.println(current + ", ");
        }
        System.out.println();
        System.out.println();
        // 4 задание
        int[] artrayOfInts6 = new int[10];
        artrayOfInts6[0] = 1;
        for(int i = 1; i < artrayOfInts6.length; i++){
        artrayOfInts6[i] = artrayOfInts6[i-1] + 2;
        }
        for(int current : artrayOfInts6){
        System.out.println(current + ", ");
        }
        System.out.println();
        System.out.println();
        }
        }
}
