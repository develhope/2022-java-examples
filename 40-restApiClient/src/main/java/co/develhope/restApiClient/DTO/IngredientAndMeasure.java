package co.develhope.restApiClient.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class IngredientAndMeasure {

    private String ingredient;
    private String measure;
}
