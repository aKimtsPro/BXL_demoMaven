package bxl.formation;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface PersonMapper {

    @Mapping(source = "nom", target = "name")
    PersonDTO entityToDTO(Person entity);
    @Mapping(source = "name", target = "nom")
    Person DTOToEntity(PersonDTO dto);

}
