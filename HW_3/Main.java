package HW_3;

// Реализовать класс работающий по принципу HashMap. Включая внутренний массив узлов с индексацией по хешу и описание узла. 
// Добавить в класс методы:
// Object put(Integer key , Integer value) добавить элемент
// Object get(Integer key) получить значение соответствующее ключу
// Object remove(Integer key) удалить элемент с соответствующем ключём
// Object replays(Integer key, Integer v) заменить значение
// int size() количество элементов
// boolean containsKey(Integer key) проверка наличия ключа
// boolean containsValue(Integer v) проверка наличия значения

public class Main {
    public static void main(String[] args) {
        Mapa<Integer, String> mapa = new Mapa<>();
        mapa.put(0, "a");
        mapa.put(1, "b");
        mapa.put(2, "c");
        mapa.put(3, "d");
        mapa.put(4, "e");
        mapa.put(5, "f");

        System.out.println("Удаление:");
        System.out.println(mapa.get(2));
        mapa.remove(2);
        System.out.println(mapa.get(2));

        System.out.println("Замена:");
        System.out.println(mapa.get(1));
        mapa.replace(1, "Z");
        System.out.println(mapa.get(1));

        System.out.println("Размер - " + mapa.size());

        System.out.println("Есть ли ключ:");
        System.out.println(mapa.containsKey(4));
        System.out.println(mapa.containsKey(7));

        System.out.println("Есть ли значение:");
        System.out.println(mapa.containsValue("f"));
        System.out.println(mapa.containsValue("X"));
    }
}
