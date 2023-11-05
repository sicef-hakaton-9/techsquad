package app.development.infrastructure.mapper;

import app.development.domain.company.entity.Company;
import app.development.domain.company.model.CompanyRequestDTO;
import app.development.domain.company.model.CompanyResponseDTO;
import app.development.domain.company.model.CompanyUpdateDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface CompanyMapper {

    @Mapping(source = "account", target = "account")
    @Mapping(source = "account.roleId", target = "account.role.id")
    Company toCompany(CompanyRequestDTO companyRequestDTO);

    @Mapping(source = "account.role.id", target = "account.roleId")
    CompanyResponseDTO toCompanyResponseDTO(Company company);

    void updateEmployeeFromDTO(CompanyUpdateDTO entity,  @MappingTarget Company currentCompany);
}
