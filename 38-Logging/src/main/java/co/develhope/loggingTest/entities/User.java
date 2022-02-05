package co.develhope.loggingTest.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
public class User {

    private String name, surname, paceOfBirth;
}
