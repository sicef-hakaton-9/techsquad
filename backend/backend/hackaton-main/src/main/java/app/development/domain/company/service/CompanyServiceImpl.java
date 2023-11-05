package app.development.domain.company.service;

import app.development.domain.ad.entity.Ad;
import app.development.domain.ad.model.AdResponseDTO;
import app.development.domain.ad.repository.AdRepository;
import app.development.domain.company.entity.Company;
import app.development.domain.company.model.CompanyRequestDTO;
import app.development.domain.company.model.CompanyResponseDTO;
import app.development.domain.company.model.CompanyUpdateDTO;
import app.development.domain.company.repository.CompanyRepository;
import app.development.infrastructure.exception.exceptions.NotFoundException;
import app.development.infrastructure.mapper.CompanyMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CompanyServiceImpl implements CompanyService {

    private final CompanyRepository companyRepository;
    private final CompanyMapper companyMapper;
    private final AdRepository adRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository, CompanyMapper companyMapper, AdRepository adRepository) {
        this.companyRepository = companyRepository;
        this.companyMapper = companyMapper;
        this.adRepository = adRepository;
    }

    @Override
    public CompanyResponseDTO createCompany(CompanyRequestDTO companyRequestDTO) {
        Company company = companyMapper.toCompany(companyRequestDTO);
        companyRepository.save(company);

        return companyMapper.toCompanyResponseDTO(company);
    }

    @Override
    public CompanyResponseDTO getCompanyById(Long id) {
        Company company = getById(id);

        return companyMapper.toCompanyResponseDTO(company);
    }

    @Override
    public Page<CompanyResponseDTO> getAllCompanies(Pageable pageable) {
        return companyRepository.findAll(pageable).map(companyMapper::toCompanyResponseDTO);
    }

    @Override
    public CompanyResponseDTO companyUpdate(Long id, CompanyUpdateDTO entity) {
        Company currentCompany = getById(id);
        companyMapper.updateEmployeeFromDTO(entity, currentCompany);
        companyRepository.save(currentCompany);

        return companyMapper.toCompanyResponseDTO(currentCompany);
    }

    public Company getById(Long id) {
        return companyRepository.findById(id).orElseThrow(() -> new NotFoundException("Company with %d id not found!".formatted(id)));
    }

    @Override
    public List<Ad> getAllAdsByCompanyId(Long id) {
        List<Long> adIds = companyRepository.findAdsByCompanyId(id);

        List<Ad> listaAds = new ArrayList<>();

        for (Long item : adIds) {
            Optional<Ad> ad = adRepository.findById(item);
            if (ad.isEmpty()) {
                throw new NotFoundException("Not found");
            }

            listaAds.add(ad.get());
        }

        return listaAds;
    }


}
