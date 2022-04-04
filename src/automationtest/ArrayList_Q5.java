package automationtest;

import java.util.ArrayList;

public class ArrayList_Q5 {

    public static void main(String[] args) {

        ArrayList<String> teamList = new ArrayList();
        teamList.add("Scrum");
        teamList.add("Java");
        teamList.add("Jira");
        teamList.add("Selenium");
        teamList.add("Cucumber");
        teamList.add("Postman");
        teamList.add("Rest Assured");

        for (String teamName : teamList) ;
        System.out.println(teamList);


    }


}
