import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jq")
public class class267 extends class206 {

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   static class247 field3386;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   static class247 field3366;
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   static class200 field3367 = new class200(64);
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   static class200 field3368 = new class200(64);
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   static class200 field3369 = new class200(20);
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 1172601793
   )
   int field3373 = -1;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 925164125
   )
   public int field3374 = 16777215;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1038044271
   )
   public int field3375 = 70;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 43365149
   )
   int field3376 = -1;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 1209890703
   )
   int field3377 = -1;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -1467718321
   )
   int field3378 = -1;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 959206911
   )
   int field3379 = -1;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = -535619493
   )
   public int field3371 = 0;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -753785695
   )
   public int field3381 = 0;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -1772931603
   )
   public int field3370 = -1;
   @ObfuscatedName("z")
   String field3365 = "";
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -2043201199
   )
   public int field3384 = -1;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -2068012815
   )
   public int field3385 = 0;
   @ObfuscatedName("v")
   public int[] field3383;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = 612297757
   )
   int field3387 = -1;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -1936569109
   )
   int field3382 = -1;


   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Lgy;I)V",
      garbageValue = "-1512059909"
   )
   void method5010(class182 var1) {
      while(true) {
         int var2 = var1.method3742();
         if(var2 == 0) {
            return;
         }

         this.method5009(var1, var2);
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Lgy;II)V",
      garbageValue = "-1469675978"
   )
   void method5009(class182 var1, int var2) {
      if(var2 == 1) {
         this.field3373 = var1.method3585();
      } else if(var2 == 2) {
         this.field3374 = var1.method3572();
      } else if(var2 == 3) {
         this.field3376 = var1.method3585();
      } else if(var2 == 4) {
         this.field3378 = var1.method3585();
      } else if(var2 == 5) {
         this.field3377 = var1.method3585();
      } else if(var2 == 6) {
         this.field3379 = var1.method3585();
      } else if(var2 == 7) {
         this.field3371 = var1.method3804();
      } else if(var2 == 8) {
         this.field3365 = var1.method3666();
      } else if(var2 == 9) {
         this.field3375 = var1.method3574();
      } else if(var2 == 10) {
         this.field3381 = var1.method3804();
      } else if(var2 == 11) {
         this.field3370 = 0;
      } else if(var2 == 12) {
         this.field3384 = var1.method3742();
      } else if(var2 == 13) {
         this.field3385 = var1.method3804();
      } else if(var2 == 14) {
         this.field3370 = var1.method3574();
      } else if(var2 == 17 || var2 == 18) {
         this.field3387 = var1.method3574();
         if(this.field3387 == '\uffff') {
            this.field3387 = -1;
         }

         this.field3382 = var1.method3574();
         if(this.field3382 == '\uffff') {
            this.field3382 = -1;
         }

         int var3 = -1;
         if(var2 == 18) {
            var3 = var1.method3574();
            if(var3 == '\uffff') {
               var3 = -1;
            }
         }

         int var4 = var1.method3742();
         this.field3383 = new int[var4 + 2];

         for(int var5 = 0; var5 <= var4; ++var5) {
            this.field3383[var5] = var1.method3574();
            if(this.field3383[var5] == '\uffff') {
               this.field3383[var5] = -1;
            }
         }

         this.field3383[var4 + 1] = var3;
      }

   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(I)Ljq;",
      garbageValue = "426997013"
   )
   public final class267 method5016() {
      int var1 = -1;
      if(this.field3387 != -1) {
         var1 = class138.method3159(this.field3387);
      } else if(this.field3382 != -1) {
         var1 = class225.field2578[this.field3382];
      }

      int var2;
      if(var1 >= 0 && var1 < this.field3383.length - 1) {
         var2 = this.field3383[var1];
      } else {
         var2 = this.field3383[this.field3383.length - 1];
      }

      return var2 != -1?class8.method92(var2):null;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(II)Ljava/lang/String;",
      garbageValue = "357689676"
   )
   public String method5013(int var1) {
      String var2 = this.field3365;

      while(true) {
         int var3 = var2.indexOf("%1");
         if(var3 < 0) {
            return var2;
         }

         var2 = var2.substring(0, var3) + class28.method517(var1, false) + var2.substring(var3 + 2);
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)Llc;",
      garbageValue = "-134649634"
   )
   public class318 method5019() {
      if(this.field3376 < 0) {
         return null;
      } else {
         class318 var1 = (class318)field3368.method4023((long)this.field3376);
         if(var1 != null) {
            return var1;
         } else {
            var1 = class86.method2017(class177.field2314, this.field3376, 0);
            if(var1 != null) {
               field3368.method4028(var1, (long)this.field3376);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(I)Llc;",
      garbageValue = "-1382838819"
   )
   public class318 method5011() {
      if(this.field3377 < 0) {
         return null;
      } else {
         class318 var1 = (class318)field3368.method4023((long)this.field3377);
         if(var1 != null) {
            return var1;
         } else {
            var1 = class86.method2017(class177.field2314, this.field3377, 0);
            if(var1 != null) {
               field3368.method4028(var1, (long)this.field3377);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)Llc;",
      garbageValue = "256269082"
   )
   public class318 method5015() {
      if(this.field3378 < 0) {
         return null;
      } else {
         class318 var1 = (class318)field3368.method4023((long)this.field3378);
         if(var1 != null) {
            return var1;
         } else {
            var1 = class86.method2017(class177.field2314, this.field3378, 0);
            if(var1 != null) {
               field3368.method4028(var1, (long)this.field3378);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(I)Llc;",
      garbageValue = "-748388471"
   )
   public class318 method5042() {
      if(this.field3379 < 0) {
         return null;
      } else {
         class318 var1 = (class318)field3368.method4023((long)this.field3379);
         if(var1 != null) {
            return var1;
         } else {
            var1 = class86.method2017(class177.field2314, this.field3379, 0);
            if(var1 != null) {
               field3368.method4028(var1, (long)this.field3379);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(I)Lkr;",
      garbageValue = "586093564"
   )
   public class298 method5017() {
      if(this.field3373 == -1) {
         return null;
      } else {
         class298 var1 = (class298)field3369.method4023((long)this.field3373);
         if(var1 != null) {
            return var1;
         } else {
            class247 var3 = class177.field2314;
            class247 var4 = field3366;
            int var5 = this.field3373;
            class298 var2;
            if(!class306.method5702(var3, var5, 0)) {
               var2 = null;
            } else {
               var2 = class40.method767(var4.method4626(var5, 0));
            }

            if(var2 != null) {
               field3369.method4028(var2, (long)this.field3373);
            }

            return var2;
         }
      }
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "22"
   )
   public static void method5044() {
      field3367.method4024();
      field3368.method4024();
      field3369.method4024();
   }
}
