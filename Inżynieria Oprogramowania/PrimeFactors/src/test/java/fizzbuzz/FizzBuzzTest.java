package fizzbuzz;

import com.google.common.collect.ImmutableList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;//
import java.util.List;//

class FizzBuzzTest {
    public FizzBuzz tested = new FizzBuzz();

    @Test
    public void shouldReturnNumber(){
        //given
        int i = 1;
        //when

        List<String> result = tested.generate(ImmutableList.of(i));

        //then
        assertEquals((ImmutableList.of("1")),result);
    }
    @Test
    public void shouldReturnFizz(){
        //given
        int i = 3;
        //when

        List<String> result = tested.generate(ImmutableList.of(i));

        //then
        assertEquals((ImmutableList.of("Fizz")),result);
    }
    @Test
    public void shouldReturnBuzz(){
        //given
        int i = 5;
        //when

        List<String> result = tested.generate(ImmutableList.of(i));

        //then
        assertEquals((ImmutableList.of("Buzz")),result);
    }
    @Test
    public void shouldReturnFizzBuzz(){
        //given
        int i = 15;
        //when

        List<String> result = tested.generate(ImmutableList.of(i));

        //then
        assertEquals((ImmutableList.of("FizzBuzz")),result);
    }
}