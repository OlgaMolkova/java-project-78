package hexlet.code.schemas;

public final class NumberSchema<T> extends BaseSchema {
    public NumberSchema<T> required() {
        addPredicate("required", n -> n != null);
        required = true;
        return this;
    }
    public NumberSchema<T> positive() {
        addPredicate("positive", n -> ((Integer) n).intValue() > 0);
        return this;
    }
    public NumberSchema<T> range(int min, int max) {
        addPredicate("range", n -> ((Integer) n).intValue() >= min && ((Integer) n).intValue() <= max);
        return this;
    }
}
