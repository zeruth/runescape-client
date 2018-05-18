import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bj")
public class class71 extends class204 {

   @ObfuscatedName("eu")
   @ObfuscatedGetter(
      intValue = 867319259
   )
   static int field1051;
   @ObfuscatedName("fj")
   @ObfuscatedSignature(
      signature = "[Llh;"
   )
   static class317[] field1049;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Ljv;"
   )
   class261 field1046;
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Lgt;"
   )
   class203 field1047 = new class203();


   @ObfuscatedSignature(
      signature = "(Ljv;)V"
   )
   class71(class261 var1) {
      this.field1046 = var1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "-1546275303"
   )
   void method1815(int var1, int var2, int var3, int var4) {
      class64 var5 = null;
      int var6 = 0;

      for(class64 var7 = (class64)this.field1047.method4072(); var7 != null; var7 = (class64)this.field1047.method4074()) {
         ++var6;
         if(var7.field945 == var1) {
            var7.method1599(var1, var2, var3, var4);
            return;
         }

         if(var7.field945 <= var1) {
            var5 = var7;
         }
      }

      if(var5 == null) {
         if(var6 < 4) {
            this.field1047.method4070(new class64(var1, var2, var3, var4));
         }

      } else {
         class203.method4089(new class64(var1, var2, var3, var4), var5);
         if(var6 >= 4) {
            this.field1047.method4072().method4098();
         }

      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(IB)Lbi;",
      garbageValue = "3"
   )
   class64 method1816(int var1) {
      class64 var2 = (class64)this.field1047.method4072();
      if(var2 != null && var2.field945 <= var1) {
         for(class64 var3 = (class64)this.field1047.method4074(); var3 != null && var3.field945 <= var1; var3 = (class64)this.field1047.method4074()) {
            var2.method4098();
            var2 = var3;
         }

         if(this.field1046.field3330 + var2.field947 + var2.field945 > var1) {
            return var2;
         } else {
            var2.method4098();
            return null;
         }
      } else {
         return null;
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "13"
   )
   boolean method1817() {
      return this.field1047.method4075();
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Lgx;ILjava/lang/String;I)Ljava/lang/String;",
      garbageValue = "-391307830"
   )
   static String method1822(class197 var0, int var1, String var2) {
      if(var0 == null) {
         return var2;
      } else {
         class195 var3 = (class195)var0.method3991((long)var1);
         return var3 == null?var2:(String)var3.field2420;
      }
   }

   @ObfuscatedName("ea")
   @ObfuscatedSignature(
      signature = "(B)Llz;",
      garbageValue = "0"
   )
   static class321 method1821() {
      return class66.field987;
   }
}
