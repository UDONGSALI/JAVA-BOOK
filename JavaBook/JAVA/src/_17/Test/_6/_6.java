package _17.Test._6;

import java.util.HashSet;
import java.util.Set;

class  Data{
    int m;
    public Data(int m) {
        this.m = m;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Data){
            return this.m == ((Data)obj).m;
        }else {
            return false;
        }
    }

    @Override
    public int hashCode() {

        return m;
    }
}

public class _6 {
    public static void main(String[] args) {
        Set<Data> set =new HashSet<>();
        set.add(new Data(2));
        set.add(new Data(2));
        set.add(new Data(3));
        System.out.println(set.size());
    }
}
