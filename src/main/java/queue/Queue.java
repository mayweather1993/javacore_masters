package queue;

import java.util.NoSuchElementException;

/* Очередь - это структура данных, в которой первым извлекается элемент, вставленный первым(FIFO, First-In-First-Out).
 * Сравните со стеком, где первым извлекается элемент, вставленный последним (LIFO).
 * Очередь работает по тому же принципу, что и очередь в магазине: человек, первым вставший в очередь, обслуживается первым.
 * Человек, последним вставший в очередь, обслуживается последним.
 * */
public interface Queue {
    /**
     * Добавление нового элемента в очередь.
     * @return true, если удалось вставить новый элемент, false - в противном случае
     */
    boolean offer(Object e);

    /**
     * Добавление нового элемента в очередь.
     * @return true, если удалось вставить новый элемент, false - в противном случае
     * @throws IllegalStateException - если очередь полная
     */
    boolean add(Object e);

    /**
     * Извлечение элемента в начале очереди c удалением из очереди.
     * @return Возвращает удаленный элемент, либо null, если очередь пуста.
     */
    Object poll();

    /**
     * Извлечение элемента в начале очереди c удалением из очереди.
     * @return Возвращает удаленный элемент.
     * @throws NoSuchElementException, если очередь пуста.
     */
    Object remove();

    /**
     * Чтение элемента в начале очереди
     * @return Возвращает первый элемент очереди, либо null, если очередь пуста.
     */
    Object peek();

    /**
     * @return Размер очереди
     */
    int size();

    /**
     * @return true, если очередь пуста, false - в противном случае
     */
    boolean isEmpty();

    /**
     * @return true, если количество элементов в очереди равно максимальному,
     * false - в противном случае
     */
    boolean isFull();
}