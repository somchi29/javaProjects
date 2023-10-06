public class ArrayListMinus2 {
    public static void main(String[] args) {
        int[] array = {22, 41, 15, 8, 2, 1};


        for (int index = 0; index < array.length; index += 2) {
            int temp = array[index];

            for (int i = 0; i < array[index]; i++) {
                array[array.length - 1] = temp;

            }
            array[index] = array[index + 1];
            array[index + 1] = temp;

            for (int b : array) {
                System.out.print(b + " , ");

                int number = 2;
                if (number % 2 == 0) {
                    array[index] = array[number - 2];


                }
                for (int e : array) {
                    System.out.print(b + " , ");
                    if (e == index) {
                        System.out.println(array);

                    }

                }


            }
        }
    }
}



