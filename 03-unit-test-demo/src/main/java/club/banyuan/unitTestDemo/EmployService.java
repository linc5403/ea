package club.banyuan.unitTestDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployService {
    @Autowired
    private EmployDao employDao;

    public Integer findIdByName(String name) {
        EmployBean employ = employDao.searchByName(name);
        return employ.getId();
    }

}
