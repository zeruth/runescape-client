import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bu")
public final class class60 extends class63 {

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lkm;"
   )
   class291 field587;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lhu;"
   )
   class227 field561;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -622472595
   )
   int field563 = -1;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 2009567535
   )
   int field564 = -1;
   @ObfuscatedName("n")
   String[] field565 = new String[3];
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 99575255
   )
   int field566;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -99521121
   )
   int field576;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -1815492519
   )
   int field572;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 2082665571
   )
   int field575;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 1895213115
   )
   int field570;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -340353
   )
   int field571;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 679314851
   )
   int field562;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -29897551
   )
   int field582;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Ldk;"
   )
   class119 field574;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -1750997421
   )
   int field568;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -278093477
   )
   int field573;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -780779311
   )
   int field577;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = -373128361
   )
   int field578;
   @ObfuscatedName("u")
   boolean field579;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 1190699813
   )
   int field569;
   @ObfuscatedName("z")
   boolean field567;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -1704637145
   )
   int field581;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 1276964475
   )
   int field583;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "Lke;"
   )
   class289 field584;
   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "Lke;"
   )
   class289 field580;
   @ObfuscatedName("ai")
   boolean field586;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 1449199021
   )
   int field585;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = 259594137
   )
   int field588;


   class60() {
      for(int var1 = 0; var1 < 3; ++var1) {
         this.field565[var1] = "";
      }

      this.field566 = 0;
      this.field576 = 0;
      this.field575 = 0;
      this.field570 = 0;
      this.field579 = false;
      this.field569 = 0;
      this.field567 = false;
      this.field584 = class289.field3652;
      this.field580 = class289.field3652;
      this.field586 = false;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lgy;I)V",
      garbageValue = "823697146"
   )
   final void method1132(class182 var1) {
      var1.field2359 = 0;
      int var2 = var1.method3742();
      this.field563 = var1.method3569();
      this.field564 = var1.method3569();
      int var3 = -1;
      this.field569 = 0;
      int[] var4 = new int[12];

      int var6;
      int var7;
      for(int var5 = 0; var5 < 12; ++var5) {
         var6 = var1.method3742();
         if(var6 == 0) {
            var4[var5] = 0;
         } else {
            var7 = var1.method3742();
            var4[var5] = var7 + (var6 << 8);
            if(var5 == 0 && var4[0] == '\uffff') {
               var3 = var1.method3574();
               break;
            }

            if(var4[var5] >= 512) {
               int var8 = class120.method2784(var4[var5] - 512).field3439;
               if(var8 != 0) {
                  this.field569 = var8;
               }
            }
         }
      }

      int[] var9 = new int[5];

      for(var6 = 0; var6 < 5; ++var6) {
         var7 = var1.method3742();
         if(var7 < 0 || var7 >= class185.field2390[var6].length) {
            var7 = 0;
         }

         var9[var6] = var7;
      }

      super.field909 = var1.method3574();
      if(super.field909 == '\uffff') {
         super.field909 = -1;
      }

      super.field892 = var1.method3574();
      if(super.field892 == '\uffff') {
         super.field892 = -1;
      }

      super.field889 = super.field892;
      super.field890 = var1.method3574();
      if(super.field890 == '\uffff') {
         super.field890 = -1;
      }

      super.field891 = var1.method3574();
      if(super.field891 == '\uffff') {
         super.field891 = -1;
      }

      super.field882 = var1.method3574();
      if(super.field882 == '\uffff') {
         super.field882 = -1;
      }

      super.field893 = var1.method3574();
      if(super.field893 == '\uffff') {
         super.field893 = -1;
      }

      super.field894 = var1.method3574();
      if(super.field894 == '\uffff') {
         super.field894 = -1;
      }

      this.field587 = new class291(var1.method3577(), class19.field168);
      this.method1158();
      this.method1166();
      if(this == class150.field1948) {
         class152.field1958 = this.field587.method5462();
      }

      this.field566 = var1.method3742();
      this.field576 = var1.method3574();
      this.field567 = var1.method3742() == 1;
      if(client.field596 == 0 && client.field729 >= 2) {
         this.field567 = false;
      }

      if(this.field561 == null) {
         this.field561 = new class227();
      }

      this.field561.method4485(var4, var9, var2 == 1, var3);
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(S)Z",
      garbageValue = "-20377"
   )
   boolean method1133() {
      if(this.field584 == class289.field3652) {
         this.method1135();
      }

      return this.field584 == class289.field3651;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "0"
   )
   void method1158() {
      this.field584 = class289.field3652;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1840993465"
   )
   void method1135() {
      this.field584 = class109.field1453.method1693(this.field587)?class289.field3651:class289.field3650;
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "761211200"
   )
   boolean method1136() {
      if(this.field580 == class289.field3652) {
         this.method1165();
      }

      return this.field580 == class289.field3651;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "31"
   )
   void method1166() {
      this.field580 = class289.field3652;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "86"
   )
   void method1165() {
      this.field580 = class0.field2 != null && class0.field2.method5343(this.field587)?class289.field3651:class289.field3650;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1863583752"
   )
   int method1141() {
      return this.field561 != null && this.field561.field2596 != -1?class59.method1125(this.field561.field2596).field3519:1;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(B)Ldk;",
      garbageValue = "111"
   )
   protected final class119 vmethod3078() {
      if(this.field561 == null) {
         return null;
      } else {
         class273 var1 = super.field915 != -1 && super.field913 == 0?class137.method3151(super.field915):null;
         class273 var2 = super.field912 != -1 && !this.field579 && (super.field909 != super.field912 || var1 == null)?class137.method3151(super.field912):null;
         class119 var3 = this.field561.method4506(var1, super.field916, var2, super.field911);
         if(var3 == null) {
            return null;
         } else {
            var3.method2725();
            super.field922 = var3.field1805;
            class119 var4;
            class119[] var5;
            if(!this.field579 && super.field920 != -1 && super.field921 != -1) {
               var4 = class51.method1064(super.field920).method4864(super.field921);
               if(var4 != null) {
                  var4.method2736(0, -super.field924, 0);
                  var5 = new class119[]{var3, var4};
                  var3 = new class119(var5, 2);
               }
            }

            if(!this.field579 && this.field574 != null) {
               if(client.field679 >= this.field570) {
                  this.field574 = null;
               }

               if(client.field679 >= this.field575 && client.field679 < this.field570) {
                  var4 = this.field574;
                  var4.method2736(this.field571 - super.field900, this.field562 - this.field572, this.field582 - super.field918);
                  if(super.field934 == 512) {
                     var4.method2732();
                     var4.method2732();
                     var4.method2732();
                  } else if(super.field934 == 1024) {
                     var4.method2732();
                     var4.method2732();
                  } else if(super.field934 == 1536) {
                     var4.method2732();
                  }

                  var5 = new class119[]{var3, var4};
                  var3 = new class119(var5, 2);
                  if(super.field934 == 512) {
                     var4.method2732();
                  } else if(super.field934 == 1024) {
                     var4.method2732();
                     var4.method2732();
                  } else if(super.field934 == 1536) {
                     var4.method2732();
                     var4.method2732();
                     var4.method2732();
                  }

                  var4.method2736(super.field900 - this.field571, this.field572 - this.field562, super.field918 - this.field582);
               }
            }

            var3.field1636 = true;
            return var3;
         }
      }
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(IIBI)V",
      garbageValue = "271359947"
   )
   final void method1134(int var1, int var2, byte var3) {
      if(super.field915 != -1 && class137.method3151(super.field915).field3563 == 1) {
         super.field915 = -1;
      }

      super.field897 = -1;
      if(var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
         if(super.field928[0] >= 0 && super.field928[0] < 104 && super.field939[0] >= 0 && super.field939[0] < 104) {
            if(var3 == 2) {
               class42.method783(this, var1, var2, (byte)2);
            }

            this.method1164(var1, var2, var3);
         } else {
            this.method1173(var1, var2);
         }
      } else {
         this.method1173(var1, var2);
      }

   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-1091413538"
   )
   void method1173(int var1, int var2) {
      super.field937 = 0;
      super.field942 = 0;
      super.field936 = 0;
      super.field928[0] = var1;
      super.field939[0] = var2;
      int var3 = this.method1141();
      super.field900 = var3 * 64 + super.field928[0] * 128;
      super.field918 = var3 * 64 + super.field939[0] * 128;
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(IIBB)V",
      garbageValue = "-13"
   )
   final void method1164(int var1, int var2, byte var3) {
      if(super.field937 < 9) {
         ++super.field937;
      }

      for(int var4 = super.field937; var4 > 0; --var4) {
         super.field928[var4] = super.field928[var4 - 1];
         super.field939[var4] = super.field939[var4 - 1];
         super.field940[var4] = super.field940[var4 - 1];
      }

      super.field928[0] = var1;
      super.field939[0] = var2;
      super.field940[0] = var3;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "0"
   )
   final boolean vmethod1828() {
      return this.field561 != null;
   }

   @ObfuscatedName("hu")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "1319164937"
   )
   static final void method1178(int var0, int var1) {
      if(client.field657 >= 2 || client.field771 != 0 || client.field813) {
         if(client.field740) {
            int var2 = client.field657 - 1;
            String var4;
            if(client.field771 == 1 && client.field657 < 2) {
               var4 = "Use" + " " + client.field759 + " " + "->";
            } else if(client.field813 && client.field657 < 2) {
               var4 = client.field750 + " " + client.field751 + " " + "->";
            } else {
               var4 = class234.method4595(var2);
            }

            if(client.field657 > 2) {
               var4 = var4 + class50.method1060(16777215) + " " + '/' + " " + (client.field657 - 2) + " more options";
            }

            class55.field499.method5549(var4, var0 + 4, var1 + 15, 16777215, 0, client.field679 / 1000);
         }
      }
   }
}
