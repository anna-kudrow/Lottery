import java.util.Comparator;

public class ToyComparator implements Comparator<Toy> {
    private Sort sort;

    public ToyComparator(Sort sortType) {
        this.sort = sortType;
    }
    @Override
    public int compare(Toy t1, Toy t2) {

        return sort == Sort.Ascending ? Integer.compare(t1.getWeight(), t2.getWeight()) :
                Integer.compare(t2.getWeight(), t1.getWeight());
    }
}