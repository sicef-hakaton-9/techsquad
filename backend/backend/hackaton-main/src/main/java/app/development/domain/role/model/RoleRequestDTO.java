package app.development.domain.role.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public record RoleRequestDTO(

        @NotNull(message = "Role id can't be null!")
        Long id,

        @NotBlank(message = "String name can't be blank!")
        String name

) {
}
