package app.development.domain.ad.model;

import java.time.LocalDate;

public record AdRequestDTO(

        String description,
        String category,
        LocalDate date,
        Long companyId

) {
}
