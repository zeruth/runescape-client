import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eu")
public class class149 extends class160 {

   @ObfuscatedName("w")
   @ObfuscatedGetter(
      longValue = 4181979056816616911L
   )
   long field1940 = System.nanoTime();


   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1218447375"
   )
   public void vmethod3346() {
      this.field1940 = System.nanoTime();
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "2000882213"
   )
   public int vmethod3348(int var1, int var2) {
      long var3 = (long)var2 * 1000000L;
      long var5 = this.field1940 - System.nanoTime();
      if(var5 < var3) {
         var5 = var3;
      }

      class18.method218(var5 / 1000000L);
      long var7 = System.nanoTime();

      int var9;
      for(var9 = 0; var9 < 10 && (var9 < 1 || this.field1940 < var7); this.field1940 += (long)var1 * 1000000L) {
         ++var9;
      }

      if(this.field1940 < var7) {
         this.field1940 = var7;
      }

      return var9;
   }
}
