import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gv")
public final class class201 {

   @ObfuscatedName("w")
   int field2438;
   @ObfuscatedName("m")
   int field2437;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lgx;"
   )
   class197 field2436;
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Lhq;"
   )
   class215 field2439 = new class215();


   public class201(int var1, int var2) {
      this.field2438 = var1;
      this.field2437 = var1;

      int var3;
      for(var3 = 1; var3 + var3 < var1 && var3 < var2; var3 += var3) {
         ;
      }

      this.field2436 = new class197(var3);
   }

   @ObfuscatedName("w")
   public Object method4033(long var1) {
      class212 var3 = (class212)this.field2436.method3991(var1);
      if(var3 == null) {
         return null;
      } else {
         Object var4 = var3.vmethod4169();
         if(var4 == null) {
            var3.method4098();
            var3.method4135();
            this.field2437 += var3.field2465;
            return null;
         } else {
            if(var3.vmethod4175()) {
               class196 var5 = new class196(var4, var3.field2465);
               this.field2436.method3992(var5, var3.field2449);
               this.field2439.method4183(var5);
               var5.field2454 = 0L;
               var3.method4098();
               var3.method4135();
            } else {
               this.field2439.method4183(var3);
               var3.field2454 = 0L;
            }

            return var4;
         }
      }
   }

   @ObfuscatedName("m")
   void method4037(long var1) {
      class212 var3 = (class212)this.field2436.method3991(var1);
      this.method4035(var3);
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Lhd;)V"
   )
   void method4035(class212 var1) {
      if(var1 != null) {
         var1.method4098();
         var1.method4135();
         this.field2437 += var1.field2465;
      }

   }

   @ObfuscatedName("x")
   public void method4036(Object var1, long var2) {
      this.method4034(var1, var2, 1);
   }

   @ObfuscatedName("j")
   public void method4034(Object var1, long var2, int var4) {
      if(var4 > this.field2438) {
         throw new IllegalStateException();
      } else {
         this.method4037(var2);
         this.field2437 -= var4;

         while(this.field2437 < 0) {
            class212 var5 = (class212)this.field2439.method4184();
            this.method4035(var5);
         }

         class196 var6 = new class196(var1, var4);
         this.field2436.method3992(var6, var2);
         this.field2439.method4183(var6);
         var6.field2454 = 0L;
      }
   }

   @ObfuscatedName("a")
   public void method4048(int var1) {
      for(class212 var2 = (class212)this.field2439.method4185(); var2 != null; var2 = (class212)this.field2439.method4187()) {
         if(var2.vmethod4175()) {
            if(var2.vmethod4169() == null) {
               var2.method4098();
               var2.method4135();
               this.field2437 += var2.field2465;
            }
         } else if(++var2.field2454 > (long)var1) {
            class207 var3 = new class207(var2.vmethod4169(), var2.field2465);
            this.field2436.method3992(var3, var2.field2449);
            class194.method3966(var3, var2);
            var2.method4098();
            var2.method4135();
         }
      }

   }

   @ObfuscatedName("l")
   public void method4039() {
      this.field2439.method4191();
      this.field2436.method4005();
      this.field2437 = this.field2438;
   }
}
