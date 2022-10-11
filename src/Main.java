public class Main {
    public static void main(String[] args) {

        //Exercise 1

        int[] arrayInt=new int[]{1,2,3};
        double[] arrayDouble={1.57, 7.654, 9.986};
        char[] arrayChar={'j','a','v','a'};


        //Exercise 2
        for (int c=0;c<arrayInt.length;c++) {
            System.out.print(c+1==arrayInt.length?arrayInt[c]+"\n":arrayInt[c]+", ");
        }
        for (int c=0;c<arrayDouble.length;c++) {
            System.out.print(c+1==arrayDouble.length?arrayDouble[c]+"\n":arrayDouble[c]+", ");
        }
        for (int c=0;c<arrayChar.length;c++) {
            System.out.print(c+1==arrayChar.length?arrayChar[c]+"\n":arrayChar[c]+", ");
        }
        System.out.println();


        //Exercise 3
        for (int c=arrayInt.length-1;c>=0;c--) {
            System.out.print(c==0?arrayInt[c]+"\n":arrayInt[c]+", ");
        }
        for (int c=arrayDouble.length-1;c>=0;c--) {
            System.out.print(c==0?arrayDouble[c]+"\n":arrayDouble[c]+", ");
        }
        for (int c=arrayChar.length-1;c>=0;c--) {
            System.out.print(c==0?arrayChar[c]+"\n":arrayChar[c]+", ");
        }
        System.out.println();


        //Exercise 4
        for (int c=0;c<arrayInt.length;c++)
            System.out.println(arrayInt[c]+=arrayInt[c]%2==1?1:0);

        //Извините, сделал разом

    }
}