package set;
/**
 * Пакет set содержит классы для создания коллекции 
 * уникальных элементов - множества.
 * Класс Set представляет собой основной класс, 
 * который используется для работы с множествами.
 * Он содержит метод main(), который инициализирует объект 
 * класса MySet с начальной емкостью 10.
 * Класс MySet представляет собой реализацию множества на основе хэш-таблицы. 
 * Он содержит методы для добавления,
 * удаления и проверки наличия элементов в множестве. Метод add() 
 * добавляет новый элемент в множество, но если элемент с таким
 * ключом уже существует, то его значение не изменится. Метод remove() 
 * удаляет элемент из множества, а метод contains()
 * проверяет, есть ли элемент с указанным ключом в множестве.
 * В этом примере мы создали множество строк и добавили в него две 
 * строки: "Hello" и "World". При попытке добавить
 * еще одну строку "Hello", она не добавится, так как такой элемент 
 * уже есть в множестве. Затем мы вывели размер 
 * множества (2) и проверили наличие элемента "World" с помощью метода 
 * contains(), который вернул true.
 */ 
public class Set {
    
public static void main(String[] args) {
MySet set = new MySet(10);
set.add("Hello");
set.add("World");
set.add("Hello"); // не добавится, так как уже есть в множестве
set.add("Hi!!!");
set.add("Hi!!!");
System.out.println(set.size()); // 2
System.out.println(set.contains("World")); // true
System.out.println(set.contains("Hi"));
    }
}