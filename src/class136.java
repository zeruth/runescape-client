import java.net.URL;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("er")
public class class136 {

   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = 1332900993
   )
   static int field1881;
   @ObfuscatedName("w")
   final URL field1886;
   @ObfuscatedName("m")
   volatile boolean field1882;
   @ObfuscatedName("q")
   volatile byte[] field1883;


   class136(URL var1) {
      this.field1886 = var1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1886294861"
   )
   public boolean method3131() {
      return this.field1882;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(B)[B",
      garbageValue = "-80"
   )
   public byte[] method3130() {
      return this.field1883;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "([Lbb;II[I[IB)V",
      garbageValue = "-103"
   )
   static void method3137(class65[] var0, int var1, int var2, int[] var3, int[] var4) {
      if(var1 < var2) {
         int var5 = var1 - 1;
         int var6 = var2 + 1;
         int var7 = (var2 + var1) / 2;
         class65 var8 = var0[var7];
         var0[var7] = var0[var1];
         var0[var1] = var8;

         label175:
         while(var5 < var6) {
            boolean var9 = true;

            while(true) {
               --var6;
               int var10 = 0;

               while(true) {
                  int var11;
                  int var12;
                  if(var10 < 4) {
                     if(var3[var10] == 2) {
                        var11 = var0[var6].field966;
                        var12 = var8.field966;
                     } else if(var3[var10] == 1) {
                        var11 = var0[var6].field957;
                        var12 = var8.field957;
                        if(var11 == -1 && var4[var10] == 1) {
                           var11 = 2001;
                        }

                        if(var12 == -1 && var4[var10] == 1) {
                           var12 = 2001;
                        }
                     } else if(var3[var10] == 3) {
                        var11 = var0[var6].method1603()?1:0;
                        var12 = var8.method1603()?1:0;
                     } else {
                        var11 = var0[var6].field960;
                        var12 = var8.field960;
                     }

                     if(var12 == var11) {
                        if(var10 == 3) {
                           var9 = false;
                        }

                        ++var10;
                        continue;
                     }

                     if((var4[var10] != 1 || var11 <= var12) && (var4[var10] != 0 || var11 >= var12)) {
                        var9 = false;
                     }
                  }

                  if(!var9) {
                     var9 = true;

                     while(true) {
                        ++var5;
                        var10 = 0;

                        while(true) {
                           if(var10 < 4) {
                              if(var3[var10] == 2) {
                                 var11 = var0[var5].field966;
                                 var12 = var8.field966;
                              } else if(var3[var10] == 1) {
                                 var11 = var0[var5].field957;
                                 var12 = var8.field957;
                                 if(var11 == -1 && var4[var10] == 1) {
                                    var11 = 2001;
                                 }

                                 if(var12 == -1 && var4[var10] == 1) {
                                    var12 = 2001;
                                 }
                              } else if(var3[var10] == 3) {
                                 var11 = var0[var5].method1603()?1:0;
                                 var12 = var8.method1603()?1:0;
                              } else {
                                 var11 = var0[var5].field960;
                                 var12 = var8.field960;
                              }

                              if(var12 == var11) {
                                 if(var10 == 3) {
                                    var9 = false;
                                 }

                                 ++var10;
                                 continue;
                              }

                              if((var4[var10] != 1 || var11 >= var12) && (var4[var10] != 0 || var11 <= var12)) {
                                 var9 = false;
                              }
                           }

                           if(!var9) {
                              if(var5 < var6) {
                                 class65 var13 = var0[var5];
                                 var0[var5] = var0[var6];
                                 var0[var6] = var13;
                              }
                              continue label175;
                           }
                           break;
                        }
                     }
                  }
                  break;
               }
            }
         }

         method3137(var0, var1, var6, var3, var4);
         method3137(var0, var6 + 1, var2, var3, var4);
      }

   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(ILcs;ZI)I",
      garbageValue = "-1322184782"
   )
   static int method3138(int var0, class84 var1, boolean var2) {
      int var4 = -1;
      class230 var3;
      if(var0 >= 2000) {
         var0 -= 1000;
         var4 = class69.field1026[--class45.field377];
         var3 = class61.method1188(var4);
      } else {
         var3 = var2?class184.field2379:class67.field996;
      }

      if(var0 == 1100) {
         class45.field377 -= 2;
         var3.field2644 = class69.field1026[class45.field377];
         if(var3.field2644 > var3.field2674 - var3.field2627) {
            var3.field2644 = var3.field2674 - var3.field2627;
         }

         if(var3.field2644 < 0) {
            var3.field2644 = 0;
         }

         var3.field2611 = class69.field1026[class45.field377 + 1];
         if(var3.field2611 > var3.field2647 - var3.field2639) {
            var3.field2611 = var3.field2647 - var3.field2639;
         }

         if(var3.field2611 < 0) {
            var3.field2611 = 0;
         }

         class181.method3548(var3);
         return 1;
      } else if(var0 == 1101) {
         var3.field2648 = class69.field1026[--class45.field377];
         class181.method3548(var3);
         return 1;
      } else if(var0 == 1102) {
         var3.field2652 = class69.field1026[--class45.field377] == 1;
         class181.method3548(var3);
         return 1;
      } else if(var0 == 1103) {
         var3.field2638 = class69.field1026[--class45.field377];
         class181.method3548(var3);
         return 1;
      } else if(var0 == 1104) {
         var3.field2656 = class69.field1026[--class45.field377];
         class181.method3548(var3);
         return 1;
      } else if(var0 == 1105) {
         var3.field2658 = class69.field1026[--class45.field377];
         class181.method3548(var3);
         return 1;
      } else if(var0 == 1106) {
         var3.field2660 = class69.field1026[--class45.field377];
         class181.method3548(var3);
         return 1;
      } else if(var0 == 1107) {
         var3.field2729 = class69.field1026[--class45.field377] == 1;
         class181.method3548(var3);
         return 1;
      } else if(var0 == 1108) {
         var3.field2666 = 1;
         var3.field2757 = class69.field1026[--class45.field377];
         class181.method3548(var3);
         return 1;
      } else if(var0 == 1109) {
         class45.field377 -= 6;
         var3.field2672 = class69.field1026[class45.field377];
         var3.field2673 = class69.field1026[class45.field377 + 1];
         var3.field2675 = class69.field1026[class45.field377 + 2];
         var3.field2707 = class69.field1026[class45.field377 + 3];
         var3.field2676 = class69.field1026[class45.field377 + 4];
         var3.field2701 = class69.field1026[class45.field377 + 5];
         class181.method3548(var3);
         return 1;
      } else {
         int var10;
         if(var0 == 1110) {
            var10 = class69.field1026[--class45.field377];
            if(var10 != var3.field2670) {
               var3.field2670 = var10;
               var3.field2746 = 0;
               var3.field2718 = 0;
               class181.method3548(var3);
            }

            return 1;
         } else if(var0 == 1111) {
            var3.field2699 = class69.field1026[--class45.field377] == 1;
            class181.method3548(var3);
            return 1;
         } else if(var0 == 1112) {
            String var8 = class69.field1021[--class83.field1207];
            if(!var8.equals(var3.field2684)) {
               var3.field2684 = var8;
               class181.method3548(var3);
            }

            return 1;
         } else if(var0 == 1113) {
            var3.field2683 = class69.field1026[--class45.field377];
            class181.method3548(var3);
            return 1;
         } else if(var0 == 1114) {
            class45.field377 -= 3;
            var3.field2747 = class69.field1026[class45.field377];
            var3.field2688 = class69.field1026[class45.field377 + 1];
            var3.field2686 = class69.field1026[class45.field377 + 2];
            class181.method3548(var3);
            return 1;
         } else if(var0 == 1115) {
            var3.field2689 = class69.field1026[--class45.field377] == 1;
            class181.method3548(var3);
            return 1;
         } else if(var0 == 1116) {
            var3.field2662 = class69.field1026[--class45.field377];
            class181.method3548(var3);
            return 1;
         } else if(var0 == 1117) {
            var3.field2742 = class69.field1026[--class45.field377];
            class181.method3548(var3);
            return 1;
         } else if(var0 == 1118) {
            var3.field2664 = class69.field1026[--class45.field377] == 1;
            class181.method3548(var3);
            return 1;
         } else if(var0 == 1119) {
            var3.field2665 = class69.field1026[--class45.field377] == 1;
            class181.method3548(var3);
            return 1;
         } else if(var0 == 1120) {
            class45.field377 -= 2;
            var3.field2674 = class69.field1026[class45.field377];
            var3.field2647 = class69.field1026[class45.field377 + 1];
            class181.method3548(var3);
            if(var4 != -1 && var3.field2625 == 0) {
               class45.method818(class230.field2615[var4 >> 16], var3, false);
            }

            return 1;
         } else if(var0 == 1121) {
            var10 = var3.field2623;
            int var6 = var3.field2633;
            class172 var11 = class133.method3115(class169.field2225, client.field739.field1250);
            var11.field2279.method3670(var10);
            var11.field2279.method3605(var6);
            client.field739.method2019(var11);
            client.field756 = var3;
            class181.method3548(var3);
            return 1;
         } else if(var0 == 1122) {
            var3.field2616 = class69.field1026[--class45.field377];
            class181.method3548(var3);
            return 1;
         } else if(var0 == 1123) {
            var3.field2640 = class69.field1026[--class45.field377];
            class181.method3548(var3);
            return 1;
         } else if(var0 == 1124) {
            var3.field2649 = class69.field1026[--class45.field377];
            class181.method3548(var3);
            return 1;
         } else if(var0 == 1125) {
            var10 = class69.field1026[--class45.field377];
            class316[] var9 = new class316[]{class316.field3781, class316.field3777, class316.field3780, class316.field3779, class316.field3778};
            class316 var7 = (class316)class7.method89(var9, var10);
            if(var7 != null) {
               var3.field2700 = var7;
               class181.method3548(var3);
            }

            return 1;
         } else {
            boolean var5;
            if(var0 == 1126) {
               var5 = class69.field1026[--class45.field377] == 1;
               var3.field2657 = var5;
               return 1;
            } else if(var0 == 1127) {
               var5 = class69.field1026[--class45.field377] == 1;
               var3.field2679 = var5;
               return 1;
            } else {
               return 2;
            }
         }
      }
   }
}
