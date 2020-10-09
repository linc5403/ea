package club.banyuan.unitTestDemo;

import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EmployServiceTest {

    @Autowired
    EmployService employService;

    @MockBean
    private EmployDao employDao;

    @Test
    void findIdByName() {
        EmployBean zhangsan = new EmployBean("zhangsan", 20, 10);

        BDDMockito.given(employDao.searchByName("zhangsan")).willReturn(zhangsan);

        Integer id = employService.findIdByName("zhangsan");
        Assertions.assertEquals(10, id);
    }
}