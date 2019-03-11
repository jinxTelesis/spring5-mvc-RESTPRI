package guru.springfamework.api.model;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class CategoryListDTO {

    List<CategoryDTO> catgories;

}
