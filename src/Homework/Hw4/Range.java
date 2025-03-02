package Homework.Hw4;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Range implements Iterable<Integer> {
    private int start, stop, step;

    public Range(int start, int stop, int step) {

        if (start > stop) {
            throw new IllegalArgumentException();
        }
        if (step == 0) {
            throw new IllegalArgumentException();
        }
        this.start = start;
        this.stop = stop;
        this.step = step;

    }

    public Range(int start, int stop) {
        this(start, stop, 1);
    }

    public Range(int stop) {
        this(0, stop, 1);
    }


    @Override
    public Iterator<Integer> iterator() {
        return new RangeIterator();
    }

    private class RangeIterator implements Iterator<Integer> {
        int current = start;

        @Override
        public boolean hasNext() {
            return current < stop;
        }

        @Override
        public Integer next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int onStage = current;
            current += step;
            return onStage;
        }
    }

    public static void main(String[] args) {
        Range r = new Range(1,100,3);

        Iterator<Integer> it = r.iterator();



    }
}
