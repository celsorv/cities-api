package com.github.celsorv.citiesapi.utils;

public class StringLocationUtils {

   private static final String LEF = "(";
   private static final String RIG = ")";
   private static final String VZO = "";

   public static Double[] transform(String geolocation) {
      final String[] s = geolocation.replace(LEF, VZO).replace(RIG, VZO).split(",");
      return new Double[] {Double.valueOf(s[0].trim()), Double.valueOf(s[1].trim())};
   }
}
