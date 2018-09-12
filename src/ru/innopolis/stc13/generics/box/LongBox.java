package ru.innopolis.stc13.generics.box;

public class LongBox {
    private Long value;

    public LongBox(Long value) {
        this.value = value;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }
}
