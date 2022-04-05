package Filter;

public class BeginStringFilter implements Filter{
    private String pattern;

    public BeginStringFilter(String str) {
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
        return str.startsWith(pattern);
    }
}
