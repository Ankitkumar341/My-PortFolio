package model.dto.response.payment;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.enums.PaymentStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;

// Payment summary for transaction history
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PaymentListResponse {
    
    private Long id;
    private BigDecimal amount;
    private String currency;
    private PaymentStatus status;
    private String transactionId;
    private String userName;
    private LocalDateTime createdAt;
}
