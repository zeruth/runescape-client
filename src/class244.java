import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ix")
public enum class244 implements class188 {

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lix;"
   )
   field3159("runelite", 0, "runescape", "RuneScape", 0),
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lix;"
   )
   field3154("runelite", 1, "stellardawn", "Stellar Dawn", 1),
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lix;"
   )
   field3155("runelite", 2, "game3", "Game 3", 2),
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Lix;"
   )
   field3156("runelite", 3, "game4", "Game 4", 3),
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lix;"
   )
   field3153("runelite", 4, "game5", "Game 5", 4),
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "Lix;"
   )
   field3158("runelite", 5, "oldscape", "RuneScape 2007", 5);
   @ObfuscatedName("h")
   public final String field3160;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -514214381
   )
   final int field3157;


   class244(String var1, int var2, String var3, String var4, int var5) {
      this.field3160 = var3;
      this.field3157 = var5;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "60"
   )
   public int vmethod5860() {
      return this.field3157;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(IIB)I",
      garbageValue = "-26"
   )
   static final int method4610(int var0, int var1) {
      int var2 = class29.method518(var0 - 1, var1 - 1) + class29.method518(1 + var0, var1 - 1) + class29.method518(var0 - 1, 1 + var1) + class29.method518(1 + var0, var1 + 1);
      int var3 = class29.method518(var0 - 1, var1) + class29.method518(1 + var0, var1) + class29.method518(var0, var1 - 1) + class29.method518(var0, 1 + var1);
      int var4 = class29.method518(var0, var1);
      return var2 / 16 + var3 / 8 + var4 / 4;
   }
}
