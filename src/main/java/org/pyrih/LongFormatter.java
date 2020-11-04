package org.pyrih;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class LongFormatter {
    public static void main(String[] args) {
        Long s = Long.parseLong("140448000");
        double result = new BigDecimal(s).movePointLeft(2).doubleValue();
        System.out.println("Before: " + s);

        DecimalFormat formatter = new DecimalFormat("###,###.##");
        DecimalFormatSymbols symbols = formatter.getDecimalFormatSymbols();
        formatter.setMinimumFractionDigits(2);
        symbols.setGroupingSeparator(' ');
        symbols.setDecimalSeparator('.');
        formatter.setDecimalFormatSymbols(symbols);
        System.out.println("After: " + formatter.format(result));
    }
}
