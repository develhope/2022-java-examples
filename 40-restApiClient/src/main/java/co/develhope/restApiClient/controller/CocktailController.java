package co.develhope.restApiClient.controller;

import co.develhope.restApiClient.DTO.OptimizedDrinkDTO;
import co.develhope.restApiClient.DTO.SingleDrinkDTO;
import co.develhope.restApiClient.services.CocktailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cocktail")
public class CocktailController {

    @Autowired
    public CocktailService cocktailService;

    @GetMapping("/alcholic")
    public List<OptimizedDrinkDTO> getAlcholicCocktail(){
        return cocktailService.getAlcholic(true);
    }

    @GetMapping("/not-alcholc")
    public List<OptimizedDrinkDTO> getNotAlcholicCocktail(){
        return cocktailService.getAlcholic(false);
    }

    @GetMapping("/category-filter")
    public List<OptimizedDrinkDTO> getByCategory(@RequestParam String category){
        return cocktailService.getByCategory(category);
    }

    @GetMapping("/glass-filter")
    public List<OptimizedDrinkDTO> getByGlass(@RequestParam String glass){
        return cocktailService.getByGlass(glass);
    }
}
