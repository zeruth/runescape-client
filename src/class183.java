import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gn")
public class class183 {

   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1304457577
   )
   static int field2371 = 0;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -1476231731
   )
   static int field2367 = 0;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -891326955
   )
   static int field2372 = 0;
   @ObfuscatedName("b")
   static byte[][] field2369 = new byte[1000][];
   @ObfuscatedName("f")
   static byte[][] field2366 = new byte[250][];
   @ObfuscatedName("n")
   static byte[][] field2368 = new byte[50][];
   @ObfuscatedName("x")
   static int[] field2370;
   @ObfuscatedName("j")
   static byte[][][] field2373;
   @ObfuscatedName("df")
   @ObfuscatedSignature(
      signature = "Lic;"
   )
   static class249 field2374;


   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(IZI)[B",
      garbageValue = "1309152656"
   )
   static synchronized byte[] method3813(int var0, boolean var1) {
      byte[] var2;
      if(var0 != 100) {
         if(var0 < 100) {
            ;
         }
      } else if(field2371 > 0) {
         var2 = field2369[--field2371];
         field2369[field2371] = null;
         return var2;
      }

      if(var0 != 5000) {
         if(var0 < 5000) {
            ;
         }
      } else if(field2367 > 0) {
         var2 = field2366[--field2367];
         field2366[field2367] = null;
         return var2;
      }

      if(var0 != 30000) {
         if(var0 < 30000) {
            ;
         }
      } else if(field2372 > 0) {
         var2 = field2368[--field2372];
         field2368[field2372] = null;
         return var2;
      }

      if(field2373 != null) {
         for(int var4 = 0; var4 < class78.field1123.length; ++var4) {
            if(class78.field1123[var4] != var0) {
               if(var0 < class78.field1123[var4]) {
                  ;
               }
            } else if(field2370[var4] > 0) {
               byte[] var3 = field2373[var4][--field2370[var4]];
               field2373[var4][field2370[var4]] = null;
               return var3;
            }
         }
      }

      return new byte[var0];
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "942713230"
   )
   public static int method3824(int var0) {
      return var0 > 0?1:(var0 < 0?-1:0);
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      signature = "(Lea;III)Lcc;",
      garbageValue = "157805437"
   )
   public static final class95 method3818(class154 var0, int var1, int var2) {
      if(class95.field1330 == 0) {
         throw new IllegalStateException();
      } else if(var1 >= 0 && var1 < 2) {
         if(var2 < 256) {
            var2 = 256;
         }

         try {
            class95 var3 = class95.field1339.vmethod2093();
            var3.field1327 = new int[(class95.field1321?2:1) * 256];
            var3.field1322 = var2;
            var3.vmethod2190();
            var3.field1331 = (var2 & -1024) + 1024;
            if(var3.field1331 > 16384) {
               var3.field1331 = 16384;
            }

            var3.vmethod2200(var3.field1331);
            if(class95.field1324 > 0 && class231.field2763 == null) {
               class231.field2763 = new class97();
               class95.field1323 = Executors.newScheduledThreadPool(1);
               class95.field1323.scheduleAtFixedRate(class231.field2763, 0L, 10L, TimeUnit.MILLISECONDS);
            }

            if(class231.field2763 != null) {
               if(class231.field2763.field1355[var1] != null) {
                  throw new IllegalArgumentException();
               }

               class231.field2763.field1355[var1] = var3;
            }

            return var3;
         } catch (Throwable var4) {
            return new class95();
         }
      } else {
         throw new IllegalArgumentException();
      }
   }
}
