package com.workintech.inheritence.main;

import com.workintech.inheritence.company.*;

public class CompanyMain {
    public static void main(String[] args) {
        Employee asci=new Employee(6,"Murat",11500);
        JuniorDeveloper juniorDevelopers1=new JuniorDeveloper(2,"Taha");
        JuniorDeveloper juniorDevelopers2=new JuniorDeveloper(3,"Hilal");
        //JuniorDeveloper[] juniors=new JuniorDeveloper[]{juniorDevelopers1,juniorDevelopers2};

        MidDeveloper midDeveloper1=new MidDeveloper(2,"Mehmet");
        midDeveloper1.work();
        MidDeveloper midDeveloper2=new MidDeveloper(3,"Fatih");
midDeveloper2.work();
MidDeveloper[] mids=new MidDeveloper[]{midDeveloper1,midDeveloper2};
SeniorDeveloper seniorDeveloper1=new SeniorDeveloper(2,"Defne");

seniorDeveloper1.work();
        SeniorDeveloper[] seniors=new SeniorDeveloper[]{seniorDeveloper1};


        HRManager hrmanager=new HRManager(1,"Mustafa",
                new JuniorDeveloper[3],new MidDeveloper[2],new SeniorDeveloper[1]);
hrmanager.work();

    }
}
