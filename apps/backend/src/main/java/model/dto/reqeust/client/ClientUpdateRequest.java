package model.dto.reqeust.client;

import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClientUpdateRequest {

    @Size(min = 2, max = 100, message = "Client name  between 2 and 100 characters")
    private String name;

    @Pattern(regexp = "^(https?://)?([\\da-z.-]+)\\.([a-z.]{2,6})([/\\w .-]*)*/?$", 
             message = "Logo URL must be a valid URL")
    @Size(max = 500, message = "Logo URL cannot exceed 500 characters")
    private String logoUrl;

    @Pattern(regexp = "^(https?://)?([\\da-z.-]+)\\.([a-z.]{2,6})([/\\w .-]*)*/?$", 
             message = "Website URL a valid URL")
    @Size(max = 500, message = "Website URL cannot exceed 500 characters")
    private String websiteUrl;

    @Pattern(regexp = "")
    @Size(max = 1000, message = "Description cannot exceed 1000 characters")
    private String description;
}
