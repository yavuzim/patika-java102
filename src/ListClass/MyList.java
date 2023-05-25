package ListClass;

public class MyList<T> {
    private int capacity;
    private int size;
    T[] values;
    private int index;

    public MyList() {
        this.capacity = 10;
        addListLength();
    }

    public MyList(int capacity) {
        this.capacity = capacity;
        addListLength();
    }

    private void addListLength() {
        this.values = (T[]) new Object[this.capacity];
        index = 0;
    }

    public int indexOf(T data) {
        int index = -1;
        for (int i = 0; i < this.getSize(); i++) {
            if (values[i].equals(data)) {
                index = i;
                break;
            }
        }
        return index;
    }

    int lastIndexOf(T data) {
        int index = -1;
        for (int i = 0; i < this.getSize(); i++) {
            if (values[i] == null) break;
            if (values[i].equals(data)) {
                index = i;
            }
        }
        return index;
    }

    public void add(T value) {
        if (this.index < this.getCapacity()) {
            this.values[this.index] = value;
        } else {
            System.out.println("Kapasite 2 Kat Arttırıldı!");
            incCapasiyt();
            this.values[this.index] = value;
        }
        this.index++;
    }

    public boolean isEmpty() {
        return this.getSize() == 0;
    }

    public void clear() {
        int size = this.getSize();
        for (int i = 0; i < size; i++) {
            this.values[i] = null;
        }
    }

    private void incCapasiyt() {
        T[] tempList = (T[]) new Object[this.getSize()];
        for (int i = 0; i < tempList.length; i++) {
            tempList[i] = this.values[i];
        }
        this.setCapacity(this.getCapacity() * 2);
        this.values = (T[]) new Object[this.getCapacity()];
        for (int i = 0; i < tempList.length; i++) {
            this.values[i] = tempList[i];
        }
    }

    public T getIndex(int index) {
        if (index >= this.getCapacity())
            return null;
        return this.values[index];
    }

    public T[] toArray() {
        int size = this.getSize();
        T[] array = (T[]) new Object[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = this.values[i];
        }
        return array;
    }

    public MyList<T> sublist(int start, int finish) {
        MyList<T> array = new MyList<T>(finish - start + 1);
        for (int i = start; i <= finish; i++) {
            array.add(this.values[i]);
        }
        return array;
    }

    public boolean contains(T data) {
        boolean isControl = false;
        for (int i = 0; i < this.getSize(); i++) {
            if(data.equals(this.values[i])) {
                isControl = true;
                break;
            }
        }
        return isControl;
    }

    public void remove(int index) {
        T[] temp = (T[]) new Object[this.getSize() - 1];
        temp = this.values;
        int j = 0;
        for (int i = 0; i < temp.length - 1; i++) {
            if (i < index)
                j = i;
            else
                j = i + 1;
            temp[i] = this.values[j];
        }
        this.index -= 1;
        this.values = temp;
    }

    public T set(int index, T data) {
        if (index >= this.getCapacity()) return null;
        else {
            this.values[index] = data;
        }
        return data;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getSize() {
        int size = 0;
        for (int i = 0; i < this.values.length; i++) {
            if (values[i] != null) size++;
        }
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        String out = "";
        int count = 0;
        out += "[ ";
        for (T value : this.values) {
            if (count < this.getCapacity() - 1)
                out += value + " , ";
            else out += value;
            count++;
        }
        out += " ]";
        System.out.println();
        return out;
    }
}
