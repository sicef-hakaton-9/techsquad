package app.development.infrastructure.security.model;

import javax.validation.constraints.NotBlank;

public record LoginRequestDTO(

        @NotBlank
        String email,

      //  @ValidPassword
        String password

) {
}
