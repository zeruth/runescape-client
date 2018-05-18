import java.util.Calendar;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bv")
public class class69 {

   @ObfuscatedName("q")
   static int[] field1016;
   @ObfuscatedName("b")
   static String[] field1017;
   @ObfuscatedName("f")
   static int[] field1019 = new int[5];
   @ObfuscatedName("n")
   static int[][] field1015 = new int[5][5000];
   @ObfuscatedName("h")
   static int[] field1026 = new int[1000];
   @ObfuscatedName("j")
   static String[] field1021 = new String[1000];
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 1795765091
   )
   static int field1022 = 0;
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "[Lak;"
   )
   static class51[] field1023 = new class51[50];
   @ObfuscatedName("g")
   static Calendar field1024 = Calendar.getInstance();
   @ObfuscatedName("y")
   static final String[] field1018 = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -1805120271
   )
   static int field1025 = 0;
   @ObfuscatedName("bc")
   @ObfuscatedGetter(
      intValue = -749547257
   )
   static int field1028;


   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Liv;IIS)[Llc;",
      garbageValue = "128"
   )
   static class318[] method1804(class247 var0, int var1, int var2) {
      return !class306.method5702(var0, var1, var2)?null:class226.method4483();
   }

   @ObfuscatedName("ja")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "506250925"
   )
   static void method1749() {
      for(class55 var0 = (class55)client.field826.method4055(); var0 != null; var0 = (class55)client.field826.method4056()) {
         int var1 = var0.field506;
         if(class42.method785(var1)) {
            boolean var2 = true;
            class230[] var3 = class230.field2615[var1];

            int var4;
            for(var4 = 0; var4 < var3.length; ++var4) {
               if(var3[var4] != null) {
                  var2 = var3[var4].field2622;
                  break;
               }
            }

            if(!var2) {
               var4 = (int)var0.field2449;
               class230 var5 = class61.method1188(var4);
               if(var5 != null) {
                  class181.method3548(var5);
               }
            }
         }
      }

   }
}
