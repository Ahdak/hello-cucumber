package net.dammak.hellocucumber;

import io.cucumber.junit.platform.engine.Cucumber;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest()
@Cucumber
public class CucumberTestRunner {
}
