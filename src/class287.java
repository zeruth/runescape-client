import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kd")
public class class287 extends class282 {

   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1818299933
   )
   public int field3648 = -1;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -467035593
   )
   public int field3649;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -1378703733
   )
   public int field3647;


   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "698375569"
   )
   void method5432(int var1, int var2) {
      this.field3648 = var1;
      this.field3649 = var2;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "-21"
   )
   public int method5433() {
      return this.field3648;
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "5"
   )
   public boolean method5438() {
      return this.field3648 > 0;
   }
}
