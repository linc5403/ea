package club.banyuan.unitTestDemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.mockito.BDDMockito.given;

@SpringBootTest
class EmployServiceTest {

    @Autowired
    EmployService employService;

    @MockBean
    private EmployDao employDao;

    @Test
    void findIdByName() {
        EmployBean zhangsan = new EmployBean("zhangsan", 20, 10);

        given(employDao.searchByName("zhangsan")).willReturn(zhangsan);

        Integer id = employService.findIdByName("zhangsan");
        Assertions.assertEquals(10, id);
    }
}