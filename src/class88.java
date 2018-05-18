import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cp")
public class class88 extends class105 {

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lgz;"
   )
   class205 field1255 = new class205();
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lgz;"
   )
   class205 field1256 = new class205();
   @ObfuscatedName("b")
   int field1257 = 0;
   @ObfuscatedName("f")
   int field1258 = -1;


   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Ldu;)V"
   )
   public final synchronized void method2049(class105 var1) {
      this.field1255.method4107(var1);
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Ldu;)V"
   )
   public final synchronized void method2050(class105 var1) {
      var1.method4098();
   }

   @ObfuscatedName("q")
   void method2078() {
      if(this.field1257 > 0) {
         for(class100 var1 = (class100)this.field1256.method4113(); var1 != null; var1 = (class100)this.field1256.method4104()) {
            var1.field1364 -= this.field1257;
         }

         this.field1258 -= this.field1257;
         this.field1257 = 0;
      }

   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Lgl;Lcr;)V"
   )
   void method2052(class204 var1, class100 var2) {
      while(this.field1256.field2451 != var1 && ((class100)var1).field1364 <= var2.field1364) {
         var1 = var1.field2447;
      }

      class205.method4132(var2, var1);
      this.field1258 = ((class100)this.field1256.field2451.field2447).field1364;
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(Lcr;)V"
   )
   void method2053(class100 var1) {
      var1.method4098();
      var1.method2291();
      class204 var2 = this.field1256.field2451.field2447;
      if(var2 == this.field1256.field2451) {
         this.field1258 = -1;
      } else {
         this.field1258 = ((class100)var2).field1364;
      }

   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "()Ldu;"
   )
   protected class105 vmethod4421() {
      return (class105)this.field1255.method4113();
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "()Ldu;"
   )
   protected class105 vmethod4422() {
      return (class105)this.field1255.method4104();
   }

   @ObfuscatedName("d")
   protected int vmethod4423() {
      return 0;
   }

   @ObfuscatedName("s")
   public final synchronized void vmethod4424(int[] var1, int var2, int var3) {
      do {
         if(this.field1258 < 0) {
            this.method2057(var1, var2, var3);
            return;
         }

         if(var3 + this.field1257 < this.field1258) {
            this.field1257 += var3;
            this.method2057(var1, var2, var3);
            return;
         }

         int var4 = this.field1258 - this.field1257;
         this.method2057(var1, var2, var4);
         var2 += var4;
         var3 -= var4;
         this.field1257 += var4;
         this.method2078();
         class100 var5 = (class100)this.field1256.method4113();
         synchronized(var5) {
            int var7 = var5.method2298();
            if(var7 < 0) {
               var5.field1364 = 0;
               this.method2053(var5);
            } else {
               var5.field1364 = var7;
               this.method2052(var5.field2447, var5);
            }
         }
      } while(var3 != 0);

   }

   @ObfuscatedName("p")
   void method2057(int[] var1, int var2, int var3) {
      for(class105 var4 = (class105)this.field1255.method4113(); var4 != null; var4 = (class105)this.field1255.method4104()) {
         var4.method2488(var1, var2, var3);
      }

   }

   @ObfuscatedName("g")
   public final synchronized void vmethod4425(int var1) {
      do {
         if(this.field1258 < 0) {
            this.method2059(var1);
            return;
         }

         if(this.field1257 + var1 < this.field1258) {
            this.field1257 += var1;
            this.method2059(var1);
            return;
         }

         int var2 = this.field1258 - this.field1257;
         this.method2059(var2);
         var1 -= var2;
         this.field1257 += var2;
         this.method2078();
         class100 var3 = (class100)this.field1256.method4113();
         synchronized(var3) {
            int var5 = var3.method2298();
            if(var5 < 0) {
               var3.field1364 = 0;
               this.method2053(var3);
            } else {
               var3.field1364 = var5;
               this.method2052(var3.field2447, var3);
            }
         }
      } while(var1 != 0);

   }

   @ObfuscatedName("y")
   void method2059(int var1) {
      for(class105 var2 = (class105)this.field1255.method4113(); var2 != null; var2 = (class105)this.field1255.method4104()) {
         var2.vmethod4425(var1);
      }

   }
}
