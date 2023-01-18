package numbers;

import org.javatuples.Tuple;

import java.awt.*;
import java.math.BigInteger;
import java.nio.ReadOnlyBufferException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise05 {
    /*
     * 5 - Write a Java program to find the number of seed Lychrel number candidates and related numbers for n in the
     *     range 1..10000 inclusive. (With that iteration limit of 500).
     */
    static Map<BigInteger, Tuple> cache = new HashMap<>();

    static class Tuple {
        final Boolean flag;
        final BigInteger bigInteger;

        Tuple(boolean f, BigInteger b) {
            flag = f;
            bigInteger = b;
        }
    }

    static Tuple lychrel(BigInteger n) {
        Tuple res;

        if ((res = cache.get(n)) != null) {
            return res;
        }

        BigInteger r = rev(n);
        res = new Tuple(true, n);
        List<BigInteger> seen = new ArrayList<>();

        for (int i = 0; i < 500; i++) {
            n = n.add(r);
            r = rev(n);

            if (n.equals(r)) {
                res = new Tuple(false, BigInteger.ZERO);
                break;
            }
            if (cache.containsKey(n)) {
                res = cache.get(n);
                break;
            }
            seen.add(n);
        }

        for (BigInteger bi : seen) {
            cache.put(bi, res);
        }
        return res;
    }

    static BigInteger rev(BigInteger bi) {
        String str = new StringBuilder(bi.toString()).reverse().toString();
        return new BigInteger(str);
    }

    public static void main(String[] args) {
        List<BigInteger> seeds = new ArrayList<>();
        List<BigInteger> related = new ArrayList<>();
        List<BigInteger> palin = new ArrayList<>();

        for (int i = 0; i <= 10_000; i++) {
            BigInteger number = BigInteger.valueOf(i);
            Tuple tuple = lychrel(number);

            if (!tuple.flag) {
                continue;
            }
            if (number.equals(tuple.bigInteger)) {
                seeds.add(tuple.bigInteger);
            } else {
                related.add(tuple.bigInteger);
            }

            if (number.equals(tuple.bigInteger)) {
                palin.add(tuple.bigInteger);
            }
        }

        System.out.printf("%d Lychrel seeds: %s%n", seeds.size(), seeds);
        System.out.printf("%d Lychrel related: %n", related.size());
        System.out.printf("%d Lychrel palindromes: %s%n", palin.size(), palin);
    }
}
