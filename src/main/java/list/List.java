package list;


/**
 * Интерфейс List содержит общие методы для всех списков.
 *
 * Для создания интерфейса используется ключевое слово interface вместо class.
 * Доступные модификаторы доступа для интерфейсов те же, что и для классов - public и по умолчанию.
 *
 * В интерфесах все методы абтрактные, а все поля - константы.
 *
 * Все не абстрактные классы, реализующие интерфейс обязательно содержат реализацию всех методов,
 * объявленных в интерфейсе.
 */
public interface List {
	/*
	 * Обратите внимание на синтаксис объявления абстрактных методов.
	 * Абстрактный метод состоит только из объявления и не имеет тела.
	 *
	 * Все методы интерфейса являются открытыми(public) и абстрактными(abstract).
	 *
	 * В Java при наследовании запрещается уменьшать уровень доступа, поэтому при реализации интрефейса
	 * его методы должны быть объявлены как public.
	 */

    /**
     * Метод получения значения элемента по индексу
     */
    Object get(int i);

    /**
     * Метод добавления элемента в конец списка
     */
    void add(Object o);

    /**
     * Метод получения размера списка
     */
    int getSize();

    /**
     * Метод удаления элемента по индексу
     */
    Object remove(int i);

    /**
     * Метод проверки, является ли список пустым
     *
     * @return true, если список пустой false - в противном случае
     */
    public boolean isEmpty();

}