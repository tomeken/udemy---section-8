package com.jsystems.frontendCucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/resources/features", // informacja gdzie sa zlokalizowane scenariusze testowe
        glue = "classpath:com.jsystems", // informacja gdzie są zlokalizowane stepy
        plugin = {"html:target/cucumber-html-report", "rerun:target/rerun.txt"},  // plugin do tworzenia raportów html z wykonanych testów
        tags = {
                // tutaj trzeba uważać ponieważ może być tylko jedna adnotacja odsłonięta
                // i wówczas wykonuje testy oznaczone w scenariuszach tą adnotacją
                // W przypadku zasłoniętych wszystkich adnotacji w tym miejscu wykonywane są wszystkie testy w scenariuszach
                // wówczas kolejność wykonywania idzie zgodnie z kolejnością plików featurei testy wykonywane są po kolei w plikach

                "@wordpress"
//                "@Login"

        }
)
public class RunTest {
}
