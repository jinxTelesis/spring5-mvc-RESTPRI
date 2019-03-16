package guru.springfamework.repositories;

import guru.springfamework.domain.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRespository extends JpaRepository<Vendor, Long> {

}
