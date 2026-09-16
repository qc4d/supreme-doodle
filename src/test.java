import com.Collection.MyArrayList;

public class test {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        int a=list.get(1);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(5,3);
        System.out.println(a);
        for (int i = 0; i < 12; i++) System.out.print(list.get(i) + " ");
// 期望：1 2 3 4 5 3 6 7 8 9 10 11  ← 3 插在 5 后面

    }
}
