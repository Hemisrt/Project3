package com.company.Greenlee;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class TaskList implements Iterable<Tasks> {
    public static List<Tasks> merge = new ArrayList<>();

    @Override
    public Iterator<Tasks> iterator() {
        return this.merge.iterator();
    }
}
