import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ja")
public enum class270 implements class188 {

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lja;"
   )
   field3498("runelite", 0, 2, 0),
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lja;"
   )
   field3495("runelite", 1, 0, 1),
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lja;"
   )
   field3496("runelite", 2, 1, 2);
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1312786803
   )
   public final int field3494;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1197192137
   )
   final int field3497;


   class270(String var1, int var2, int var3, int var4) {
      this.field3494 = var3;
      this.field3497 = var4;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "60"
   )
   public int vmethod5860() {
      return this.field3497;
   }
}
