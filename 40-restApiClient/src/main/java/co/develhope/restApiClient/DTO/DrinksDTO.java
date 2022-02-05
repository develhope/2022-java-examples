package co.develhope.restApiClient.DTO;

import lombok.Data;

import java.util.List;

@Data
public class DrinksDTO {

    List<SingleDrinkDTO> drinks;
}
