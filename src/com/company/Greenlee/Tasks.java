package com.company.Greenlee;

import java.util.Comparator;

public class Tasks {
    private String title;
    private String description;
    private int priority;

    public Tasks(String title, String description, int priority) {
        this.title = title;
        this.description = description;
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Task: " + title + ", Description: " + description + ", Priority: " + priority;
    }
}

// Chained Comparators
// Could not find a way to handle both different comparators in the one main class. Had to use two separate classes
// that each could handle one of the comparators since it's possible to return only one statement in the compare method.

// Class Title sorts things starting with A-Z(Uppercase) then a-z(Lowercase).
class Title implements Comparator<Tasks> {
    @Override
    public int compare(Tasks o1, Tasks o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}

// Class Priority reverse sorts priorities from greatest to lowest.
class Priority implements Comparator<Tasks> {
    @Override
    public int compare(Tasks o1, Tasks o2) {
        return o2.getPriority() - o1.getPriority();
    }
}
