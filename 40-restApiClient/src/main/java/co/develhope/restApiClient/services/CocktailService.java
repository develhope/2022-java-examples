package co.develhope.restApiClient.services;

import co.develhope.restApiClient.DTO.*;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class CocktailService {

    public static OptimizedDrinkDTO mapDink(SingleDrinkDTO singleDrink){
        if(singleDrink == null) return null;
        OptimizedDrinkDTO optimized = new OptimizedDrinkDTO();
        optimized.setIdDrink(singleDrink.getIdDrink());
        optimized.setStrDrink(singleDrink.getStrDrink());
        optimized.setStrDrinkAlternate(singleDrink.getStrDrinkAlternate());
        optimized.setStrTags(singleDrink.getStrTags());
        optimized.setStrVideo(singleDrink.getStrVideo());
        optimized.setStrCategory(singleDrink.getStrCategory());
        optimized.setStrIBA(singleDrink.getStrIBA());
        optimized.setStrAlcoholic(singleDrink.getStrAlcoholic());
        optimized.setStrGlass(singleDrink.getStrGlass());
        optimized.setStrDrinkThumb(singleDrink.getStrDrinkThumb());

        optimized.setStrImageSource(singleDrink.getStrImageSource());
        optimized.setStrImageAttribution(singleDrink.getStrImageAttribution());
        optimized.setStrCreativeCommonsConfirmed(singleDrink.getStrCreativeCommonsConfirmed());
        optimized.setDateModified(singleDrink.getDateModified());

        Map<String, String> instructions = new HashMap<>();
        if(singleDrink.getStrInstructions() != null){
            instructions.put("EN", singleDrink.getStrInstructions());
        }
        if(singleDrink.getStrInstructionsDE() != null){
            instructions.put("DE", singleDrink.getStrInstructionsDE());
        }
        if(singleDrink.getStrInstructionsES() != null){
            instructions.put("ES", singleDrink.getStrInstructionsES());
        }
        if(singleDrink.getStrInstructionsFR() != null){
            instructions.put("FR", singleDrink.getStrInstructionsFR());
        }
        if(singleDrink.getStrInstructionsIT() != null){
            instructions.put("IT", singleDrink.getStrInstructionsIT());
        }
        if(singleDrink.getStrInstructionsZH() != null){
            instructions.put("ZH", singleDrink.getStrInstructionsZH());
        }
        optimized.setInstructions(instructions);

        List<IngredientAndMeasure> ingredientsAndMeasure = new ArrayList<>();
        if(singleDrink.getStrIngredient1() != null){
            ingredientsAndMeasure.add(new IngredientAndMeasure(singleDrink.getStrIngredient1(), singleDrink.getStrMeasure1()));
        }
        if(singleDrink.getStrIngredient2() != null){
            ingredientsAndMeasure.add(new IngredientAndMeasure(singleDrink.getStrIngredient2(), singleDrink.getStrMeasure2()));
        }
        if(singleDrink.getStrIngredient3() != null){
            ingredientsAndMeasure.add(new IngredientAndMeasure(singleDrink.getStrIngredient3(), singleDrink.getStrMeasure3()));
        }
        if(singleDrink.getStrIngredient4() != null){
            ingredientsAndMeasure.add(new IngredientAndMeasure(singleDrink.getStrIngredient4(), singleDrink.getStrMeasure4()));
        }
        if(singleDrink.getStrIngredient5() != null){
            ingredientsAndMeasure.add(new IngredientAndMeasure(singleDrink.getStrIngredient5(), singleDrink.getStrMeasure5()));
        }
        if(singleDrink.getStrIngredient6() != null){
            ingredientsAndMeasure.add(new IngredientAndMeasure(singleDrink.getStrIngredient6(), singleDrink.getStrMeasure6()));
        }
        if(singleDrink.getStrIngredient7() != null){
            ingredientsAndMeasure.add(new IngredientAndMeasure(singleDrink.getStrIngredient7(), singleDrink.getStrMeasure7()));
        }
        if(singleDrink.getStrIngredient8() != null){
            ingredientsAndMeasure.add(new IngredientAndMeasure(singleDrink.getStrIngredient8(), singleDrink.getStrMeasure8()));
        }
        if(singleDrink.getStrIngredient9() != null){
            ingredientsAndMeasure.add(new IngredientAndMeasure(singleDrink.getStrIngredient9(), singleDrink.getStrMeasure9()));
        }
        if(singleDrink.getStrIngredient10() != null){
            ingredientsAndMeasure.add(new IngredientAndMeasure(singleDrink.getStrIngredient10(), singleDrink.getStrMeasure10()));
        }
        if(singleDrink.getStrIngredient11() != null){
            ingredientsAndMeasure.add(new IngredientAndMeasure(singleDrink.getStrIngredient11(), singleDrink.getStrMeasure11()));
        }
        if(singleDrink.getStrIngredient12() != null){
            ingredientsAndMeasure.add(new IngredientAndMeasure(singleDrink.getStrIngredient12(), singleDrink.getStrMeasure12()));
        }
        if(singleDrink.getStrIngredient13() != null){
            ingredientsAndMeasure.add(new IngredientAndMeasure(singleDrink.getStrIngredient13(), singleDrink.getStrMeasure13()));
        }
        if(singleDrink.getStrIngredient14() != null){
            ingredientsAndMeasure.add(new IngredientAndMeasure(singleDrink.getStrIngredient14(), singleDrink.getStrMeasure14()));
        }
        if(singleDrink.getStrIngredient15() != null){
            ingredientsAndMeasure.add(new IngredientAndMeasure(singleDrink.getStrIngredient15(), singleDrink.getStrMeasure15()));
        }

        optimized.setIngredients(ingredientsAndMeasure);
        return optimized;
    }

    private List<OptimizedDrinkDTO> getDetailedDrinks(List<FilterDrinksDTO> drinksOld){
        List<OptimizedDrinkDTO> output = new ArrayList<>(drinksOld.size());
        int size = drinksOld.size();
        for(int i = 0; i< size; i++){
            System.out.println("Working on cocktail: " + drinksOld.get(i).getIdDrink() + " - " + i + "/"+size);
            OptimizedDrinkDTO newDrink = getSingle(Long.parseLong(drinksOld.get(i).getIdDrink()));
            output.add(newDrink);
        }

        System.out.println("Finished");
        return output;
    }

    public List<OptimizedDrinkDTO> getByType() {
        RestTemplate template = new RestTemplate();
        ResponseEntity<DrinksDTO> response =  template.getForEntity("https://www.thecocktaildb.com/api/json/v1/1/search.php?s=margarita", DrinksDTO.class);
        List<SingleDrinkDTO> dto = response.getBody().getDrinks();
        List<OptimizedDrinkDTO> output = new ArrayList<>(dto.size());
        for(int i = 0; i< dto.size(); i++){
            output.add(mapDink(dto.get(i)));
        }
        return output;

    }

    public OptimizedDrinkDTO getSingle(long drinkId) {
        RestTemplate template = new RestTemplate();
        ResponseEntity<DrinksDTO> response =  template.getForEntity("https://www.thecocktaildb.com/api/json/v1/1/lookup.php?i="+drinkId, DrinksDTO.class);
        SingleDrinkDTO oldSingleDrink = response.getBody().getDrinks().get(0);
        return mapDink(oldSingleDrink);
    }

    private List<OptimizedDrinkDTO> getBy(String value, String key) {
        RestTemplate template = new RestTemplate();
        ResponseEntity<FilterDrinksPayloadDTO> response =  template.getForEntity("https://www.thecocktaildb.com/api/json/v1/1/filter.php?"+key+"="+value, FilterDrinksPayloadDTO.class);
        return getDetailedDrinks(response.getBody().getDrinks());
    }

    public List<OptimizedDrinkDTO> getAlcholic(boolean isAlcholic) {
        return getBy(isAlcholic ? "Alcoholic" : "Non_Alcoholic", "a");
    }

    public List<OptimizedDrinkDTO> getByCategory(String category) {
        return getBy(category, "c");
    }

    public List<OptimizedDrinkDTO> getByGlass(String glass) {
        return getBy(glass, "g");
    }
}
