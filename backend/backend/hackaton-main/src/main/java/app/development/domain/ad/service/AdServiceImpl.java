package app.development.domain.ad.service;

import app.development.domain.ad.entity.Ad;
import app.development.domain.ad.model.AdRequestDTO;
import app.development.domain.ad.model.AdResponseDTO;
import app.development.domain.ad.repository.AdRepository;
import app.development.domain.company.entity.Company;
import app.development.domain.company.service.CompanyService;
import app.development.infrastructure.exception.exceptions.NotFoundException;
import app.development.infrastructure.mapper.AdMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdServiceImpl implements AdService {

    private final AdRepository adRepository;
    private final AdMapper adMapper;
    private final CompanyService companyService;

    public AdServiceImpl(AdRepository adRepository, AdMapper adMapper, CompanyService companyService) {
        this.adRepository = adRepository;
        this.adMapper = adMapper;
        this.companyService = companyService;
    }


    @Override
    public AdResponseDTO createAd(AdRequestDTO adRequestDTO) {
        Ad ad = adMapper.toAd(adRequestDTO);
        Company company = companyService.getById(adRequestDTO.companyId());

        ad.setCompany(company);
        adRepository.save(ad);

        return adMapper.toAdResponseDTO(ad);
    }

    @Override
    public AdResponseDTO getAdById(Long id) {
        Ad ad = getById(id);

        return adMapper.toAdResponseDTO(ad);
    }

    @Override
    public Page<AdResponseDTO> getAllAds(Pageable pageable) {
        return adRepository.findAll(pageable).map(adMapper::toAdResponseDTO);

    }

    @Override
    public List<Ad> getProviderAds(Long id) {

        return adRepository.findProviderAds();
    }

    @Override
    public List<Ad> getRequestedAds(Long id) {
        return adRepository.findRequestedAds();

    }

    public Ad getById(Long id) {
        return adRepository.findById(id).orElseThrow(() -> new NotFoundException("Ad with %d id not found!".formatted(id)));
    }
}
