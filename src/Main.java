public class Main {
    public static void main(String[] args) {

        //Задача 1. Объявление 3-х массивов
        int [] array = new int [3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        double [] array2 = {1.57, 7.654, 9.986};

        int [] array3 = {1, 2, 3, 4, 5, 6, 7};

        //Задача 2. Распечатать все элементы всех 3-х массивов
        System.out.println("Задача 2");
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i] + ", ");
            }
        System.out.println("");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + ", ");
        }
        System.out.println("");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + ", ");
        }
        System.out.println("");

        //Задача 3. Распечатать все элементы всех 3-х массивов в обратном порядке
        System.out.println("Задача 3");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + ", ");
        }
        System.out.println("");
        for (int i = array2.length - 1; i >= 0; i--) {
            System.out.print(array2[i] + ", ");
        }
        System.out.println("");
        for (int i = array3.length - 1; i >= 0; i--) {
            System.out.print(array3[i] + ", ");
        }

        System.out.println("");
        //Задача 4. Нечетные числа 1-го массива сделать четными
        System.out.println("Задача 4");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = array[i] + 1;
            }
            System.out.print(array[i] + ", ");
        }
    }
}