package string;

public class BigString {

    private int length;

    private String value;

    public BigString(int length, String value) {
        this.length = length;
        this.value = value;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
