import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("is")
public enum class252 implements class188 {

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lis;"
   )
   field3242("runelite", 0, 2, 0),
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lis;"
   )
   field3241("runelite", 1, 1, 1),
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lis;"
   )
   field3243("runelite", 2, 0, 2);
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1688464985
   )
   public final int field3244;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1193385339
   )
   final int field3245;


   class252(String var1, int var2, int var3, int var4) {
      this.field3244 = var3;
      this.field3245 = var4;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "60"
   )
   public int vmethod5860() {
      return this.field3245;
   }
}
