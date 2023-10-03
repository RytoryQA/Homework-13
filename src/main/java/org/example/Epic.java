package org.example;

import java.util.Arrays;

public class Epic extends Task {
    protected String[] subtasks;

    public Epic(int id, String[] subtasks) {
        super(id);
        this.subtasks = subtasks;
    }

    @Override
    public boolean matches(String query) {

        boolean result = false;

        for (int i = 0; i < subtasks.length; i++) {
            if (subtasks[i].contains(query)) {
                result = true;
            }
        }
        return result;
    }

    public String[] getSubtasks() {
        return subtasks;
    }
}
