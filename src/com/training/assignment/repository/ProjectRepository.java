package com.training.assignment.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.training.assignment.model.Employee;
import com.training.assignment.model.Project;

public class ProjectRepository {
	private static Map<Integer, Project> projectData = new HashMap<>();

    public List<Project> fetchAll() {
        return new ArrayList<>(projectData.values());
    }

	 public void save(Project project) {
	        projectData.put(project.getUniqueIdentifier(), project);
	    }
}
