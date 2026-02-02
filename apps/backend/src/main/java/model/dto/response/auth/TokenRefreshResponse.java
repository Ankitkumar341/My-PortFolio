package model.dto.response.auth;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// New access token after refresh
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TokenRefreshResponse {
    
    private String accessToken;
    private String tokenType = "Bearer";
}
