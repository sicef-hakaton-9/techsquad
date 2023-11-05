package app.development.domain.ad.service;

import app.development.domain.ad.entity.Ad;
import app.development.domain.ad.model.AdRequestDTO;
import app.development.domain.ad.model.AdResponseDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface AdService {
    AdResponseDTO createAd(AdRequestDTO adRequestDTO);

    AdResponseDTO getAdById(Long id);

    Page<AdResponseDTO> getAllAds(Pageable pageable);

    List<Ad> getProviderAds(Long id);

    List<Ad> getRequestedAds(Long id);
}
