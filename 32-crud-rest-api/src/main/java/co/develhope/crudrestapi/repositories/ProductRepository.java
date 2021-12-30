package co.develhope.crudrestapi.repositories;

import co.develhope.crudrestapi.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "repo-products", collectionResourceDescription = @Description("This is the description"), collectionResourceRel = "product", itemResourceDescription = @Description("Single item description"))
public interface ProductRepository extends JpaRepository<Product, Long> {
}
