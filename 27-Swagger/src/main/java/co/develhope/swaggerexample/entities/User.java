package co.develhope.swaggerexample.entities;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @ApiModelProperty(value = "The first name of the user", example = "John")
    private String firstName;
    @ApiModelProperty(value = "The last name of the user", example = "Doe")
    private String lastName;
    @ApiModelProperty(value = "The city of the user", example = "York")
    private String city;
    @ApiModelProperty(value = "The Place of birth of the user", example = "Milan")
    private String placeOfBirth;
}
