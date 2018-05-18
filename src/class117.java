import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dc")
public class class117 {

   @ObfuscatedName("w")
   static int[] field1574 = new int[500];
   @ObfuscatedName("m")
   static int[] field1576 = new int[500];
   @ObfuscatedName("q")
   static int[] field1573 = new int[500];
   @ObfuscatedName("b")
   static int[] field1583 = new int[500];
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Ldx;"
   )
   class124 field1577 = null;
   @ObfuscatedName("n")
   int field1578 = -1;
   @ObfuscatedName("h")
   int[] field1579;
   @ObfuscatedName("x")
   int[] field1580;
   @ObfuscatedName("j")
   int[] field1581;
   @ObfuscatedName("a")
   int[] field1582;
   @ObfuscatedName("l")
   boolean field1575 = false;


   @ObfuscatedSignature(
      signature = "([BLdx;)V"
   )
   class117(byte[] var1, class124 var2) {
      this.field1577 = var2;
      class182 var3 = new class182(var1);
      class182 var4 = new class182(var1);
      var3.field2359 = 2;
      int var5 = var3.method3742();
      int var6 = -1;
      int var7 = 0;
      var4.field2359 = var5 + var3.field2359;

      int var8;
      for(var8 = 0; var8 < var5; ++var8) {
         int var9 = var3.method3742();
         if(var9 > 0) {
            if(this.field1577.field1737[var8] != 0) {
               for(int var10 = var8 - 1; var10 > var6; --var10) {
                  if(this.field1577.field1737[var10] == 0) {
                     field1574[var7] = var10;
                     field1576[var7] = 0;
                     field1573[var7] = 0;
                     field1583[var7] = 0;
                     ++var7;
                     break;
                  }
               }
            }

            field1574[var7] = var8;
            short var11 = 0;
            if(this.field1577.field1737[var8] == 3) {
               var11 = 128;
            }

            if((var9 & 1) != 0) {
               field1576[var7] = var4.method3581();
            } else {
               field1576[var7] = var11;
            }

            if((var9 & 2) != 0) {
               field1573[var7] = var4.method3581();
            } else {
               field1573[var7] = var11;
            }

            if((var9 & 4) != 0) {
               field1583[var7] = var4.method3581();
            } else {
               field1583[var7] = var11;
            }

            var6 = var8;
            ++var7;
            if(this.field1577.field1737[var8] == 5) {
               this.field1575 = true;
            }
         }
      }

      if(var1.length != var4.field2359) {
         throw new RuntimeException();
      } else {
         this.field1578 = var7;
         this.field1579 = new int[var7];
         this.field1580 = new int[var7];
         this.field1581 = new int[var7];
         this.field1582 = new int[var7];

         for(var8 = 0; var8 < var7; ++var8) {
            this.field1579[var8] = field1574[var8];
            this.field1580[var8] = field1576[var8];
            this.field1581[var8] = field1573[var8];
            this.field1582[var8] = field1583[var8];
         }

      }
   }
}
