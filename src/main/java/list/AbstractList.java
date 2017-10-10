package list;

/**
 * Абстрактный класс AbstractList содержит общие поля и методы для обоих списков.
 * <p>
 * Модификатор доступа public указывается перед словом class и указывает на то,
 * что этот класс будет доступен всем пользователям. Имя public класса должно совпадать с именем файла.
 * В каждом файле может быть только один public класс(не считая внутренние классы).
 * В одном файле может содержаться сколько угодно классов с доступом по умолчанию(в пределах пакета),
 * но лучше создавать каждый класс в отдельном файле с названием соответствующим названию класса,
 * это удобнее для разработчиков - легко найти соответствующий класс,
 * и не возникнет проблем с загрузкой классов.
 * <p>
 * Класс нельзя сделать private(это не имеет смысла,
 * поскольку в противном случае его никто не сможет использовать) или protected.
 * Но это не относится к внутренним(inner) классам.
 * <p>
 * Ключевое слово abstract указывает на то, что класс абстрактный.
 * Абстрактный класс - это класс, содержащий абстрактные методы.
 * AbstractList реализует интерфейс List, но при этом в нем не определена реализация
 * абстрактных методов get(int i), add(Object o) и remove(int i)
 * Реализацию этих методов мы хотим оставить классам-потомкам, поэтому мы сделали этот класс абстрактным.
 * <p>
 * Экземпляр абстрактного класса создать нельзя, можно создавать только экземпляры тех классов,
 * в которых определена реализация всех методов.
 * Т. е. запись AbstractList list = new AbstractList(); работать не будет
 * Корректная запись AbstractList list = new ArrayList();  - создаем экземпляр класса ArrayList, а не AbstractList.
 */
public abstract class AbstractList extends List {
    /**
     * Количество заполненных элементов списка
     * <p>
     * Поле size класса AbstractList Модификатор доступа protected предоставляет
     * доступ в пределах пакета и в производных классах.
     */
    protected int size;

    /**
     * Метод получения размера списка
     */
    public int getSize() {
        return size;
    }

    /**
     * Метод проверки, является ли список пустым
     *
     * @return true, если список пустой false - в противном случае
     */
    public boolean isEmpty() {
        return size == 0;
    }

}