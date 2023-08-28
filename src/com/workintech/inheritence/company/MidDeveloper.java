package com.workintech.inheritence.company;

public class MidDeveloper extends Employee{
    public MidDeveloper(long id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
      setSalary(35000);
        System.out.println(getName()+" mid developer begins to work.");
    }
}
