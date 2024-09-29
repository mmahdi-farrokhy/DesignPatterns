package Composite.ProjectManagement;

import java.util.ArrayList;
import java.util.List;

public class Project {
    private List<ProjectComponent> projectComponents;

    public void addProjectComponent(ProjectComponent projectComponent) {
        if (projectComponents == null) {
            projectComponents = new ArrayList<>();
        }

        projectComponents.add(projectComponent);
    }

    public void done(int index) {
        projectComponents.get(index).done();
    }

    public void delete(int index) {
        projectComponents.get(index).delete();
    }

    public void duplicate(int index) {
        projectComponents.get(index).duplicate();
    }

    public void move(int index) {
        projectComponents.get(index).move();
    }
}
