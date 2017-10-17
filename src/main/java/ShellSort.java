import java.util.Random;

class Shell {
    /**
     * Сортировка Шелла выполняет дальние сдвиги, сортируя разобщенные элементы посредством сортировки методом вставок.
     * После сортироки этих элементов сортируются элементы, находящиеся на меньшем расстоянии и т.д.
     * Пример 4-сортировки(т.е. элементы на расстоянии 4 будут сортироваться между собой)
     * 7 10 1 9 2 5 8 6 4 3  // в сортировке участвуют 7, 2 и 4
     * 2 10 1 9 4 5 8 6 7 3  // в сортировке участвуют 10, 5, 3
     * 2  3 1 9 4 5 8 6 7 10 // в сортировке участвуют 1 и 8
     * 2  3 1 9 4 5 8 6 7 10 // в сортировке участвуют 9 и 6
     * 2  3 1 6 4 5 8 9 7 10
     * В конце 4 сортировки ни один элемент не находится на расстоянии более 3 ячеек от той позиции,
     *  где он находился бы при полной сортировке массива. Именно эта особенность - почти отсортированный массив -
     *  и является секретом сортировки Шелла. Создание чередующихся наборов элементов с внутренней сортировкой
     *  сводит к минимуму объем работы, который необходимо сделать для завершения сортировки. Сортировка вставками
     *  выполняется за O(n), если каждый элемент достаточно сметить на 1-2 ячейки. Таким образом, комбинация 4-сортировки с
     *  1-сортировкой работает намного быстрее, чем простое примененние сортировки методом вставок без предварительной 4-сортировки.
     *
     *   Сокращение интервалов.
     *   Для массивов большего размера сортировка должна начинаться с намного большего интервала, чем 4,
     *   который затем последовательно сокращается вплоть до 1. Согласно Кнуту, значение интервала генерируется по формуле
     *   h = 3*h + 1
     *   (начальное значение h = 1), процесс генерации h завершается, когда величина интервала превышает размер массива.
     *   Пример:
     *   размер массива = 1000
     *   h
     *   1
     *   4
     *   13
     *   40
     *   121
     *   364
     *   следующие число(1093) оказывается слишком большим. Соответственно сортировка начинается с интервала 364.
     *   Затем при каждой итерации внешнего цикла метода сортировки интервал сокращается по формуле, обратной по отношению к приведенной.
     *   h = (h - 1)/3
     *   т.е. после 364-сотировки будет 121-сортировка, 40-сортировка, 13-сортировка и т.д.
     *
     *   Эффективность сортировки Шелла
     *   До настоящего момента еще никому не удавалось теоритически обосновать эффективность сортировки, не считая частных случаев.
     *   На разных наборах данных она составляет O(N^3/2), O(N(logN)^2), O(N^5/4), O(N^7/6)
     *
     */
    public static void shellSort(int[] array) {
        int inner, outer;
        int temp;

        int h = 1;
        // ищем начальное значение h
        while (h <= array.length / 3) {
            h = h * 3 + 1; // (1, 4, 13, 40, 121, ...)
        }

        while (h > 0) {
            //сдвигаемся на 1 шаг, для h-сортировки следующей группы элементов
            for (outer = h; outer < array.length; outer++) {
                temp = array[outer];
                inner = outer;
                //сортируем массив с шагом h
                while (inner > h - 1 && array[inner - h] >= temp) {
                    array[inner] = array[inner - h];
                    inner -= h;
                }
                array[inner] = temp;
            }
            //на каждом шаге уменьшаем h
            h = (h - 1) / 3;
        }
    }

    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(n*5);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        shellSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}