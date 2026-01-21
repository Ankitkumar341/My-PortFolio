package mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ClientMapper {
    
    // ClientDTO toDTO(Client client);
    // Client toEntity(ClientDTO dto);
    // List<ClientDTO> toDTOList(List<Client> clients);
    
}
