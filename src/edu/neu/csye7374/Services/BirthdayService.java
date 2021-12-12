package edu.neu.csye7374.Services;

import edu.neu.csye7374.Person.Person;

import java.util.Date;
import java.util.List;

public class BirthdayService {
    public void notifyBirthday(List<Person> masterList){
        for(Person person : masterList){
            if(person.getDateOfBirth().equals(new Date())){
                // Send notification
            }
        }
    }
}
