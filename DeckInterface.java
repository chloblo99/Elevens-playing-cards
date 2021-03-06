public interface DeckInterface<T> {

    public int getCurrentSize();

    public boolean isEmpty();

    public boolean addNewEntry(Card newEntry);

    public boolean remove(T anEntry);

    public void clear();

    public int getFrequencyOf(T anEntry);

    public boolean contains(T anEntry);

    public T[] toArray();

    public void display();

}
