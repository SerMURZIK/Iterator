import java.util.Iterator;

public class Randoms implements Iterable<Object> {
    private int min;
    private int max;
    private int[] numbers;

    public Randoms(int min, int max) {
        max++;
        IteratorRandom iteratorRandom = new IteratorRandom();
        this.max = max;
        this.min = min;
        numbers = new int[max - min];
        for (int i = 0; i < this.max - this.min; i++) {
            numbers[i] = (int) iteratorRandom.next();
        }
    }

    public int[] getNumbers() {
        return numbers;
    }

    @Override
    public Iterator<Object> iterator() {
        return null;
    }

    class IteratorRandom implements Iterator {

        @Override
        public boolean hasNext() {
            return min < max;
        }

        @Override
        public Object next() {
            return (int) (Math.random() * (max - min)) + min;
        }
    }
}