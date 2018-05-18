import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("da")
public class class106 {

   @ObfuscatedName("w")
   int field1413;
   @ObfuscatedName("m")
   int field1411;
   @ObfuscatedName("q")
   int[] field1412;
   @ObfuscatedName("b")
   int[] field1410;


   class106() {
      class92.method2141(16);
      this.field1413 = class92.method2121() != 0?class92.method2141(4) + 1:1;
      if(class92.method2121() != 0) {
         class92.method2141(8);
      }

      class92.method2141(2);
      if(this.field1413 > 1) {
         this.field1411 = class92.method2141(4);
      }

      this.field1412 = new int[this.field1413];
      this.field1410 = new int[this.field1413];

      for(int var1 = 0; var1 < this.field1413; ++var1) {
         class92.method2141(8);
         this.field1412[var1] = class92.method2141(8);
         this.field1410[var1] = class92.method2141(8);
      }

   }
}
