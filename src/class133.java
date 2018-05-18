import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eo")
public final class class133 {

   @ObfuscatedName("mf")
   @ObfuscatedGetter(
      intValue = -1786396111
   )
   static int field1860;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -511355339
   )
   int field1852;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 1850199349
   )
   int field1848;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -1602512817
   )
   int field1850;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 552093651
   )
   int field1858;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1255582715
   )
   int field1849;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -1346941497
   )
   int field1859;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -2085664887
   )
   int field1847;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Ldz;"
   )
   public class127 field1854;
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "Ldz;"
   )
   public class127 field1855;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      longValue = -5118687135473253869L
   )
   public long field1851 = 0L;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1042594383
   )
   int field1857 = 0;


   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lfy;Lgh;B)Lfe;",
      garbageValue = "46"
   )
   public static class172 method3115(class169 var0, class190 var1) {
      class172 var2;
      if(class172.field2277 == 0) {
         var2 = new class172();
      } else {
         var2 = class172.field2281[--class172.field2277];
      }

      var2.field2282 = var0;
      var2.field2278 = var0.field2166;
      if(var2.field2278 == -1) {
         var2.field2279 = new class189(260);
      } else if(var2.field2278 == -2) {
         var2.field2279 = new class189(10000);
      } else if(var2.field2278 <= 18) {
         var2.field2279 = new class189(20);
      } else if(var2.field2278 <= 98) {
         var2.field2279 = new class189(100);
      } else {
         var2.field2279 = new class189(260);
      }

      var2.field2279.method3866(var1);
      var2.field2279.method3886(var2.field2282.field2256);
      var2.field2280 = 0;
      return var2;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "-1803377882"
   )
   public static boolean method3114(int var0) {
      return (var0 >> 20 & 1) != 0;
   }
}
