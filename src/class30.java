import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ay")
public final class class30 {

   @ObfuscatedName("ma")
   @ObfuscatedGetter(
      intValue = -1676181865
   )
   static int field268;
   @ObfuscatedName("w")
   boolean field280 = false;
   @ObfuscatedName("m")
   boolean field264 = false;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Law;"
   )
   class33 field266;
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Llc;"
   )
   class318 field267;
   @ObfuscatedName("f")
   HashMap field277;
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "[[Lr;"
   )
   class23[][] field272;
   @ObfuscatedName("h")
   HashMap field270 = new HashMap();
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "[Llh;"
   )
   class317[] field271;
   @ObfuscatedName("j")
   final HashMap field279;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -1123117609
   )
   int field273;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -137335597
   )
   int field274;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 1616057787
   )
   int field275;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1739457141
   )
   int field276;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 57378661
   )
   public int field269 = 0;


   @ObfuscatedSignature(
      signature = "([Llh;Ljava/util/HashMap;)V"
   )
   public class30(class317[] var1, HashMap var2) {
      this.field271 = var1;
      this.field279 = var2;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Liv;Ljava/lang/String;ZI)V",
      garbageValue = "280702549"
   )
   public void method520(class247 var1, String var2, boolean var3) {
      if(!this.field264) {
         this.field280 = false;
         this.field264 = true;
         System.nanoTime();
         int var4 = var1.method4644(class29.field257.field262);
         int var5 = var1.method4693(var4, var2);
         class182 var6 = new class182(var1.method4647(class29.field257.field262, var2));
         class182 var7 = new class182(var1.method4647(class29.field261.field262, var2));
         class182 var8 = new class182(var1.method4647(var2, class29.field260.field262));
         System.nanoTime();
         System.nanoTime();
         this.field266 = new class33();

         try {
            this.field266.method603(var6, var8, var7, var5, var3);
         } catch (IllegalStateException var20) {
            return;
         }

         this.field266.method241();
         this.field266.method242();
         this.field266.method243();
         this.field273 = this.field266.method223() * 64;
         this.field274 = this.field266.method292() * 64;
         this.field275 = (this.field266.method238() - this.field266.method223() + 1) * 64;
         this.field276 = (this.field266.method270() - this.field266.method292() + 1) * 64;
         int var17 = this.field266.method238() - this.field266.method223() + 1;
         int var10 = this.field266.method270() - this.field266.method292() + 1;
         System.nanoTime();
         System.nanoTime();
         class23.field203.method4039();
         class23.field204.method4039();
         this.field272 = new class23[var17][var10];
         Iterator var11 = this.field266.field292.iterator();

         while(var11.hasNext()) {
            class10 var12 = (class10)var11.next();
            int var13 = var12.field131;
            int var14 = var12.field135;
            int var15 = var13 - this.field266.method223();
            int var16 = var14 - this.field266.method292();
            this.field272[var15][var16] = new class23(var13, var14, this.field266.method235(), this.field279);
            this.field272[var15][var16].method310(var12, this.field266.field291);
         }

         for(int var18 = 0; var18 < var17; ++var18) {
            for(int var19 = 0; var19 < var10; ++var19) {
               if(this.field272[var18][var19] == null) {
                  this.field272[var18][var19] = new class23(this.field266.method223() + var18, this.field266.method292() + var19, this.field266.method235(), this.field279);
                  this.field272[var18][var19].method378(this.field266.field293, this.field266.field291);
               }
            }
         }

         System.nanoTime();
         System.nanoTime();
         if(var1.method4689(class29.field259.field262, var2)) {
            byte[] var21 = var1.method4647(class29.field259.field262, var2);
            this.field267 = class256.method4854(var21);
         }

         System.nanoTime();
         var1.method4662();
         var1.method4642();
         this.field280 = true;
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "502427036"
   )
   public final void method561() {
      this.field277 = null;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(IIIIIIIIB)V",
      garbageValue = "59"
   )
   public final void method548(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int[] var9 = class314.field3772;
      int var10 = class314.field3770;
      int var11 = class314.field3766;
      int[] var12 = new int[4];
      class314.method5776(var12);
      class17 var13 = this.method527(var1, var2, var3, var4);
      float var14 = this.method522(var7 - var5, var3 - var1);
      int var15 = (int)Math.ceil((double)var14);
      this.field269 = var15;
      if(!this.field270.containsKey(Integer.valueOf(var15))) {
         class35 var16 = new class35(var15);
         var16.method640();
         this.field270.put(Integer.valueOf(var15), var16);
      }

      class23[] var22 = new class23[8];

      int var17;
      int var18;
      for(var17 = var13.field143; var17 < var13.field143 + var13.field147; ++var17) {
         for(var18 = var13.field145; var18 < var13.field144 + var13.field145; ++var18) {
            this.method524(var17, var18, var22);
            this.field272[var17][var18].method314(var15, (class35)this.field270.get(Integer.valueOf(var15)), var22, this.field271);
         }
      }

      class314.method5761(var9, var10, var11);
      class314.method5766(var12);
      var17 = (int)(64.0F * var14);
      var18 = this.field273 + var1;
      int var19 = var2 + this.field274;

      for(int var20 = var13.field143; var20 < var13.field147 + var13.field143; ++var20) {
         for(int var21 = var13.field145; var21 < var13.field144 + var13.field145; ++var21) {
            this.field272[var20][var21].method418(var5 + var17 * (this.field272[var20][var21].field205 * 64 - var18) / 64, var8 - var17 * (this.field272[var20][var21].field206 * 64 - var19 + 64) / 64, var17);
         }
      }

   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZB)V",
      garbageValue = "1"
   )
   public final void method523(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13) {
      class17 var14 = this.method527(var1, var2, var3, var4);
      float var15 = this.method522(var7 - var5, var3 - var1);
      int var16 = (int)(var15 * 64.0F);
      int var17 = this.field273 + var1;
      int var18 = var2 + this.field274;

      int var19;
      int var20;
      for(var19 = var14.field143; var19 < var14.field143 + var14.field147; ++var19) {
         for(var20 = var14.field145; var20 < var14.field145 + var14.field144; ++var20) {
            if(var13) {
               this.field272[var19][var20].method337();
            }

            this.field272[var19][var20].method315(var5 + var16 * (this.field272[var19][var20].field205 * 64 - var17) / 64, var8 - var16 * (this.field272[var19][var20].field206 * 64 - var18 + 64) / 64, var16, var9);
         }
      }

      if(var10 != null && var11 > 0) {
         for(var19 = var14.field143; var19 < var14.field143 + var14.field147; ++var19) {
            for(var20 = var14.field145; var20 < var14.field144 + var14.field145; ++var20) {
               this.field272[var19][var20].method316(var10, var11, var12);
            }
         }
      }

   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(II[Lr;S)V",
      garbageValue = "-11249"
   )
   void method524(int var1, int var2, class23[] var3) {
      boolean var4 = var1 <= 0;
      boolean var5 = var1 >= this.field272.length - 1;
      boolean var6 = var2 <= 0;
      boolean var7 = var2 >= this.field272[0].length - 1;
      if(var7) {
         var3[class240.field3128.vmethod5860()] = null;
      } else {
         var3[class240.field3128.vmethod5860()] = this.field272[var1][var2 + 1];
      }

      var3[class240.field3121.vmethod5860()] = !var7 && !var5?this.field272[var1 + 1][var2 + 1]:null;
      var3[class240.field3120.vmethod5860()] = !var7 && !var4?this.field272[var1 - 1][var2 + 1]:null;
      var3[class240.field3125.vmethod5860()] = var5?null:this.field272[var1 + 1][var2];
      var3[class240.field3127.vmethod5860()] = var4?null:this.field272[var1 - 1][var2];
      var3[class240.field3124.vmethod5860()] = var6?null:this.field272[var1][var2 - 1];
      var3[class240.field3123.vmethod5860()] = !var6 && !var5?this.field272[var1 + 1][var2 - 1]:null;
      var3[class240.field3122.vmethod5860()] = !var6 && !var4?this.field272[var1 - 1][var2 - 1]:null;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(IIIILjava/util/HashSet;III)V",
      garbageValue = "-1866436282"
   )
   public void method525(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7) {
      if(this.field267 != null) {
         this.field267.method5897(var1, var2, var3, var4);
         if(var6 > 0 && var6 % var7 < var7 / 2) {
            if(this.field277 == null) {
               this.method529();
            }

            Iterator var8 = var5.iterator();

            while(var8.hasNext()) {
               int var9 = ((Integer)var8.next()).intValue();
               List var10 = (List)this.field277.get(Integer.valueOf(var9));
               if(var10 != null) {
                  Iterator var11 = var10.iterator();

                  while(var11.hasNext()) {
                     class28 var12 = (class28)var11.next();
                     int var13 = var3 * (var12.field247.field2581 - this.field273) / this.field275;
                     int var14 = var4 - (var12.field247.field2583 - this.field274) * var4 / this.field276;
                     class314.method5818(var13 + var1, var14 + var2, 2, 16776960, 256);
                  }
               }
            }

         }
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IIIIIIIIIIB)Ljava/util/List;",
      garbageValue = "-27"
   )
   public List method560(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      LinkedList var11 = new LinkedList();
      if(!this.field280) {
         return var11;
      } else {
         class17 var12 = this.method527(var1, var2, var3, var4);
         float var13 = this.method522(var7, var3 - var1);
         int var14 = (int)(64.0F * var13);
         int var15 = this.field273 + var1;
         int var16 = var2 + this.field274;

         for(int var17 = var12.field143; var17 < var12.field147 + var12.field143; ++var17) {
            for(int var18 = var12.field145; var18 < var12.field144 + var12.field145; ++var18) {
               List var19 = this.field272[var17][var18].method344(var5 + var14 * (this.field272[var17][var18].field205 * 64 - var15) / 64, var8 + var6 - var14 * (this.field272[var17][var18].field206 * 64 - var16 + 64) / 64, var14, var9, var10);
               if(!var19.isEmpty()) {
                  var11.addAll(var19);
               }
            }
         }

         return var11;
      }
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(IIIIB)Le;",
      garbageValue = "36"
   )
   class17 method527(int var1, int var2, int var3, int var4) {
      class17 var5 = new class17(this);
      int var6 = this.field273 + var1;
      int var7 = var2 + this.field274;
      int var8 = var3 + this.field273;
      int var9 = var4 + this.field274;
      int var10 = var6 / 64;
      int var11 = var7 / 64;
      int var12 = var8 / 64;
      int var13 = var9 / 64;
      var5.field147 = var12 - var10 + 1;
      var5.field144 = var13 - var11 + 1;
      var5.field143 = var10 - this.field266.method223();
      var5.field145 = var11 - this.field266.method292();
      if(var5.field143 < 0) {
         var5.field147 += var5.field143;
         var5.field143 = 0;
      }

      if(var5.field143 > this.field272.length - var5.field147) {
         var5.field147 = this.field272.length - var5.field143;
      }

      if(var5.field145 < 0) {
         var5.field144 += var5.field145;
         var5.field145 = 0;
      }

      if(var5.field145 > this.field272[0].length - var5.field144) {
         var5.field144 = this.field272[0].length - var5.field145;
      }

      var5.field147 = Math.min(var5.field147, this.field272.length);
      var5.field144 = Math.min(var5.field144, this.field272[0].length);
      return var5;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "-114"
   )
   public boolean method554() {
      return this.field280;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(I)Ljava/util/HashMap;",
      garbageValue = "-1086166774"
   )
   public HashMap method546() {
      this.method529();
      return this.field277;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2010052197"
   )
   void method529() {
      if(this.field277 == null) {
         this.field277 = new HashMap();
      }

      this.field277.clear();

      for(int var1 = 0; var1 < this.field272.length; ++var1) {
         for(int var2 = 0; var2 < this.field272[var1].length; ++var2) {
            List var3 = this.field272[var1][var2].method449();
            Iterator var4 = var3.iterator();

            while(var4.hasNext()) {
               class28 var5 = (class28)var4.next();
               if(!this.field277.containsKey(Integer.valueOf(var5.field251))) {
                  LinkedList var6 = new LinkedList();
                  var6.add(var5);
                  this.field277.put(Integer.valueOf(var5.field251), var6);
               } else {
                  List var7 = (List)this.field277.get(Integer.valueOf(var5.field251));
                  var7.add(var5);
               }
            }
         }
      }

   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(III)F",
      garbageValue = "1789202139"
   )
   float method522(int var1, int var2) {
      float var3 = (float)var1 / (float)var2;
      if(var3 > 8.0F) {
         return 8.0F;
      } else if(var3 < 1.0F) {
         return 1.0F;
      } else {
         int var4 = Math.round(var3);
         return Math.abs((float)var4 - var3) < 0.05F?(float)var4:var3;
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-1268534884"
   )
   public static boolean method562() {
      class312 var0 = (class312)class313.field3762.method4072();
      return var0 != null;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(IB)Ljk;",
      garbageValue = "-107"
   )
   public static class260 method552(int var0) {
      class260 var1 = (class260)class260.field3312.method4023((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = class260.field3309.method4626(3, var0);
         var1 = new class260();
         if(var2 != null) {
            var1.method4896(new class182(var2));
         }

         class260.field3312.method4028(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(IIII)I",
      garbageValue = "188281095"
   )
   static final int method559(int var0, int var1, int var2) {
      int var3 = 256 - var2;
      return ((var1 & 16711935) * var2 + var3 * (var0 & 16711935) & -16711936) + ((var1 & '\uff00') * var2 + (var0 & '\uff00') * var3 & 16711680) >> 8;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(ILcs;ZB)I",
      garbageValue = "31"
   )
   static int method528(int var0, class84 var1, boolean var2) {
      String var3;
      if(var0 == 3100) {
         var3 = class69.field1021[--class83.field1207];
         class61.method1189(0, "", var3);
         return 1;
      } else if(var0 == 3101) {
         class45.field377 -= 2;
         class144.method3193(class150.field1948, class69.field1026[class45.field377], class69.field1026[class45.field377 + 1]);
         return 1;
      } else if(var0 == 3103) {
         class9.method99();
         return 1;
      } else {
         boolean var7;
         int var9;
         int var21;
         class172 var24;
         if(var0 == 3104) {
            var3 = class69.field1021[--class83.field1207];
            var21 = 0;
            var7 = false;
            boolean var8 = false;
            var9 = 0;
            int var10 = var3.length();
            int var11 = 0;

            boolean var6;
            while(true) {
               if(var11 >= var10) {
                  var6 = var8;
                  break;
               }

               label438: {
                  char var12 = var3.charAt(var11);
                  if(var11 == 0) {
                     if(var12 == 45) {
                        var7 = true;
                        break label438;
                     }

                     if(var12 == 43) {
                        break label438;
                     }
                  }

                  int var23;
                  if(var12 >= 48 && var12 <= 57) {
                     var23 = var12 - 48;
                  } else if(var12 >= 65 && var12 <= 90) {
                     var23 = var12 - 55;
                  } else {
                     if(var12 < 97 || var12 > 122) {
                        var6 = false;
                        break;
                     }

                     var23 = var12 - 87;
                  }

                  if(var23 >= 10) {
                     var6 = false;
                     break;
                  }

                  if(var7) {
                     var23 = -var23;
                  }

                  int var13 = var9 * 10 + var23;
                  if(var9 != var13 / 10) {
                     var6 = false;
                     break;
                  }

                  var9 = var13;
                  var8 = true;
               }

               ++var11;
            }

            if(var6) {
               int var22 = class1.method13(var3, 10, true);
               var21 = var22;
            }

            var24 = class133.method3115(class169.field2228, client.field739.field1250);
            var24.field2279.method3555(var21);
            client.field739.method2019(var24);
            return 1;
         } else {
            class172 var26;
            if(var0 == 3105) {
               var3 = class69.field1021[--class83.field1207];
               var26 = class133.method3115(class169.field2239, client.field739.field1250);
               var26.field2279.method3552(var3.length() + 1);
               var26.field2279.method3549(var3);
               client.field739.method2019(var26);
               return 1;
            } else if(var0 == 3106) {
               var3 = class69.field1021[--class83.field1207];
               var26 = class133.method3115(class169.field2249, client.field739.field1250);
               var26.field2279.method3552(var3.length() + 1);
               var26.field2279.method3549(var3);
               client.field739.method2019(var26);
               return 1;
            } else {
               int var5;
               String var15;
               int var16;
               if(var0 != 3107) {
                  if(var0 == 3108) {
                     class45.field377 -= 3;
                     var16 = class69.field1026[class45.field377];
                     var21 = class69.field1026[class45.field377 + 1];
                     var5 = class69.field1026[class45.field377 + 2];
                     class230 var25 = class61.method1188(var5);
                     class35.method685(var25, var16, var21);
                     return 1;
                  } else if(var0 == 3109) {
                     class45.field377 -= 2;
                     var16 = class69.field1026[class45.field377];
                     var21 = class69.field1026[class45.field377 + 1];
                     class230 var28 = var2?class184.field2379:class67.field996;
                     class35.method685(var28, var16, var21);
                     return 1;
                  } else if(var0 == 3110) {
                     class8.field57 = class69.field1026[--class45.field377] == 1;
                     return 1;
                  } else if(var0 == 3111) {
                     class69.field1026[++class45.field377 - 1] = class51.field468.field981?1:0;
                     return 1;
                  } else if(var0 == 3112) {
                     class51.field468.field981 = class69.field1026[--class45.field377] == 1;
                     class266.method5008();
                     return 1;
                  } else if(var0 == 3113) {
                     var3 = class69.field1021[--class83.field1207];
                     boolean var4 = class69.field1026[--class45.field377] == 1;
                     class32.method590(var3, var4, "openjs", false);
                     return 1;
                  } else if(var0 == 3115) {
                     var16 = class69.field1026[--class45.field377];
                     var26 = class133.method3115(class169.field2200, client.field739.field1250);
                     var26.field2279.method3602(var16);
                     client.field739.method2019(var26);
                     return 1;
                  } else if(var0 == 3116) {
                     var16 = class69.field1026[--class45.field377];
                     class83.field1207 -= 2;
                     var15 = class69.field1021[class83.field1207];
                     String var20 = class69.field1021[class83.field1207 + 1];
                     if(var15.length() > 500) {
                        return 1;
                     } else if(var20.length() > 500) {
                        return 1;
                     } else {
                        var24 = class133.method3115(class169.field2205, client.field739.field1250);
                        var24.field2279.method3602(1 + class12.method123(var15) + class12.method123(var20));
                        var24.field2279.method3549(var20);
                        var24.field2279.method3552(var16);
                        var24.field2279.method3549(var15);
                        client.field739.method2019(var24);
                        return 1;
                     }
                  } else if(var0 == 3117) {
                     client.field733 = class69.field1026[--class45.field377] == 1;
                     return 1;
                  } else if(var0 == 3118) {
                     client.field740 = class69.field1026[--class45.field377] == 1;
                     return 1;
                  } else if(var0 == 3119) {
                     client.field711 = class69.field1026[--class45.field377] == 1;
                     return 1;
                  } else if(var0 == 3120) {
                     if(class69.field1026[--class45.field377] == 1) {
                        client.field712 |= 1;
                     } else {
                        client.field712 &= -2;
                     }

                     return 1;
                  } else if(var0 == 3121) {
                     if(class69.field1026[--class45.field377] == 1) {
                        client.field712 |= 2;
                     } else {
                        client.field712 &= -3;
                     }

                     return 1;
                  } else if(var0 == 3122) {
                     if(class69.field1026[--class45.field377] == 1) {
                        client.field712 |= 4;
                     } else {
                        client.field712 &= -5;
                     }

                     return 1;
                  } else if(var0 == 3123) {
                     if(class69.field1026[--class45.field377] == 1) {
                        client.field712 |= 8;
                     } else {
                        client.field712 &= -9;
                     }

                     return 1;
                  } else if(var0 == 3124) {
                     client.field712 = 0;
                     return 1;
                  } else if(var0 == 3125) {
                     client.field664 = class69.field1026[--class45.field377] == 1;
                     return 1;
                  } else if(var0 == 3126) {
                     client.field715 = class69.field1026[--class45.field377] == 1;
                     return 1;
                  } else if(var0 == 3127) {
                     boolean var27 = class69.field1026[--class45.field377] == 1;
                     client.field669 = var27;
                     return 1;
                  } else if(var0 == 3128) {
                     class69.field1026[++class45.field377 - 1] = class275.method5250()?1:0;
                     return 1;
                  } else if(var0 == 3129) {
                     class45.field377 -= 2;
                     client.field672 = class69.field1026[class45.field377];
                     client.field673 = class69.field1026[class45.field377 + 1];
                     return 1;
                  } else if(var0 == 3130) {
                     class45.field377 -= 2;
                     return 1;
                  } else if(var0 == 3131) {
                     --class45.field377;
                     return 1;
                  } else {
                     return 2;
                  }
               } else {
                  var16 = class69.field1026[--class45.field377];
                  var15 = class69.field1021[--class83.field1207];
                  var5 = class81.field1180;
                  int[] var14 = class81.field1181;
                  var7 = false;
                  class291 var17 = new class291(var15, class19.field168);

                  for(var9 = 0; var9 < var5; ++var9) {
                     class60 var18 = client.field806[var14[var9]];
                     if(var18 != null && var18 != class150.field1948 && var18.field587 != null && var18.field587.equals(var17)) {
                        class172 var19;
                        if(var16 == 1) {
                           var19 = class133.method3115(class169.field2213, client.field739.field1250);
                           var19.field2279.method3605(var14[var9]);
                           var19.field2279.method3594(0);
                           client.field739.method2019(var19);
                        } else if(var16 == 4) {
                           var19 = class133.method3115(class169.field2218, client.field739.field1250);
                           var19.field2279.method3552(0);
                           var19.field2279.method3725(var14[var9]);
                           client.field739.method2019(var19);
                        } else if(var16 == 6) {
                           var19 = class133.method3115(class169.field2164, client.field739.field1250);
                           var19.field2279.method3707(var14[var9]);
                           var19.field2279.method3594(0);
                           client.field739.method2019(var19);
                        } else if(var16 == 7) {
                           var19 = class133.method3115(class169.field2180, client.field739.field1250);
                           var19.field2279.method3725(var14[var9]);
                           var19.field2279.method3594(0);
                           client.field739.method2019(var19);
                        }

                        var7 = true;
                        break;
                     }
                  }

                  if(!var7) {
                     class61.method1189(4, "", "Unable to find " + var15);
                  }

                  return 1;
               }
            }
         }
      }
   }
}
