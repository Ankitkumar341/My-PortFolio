package mapper;

import model.dto.reqeust.payment.PaymentCreateRequest;
import model.dto.response.payment.PaymentListResponse;
import model.dto.response.payment.PaymentResponse;
import model.entity.Payment;
import org.mapstruct.*;

import java.util.List;

@Mapper(
    componentModel = MappingConstants.ComponentModel.SPRING,
    unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface PaymentMapper {
    
    @Mapping(target = "userId", source = "user.id")
    @Mapping(target = "userName", source = "user.userName")
    PaymentResponse toResponse(Payment payment);
    
    @Mapping(target = "userName", source = "user.userName")
    PaymentListResponse toListResponse(Payment payment);
    
    List<PaymentResponse> toResponseList(List<Payment> payments);
    List<PaymentListResponse> toListResponseList(List<Payment> payments);
    
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "user", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    Payment toEntity(PaymentCreateRequest request);
}
