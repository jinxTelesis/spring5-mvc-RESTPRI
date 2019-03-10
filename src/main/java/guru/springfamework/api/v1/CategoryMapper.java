package guru.springfamework.api.v1;

import guru.springfamework.api.v1.model.CategoryDTO;
import guru.springfamework.domain.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper {

    // == not sure about this code ==
    CategoryMapper INSTANCE = Mappers.getMapperClass(CategoryMapper.class);


    CategoryDTO categoryToCategoryDTO(Category category);
}
