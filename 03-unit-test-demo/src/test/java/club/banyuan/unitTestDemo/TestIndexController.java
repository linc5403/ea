package club.banyuan.unitTestDemo;

import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
public class TestIndexController {
    private MockMvc mvc;

    @Before
    public void setup() {
        this.mvc = MockMvcBuilders.standaloneSetup(new IndexController()).build();
    }
    @Test
    public void showHomePage() throws Exception {
        this.mvc.perform(
                    get("/")
                        .accept(MediaType.parseMediaType("application/html;charset=UTF-8")))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/html;charset=UTF-8"))
                .andExpect(content().string("Hello"));
    }
}