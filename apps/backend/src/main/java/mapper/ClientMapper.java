package mapper;

import model.dto.reqeust.client.ClientCreateRequest;
import model.dto.reqeust.client.ClientUpdateRequest;
import model.dto.response.client.ClientListResponse;
import model.dto.response.client.ClientResponse;
import model.entity.Client;
import org.mapstruct.*;

import java.util.List;

@Mapper(
    componentModel = MappingConstants.ComponentModel.SPRING,
    unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface ClientMapper {
    
    @Mapping(target = "projectCount", expression = "java(client.getProjects() != null ? client.getProjects().size() : 0)")
    ClientResponse toResponse(Client client);
    
    @Mapping(target = "projectCount", expression = "java(client.getProjects() != null ? client.getProjects().size() : 0)")
    ClientListResponse toListResponse(Client client);
    
    List<ClientResponse> toResponseList(List<Client> clients);
    List<ClientListResponse> toListResponseList(List<Client> clients);
    
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "projects", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    Client toEntity(ClientCreateRequest request);
    
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "projects", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    void updateEntity(ClientUpdateRequest request, @MappingTarget Client client);
}
