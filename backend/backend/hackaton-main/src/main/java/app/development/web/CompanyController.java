package app.development.web;

import app.development.domain.ad.entity.Ad;
import app.development.domain.ad.model.AdResponseDTO;
import app.development.domain.company.model.CompanyRequestDTO;
import app.development.domain.company.model.CompanyResponseDTO;
import app.development.domain.company.model.CompanyUpdateDTO;
import app.development.domain.company.service.CompanyService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/companies")
public class CompanyController {

    private final CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @PostMapping
    public ResponseEntity<CompanyResponseDTO> createCompany(@Valid @RequestBody CompanyRequestDTO companyRequestDTO) {
        return ResponseEntity.ok(companyService.createCompany(companyRequestDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<CompanyResponseDTO> getCompanyById(@PathVariable Long id) {
        return ResponseEntity.ok(companyService.getCompanyById(id));
    }

    @GetMapping
    public ResponseEntity<Page<CompanyResponseDTO>> getAllCompanies(Pageable pageable) {
        return ResponseEntity.ok(companyService.getAllCompanies(pageable));
    }

    @PutMapping("/{id}")
    public ResponseEntity<CompanyResponseDTO> updateCompany(@PathVariable Long id, @RequestBody CompanyUpdateDTO entity) {
        return ResponseEntity.ok(companyService.companyUpdate(id, entity));
    }

    @GetMapping("/ads")
    public ResponseEntity<List<Ad>> getAllAdsByCompanyId(@RequestParam Long id) {
        return ResponseEntity.ok(companyService.getAllAdsByCompanyId(id));
    }
}
