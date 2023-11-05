package app.development.domain.company.model;

import app.development.domain.account.model.CompanyAccountDTO;

import java.util.List;

public record CompanyRequestDTO(

        String name,
        Long pib,
        String phone,
        String type,
        String city,
        CompanyAccountDTO account,
        List<Long> adIds
) {
}
