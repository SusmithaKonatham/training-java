package com.training.assignment.service;

import com.training.assignment.framework.Menu;
import com.training.assignment.framework.MenuItem;
import com.training.assignment.framework.MenuProvider;
import com.training.assignment.model.Employee;
import com.training.assignment.model.Project;
import com.training.assignment.repository.EmployeeRepository;
import com.training.assignment.repository.ProjectRepository;

public class ProjectService implements MenuProvider {
	private ProjectRepository projectRepository = new ProjectRepository();
    public int createProject(String projectName, String projectTechnology, String projectDuration) 
    {
    	final int uniqueIdentifier = ProjectIDGenerator.generateID();
        Project project = new Project(projectName, projectTechnology, uniqueIdentifier, projectDuration);
        projectRepository.save(project);
        return uniqueIdentifier;
    }

    public void updateProject(String projectId) {

    }

    public void deleteProject(String projectId) {

    }

    public void listProject() {

    }

    @Override
    public Menu showMenu() {
        return new Menu("Project", new MenuItem("Create Project", 1),
                new MenuItem("Update Project", 2),
                new MenuItem("Delete Project", 3),
                new MenuItem("List Project", 4));
    }
}
