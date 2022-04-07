package Filter;

public class ContainsStringFiller implements Filter{
    private String pattern;

    public ContainsStringFiller(String str) {
        this.pattern = str;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public boolean apply(String str) {
        return str.contains(pattern);
    }
}
