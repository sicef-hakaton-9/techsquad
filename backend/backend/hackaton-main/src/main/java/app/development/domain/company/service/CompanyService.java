package app.development.domain.company.service;

import app.development.domain.ad.entity.Ad;
import app.development.domain.ad.model.AdResponseDTO;
import app.development.domain.company.entity.Company;
import app.development.domain.company.model.CompanyRequestDTO;
import app.development.domain.company.model.CompanyResponseDTO;
import app.development.domain.company.model.CompanyUpdateDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CompanyService {
    CompanyResponseDTO createCompany(CompanyRequestDTO companyRequestDTO);

    CompanyResponseDTO getCompanyById(Long id);

    Page<CompanyResponseDTO> getAllCompanies(Pageable pageable);

    CompanyResponseDTO companyUpdate(Long id, CompanyUpdateDTO entity);

    Company getById(Long id);

    List<Ad> getAllAdsByCompanyId(Long id);
}
