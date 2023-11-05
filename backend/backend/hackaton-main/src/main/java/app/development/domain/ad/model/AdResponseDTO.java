package app.development.domain.ad.model;

import java.time.LocalDate;

public record AdResponseDTO(

        Long id,
        String description,
        String category,
        LocalDate date,
        Long companyId

) {
}
