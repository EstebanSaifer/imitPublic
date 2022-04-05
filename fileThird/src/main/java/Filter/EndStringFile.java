package Filter;

public class EndStringFile implements Filter{

    private String pattern;

    public EndStringFile(String str) {
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
        return str.endsWith(pattern);
    }
}
