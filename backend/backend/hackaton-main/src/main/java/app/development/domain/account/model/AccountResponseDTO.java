package app.development.domain.account.model;

import app.development.domain.role.model.RoleRequestDTO;

public record AccountResponseDTO(

        Long id,
        String email,
        RoleRequestDTO role

) {
}
