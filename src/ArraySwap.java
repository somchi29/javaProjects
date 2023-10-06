public class ArraySwap {
    public static void main(String[] args) {

            int[] array = {1, 2, 3, 4, 5, 6};
            for (int index = 0; index < array.length; index += 2) {
                int temp = array[index];

                array[index] = array[index + 1];
                array[index + 1] = temp;


            }
            for ( int b : array){
                System.out.print( b + " ");
            }
        }
    }

