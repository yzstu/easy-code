package cn.yzstu.metadata;

/**
 * @author Baldwin
 */
public class FieldData {
    private long modifier;
    /** Type */
    private Class<?> type;
    private String name;
    private ObjectData value;

    public FieldData(long modifier, Class<?> clazz, String name, ObjectData value) {
        this.modifier = modifier;
        this.type = clazz;
        this.name = name;
        this.value = value;
    }

    public long getModifier() {
        return modifier;
    }

    public Class<?> getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public ObjectData getValue() {
        return value;
    }
}
