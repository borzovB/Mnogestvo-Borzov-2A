/**
 * Пакет set содержит классы для создания коллекции уникальных элементов - множества.
 */

package set;

/**
 * Класс MySet представляет собой реализацию множества на основе хэш-таблицы.
 */
public class MySet {

    private Object[] elements; // массив для хранения элементов множества
    private int size; // количество элементов в множестве

    /**
     * Конструктор класса, инициализирует массив элементов заданной емкости.
     *
     * @param capacity - емкость множества
     */
    public MySet(int capacity) {
        this.elements = new Object[capacity];
        this.size = 0;
    }

    /**
     * Метод добавления нового элемента в множество.
     *
     * @param element - добавляемый элемент
     * @return true, если элемент был успешно добавлен, false - если элемент уже есть в множестве или множество заполнено
     */
    public boolean add(Object element) {
        if (contains(element)) { // если элемент уже есть в множестве, не добавляем
            return false;
        }
        if (size == elements.length) { // если множество заполнено, не добавляем
            return false;
        }
        elements[size] = element; // добавляем элемент в множество
        size++; // увеличиваем количество элементов в множестве
        return true;
    }

    /**
     * Метод проверки наличия элемента в множестве.
     *
     * @param element - проверяемый элемент
     * @return true, если множество содержит элемент, false - в противном случае
     */
    public boolean contains(Object element) {
        for (int i = 0; i < size; i++) { // перебираем элементы множества
            if (elements[i].equals(element)) { // если элемент найден, возвращаем true
                return true;
            }
        }
        return false; // элемент не найден, возвращаем false
    }

    /**
     * Метод определения размера множества.
     *
     * @return количество элементов в множестве
     */
    public int size() {
        return size;
    }
}
