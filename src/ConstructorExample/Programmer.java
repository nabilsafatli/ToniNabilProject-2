package ConstructorExample;

import java.util.ArrayList;
import java.util.List;

public class Programmer {

    String name;
    int yearsOfExperience;

    List<String> programmingLanguages = new ArrayList<>();
    // Whats the difference between ArrayList and List


    public Programmer(String name, int yearsOfExperience){

        this.name = name;
        this.yearsOfExperience = yearsOfExperience;

    }

    public void addLanguages(String language){

        programmingLanguages.add(language);
    }

    public void listExperience(){

        for(int i = 0; i<programmingLanguages.size(); i++){

            System.out.println(programmingLanguages.get(i));

        }
    }

    public static void main(String[] args){

        Programmer testPerson = new Programmer("Nabil",5);

        testPerson.addLanguages("Java");
        testPerson.addLanguages("Python");
        testPerson.addLanguages(".Net");

        testPerson.listExperience();

    }


}
