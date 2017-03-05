package nitro.com.DAO;

import nitro.com.Entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface StudentDao extends PagingAndSortingRepository<Student, Long> {
}
