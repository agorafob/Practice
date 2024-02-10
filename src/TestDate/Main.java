package TestDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy");
        Date d1 = new Date();
        Date d2 = f.parse("8-09-2023");

        long diff = Math.abs(d1.getTime()-d2.getTime());
        long res = TimeUnit.DAYS.convert(diff,TimeUnit.MILLISECONDS);

        System.out.println(res);

    }
}
