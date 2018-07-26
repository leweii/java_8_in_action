package learn.example.two.test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.Test;

public class PracticeStream {

    @Test
    public void practiceTest() {

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950));

        // find 2011 ones, order by found.
        transactions.stream().filter(n -> n.getYear() == 2011).sorted((o1, o2) -> Integer.compare(o1.getValue(), o2.getValue())).forEach(System.out::println);

        // find all cities for trader
        transactions.stream().map(n -> n.getTrader().getCity()).distinct().forEach(System.out::println);

        // any one from milan?
        Optional<Transaction> milanOne = transactions.stream().filter(n -> "Milan".equals(n.getTrader().getCity())).findAny();
        System.out.println(milanOne.get().getTrader().getCity());

        // print all values for trader lives in Cambridge
        transactions.stream().filter(n -> "Cambridge".equals(n.getTrader().getCity())).map(n -> n.getValue()).forEach(System.out::println);

        // MAX and min
        transactions.stream().map(n -> n.getValue()).reduce(Integer::min);
        transactions.stream().map(n -> n.getValue()).reduce(Integer::max);
    }
}
