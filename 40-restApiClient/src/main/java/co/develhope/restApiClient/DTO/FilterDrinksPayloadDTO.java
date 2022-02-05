package co.develhope.restApiClient.DTO;

import lombok.Data;

import java.util.List;

@Data
public class FilterDrinksPayloadDTO {

    private List<FilterDrinksDTO> drinks;
}
