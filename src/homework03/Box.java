package homework03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Box<T extends Fruit> {

    private List<T> list;

    public List<T> getListOfFruits() {
        return list;
    }

    public Box(T... obj) {
        list = Arrays.asList(obj);
    }

    public Box() {
        list = new ArrayList<T>();
    }

    void addFruits(T obj) {
        list.add(obj);
    }

    void moveAtAnotherBox(Box<T> box) {
        box.getListOfFruits().addAll(list);
        list.clear();
    }

    void infoAboutBox() {
        if (list.isEmpty()) {
            System.out.println("Коробка пуста");
        } else {
            System.out.println("В коробке находятся " + list.get(0).toString() + " в количестве: " + list.size());
        }
    }

    float getWeight() {
        if (list.isEmpty()) {
            return 0;
        } else {
            return list.size() * list.get(0).getWeight();
        }
    }

    boolean compare(Box<? extends Fruit> box) {
        return this.getWeight() == box.getWeight();
    }


}