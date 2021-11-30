package prorotypeMain;

/**
 * @author Viktor Bakakin
 */
public class ProjectPrototypeFactory {
    ProjectPrototype projectPrototype;

    public ProjectPrototypeFactory(ProjectPrototype projectPrototype) {
        this.projectPrototype = projectPrototype;
    }

    public void setProjectPrototype(ProjectPrototype projectPrototype) {
        this.projectPrototype = projectPrototype;
    }

    ProjectPrototype cloneProject(){
        return (ProjectPrototype) projectPrototype.copy();
    }
}
