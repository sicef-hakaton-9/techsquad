package app.development.domain.account.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public record CompanyAccountDTO(

        Long id,

        //   @Email(message = "Not valid email, email should be email@example.com")
        //  @NotBlank(message = "Email can't be blank")
        String email,

        @JsonInclude(JsonInclude.Include.NON_NULL)
        //  @ValidPassword
        String password,

        //  @NotNull(message = "Role id can't be blank")
        Long roleId

) {
}
