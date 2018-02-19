package PrimeFactors;
import com.google.common.collect.ImmutableList;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class PrimeFactorsTest {

    PrimeFactors tested = new PrimeFactors();

    @Test
    public void shouldReturnEmptyListFor1(){

        //given
        int input =1;

        //when
        List<Integer> result = tested.generate(input);

        //then
        assertEquals(ImmutableList.of(),result);
    }
    @Test
    public void shouldReturn2(){
        //given
        int input =2;

        //when
        List<Integer> result = tested.generate(input);

        //then
        assertEquals(ImmutableList.of(2),result);

    }
    @Test
    public void shouldReturn3(){
        //given
        int input =3;

        //when
        List<Integer> result = tested.generate(input);

        //then
        assertEquals(ImmutableList.of(3),result);

    }
    @Test
    public void shouldReturn22for4(){
        //given
        int input =4;

        //when
        List<Integer> result = tested.generate(input);

        //then
        assertEquals(ImmutableList.of(2,2),result);

    }
    @Test
    public void shouldReturn23for6(){
        //given
        int input =6;

        //when
        List<Integer> result = tested.generate(input);

        //then
        assertEquals(ImmutableList.of(2,3),result);

    }
    @Test
    public void shouldReturn222for8(){
        //given
        int input =8;

        //when
        List<Integer> result = tested.generate(input);

        //then
        assertEquals(ImmutableList.of(2,2,2),result);

    }
}