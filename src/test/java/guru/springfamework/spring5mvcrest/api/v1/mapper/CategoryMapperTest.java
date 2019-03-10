package guru.springfamework.spring5mvcrest.api.v1.mapper;

import guru.springfamework.api.v1.CategoryMapper;
import guru.springfamework.api.v1.model.CategoryDTO;
import guru.springfamework.domain.Category;

import static org.junit.Assert.assertEquals;

public class CategoryMapperTest {

        CategoryMapper categoryMapper = CategoryMapper.INSTANCE;

        public void categoryToCategoryDTO() throws Exception{

            //given
            Category category = new Category();
            category.setName("Joe");
            category.setId(1L);

            //when
            CategoryDTO categoryDTO = categoryMapper.categoryToCategoryDTO(category);

            //then
            assertEquals(Long.valueOf(1L), categoryDTO.getId());
            assertEquals("Joe",categoryDTO.getName());




        }



}
