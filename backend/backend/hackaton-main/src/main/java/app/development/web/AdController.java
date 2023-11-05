package app.development.web;

import app.development.domain.ad.entity.Ad;
import app.development.domain.ad.model.AdRequestDTO;
import app.development.domain.ad.model.AdResponseDTO;
import app.development.domain.ad.service.AdService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/ads")
public class AdController {

    private final AdService adService;

    public AdController(AdService adService) {
        this.adService = adService;
    }

    @PostMapping
    public ResponseEntity<AdResponseDTO> createAd(@Valid @RequestBody AdRequestDTO adRequestDTO) {
        return ResponseEntity.ok(adService.createAd(adRequestDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<AdResponseDTO> getAdById(@PathVariable Long id) {
        return ResponseEntity.ok(adService.getAdById(id));
    }

    @GetMapping
    public ResponseEntity<Page<AdResponseDTO>> getAllAds(Pageable pageable) {
        return ResponseEntity.ok(adService.getAllAds(pageable));
    }

    @GetMapping("/getProviderAds")
    public ResponseEntity<List<Ad>> getProviderAds(Long id){
        return ResponseEntity.ok(adService.getProviderAds(id));
    }

    @GetMapping("/getRequestedAds")
    public ResponseEntity<List<Ad>> getRequestedAds(Long id){
        return ResponseEntity.ok(adService.getRequestedAds(id));
    }

}
