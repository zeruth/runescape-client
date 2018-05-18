import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("dx")
public class class124 extends class204 {

   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 570567615
   )
   int field1738;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -82372649
   )
   int field1739;
   @ObfuscatedName("q")
   int[] field1737;
   @ObfuscatedName("b")
   int[][] field1735;


   class124(int var1, byte[] var2) {
      this.field1738 = var1;
      class182 var3 = new class182(var2);
      this.field1739 = var3.method3742();
      this.field1737 = new int[this.field1739];
      this.field1735 = new int[this.field1739][];

      int var4;
      for(var4 = 0; var4 < this.field1739; ++var4) {
         this.field1737[var4] = var3.method3742();
      }

      for(var4 = 0; var4 < this.field1739; ++var4) {
         this.field1735[var4] = new int[var3.method3742()];
      }

      for(var4 = 0; var4 < this.field1739; ++var4) {
         for(int var5 = 0; var5 < this.field1735[var4].length; ++var5) {
            this.field1735[var4][var5] = var3.method3742();
         }
      }

   }
}
