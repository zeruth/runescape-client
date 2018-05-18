import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cy")
public class class96 {

   @ObfuscatedName("w")
   int field1347 = 2;
   @ObfuscatedName("m")
   int[] field1344 = new int[2];
   @ObfuscatedName("q")
   int[] field1345 = new int[2];
   @ObfuscatedName("b")
   int field1346;
   @ObfuscatedName("f")
   int field1348;
   @ObfuscatedName("n")
   int field1353;
   @ObfuscatedName("h")
   int field1343;
   @ObfuscatedName("j")
   int field1350;
   @ObfuscatedName("a")
   int field1349;
   @ObfuscatedName("l")
   int field1352;
   @ObfuscatedName("d")
   int field1351;


   class96() {
      this.field1344[0] = 0;
      this.field1344[1] = '\uffff';
      this.field1345[0] = 0;
      this.field1345[1] = '\uffff';
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgy;)V"
   )
   final void method2264(class182 var1) {
      this.field1353 = var1.method3742();
      this.field1346 = var1.method3573();
      this.field1348 = var1.method3573();
      this.method2256(var1);
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Lgy;)V"
   )
   final void method2256(class182 var1) {
      this.field1347 = var1.method3742();
      this.field1344 = new int[this.field1347];
      this.field1345 = new int[this.field1347];

      for(int var2 = 0; var2 < this.field1347; ++var2) {
         this.field1344[var2] = var1.method3574();
         this.field1345[var2] = var1.method3574();
      }

   }

   @ObfuscatedName("q")
   final void method2257() {
      this.field1343 = 0;
      this.field1350 = 0;
      this.field1349 = 0;
      this.field1352 = 0;
      this.field1351 = 0;
   }

   @ObfuscatedName("x")
   final int method2260(int var1) {
      if(this.field1351 >= this.field1343) {
         this.field1352 = this.field1345[this.field1350++] << 15;
         if(this.field1350 >= this.field1347) {
            this.field1350 = this.field1347 - 1;
         }

         this.field1343 = (int)((double)this.field1344[this.field1350] / 65536.0D * (double)var1);
         if(this.field1343 > this.field1351) {
            this.field1349 = ((this.field1345[this.field1350] << 15) - this.field1352) / (this.field1343 - this.field1351);
         }
      }

      this.field1352 += this.field1349;
      ++this.field1351;
      return this.field1352 - this.field1349 >> 15;
   }
}
