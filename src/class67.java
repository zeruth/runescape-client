import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bm")
public class class67 {

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lhl;"
   )
   static class230 field996;
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Lla;"
   )
   final class322 field988;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lkn;"
   )
   public final class290 field989;
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "Ljz;"
   )
   public final class284 field993;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 364671715
   )
   int field994 = 0;


   @ObfuscatedSignature(
      signature = "(Lla;)V"
   )
   class67(class322 var1) {
      this.field988 = var1;
      this.field989 = new class290(var1);
      this.field993 = new class284(var1);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "949143045"
   )
   boolean method1663() {
      return this.field994 == 2;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1887534903"
   )
   final void method1664() {
      this.field994 = 1;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Lgy;II)V",
      garbageValue = "-164625233"
   )
   final void method1665(class182 var1, int var2) {
      this.field989.method5449(var1, var2);
      this.field994 = 2;

      for(int var3 = 0; var3 < class81.field1180; ++var3) {
         class60 var4 = client.field806[class81.field1181[var3]];
         var4.method1158();
      }

      Iterator var5 = class83.field1203.iterator();

      while(var5.hasNext()) {
         class58 var6 = (class58)var5.next();
         var6.method1095();
      }

      if(class0.field2 != null) {
         class0.field2.method5518();
      }

   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1443163446"
   )
   final void method1698() {
      for(class294 var1 = (class294)this.field989.field3658.method4147(); var1 != null; var1 = (class294)this.field989.field3658.method4146()) {
         if((long)var1.field3676 < class166.method3456() / 1000L - 5L) {
            if(var1.field3677 > 0) {
               class61.method1189(5, "", var1.field3675 + " has logged in.");
            }

            if(var1.field3677 == 0) {
               class61.method1189(5, "", var1.field3675 + " has logged out.");
            }

            var1.method4156();
         }
      }

   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1922799886"
   )
   final void method1667() {
      this.field994 = 0;
      this.field989.method5340();
      this.field993.method5340();
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Lkm;ZI)Z",
      garbageValue = "-1852519047"
   )
   final boolean method1668(class291 var1, boolean var2) {
      return var1 == null?false:(var1.equals(class150.field1948.field587)?true:this.field989.method5457(var1, var2));
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lkm;I)Z",
      garbageValue = "611113321"
   )
   final boolean method1669(class291 var1) {
      return var1 == null?false:this.field993.method5343(var1);
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;B)V",
      garbageValue = "0"
   )
   final void method1672(String var1) {
      if(var1 != null) {
         class291 var2 = new class291(var1, this.field988);
         if(var2.method5463()) {
            if(this.method1671()) {
               class164.method3448("Your friend list is full. Max of 200 for free users, and 400 for members");
            } else if(class150.field1948.field587.equals(var2)) {
               class174.method3498();
            } else if(this.method1668(var2, false)) {
               class130.method3094(var1);
            } else if(this.method1669(var2)) {
               class11.method112(var1);
            } else {
               class138.method3158(var1);
            }
         }
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-773051644"
   )
   final boolean method1671() {
      return this.field989.method5342() || this.field989.method5341() >= 200 && client.field710 != 1;
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;B)V",
      garbageValue = "2"
   )
   final void method1670(String var1) {
      if(var1 != null) {
         class291 var2 = new class291(var1, this.field988);
         if(var2.method5463()) {
            if(this.method1673()) {
               class37.method720();
            } else if(class150.field1948.field587.equals(var2)) {
               class164.method3448("You can\'t add yourself to your own ignore list");
            } else if(this.method1669(var2)) {
               class11.method115(var1);
            } else if(this.method1668(var2, false)) {
               class164.method3448("Please remove " + var1 + " from your friend list first");
            } else {
               class74.method1845(var1);
            }
         }
      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "83"
   )
   final boolean method1673() {
      return this.field993.method5342() || this.field993.method5341() >= 100 && client.field710 != 1;
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;B)V",
      garbageValue = "-72"
   )
   final void method1674(String var1) {
      if(var1 != null) {
         class291 var2 = new class291(var1, this.field988);
         if(var2.method5463()) {
            if(this.field989.method5397(var2)) {
               client.field742 = client.field775;
               class172 var3 = class133.method3115(class169.field2250, client.field739.field1250);
               var3.field2279.method3552(class12.method123(var1));
               var3.field2279.method3549(var1);
               client.field739.method2019(var3);
            }

            for(int var5 = 0; var5 < class81.field1180; ++var5) {
               class60 var4 = client.field806[class81.field1181[var5]];
               var4.method1158();
            }

            Iterator var6 = class83.field1203.iterator();

            while(var6.hasNext()) {
               class58 var7 = (class58)var6.next();
               var7.method1095();
            }

            if(class0.field2 != null) {
               class0.field2.method5518();
            }

         }
      }
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "-1697776287"
   )
   final void method1675(String var1) {
      if(var1 != null) {
         class291 var2 = new class291(var1, this.field988);
         if(var2.method5463()) {
            if(this.field993.method5397(var2)) {
               client.field742 = client.field775;
               class172 var3 = class133.method3115(class169.field2214, client.field739.field1250);
               var3.field2279.method3552(class12.method123(var1));
               var3.field2279.method3549(var1);
               client.field739.method2019(var3);
            }

            class169.method3460();
            if(class0.field2 != null) {
               class0.field2.method5498();
            }

         }
      }
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      signature = "(Lkm;B)Z",
      garbageValue = "22"
   )
   final boolean method1693(class291 var1) {
      class292 var2 = (class292)this.field989.method5344(var1);
      return var2 != null && var2.method5438();
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lbr;I)V",
      garbageValue = "-1754453186"
   )
   public static void method1728(class56 var0) {
      class57.method1092(var0, 500000);
   }
}
