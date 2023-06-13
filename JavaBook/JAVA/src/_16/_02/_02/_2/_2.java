package _16._02._02._2;

class KeyValue<K, V>{
    private K key;
    private V value;
    public  K getKey(){
        return key;
    }
    public void setKey(K key){
        this.key = key;
    }
    public  V getValue(){
        return value;
    }
    public void setValue(V value){
        this.value = value;
    }

}

public class _2 {
    public static void main(String[] args) {
        KeyValue<String, Integer> kv1 = new KeyValue<>();
        kv1.setKey("사과");
        kv1.setValue(1000);
        System.out.println("key" + kv1.getKey() + "value" + kv1.getValue());

    }
}

    