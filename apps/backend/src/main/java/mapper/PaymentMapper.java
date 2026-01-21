package mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PaymentMapper {
    
    // PaymentDTO toDTO(Payment payment);
    // Payment toEntity(PaymentDTO dto);
    // List<PaymentDTO> toDTOList(List<Payment> payments);
    
}
