package club.banyuan.unitTestDemo;

import org.springframework.stereotype.Repository;

@Repository
public interface EmployDao {
    public EmployBean searchByName(String name);
}
