package fizzbuzz;

import com.google.common.collect.ImmutableList;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> generate(List<Integer> input) {
        List<String> result = new ArrayList<String>();
        for (Integer i : input) {
            mapToString(result, i);
        }

        return result;
    }

    private String mapToString( Integer i) {
        if (i % 5 == 0 && i % 3 == 0) {
            return "FizzBuzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        } else if (i % 5 == 0) {
            return "Buzz";
        } else if (i % 5 == 0 && i % 3 == 0) {
            return "FizzBuzz";
        } else {
            result.add(String.valueOf(i));
        }
    }
}
