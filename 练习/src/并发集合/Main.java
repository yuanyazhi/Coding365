package 并发集合;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {
        // 读多写少时用并发集合
        // 同步 HashMap , Hashtable , HashSet , Vector , ArrayList
        // 并发 ConcurrentHashMap , CopyOnWriteArrayList , CopyOnWriteHashSet
        ConcurrentHashMap<Integer, Integer> cmap = new ConcurrentHashMap<>();
        cmap.put(1,1); // 分段锁实现，多线程
        CopyOnWriteArrayList<Integer> clist = new CopyOnWriteArrayList<>();
        clist.add(2); // 多个线程非同步的读，有线程x写的时候复制list的副本给x
    }
}
