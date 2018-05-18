import java.io.File;
import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ct")
public class class81 {

   @ObfuscatedName("q")
   static byte[] field1183 = new byte[2048];
   @ObfuscatedName("b")
   static byte[] field1177 = new byte[2048];
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "[Lgy;"
   )
   static class182[] field1179 = new class182[2048];
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 1358551967
   )
   static int field1180 = 0;
   @ObfuscatedName("h")
   static int[] field1181 = new int[2048];
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 1972551019
   )
   static int field1182 = 0;
   @ObfuscatedName("j")
   static int[] field1175 = new int[2048];
   @ObfuscatedName("a")
   static int[] field1184 = new int[2048];
   @ObfuscatedName("l")
   static int[] field1185 = new int[2048];
   @ObfuscatedName("d")
   static int[] field1186 = new int[2048];
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1296694293
   )
   static int field1176 = 0;
   @ObfuscatedName("p")
   static int[] field1188 = new int[2048];
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Lgy;"
   )
   static class182 field1189 = new class182(new byte[5000]);
   @ObfuscatedName("r")
   static int[] field1178;
   @ObfuscatedName("dm")
   @ObfuscatedGetter(
      intValue = 1649712923
   )
   static int field1192;
   @ObfuscatedName("fx")
   @ObfuscatedSignature(
      signature = "[Llc;"
   )
   static class318[] field1190;


   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Ljava/io/File;Ljava/io/File;I)V",
      garbageValue = "1970983576"
   )
   public static void method1921(File var0, File var1) {
      try {
         class110 var2 = new class110(class155.field1984, "rw", 10000L);
         class182 var3 = new class182(500);
         var3.method3552(3);
         var3.method3552(var1 != null?1:0);
         var3.method3691(var0.getPath());
         if(var1 != null) {
            var3.method3691("");
         }

         var2.method2556(var3.field2365, 0, var3.field2359);
         var2.method2564();
      } catch (IOException var4) {
         var4.printStackTrace();
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Liv;Liv;Liv;B)V",
      garbageValue = "-124"
   )
   public static void method1923(class247 var0, class247 var1, class247 var2) {
      class267.field3386 = var0;
      class177.field2314 = var1;
      class267.field3366 = var2;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "983127599"
   )
   public static int method1922(int var0) {
      --var0;
      var0 |= var0 >>> 1;
      var0 |= var0 >>> 2;
      var0 |= var0 >>> 4;
      var0 |= var0 >>> 8;
      var0 |= var0 >>> 16;
      return var0 + 1;
   }
}
