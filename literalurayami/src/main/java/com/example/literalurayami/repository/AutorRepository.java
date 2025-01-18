import com.example.literalurayami.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AutorRepository extends JpaRepository<Autor, Long> {

    List<Autor> findByNameContainingIgnoreCase(String name);

    @Query("SELECT a FROM Author a WHERE a.yearOfBirth = :yearOfBirth")
    List<Autor> findByYearOfBirth(@Param("yearOfBirth") int yearOfBirth);

    @Query("SELECT a FROM Author a WHERE a.yearOfDeath = :yearOfDeath")
    List<Autor> findByYearOfDeath(@Param("yearOfDeath") int yearOfDeath);
}
