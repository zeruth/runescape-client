import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cs")
public class class84 extends class206 {

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   static class200 field1214 = new class200(128);
   @ObfuscatedName("fk")
   @ObfuscatedGetter(
      intValue = 1986819395
   )
   static int field1219;
   @ObfuscatedName("m")
   int[] field1211;
   @ObfuscatedName("q")
   int[] field1216;
   @ObfuscatedName("b")
   String[] field1212;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -234324811
   )
   int field1213;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -289334549
   )
   int field1210;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 461672635
   )
   int field1215;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 1932646591
   )
   int field1209;
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "[Lgx;"
   )
   class197[] field1217;


   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(II)[Lgx;",
      garbageValue = "-717771929"
   )
   class197[] method1989(int var1) {
      return new class197[var1];
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Liv;I)V",
      garbageValue = "-968351460"
   )
   public static void method2002(class247 var0) {
      class263.field3337 = var0;
   }

   @ObfuscatedName("gb")
   @ObfuscatedSignature(
      signature = "(Lbs;I)V",
      garbageValue = "1256740677"
   )
   static final void method1994(class63 var0) {
      int var1 = var0.field896 - client.field679;
      int var2 = var0.field925 * 128 + var0.field885 * 64;
      int var3 = var0.field927 * 128 + var0.field885 * 64;
      var0.field900 += (var2 - var0.field900) / var1;
      var0.field918 += (var3 - var0.field918) / var1;
      var0.field936 = 0;
      var0.field934 = var0.field931;
   }
}
