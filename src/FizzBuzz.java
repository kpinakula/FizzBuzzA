public class FizzBuzz {
    public String play(Integer input) {
        if (input % 15 == 0) {
            return "fizzbuzz";
        }
        else if (input % 3 == 0) {
            return "fizz";
        }
        else if (input % 5 == 0) {
            return "buzz";
        }
        else {
            return Integer.toString(input);
        }
    }
}
