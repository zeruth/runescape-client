import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ac")
public class class29 {

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lac;"
   )
   public static final class29 field257 = new class29("details");
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lac;"
   )
   public static final class29 field261 = new class29("compositemap");
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lac;"
   )
   public static final class29 field259 = new class29("compositetexture");
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Lac;"
   )
   public static final class29 field260 = new class29("area");
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lac;"
   )
   public static final class29 field258 = new class29("labels");
   @ObfuscatedName("n")
   public final String field262;


   class29(String var1) {
      this.field262 = var1;
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "1972552445"
   )
   static final int method518(int var0, int var1) {
      int var2 = var1 * 57 + var0;
      var2 ^= var2 << 13;
      int var3 = var2 * (var2 * var2 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
      return var3 >> 19 & 255;
   }
}
