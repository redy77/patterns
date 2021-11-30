package prorotypeMain;

/**
 * @author Viktor Bakakin
 */
public class ProjectPrototype implements Copyable {
    private int id;
    private String name;
    private String sourceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSourceCode() {
        return sourceCode;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    public ProjectPrototype(int id, String name, String sourceCode) {
        this.id = id;
        this.name = name;
        this.sourceCode = sourceCode;
    }

    @Override
    public Object copy() {
        ProjectPrototype copy = new ProjectPrototype(id, name, sourceCode);
        return copy;
    }

    @Override
    public String toString() {
        return "ProjectPrototype{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sourceCode='" + sourceCode + '\'' +
                '}';
    }
}
