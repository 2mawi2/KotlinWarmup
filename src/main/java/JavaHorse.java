import java.util.Objects;

public class JavaHorse {
    private HorseCategory category;
    private int size;

    public JavaHorse(HorseCategory category, int size) {
        this.category = category;
        this.size = size;
    }

    public JavaHorse(HorseCategory category) {
        this(category, 0);
    }

    public HorseCategory getCategory() {
        return category;
    }

    public void setCategory(HorseCategory category) {
        this.category = category;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JavaHorse javaHorse = (JavaHorse) o;
        return size == javaHorse.size &&
                category == javaHorse.category;
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, size);
    }

    @Override
    public String toString() {
        return "JavaHorse{" +
                "category=" + category +
                ", size=" + size +
                '}';
    }

    public JavaHorse copy(int size) {
        return new JavaHorse(this.category, size);
    }

    public JavaHorse copy(HorseCategory category) {
        return new JavaHorse(category, this.size);
    }

    public JavaHorse copy(HorseCategory category, int size) {
        return new JavaHorse(category, size);
    }
}
