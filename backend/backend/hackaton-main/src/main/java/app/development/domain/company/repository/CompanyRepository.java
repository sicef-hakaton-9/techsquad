package app.development.domain.company.repository;

import app.development.domain.company.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CompanyRepository extends JpaRepository<Company, Long> {

    @Query(value = "SELECT a.id FROM ad a JOIN company c ON a.company_id = c.id WHERE c.id = :companyId", nativeQuery = true)
    List<Long> findAdsByCompanyId(@Param("companyId") Long companyId);

}
