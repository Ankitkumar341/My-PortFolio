package model.dto.reqeust.payment;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.enums.PaymentStatus;

import java.math.BigDecimal;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PaymentCreateRequest {

    @NotNull(message = "User ID is required")
    private Long userId;

    @NotNull(message = "Amount is required")
    @DecimalMin(value = "0.01", message = "Amount must greater than 0")
    @Digits(integer = 17, fraction = 2, message = " maximum 17 digits before decimal and 2 after")
    private BigDecimal amount;

    @NotBlank(message = "Currency is required")
    @Size(min = 3, max = 3, message = "Currency  a 3-letter code")
    @Pattern(regexp = "^[A-Z]{3}$", message = "Currency  uppercase 3-letter code")
    private String currency;

    @NotBlank(message = "Transaction ID is required")
    @Size(min = 5, max = 100, message = "Transaction ID between 5 and 100 characters")
    private String transactionId;

    @NotNull(message = "Payment status is required")
    private PaymentStatus status;

    @Size(max = 50, message = "Payment method cannot exceed 50 characters")
    private String paymentMethod;
}
