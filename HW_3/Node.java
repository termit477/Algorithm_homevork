package HW_3;

public class Node<K, V> {
    K key;
    V value;
    Node<K, V> nextNode;

    public Node (K key, V value){
        this.key = key;
        this.value = value;
    }
}