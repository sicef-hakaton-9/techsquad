package app.development.domain.company.model;

import app.development.domain.account.model.CompanyAccountDTO;

public record CompanyResponseDTO(

        Long id,
        String name,
        Long pib,
        String phone,
        String city,
        CompanyAccountDTO account

) {
}
