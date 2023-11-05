package app.development.domain.ad.repository;

import app.development.domain.ad.entity.Ad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AdRepository extends JpaRepository<Ad,Long> {

    @Query("SELECT a FROM Ad a " +
            "JOIN a.company c " +
            "JOIN c.account ac " +
            "JOIN ac.role r " +
            "WHERE r.name = 'REQUESTER'")
    List<Ad> findRequestedAds();

    @Query("SELECT a FROM Ad a " +
            "JOIN a.company c " +
            "JOIN c.account ac " +
            "JOIN ac.role r " +
            "WHERE r.name = 'PROVIDER'")
    List<Ad> findProviderAds();
}
