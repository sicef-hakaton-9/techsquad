package app.development.infrastructure.mapper;

import app.development.domain.ad.entity.Ad;
import app.development.domain.ad.model.AdRequestDTO;
import app.development.domain.ad.model.AdResponseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AdMapper {

    Ad toAd(AdRequestDTO adRequestDTO);

    @Mapping(source = "company.id", target = "companyId")
    AdResponseDTO toAdResponseDTO(Ad ad);


}
