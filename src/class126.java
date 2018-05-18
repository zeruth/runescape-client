import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("db")
public class class126 {

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(ILcs;ZI)I",
      garbageValue = "2146503778"
   )
   static int method3072(int var0, class84 var1, boolean var2) {
      byte var3;
      int var4;
      int var6;
      int var9;
      int var24;
      class230 var67;
      class230 var68;
      if(var0 < 1000) {
         if(var0 == 100) {
            class45.field377 -= 3;
            var4 = class69.field1026[class45.field377];
            var24 = class69.field1026[class45.field377 + 1];
            var6 = class69.field1026[class45.field377 + 2];
            if(var24 == 0) {
               throw new RuntimeException();
            }

            class230 var30 = class61.method1188(var4);
            if(var30.field2626 == null) {
               var30.field2626 = new class230[var6 + 1];
            }

            if(var30.field2626.length <= var6) {
               class230[] var32 = new class230[var6 + 1];

               for(var9 = 0; var9 < var30.field2626.length; ++var9) {
                  var32[var9] = var30.field2626[var9];
               }

               var30.field2626 = var32;
            }

            if(var6 > 0 && var30.field2626[var6 - 1] == null) {
               throw new RuntimeException("" + (var6 - 1));
            }

            class230 var33 = new class230();
            var33.field2625 = var24;
            var33.field2642 = var33.field2623 = var30.field2623;
            var33.field2633 = var6;
            var33.field2622 = true;
            var30.field2626[var6] = var33;
            if(var2) {
               class184.field2379 = var33;
            } else {
               class67.field996 = var33;
            }

            class181.method3548(var30);
            var3 = 1;
         } else if(var0 == 101) {
            var68 = var2?class184.field2379:class67.field996;
            var67 = class61.method1188(var68.field2623);
            var67.field2626[var68.field2633] = null;
            class181.method3548(var67);
            var3 = 1;
         } else if(var0 == 102) {
            var68 = class61.method1188(class69.field1026[--class45.field377]);
            var68.field2626 = null;
            class181.method3548(var68);
            var3 = 1;
         } else if(var0 == 200) {
            class45.field377 -= 2;
            var4 = class69.field1026[class45.field377];
            var24 = class69.field1026[class45.field377 + 1];
            class230 var63 = class21.method304(var4, var24);
            if(var63 != null && var24 != -1) {
               class69.field1026[++class45.field377 - 1] = 1;
               if(var2) {
                  class184.field2379 = var63;
               } else {
                  class67.field996 = var63;
               }
            } else {
               class69.field1026[++class45.field377 - 1] = 0;
            }

            var3 = 1;
         } else if(var0 == 201) {
            var68 = class61.method1188(class69.field1026[--class45.field377]);
            if(var68 != null) {
               class69.field1026[++class45.field377 - 1] = 1;
               if(var2) {
                  class184.field2379 = var68;
               } else {
                  class67.field996 = var68;
               }
            } else {
               class69.field1026[++class45.field377 - 1] = 0;
            }

            var3 = 1;
         } else {
            var3 = 2;
         }

         return var3;
      } else if(var0 < 1100) {
         return class87.method2047(var0, var1, var2);
      } else if(var0 < 1200) {
         return class136.method3138(var0, var1, var2);
      } else if(var0 < 1300) {
         return class51.method1062(var0, var1, var2);
      } else if(var0 < 1400) {
         return class72.method1831(var0, var1, var2);
      } else if(var0 < 1500) {
         return class57.method1090(var0, var1, var2);
      } else if(var0 < 1600) {
         return class82.method1943(var0, var1, var2);
      } else if(var0 < 1700) {
         return class52.method1066(var0, var1, var2);
      } else if(var0 < 1800) {
         return class25.method464(var0, var1, var2);
      } else {
         int var17;
         int var46;
         int[] var65;
         if(var0 < 1900) {
            var68 = var2?class184.field2379:class67.field996;
            if(var0 == 1800) {
               var65 = class69.field1026;
               var6 = ++class45.field377 - 1;
               var17 = class95.method2252(var68);
               var46 = var17 >> 11 & 63;
               var65[var6] = var46;
               var3 = 1;
            } else if(var0 == 1801) {
               var24 = class69.field1026[--class45.field377];
               --var24;
               if(var68.field2698 != null && var24 < var68.field2698.length && var68.field2698[var24] != null) {
                  class69.field1021[++class83.field1207 - 1] = var68.field2698[var24];
               } else {
                  class69.field1021[++class83.field1207 - 1] = "";
               }

               var3 = 1;
            } else if(var0 == 1802) {
               if(var68.field2697 == null) {
                  class69.field1021[++class83.field1207 - 1] = "";
               } else {
                  class69.field1021[++class83.field1207 - 1] = var68.field2697;
               }

               var3 = 1;
            } else {
               var3 = 2;
            }

            return var3;
         } else if(var0 < 2000) {
            var4 = var0;
            if(var0 >= 2000) {
               var4 = var0 - 1000;
               var67 = class61.method1188(class69.field1026[--class45.field377]);
            } else {
               var67 = var2?class184.field2379:class67.field996;
            }

            if(var4 == 1927) {
               if(class69.field1025 >= 10) {
                  throw new RuntimeException();
               }

               if(var67.field2745 == null) {
                  var3 = 0;
               } else {
                  class56 var62 = new class56();
                  var62.field511 = var67;
                  var62.field525 = var67.field2745;
                  var62.field519 = class69.field1025 + 1;
                  client.field755.method4126(var62);
                  var3 = 1;
               }
            } else {
               var3 = 2;
            }

            return var3;
         } else if(var0 < 2100) {
            return class87.method2047(var0, var1, var2);
         } else if(var0 < 2200) {
            return class136.method3138(var0, var1, var2);
         } else if(var0 < 2300) {
            return class51.method1062(var0, var1, var2);
         } else if(var0 < 2400) {
            return class72.method1831(var0, var1, var2);
         } else if(var0 < 2500) {
            return class57.method1090(var0, var1, var2);
         } else if(var0 < 2600) {
            var68 = class61.method1188(class69.field1026[--class45.field377]);
            if(var0 == 2500) {
               class69.field1026[++class45.field377 - 1] = var68.field2636;
               var3 = 1;
            } else if(var0 == 2501) {
               class69.field1026[++class45.field377 - 1] = var68.field2637;
               var3 = 1;
            } else if(var0 == 2502) {
               class69.field1026[++class45.field377 - 1] = var68.field2627;
               var3 = 1;
            } else if(var0 == 2503) {
               class69.field1026[++class45.field377 - 1] = var68.field2639;
               var3 = 1;
            } else if(var0 == 2504) {
               class69.field1026[++class45.field377 - 1] = var68.field2643?1:0;
               var3 = 1;
            } else if(var0 == 2505) {
               class69.field1026[++class45.field377 - 1] = var68.field2642;
               var3 = 1;
            } else {
               var3 = 2;
            }

            return var3;
         } else if(var0 < 2700) {
            return class32.method600(var0, var1, var2);
         } else if(var0 < 2800) {
            if(var0 == 2700) {
               var68 = class61.method1188(class69.field1026[--class45.field377]);
               class69.field1026[++class45.field377 - 1] = var68.field2754;
               var3 = 1;
            } else if(var0 == 2701) {
               var68 = class61.method1188(class69.field1026[--class45.field377]);
               if(var68.field2754 != -1) {
                  class69.field1026[++class45.field377 - 1] = var68.field2677;
               } else {
                  class69.field1026[++class45.field377 - 1] = 0;
               }

               var3 = 1;
            } else if(var0 == 2702) {
               var4 = class69.field1026[--class45.field377];
               class55 var66 = (class55)client.field826.method4064((long)var4);
               if(var66 != null) {
                  class69.field1026[++class45.field377 - 1] = 1;
               } else {
                  class69.field1026[++class45.field377 - 1] = 0;
               }

               var3 = 1;
            } else if(var0 == 2706) {
               class69.field1026[++class45.field377 - 1] = client.field752;
               var3 = 1;
            } else {
               var3 = 2;
            }

            return var3;
         } else if(var0 < 2900) {
            var68 = class61.method1188(class69.field1026[--class45.field377]);
            if(var0 == 2800) {
               var65 = class69.field1026;
               var6 = ++class45.field377 - 1;
               var17 = class95.method2252(var68);
               var46 = var17 >> 11 & 63;
               var65[var6] = var46;
               var3 = 1;
            } else if(var0 == 2801) {
               var24 = class69.field1026[--class45.field377];
               --var24;
               if(var68.field2698 != null && var24 < var68.field2698.length && var68.field2698[var24] != null) {
                  class69.field1021[++class83.field1207 - 1] = var68.field2698[var24];
               } else {
                  class69.field1021[++class83.field1207 - 1] = "";
               }

               var3 = 1;
            } else if(var0 == 2802) {
               if(var68.field2697 == null) {
                  class69.field1021[++class83.field1207 - 1] = "";
               } else {
                  class69.field1021[++class83.field1207 - 1] = var68.field2697;
               }

               var3 = 1;
            } else {
               var3 = 2;
            }

            return var3;
         } else if(var0 < 3000) {
            return class98.method2285(var0, var1, var2);
         } else if(var0 < 3200) {
            return class30.method528(var0, var1, var2);
         } else if(var0 < 3300) {
            return class58.method1118(var0, var1, var2);
         } else {
            int var20;
            int[] var43;
            if(var0 < 3400) {
               if(var0 == 3300) {
                  class69.field1026[++class45.field377 - 1] = client.field679;
                  var3 = 1;
               } else {
                  class53 var58;
                  if(var0 == 3301) {
                     class45.field377 -= 2;
                     var4 = class69.field1026[class45.field377];
                     var24 = class69.field1026[class45.field377 + 1];
                     var43 = class69.field1026;
                     var46 = ++class45.field377 - 1;
                     var58 = (class53)class53.field478.method4064((long)var4);
                     if(var58 == null) {
                        var17 = -1;
                     } else if(var24 >= 0 && var24 < var58.field482.length) {
                        var17 = var58.field482[var24];
                     } else {
                        var17 = -1;
                     }

                     var43[var46] = var17;
                     var3 = 1;
                  } else if(var0 == 3302) {
                     class45.field377 -= 2;
                     var4 = class69.field1026[class45.field377];
                     var24 = class69.field1026[class45.field377 + 1];
                     var43 = class69.field1026;
                     var46 = ++class45.field377 - 1;
                     var58 = (class53)class53.field478.method4064((long)var4);
                     if(var58 == null) {
                        var17 = 0;
                     } else if(var24 >= 0 && var24 < var58.field480.length) {
                        var17 = var58.field480[var24];
                     } else {
                        var17 = 0;
                     }

                     var43[var46] = var17;
                     var3 = 1;
                  } else {
                     int var21;
                     if(var0 == 3303) {
                        class45.field377 -= 2;
                        var4 = class69.field1026[class45.field377];
                        var24 = class69.field1026[class45.field377 + 1];
                        var43 = class69.field1026;
                        var46 = ++class45.field377 - 1;
                        var58 = (class53)class53.field478.method4064((long)var4);
                        if(var58 == null) {
                           var17 = 0;
                        } else if(var24 == -1) {
                           var17 = 0;
                        } else {
                           var20 = 0;

                           for(var21 = 0; var21 < var58.field480.length; ++var21) {
                              if(var24 == var58.field482[var21]) {
                                 var20 += var58.field480[var21];
                              }
                           }

                           var17 = var20;
                        }

                        var43[var46] = var17;
                        var3 = 1;
                     } else if(var0 == 3304) {
                        var4 = class69.field1026[--class45.field377];
                        class69.field1026[++class45.field377 - 1] = class246.method4622(var4).field3249;
                        var3 = 1;
                     } else if(var0 == 3305) {
                        var4 = class69.field1026[--class45.field377];
                        class69.field1026[++class45.field377 - 1] = client.field724[var4];
                        var3 = 1;
                     } else if(var0 == 3306) {
                        var4 = class69.field1026[--class45.field377];
                        class69.field1026[++class45.field377 - 1] = client.field725[var4];
                        var3 = 1;
                     } else if(var0 == 3307) {
                        var4 = class69.field1026[--class45.field377];
                        class69.field1026[++class45.field377 - 1] = client.field764[var4];
                        var3 = 1;
                     } else if(var0 == 3308) {
                        var4 = class192.field2415;
                        var24 = (class150.field1948.field900 >> 7) + class178.field2315;
                        var6 = (class150.field1948.field918 >> 7) + class71.field1051;
                        class69.field1026[++class45.field377 - 1] = (var24 << 14) + var6 + (var4 << 28);
                        var3 = 1;
                     } else if(var0 == 3309) {
                        var4 = class69.field1026[--class45.field377];
                        class69.field1026[++class45.field377 - 1] = var4 >> 14 & 16383;
                        var3 = 1;
                     } else if(var0 == 3310) {
                        var4 = class69.field1026[--class45.field377];
                        class69.field1026[++class45.field377 - 1] = var4 >> 28;
                        var3 = 1;
                     } else if(var0 == 3311) {
                        var4 = class69.field1026[--class45.field377];
                        class69.field1026[++class45.field377 - 1] = var4 & 16383;
                        var3 = 1;
                     } else if(var0 == 3312) {
                        class69.field1026[++class45.field377 - 1] = client.field628?1:0;
                        var3 = 1;
                     } else if(var0 == 3313) {
                        class45.field377 -= 2;
                        var4 = class69.field1026[class45.field377] + '\u8000';
                        var24 = class69.field1026[class45.field377 + 1];
                        var43 = class69.field1026;
                        var46 = ++class45.field377 - 1;
                        var58 = (class53)class53.field478.method4064((long)var4);
                        if(var58 == null) {
                           var17 = -1;
                        } else if(var24 >= 0 && var24 < var58.field482.length) {
                           var17 = var58.field482[var24];
                        } else {
                           var17 = -1;
                        }

                        var43[var46] = var17;
                        var3 = 1;
                     } else if(var0 == 3314) {
                        class45.field377 -= 2;
                        var4 = class69.field1026[class45.field377] + '\u8000';
                        var24 = class69.field1026[class45.field377 + 1];
                        var43 = class69.field1026;
                        var46 = ++class45.field377 - 1;
                        var58 = (class53)class53.field478.method4064((long)var4);
                        if(var58 == null) {
                           var17 = 0;
                        } else if(var24 >= 0 && var24 < var58.field480.length) {
                           var17 = var58.field480[var24];
                        } else {
                           var17 = 0;
                        }

                        var43[var46] = var17;
                        var3 = 1;
                     } else if(var0 == 3315) {
                        class45.field377 -= 2;
                        var4 = class69.field1026[class45.field377] + '\u8000';
                        var24 = class69.field1026[class45.field377 + 1];
                        var43 = class69.field1026;
                        var46 = ++class45.field377 - 1;
                        var58 = (class53)class53.field478.method4064((long)var4);
                        if(var58 == null) {
                           var17 = 0;
                        } else if(var24 == -1) {
                           var17 = 0;
                        } else {
                           var20 = 0;

                           for(var21 = 0; var21 < var58.field480.length; ++var21) {
                              if(var24 == var58.field482[var21]) {
                                 var20 += var58.field480[var21];
                              }
                           }

                           var17 = var20;
                        }

                        var43[var46] = var17;
                        var3 = 1;
                     } else if(var0 == 3316) {
                        if(client.field729 >= 2) {
                           class69.field1026[++class45.field377 - 1] = client.field729;
                        } else {
                           class69.field1026[++class45.field377 - 1] = 0;
                        }

                        var3 = 1;
                     } else if(var0 == 3317) {
                        class69.field1026[++class45.field377 - 1] = client.field643;
                        var3 = 1;
                     } else if(var0 == 3318) {
                        class69.field1026[++class45.field377 - 1] = client.field676;
                        var3 = 1;
                     } else if(var0 == 3321) {
                        class69.field1026[++class45.field377 - 1] = client.field757;
                        var3 = 1;
                     } else if(var0 == 3322) {
                        class69.field1026[++class45.field377 - 1] = client.field758;
                        var3 = 1;
                     } else if(var0 == 3323) {
                        if(client.field761) {
                           class69.field1026[++class45.field377 - 1] = 1;
                        } else {
                           class69.field1026[++class45.field377 - 1] = 0;
                        }

                        var3 = 1;
                     } else if(var0 == 3324) {
                        class69.field1026[++class45.field377 - 1] = client.field726;
                        var3 = 1;
                     } else if(var0 == 3325) {
                        class45.field377 -= 4;
                        var4 = class69.field1026[class45.field377];
                        var24 = class69.field1026[class45.field377 + 1];
                        var6 = class69.field1026[class45.field377 + 2];
                        var46 = class69.field1026[class45.field377 + 3];
                        var4 += var24 << 14;
                        var4 += var6 << 28;
                        var4 += var46;
                        class69.field1026[++class45.field377 - 1] = var4;
                        var3 = 1;
                     } else {
                        var3 = 2;
                     }
                  }
               }

               return var3;
            } else if(var0 < 3500) {
               if(var0 == 3400) {
                  class45.field377 -= 2;
                  var4 = class69.field1026[class45.field377];
                  var24 = class69.field1026[class45.field377 + 1];
                  class266 var59 = class51.method1063(var4);
                  if(var59.field3355 != 115) {
                     ;
                  }

                  for(var46 = 0; var46 < var59.field3360; ++var46) {
                     if(var24 == var59.field3359[var46]) {
                        class69.field1021[++class83.field1207 - 1] = var59.field3363[var46];
                        var59 = null;
                        break;
                     }
                  }

                  if(var59 != null) {
                     class69.field1021[++class83.field1207 - 1] = var59.field3358;
                  }

                  var3 = 1;
               } else if(var0 == 3408) {
                  class45.field377 -= 4;
                  var4 = class69.field1026[class45.field377];
                  var24 = class69.field1026[class45.field377 + 1];
                  var6 = class69.field1026[class45.field377 + 2];
                  var46 = class69.field1026[class45.field377 + 3];
                  class266 var31 = class51.method1063(var6);
                  if(var4 == var31.field3357 && var24 == var31.field3355) {
                     for(var9 = 0; var9 < var31.field3360; ++var9) {
                        if(var46 == var31.field3359[var9]) {
                           if(var24 == 115) {
                              class69.field1021[++class83.field1207 - 1] = var31.field3363[var9];
                           } else {
                              class69.field1026[++class45.field377 - 1] = var31.field3362[var9];
                           }

                           var31 = null;
                           break;
                        }
                     }

                     if(var31 != null) {
                        if(var24 == 115) {
                           class69.field1021[++class83.field1207 - 1] = var31.field3358;
                        } else {
                           class69.field1026[++class45.field377 - 1] = var31.field3361;
                        }
                     }

                     var3 = 1;
                  } else {
                     if(var24 == 115) {
                        class69.field1021[++class83.field1207 - 1] = "null";
                     } else {
                        class69.field1026[++class45.field377 - 1] = 0;
                     }

                     var3 = 1;
                  }
               } else if(var0 == 3411) {
                  var4 = class69.field1026[--class45.field377];
                  class266 var64 = class51.method1063(var4);
                  class69.field1026[++class45.field377 - 1] = var64.method4998();
                  var3 = 1;
               } else {
                  var3 = 2;
               }

               return var3;
            } else if(var0 < 3700) {
               return class170.method3465(var0, var1, var2);
            } else {
               boolean var5;
               boolean var34;
               if(var0 < 4000) {
                  if(var0 == 3903) {
                     var4 = class69.field1026[--class45.field377];
                     class69.field1026[++class45.field377 - 1] = client.field856[var4].method42();
                     var3 = 1;
                  } else if(var0 == 3904) {
                     var4 = class69.field1026[--class45.field377];
                     class69.field1026[++class45.field377 - 1] = client.field856[var4].field26;
                     var3 = 1;
                  } else if(var0 == 3905) {
                     var4 = class69.field1026[--class45.field377];
                     class69.field1026[++class45.field377 - 1] = client.field856[var4].field27;
                     var3 = 1;
                  } else if(var0 == 3906) {
                     var4 = class69.field1026[--class45.field377];
                     class69.field1026[++class45.field377 - 1] = client.field856[var4].field28;
                     var3 = 1;
                  } else if(var0 == 3907) {
                     var4 = class69.field1026[--class45.field377];
                     class69.field1026[++class45.field377 - 1] = client.field856[var4].field29;
                     var3 = 1;
                  } else if(var0 == 3908) {
                     var4 = class69.field1026[--class45.field377];
                     class69.field1026[++class45.field377 - 1] = client.field856[var4].field30;
                     var3 = 1;
                  } else if(var0 == 3910) {
                     var4 = class69.field1026[--class45.field377];
                     var24 = client.field856[var4].method38();
                     class69.field1026[++class45.field377 - 1] = var24 == 0?1:0;
                     var3 = 1;
                  } else if(var0 == 3911) {
                     var4 = class69.field1026[--class45.field377];
                     var24 = client.field856[var4].method38();
                     class69.field1026[++class45.field377 - 1] = var24 == 2?1:0;
                     var3 = 1;
                  } else if(var0 == 3912) {
                     var4 = class69.field1026[--class45.field377];
                     var24 = client.field856[var4].method38();
                     class69.field1026[++class45.field377 - 1] = var24 == 5?1:0;
                     var3 = 1;
                  } else if(var0 == 3913) {
                     var4 = class69.field1026[--class45.field377];
                     var24 = client.field856[var4].method38();
                     class69.field1026[++class45.field377 - 1] = var24 == 1?1:0;
                     var3 = 1;
                  } else if(var0 == 3914) {
                     var34 = class69.field1026[--class45.field377] == 1;
                     if(class173.field2291 != null) {
                        class173.field2291.method11(class1.field8, var34);
                     }

                     var3 = 1;
                  } else if(var0 == 3915) {
                     var34 = class69.field1026[--class45.field377] == 1;
                     if(class173.field2291 != null) {
                        class173.field2291.method11(class1.field7, var34);
                     }

                     var3 = 1;
                  } else if(var0 == 3916) {
                     class45.field377 -= 2;
                     var34 = class69.field1026[class45.field377] == 1;
                     var5 = class69.field1026[class45.field377 + 1] == 1;
                     if(class173.field2291 != null) {
                        client.field738.field591 = var5;
                        class173.field2291.method11(client.field738, var34);
                     }

                     var3 = 1;
                  } else if(var0 == 3917) {
                     var34 = class69.field1026[--class45.field377] == 1;
                     if(class173.field2291 != null) {
                        class173.field2291.method11(class1.field5, var34);
                     }

                     var3 = 1;
                  } else if(var0 == 3918) {
                     var34 = class69.field1026[--class45.field377] == 1;
                     if(class173.field2291 != null) {
                        class173.field2291.method11(class1.field9, var34);
                     }

                     var3 = 1;
                  } else if(var0 == 3919) {
                     class69.field1026[++class45.field377 - 1] = class173.field2291 == null?0:class173.field2291.field6.size();
                     var3 = 1;
                  } else {
                     class2 var61;
                     if(var0 == 3920) {
                        var4 = class69.field1026[--class45.field377];
                        var61 = (class2)class173.field2291.field6.get(var4);
                        class69.field1026[++class45.field377 - 1] = var61.field17;
                        var3 = 1;
                     } else if(var0 == 3921) {
                        var4 = class69.field1026[--class45.field377];
                        var61 = (class2)class173.field2291.field6.get(var4);
                        class69.field1021[++class83.field1207 - 1] = var61.method16();
                        var3 = 1;
                     } else if(var0 == 3922) {
                        var4 = class69.field1026[--class45.field377];
                        var61 = (class2)class173.field2291.field6.get(var4);
                        class69.field1021[++class83.field1207 - 1] = var61.method17();
                        var3 = 1;
                     } else if(var0 == 3923) {
                        var4 = class69.field1026[--class45.field377];
                        var61 = (class2)class173.field2291.field6.get(var4);
                        long var22 = class166.method3456() - client.field629 - var61.field10;
                        var17 = (int)(var22 / 3600000L);
                        var9 = (int)((var22 - (long)(var17 * 3600000)) / 60000L);
                        var20 = (int)((var22 - (long)(var17 * 3600000) - (long)(var9 * '\uea60')) / 1000L);
                        String var37 = var17 + ":" + var9 / 10 + var9 % 10 + ":" + var20 / 10 + var20 % 10;
                        class69.field1021[++class83.field1207 - 1] = var37;
                        var3 = 1;
                     } else if(var0 == 3924) {
                        var4 = class69.field1026[--class45.field377];
                        var61 = (class2)class173.field2291.field6.get(var4);
                        class69.field1026[++class45.field377 - 1] = var61.field13.field28;
                        var3 = 1;
                     } else if(var0 == 3925) {
                        var4 = class69.field1026[--class45.field377];
                        var61 = (class2)class173.field2291.field6.get(var4);
                        class69.field1026[++class45.field377 - 1] = var61.field13.field27;
                        var3 = 1;
                     } else if(var0 == 3926) {
                        var4 = class69.field1026[--class45.field377];
                        var61 = (class2)class173.field2291.field6.get(var4);
                        class69.field1026[++class45.field377 - 1] = var61.field13.field26;
                        var3 = 1;
                     } else {
                        var3 = 2;
                     }
                  }

                  return var3;
               } else if(var0 < 4100) {
                  return class128.method3081(var0, var1, var2);
               } else if(var0 < 4200) {
                  return class112.method2617(var0, var1, var2);
               } else if(var0 < 4300) {
                  return class66.method1661(var0, var1, var2);
               } else {
                  String var39;
                  class172 var49;
                  if(var0 < 5100) {
                     if(var0 == 5000) {
                        class69.field1026[++class45.field377 - 1] = client.field851;
                        var3 = 1;
                     } else if(var0 == 5001) {
                        class45.field377 -= 3;
                        client.field851 = class69.field1026[class45.field377];
                        var24 = class69.field1026[class45.field377 + 1];
                        class307[] var50 = class151.method3235();
                        var46 = 0;

                        class307 var47;
                        while(true) {
                           if(var46 >= var50.length) {
                              var47 = null;
                              break;
                           }

                           class307 var8 = var50[var46];
                           if(var24 == var8.field3741) {
                              var47 = var8;
                              break;
                           }

                           ++var46;
                        }

                        class20.field170 = var47;
                        if(class20.field170 == null) {
                           class20.field170 = class307.field3740;
                        }

                        client.field694 = class69.field1026[class45.field377 + 2];
                        var49 = class133.method3115(class169.field2219, client.field739.field1250);
                        var49.field2279.method3552(client.field851);
                        var49.field2279.method3552(class20.field170.field3741);
                        var49.field2279.method3552(client.field694);
                        client.field739.method2019(var49);
                        var3 = 1;
                     } else {
                        String var51;
                        if(var0 == 5002) {
                           var51 = class69.field1021[--class83.field1207];
                           class45.field377 -= 2;
                           var24 = class69.field1026[class45.field377];
                           var6 = class69.field1026[class45.field377 + 1];
                           class172 var27 = class133.method3115(class169.field2248, client.field739.field1250);
                           var27.field2279.method3552(class12.method123(var51) + 2);
                           var27.field2279.method3549(var51);
                           var27.field2279.method3552(var24 - 1);
                           var27.field2279.method3552(var6);
                           client.field739.method2019(var27);
                           var3 = 1;
                        } else if(var0 == 5003) {
                           class45.field377 -= 2;
                           var4 = class69.field1026[class45.field377];
                           var24 = class69.field1026[class45.field377 + 1];
                           class86 var28 = (class86)class83.field1204.get(Integer.valueOf(var4));
                           class58 var53 = var28.method2013(var24);
                           if(var53 != null) {
                              class69.field1026[++class45.field377 - 1] = var53.field546;
                              class69.field1026[++class45.field377 - 1] = var53.field537;
                              class69.field1021[++class83.field1207 - 1] = var53.field539 != null?var53.field539:"";
                              class69.field1021[++class83.field1207 - 1] = var53.field542 != null?var53.field542:"";
                              class69.field1021[++class83.field1207 - 1] = var53.field544 != null?var53.field544:"";
                              class69.field1026[++class45.field377 - 1] = var53.method1096()?1:(var53.method1099()?2:0);
                           } else {
                              class69.field1026[++class45.field377 - 1] = -1;
                              class69.field1026[++class45.field377 - 1] = 0;
                              class69.field1021[++class83.field1207 - 1] = "";
                              class69.field1021[++class83.field1207 - 1] = "";
                              class69.field1021[++class83.field1207 - 1] = "";
                              class69.field1026[++class45.field377 - 1] = 0;
                           }

                           var3 = 1;
                        } else if(var0 == 5004) {
                           var4 = class69.field1026[--class45.field377];
                           class58 var60 = (class58)class83.field1203.method3991((long)var4);
                           if(var60 != null) {
                              class69.field1026[++class45.field377 - 1] = var60.field538;
                              class69.field1026[++class45.field377 - 1] = var60.field537;
                              class69.field1021[++class83.field1207 - 1] = var60.field539 != null?var60.field539:"";
                              class69.field1021[++class83.field1207 - 1] = var60.field542 != null?var60.field542:"";
                              class69.field1021[++class83.field1207 - 1] = var60.field544 != null?var60.field544:"";
                              class69.field1026[++class45.field377 - 1] = var60.method1096()?1:(var60.method1099()?2:0);
                           } else {
                              class69.field1026[++class45.field377 - 1] = -1;
                              class69.field1026[++class45.field377 - 1] = 0;
                              class69.field1021[++class83.field1207 - 1] = "";
                              class69.field1021[++class83.field1207 - 1] = "";
                              class69.field1021[++class83.field1207 - 1] = "";
                              class69.field1026[++class45.field377 - 1] = 0;
                           }

                           var3 = 1;
                        } else if(var0 == 5005) {
                           if(class20.field170 == null) {
                              class69.field1026[++class45.field377 - 1] = -1;
                           } else {
                              class69.field1026[++class45.field377 - 1] = class20.field170.field3741;
                           }

                           var3 = 1;
                        } else if(var0 == 5008) {
                           var51 = class69.field1021[--class83.field1207];
                           var24 = class69.field1026[--class45.field377];
                           String var54 = var51.toLowerCase();
                           byte var55 = 0;
                           if(var54.startsWith("yellow:")) {
                              var55 = 0;
                              var51 = var51.substring("yellow:".length());
                           } else if(var54.startsWith("red:")) {
                              var55 = 1;
                              var51 = var51.substring("red:".length());
                           } else if(var54.startsWith("green:")) {
                              var55 = 2;
                              var51 = var51.substring("green:".length());
                           } else if(var54.startsWith("cyan:")) {
                              var55 = 3;
                              var51 = var51.substring("cyan:".length());
                           } else if(var54.startsWith("purple:")) {
                              var55 = 4;
                              var51 = var51.substring("purple:".length());
                           } else if(var54.startsWith("white:")) {
                              var55 = 5;
                              var51 = var51.substring("white:".length());
                           } else if(var54.startsWith("flash1:")) {
                              var55 = 6;
                              var51 = var51.substring("flash1:".length());
                           } else if(var54.startsWith("flash2:")) {
                              var55 = 7;
                              var51 = var51.substring("flash2:".length());
                           } else if(var54.startsWith("flash3:")) {
                              var55 = 8;
                              var51 = var51.substring("flash3:".length());
                           } else if(var54.startsWith("glow1:")) {
                              var55 = 9;
                              var51 = var51.substring("glow1:".length());
                           } else if(var54.startsWith("glow2:")) {
                              var55 = 10;
                              var51 = var51.substring("glow2:".length());
                           } else if(var54.startsWith("glow3:")) {
                              var55 = 11;
                              var51 = var51.substring("glow3:".length());
                           } else if(client.field599 != 0) {
                              if(var54.startsWith("yellow:")) {
                                 var55 = 0;
                                 var51 = var51.substring("yellow:".length());
                              } else if(var54.startsWith("red:")) {
                                 var55 = 1;
                                 var51 = var51.substring("red:".length());
                              } else if(var54.startsWith("green:")) {
                                 var55 = 2;
                                 var51 = var51.substring("green:".length());
                              } else if(var54.startsWith("cyan:")) {
                                 var55 = 3;
                                 var51 = var51.substring("cyan:".length());
                              } else if(var54.startsWith("purple:")) {
                                 var55 = 4;
                                 var51 = var51.substring("purple:".length());
                              } else if(var54.startsWith("white:")) {
                                 var55 = 5;
                                 var51 = var51.substring("white:".length());
                              } else if(var54.startsWith("flash1:")) {
                                 var55 = 6;
                                 var51 = var51.substring("flash1:".length());
                              } else if(var54.startsWith("flash2:")) {
                                 var55 = 7;
                                 var51 = var51.substring("flash2:".length());
                              } else if(var54.startsWith("flash3:")) {
                                 var55 = 8;
                                 var51 = var51.substring("flash3:".length());
                              } else if(var54.startsWith("glow1:")) {
                                 var55 = 9;
                                 var51 = var51.substring("glow1:".length());
                              } else if(var54.startsWith("glow2:")) {
                                 var55 = 10;
                                 var51 = var51.substring("glow2:".length());
                              } else if(var54.startsWith("glow3:")) {
                                 var55 = 11;
                                 var51 = var51.substring("glow3:".length());
                              }
                           }

                           var54 = var51.toLowerCase();
                           byte var48 = 0;
                           if(var54.startsWith("wave:")) {
                              var48 = 1;
                              var51 = var51.substring("wave:".length());
                           } else if(var54.startsWith("wave2:")) {
                              var48 = 2;
                              var51 = var51.substring("wave2:".length());
                           } else if(var54.startsWith("shake:")) {
                              var48 = 3;
                              var51 = var51.substring("shake:".length());
                           } else if(var54.startsWith("scroll:")) {
                              var48 = 4;
                              var51 = var51.substring("scroll:".length());
                           } else if(var54.startsWith("slide:")) {
                              var48 = 5;
                              var51 = var51.substring("slide:".length());
                           } else if(client.field599 != 0) {
                              if(var54.startsWith("wave:")) {
                                 var48 = 1;
                                 var51 = var51.substring("wave:".length());
                              } else if(var54.startsWith("wave2:")) {
                                 var48 = 2;
                                 var51 = var51.substring("wave2:".length());
                              } else if(var54.startsWith("shake:")) {
                                 var48 = 3;
                                 var51 = var51.substring("shake:".length());
                              } else if(var54.startsWith("scroll:")) {
                                 var48 = 4;
                                 var51 = var51.substring("scroll:".length());
                              } else if(var54.startsWith("slide:")) {
                                 var48 = 5;
                                 var51 = var51.substring("slide:".length());
                              }
                           }

                           class172 var56 = class133.method3115(class169.field2253, client.field739.field1250);
                           var56.field2279.method3552(0);
                           var20 = var56.field2279.field2359;
                           var56.field2279.method3552(var24);
                           var56.field2279.method3552(var55);
                           var56.field2279.method3552(var48);
                           class189 var36 = var56.field2279;
                           int var12 = var36.field2359;
                           byte[] var13 = class148.method3203(var51);
                           var36.method3614(var13.length);
                           var36.field2359 += class300.field3724.method3493(var13, 0, var13.length, var36.field2365, var36.field2359);
                           var56.field2279.method3565(var56.field2279.field2359 - var20);
                           client.field739.method2019(var56);
                           var3 = 1;
                        } else if(var0 == 5009) {
                           class83.field1207 -= 2;
                           var51 = class69.field1021[class83.field1207];
                           var39 = class69.field1021[class83.field1207 + 1];
                           var49 = class133.method3115(class169.field2197, client.field739.field1250);
                           var49.field2279.method3602(0);
                           var46 = var49.field2279.field2359;
                           var49.field2279.method3549(var51);
                           class189 var29 = var49.field2279;
                           var9 = var29.field2359;
                           byte[] var35 = class148.method3203(var39);
                           var29.method3614(var35.length);
                           var29.field2359 += class300.field3724.method3493(var35, 0, var35.length, var29.field2365, var29.field2359);
                           var49.field2279.method3734(var49.field2279.field2359 - var46);
                           client.field739.method2019(var49);
                           var3 = 1;
                        } else if(var0 == 5015) {
                           if(class150.field1948 != null && class150.field1948.field587 != null) {
                              var51 = class150.field1948.field587.method5462();
                           } else {
                              var51 = "";
                           }

                           class69.field1021[++class83.field1207 - 1] = var51;
                           var3 = 1;
                        } else if(var0 == 5016) {
                           class69.field1026[++class45.field377 - 1] = client.field694;
                           var3 = 1;
                        } else if(var0 == 5017) {
                           var4 = class69.field1026[--class45.field377];
                           class69.field1026[++class45.field377 - 1] = class123.method2895(var4);
                           var3 = 1;
                        } else if(var0 == 5018) {
                           var4 = class69.field1026[--class45.field377];
                           class69.field1026[++class45.field377 - 1] = class15.method157(var4);
                           var3 = 1;
                        } else if(var0 == 5019) {
                           var4 = class69.field1026[--class45.field377];
                           class69.field1026[++class45.field377 - 1] = class79.method1900(var4);
                           var3 = 1;
                        } else if(var0 == 5020) {
                           var51 = class69.field1021[--class83.field1207];
                           class151.method3234(var51);
                           var3 = 1;
                        } else if(var0 == 5021) {
                           client.field808 = class69.field1021[--class83.field1207].toLowerCase().trim();
                           var3 = 1;
                        } else if(var0 == 5022) {
                           class69.field1021[++class83.field1207 - 1] = client.field808;
                           var3 = 1;
                        } else {
                           var3 = 2;
                        }
                     }

                     return var3;
                  } else if(var0 < 5400) {
                     if(var0 == 5306) {
                        int[] var44 = class69.field1026;
                        var24 = ++class45.field377 - 1;
                        var6 = client.field675?2:1;
                        var44[var24] = var6;
                        var3 = 1;
                     } else if(var0 == 5307) {
                        var4 = class69.field1026[--class45.field377];
                        if(var4 == 1 || var4 == 2) {
                           client.field803 = 0L;
                           if(var4 >= 2) {
                              client.field675 = true;
                           } else {
                              client.field675 = false;
                           }

                           var5 = client.field675?true:true;
                           if(var5) {
                              class37.field321.method896(765, 503);
                           } else {
                              class37.field321.method896(7680, 2160);
                           }

                           if(client.field611 >= 25) {
                              var49 = class133.method3115(class169.field2206, client.field739.field1250);
                              class189 var26 = var49.field2279;
                              var17 = client.field675?2:1;
                              var26.method3552(var17);
                              var49.field2279.method3602(class9.field70);
                              var49.field2279.method3602(class37.field326);
                              client.field739.method2019(var49);
                           }
                        }

                        var3 = 1;
                     } else if(var0 == 5308) {
                        class69.field1026[++class45.field377 - 1] = class51.field468.field979;
                        var3 = 1;
                     } else if(var0 == 5309) {
                        var4 = class69.field1026[--class45.field377];
                        if(var4 == 1 || var4 == 2) {
                           class51.field468.field979 = var4;
                           class266.method5008();
                        }

                        var3 = 1;
                     } else {
                        var3 = 2;
                     }

                     return var3;
                  } else if(var0 < 5600) {
                     if(var0 == 5504) {
                        class45.field377 -= 2;
                        var46 = class69.field1026[class45.field377];
                        var17 = class69.field1026[class45.field377 + 1];
                        if(!client.field746) {
                           client.field632 = var46;
                           client.field662 = var17;
                        }

                        var3 = 1;
                     } else if(var0 == 5505) {
                        class69.field1026[++class45.field377 - 1] = client.field632;
                        var3 = 1;
                     } else if(var0 == 5506) {
                        class69.field1026[++class45.field377 - 1] = client.field662;
                        var3 = 1;
                     } else if(var0 == 5530) {
                        var46 = class69.field1026[--class45.field377];
                        if(var46 < 0) {
                           var46 = 0;
                        }

                        client.field668 = var46;
                        var3 = 1;
                     } else if(var0 == 5531) {
                        class69.field1026[++class45.field377 - 1] = client.field668;
                        var3 = 1;
                     } else {
                        var3 = 2;
                     }

                     return var3;
                  } else if(var0 < 5700) {
                     if(var0 == 5630) {
                        client.field688 = 250;
                        var3 = 1;
                     } else {
                        var3 = 2;
                     }

                     return var3;
                  } else if(var0 < 6300) {
                     if(var0 == 6200) {
                        class45.field377 -= 2;
                        client.field745 = (short)class69.field1026[class45.field377];
                        if(client.field745 <= 0) {
                           client.field745 = 256;
                        }

                        client.field841 = (short)class69.field1026[class45.field377 + 1];
                        if(client.field841 <= 0) {
                           client.field841 = 205;
                        }

                        var3 = 1;
                     } else if(var0 == 6201) {
                        class45.field377 -= 2;
                        client.field842 = (short)class69.field1026[class45.field377];
                        if(client.field842 <= 0) {
                           client.field842 = 256;
                        }

                        client.field615 = (short)class69.field1026[class45.field377 + 1];
                        if(client.field615 <= 0) {
                           client.field615 = 320;
                        }

                        var3 = 1;
                     } else if(var0 == 6202) {
                        class45.field377 -= 4;
                        client.field844 = (short)class69.field1026[class45.field377];
                        if(client.field844 <= 0) {
                           client.field844 = 1;
                        }

                        client.field863 = (short)class69.field1026[class45.field377 + 1];
                        if(client.field863 <= 0) {
                           client.field863 = 32767;
                        } else if(client.field863 < client.field844) {
                           client.field863 = client.field844;
                        }

                        client.field707 = (short)class69.field1026[class45.field377 + 2];
                        if(client.field707 <= 0) {
                           client.field707 = 1;
                        }

                        client.field847 = (short)class69.field1026[class45.field377 + 3];
                        if(client.field847 <= 0) {
                           client.field847 = 32767;
                        } else if(client.field847 < client.field707) {
                           client.field847 = client.field707;
                        }

                        var3 = 1;
                     } else if(var0 == 6203) {
                        if(client.field776 != null) {
                           class132.method3113(0, 0, client.field776.field2627, client.field776.field2639, false);
                           class69.field1026[++class45.field377 - 1] = client.field834;
                           class69.field1026[++class45.field377 - 1] = client.field661;
                        } else {
                           class69.field1026[++class45.field377 - 1] = -1;
                           class69.field1026[++class45.field377 - 1] = -1;
                        }

                        var3 = 1;
                     } else if(var0 == 6204) {
                        class69.field1026[++class45.field377 - 1] = client.field842;
                        class69.field1026[++class45.field377 - 1] = client.field615;
                        var3 = 1;
                     } else if(var0 == 6205) {
                        class69.field1026[++class45.field377 - 1] = client.field745;
                        class69.field1026[++class45.field377 - 1] = client.field841;
                        var3 = 1;
                     } else {
                        var3 = 2;
                     }

                     return var3;
                  } else if(var0 >= 6600) {
                     if(var0 < 6700) {
                        if(var0 == 6600) {
                           var4 = class192.field2415;
                           var24 = (class150.field1948.field900 >> 7) + class178.field2315;
                           var6 = (class150.field1948.field918 >> 7) + class71.field1051;
                           class71.method1821().method6222(var4, var24, var6, true);
                           var3 = 1;
                        } else {
                           class20 var40;
                           if(var0 == 6601) {
                              var4 = class69.field1026[--class45.field377];
                              var39 = "";
                              var40 = class71.method1821().method6046(var4);
                              if(var40 != null) {
                                 var39 = var40.method254();
                              }

                              class69.field1021[++class83.field1207 - 1] = var39;
                              var3 = 1;
                           } else if(var0 == 6602) {
                              var4 = class69.field1026[--class45.field377];
                              class71.method1821().method6244(var4);
                              var3 = 1;
                           } else if(var0 == 6603) {
                              class69.field1026[++class45.field377 - 1] = class71.method1821().method6073();
                              var3 = 1;
                           } else if(var0 == 6604) {
                              var4 = class69.field1026[--class45.field377];
                              class71.method1821().method6191(var4);
                              var3 = 1;
                           } else if(var0 == 6605) {
                              class69.field1026[++class45.field377 - 1] = class71.method1821().method6075()?1:0;
                              var3 = 1;
                           } else {
                              class226 var38;
                              if(var0 == 6606) {
                                 var38 = new class226(class69.field1026[--class45.field377]);
                                 class71.method1821().method6077(var38.field2581, var38.field2583);
                                 var3 = 1;
                              } else if(var0 == 6607) {
                                 var38 = new class226(class69.field1026[--class45.field377]);
                                 class71.method1821().method6070(var38.field2581, var38.field2583);
                                 var3 = 1;
                              } else if(var0 == 6608) {
                                 var38 = new class226(class69.field1026[--class45.field377]);
                                 class71.method1821().method6224(var38.field2587, var38.field2581, var38.field2583);
                                 var3 = 1;
                              } else if(var0 == 6609) {
                                 var38 = new class226(class69.field1026[--class45.field377]);
                                 class71.method1821().method6080(var38.field2587, var38.field2581, var38.field2583);
                                 var3 = 1;
                              } else if(var0 == 6610) {
                                 class69.field1026[++class45.field377 - 1] = class71.method1821().method6081();
                                 class69.field1026[++class45.field377 - 1] = class71.method1821().method6218();
                                 var3 = 1;
                              } else {
                                 class20 var41;
                                 if(var0 == 6611) {
                                    var4 = class69.field1026[--class45.field377];
                                    var41 = class71.method1821().method6046(var4);
                                    if(var41 == null) {
                                       class69.field1026[++class45.field377 - 1] = 0;
                                    } else {
                                       class69.field1026[++class45.field377 - 1] = var41.method244().method4467();
                                    }

                                    var3 = 1;
                                 } else if(var0 == 6612) {
                                    var4 = class69.field1026[--class45.field377];
                                    var41 = class71.method1821().method6046(var4);
                                    if(var41 == null) {
                                       class69.field1026[++class45.field377 - 1] = 0;
                                       class69.field1026[++class45.field377 - 1] = 0;
                                    } else {
                                       class69.field1026[++class45.field377 - 1] = (var41.method238() - var41.method223() + 1) * 64;
                                       class69.field1026[++class45.field377 - 1] = (var41.method270() - var41.method292() + 1) * 64;
                                    }

                                    var3 = 1;
                                 } else if(var0 == 6613) {
                                    var4 = class69.field1026[--class45.field377];
                                    var41 = class71.method1821().method6046(var4);
                                    if(var41 == null) {
                                       class69.field1026[++class45.field377 - 1] = 0;
                                       class69.field1026[++class45.field377 - 1] = 0;
                                       class69.field1026[++class45.field377 - 1] = 0;
                                       class69.field1026[++class45.field377 - 1] = 0;
                                    } else {
                                       class69.field1026[++class45.field377 - 1] = var41.method223() * 64;
                                       class69.field1026[++class45.field377 - 1] = var41.method292() * 64;
                                       class69.field1026[++class45.field377 - 1] = var41.method238() * 64 + 64 - 1;
                                       class69.field1026[++class45.field377 - 1] = var41.method270() * 64 + 64 - 1;
                                    }

                                    var3 = 1;
                                 } else if(var0 == 6614) {
                                    var4 = class69.field1026[--class45.field377];
                                    var41 = class71.method1821().method6046(var4);
                                    if(var41 == null) {
                                       class69.field1026[++class45.field377 - 1] = -1;
                                    } else {
                                       class69.field1026[++class45.field377 - 1] = var41.method247();
                                    }

                                    var3 = 1;
                                 } else if(var0 == 6615) {
                                    var38 = class71.method1821().method6083();
                                    if(var38 == null) {
                                       class69.field1026[++class45.field377 - 1] = -1;
                                       class69.field1026[++class45.field377 - 1] = -1;
                                    } else {
                                       class69.field1026[++class45.field377 - 1] = var38.field2581;
                                       class69.field1026[++class45.field377 - 1] = var38.field2583;
                                    }

                                    var3 = 1;
                                 } else if(var0 == 6616) {
                                    class69.field1026[++class45.field377 - 1] = class71.method1821().method6060();
                                    var3 = 1;
                                 } else if(var0 == 6617) {
                                    var38 = new class226(class69.field1026[--class45.field377]);
                                    var41 = class71.method1821().method6061();
                                    if(var41 == null) {
                                       class69.field1026[++class45.field377 - 1] = -1;
                                       class69.field1026[++class45.field377 - 1] = -1;
                                       var3 = 1;
                                    } else {
                                       var43 = var41.method281(var38.field2587, var38.field2581, var38.field2583);
                                       if(var43 == null) {
                                          class69.field1026[++class45.field377 - 1] = -1;
                                          class69.field1026[++class45.field377 - 1] = -1;
                                       } else {
                                          class69.field1026[++class45.field377 - 1] = var43[0];
                                          class69.field1026[++class45.field377 - 1] = var43[1];
                                       }

                                       var3 = 1;
                                    }
                                 } else {
                                    class226 var45;
                                    if(var0 == 6618) {
                                       var38 = new class226(class69.field1026[--class45.field377]);
                                       var41 = class71.method1821().method6061();
                                       if(var41 == null) {
                                          class69.field1026[++class45.field377 - 1] = -1;
                                          class69.field1026[++class45.field377 - 1] = -1;
                                          var3 = 1;
                                       } else {
                                          var45 = var41.method229(var38.field2581, var38.field2583);
                                          if(var45 == null) {
                                             class69.field1026[++class45.field377 - 1] = -1;
                                          } else {
                                             class69.field1026[++class45.field377 - 1] = var45.method4467();
                                          }

                                          var3 = 1;
                                       }
                                    } else {
                                       class226 var52;
                                       if(var0 == 6619) {
                                          class45.field377 -= 2;
                                          var4 = class69.field1026[class45.field377];
                                          var52 = new class226(class69.field1026[class45.field377 + 1]);
                                          class32.method601(var4, var52, false);
                                          var3 = 1;
                                       } else if(var0 == 6620) {
                                          class45.field377 -= 2;
                                          var4 = class69.field1026[class45.field377];
                                          var52 = new class226(class69.field1026[class45.field377 + 1]);
                                          class32.method601(var4, var52, true);
                                          var3 = 1;
                                       } else if(var0 == 6621) {
                                          class45.field377 -= 2;
                                          var4 = class69.field1026[class45.field377];
                                          var52 = new class226(class69.field1026[class45.field377 + 1]);
                                          var40 = class71.method1821().method6046(var4);
                                          if(var40 == null) {
                                             class69.field1026[++class45.field377 - 1] = 0;
                                             var3 = 1;
                                          } else {
                                             class69.field1026[++class45.field377 - 1] = var40.method226(var52.field2587, var52.field2581, var52.field2583)?1:0;
                                             var3 = 1;
                                          }
                                       } else if(var0 == 6622) {
                                          class69.field1026[++class45.field377 - 1] = class71.method1821().method6084();
                                          class69.field1026[++class45.field377 - 1] = class71.method1821().method6085();
                                          var3 = 1;
                                       } else if(var0 == 6623) {
                                          var38 = new class226(class69.field1026[--class45.field377]);
                                          var41 = class71.method1821().method6225(var38.field2587, var38.field2581, var38.field2583);
                                          if(var41 == null) {
                                             class69.field1026[++class45.field377 - 1] = -1;
                                          } else {
                                             class69.field1026[++class45.field377 - 1] = var41.method231();
                                          }

                                          var3 = 1;
                                       } else if(var0 == 6624) {
                                          class71.method1821().method6086(class69.field1026[--class45.field377]);
                                          var3 = 1;
                                       } else if(var0 == 6625) {
                                          class71.method1821().method6087();
                                          var3 = 1;
                                       } else if(var0 == 6626) {
                                          class71.method1821().method6088(class69.field1026[--class45.field377]);
                                          var3 = 1;
                                       } else if(var0 == 6627) {
                                          class71.method1821().method6203();
                                          var3 = 1;
                                       } else if(var0 == 6628) {
                                          var34 = class69.field1026[--class45.field377] == 1;
                                          class71.method1821().method6058(var34);
                                          var3 = 1;
                                       } else if(var0 == 6629) {
                                          var4 = class69.field1026[--class45.field377];
                                          class71.method1821().method6091(var4);
                                          var3 = 1;
                                       } else if(var0 == 6630) {
                                          var4 = class69.field1026[--class45.field377];
                                          class71.method1821().method6090(var4);
                                          var3 = 1;
                                       } else if(var0 == 6631) {
                                          class71.method1821().method6093();
                                          var3 = 1;
                                       } else if(var0 == 6632) {
                                          var34 = class69.field1026[--class45.field377] == 1;
                                          class71.method1821().method6094(var34);
                                          var3 = 1;
                                       } else if(var0 == 6633) {
                                          class45.field377 -= 2;
                                          var4 = class69.field1026[class45.field377];
                                          var5 = class69.field1026[class45.field377 + 1] == 1;
                                          class71.method1821().method6095(var4, var5);
                                          var3 = 1;
                                       } else if(var0 == 6634) {
                                          class45.field377 -= 2;
                                          var4 = class69.field1026[class45.field377];
                                          var5 = class69.field1026[class45.field377 + 1] == 1;
                                          class71.method1821().method6082(var4, var5);
                                          var3 = 1;
                                       } else if(var0 == 6635) {
                                          class69.field1026[++class45.field377 - 1] = class71.method1821().method6097()?1:0;
                                          var3 = 1;
                                       } else if(var0 == 6636) {
                                          var4 = class69.field1026[--class45.field377];
                                          class69.field1026[++class45.field377 - 1] = class71.method1821().method6098(var4)?1:0;
                                          var3 = 1;
                                       } else if(var0 == 6637) {
                                          var4 = class69.field1026[--class45.field377];
                                          class69.field1026[++class45.field377 - 1] = class71.method1821().method6059(var4)?1:0;
                                          var3 = 1;
                                       } else if(var0 == 6638) {
                                          class45.field377 -= 2;
                                          var4 = class69.field1026[class45.field377];
                                          var52 = new class226(class69.field1026[class45.field377 + 1]);
                                          var45 = class71.method1821().method6105(var4, var52);
                                          if(var45 == null) {
                                             class69.field1026[++class45.field377 - 1] = -1;
                                          } else {
                                             class69.field1026[++class45.field377 - 1] = var45.method4467();
                                          }

                                          var3 = 1;
                                       } else {
                                          class28 var42;
                                          if(var0 == 6639) {
                                             var42 = class71.method1821().method6067();
                                             if(var42 == null) {
                                                class69.field1026[++class45.field377 - 1] = -1;
                                                class69.field1026[++class45.field377 - 1] = -1;
                                             } else {
                                                class69.field1026[++class45.field377 - 1] = var42.field251;
                                                class69.field1026[++class45.field377 - 1] = var42.field247.method4467();
                                             }

                                             var3 = 1;
                                          } else if(var0 == 6640) {
                                             var42 = class71.method1821().method6245();
                                             if(var42 == null) {
                                                class69.field1026[++class45.field377 - 1] = -1;
                                                class69.field1026[++class45.field377 - 1] = -1;
                                             } else {
                                                class69.field1026[++class45.field377 - 1] = var42.field251;
                                                class69.field1026[++class45.field377 - 1] = var42.field247.method4467();
                                             }

                                             var3 = 1;
                                          } else {
                                             class255 var57;
                                             if(var0 == 6693) {
                                                var4 = class69.field1026[--class45.field377];
                                                var57 = class255.field3274[var4];
                                                if(var57.field3262 == null) {
                                                   class69.field1021[++class83.field1207 - 1] = "";
                                                } else {
                                                   class69.field1021[++class83.field1207 - 1] = var57.field3262;
                                                }

                                                var3 = 1;
                                             } else if(var0 == 6694) {
                                                var4 = class69.field1026[--class45.field377];
                                                var57 = class255.field3274[var4];
                                                class69.field1026[++class45.field377 - 1] = var57.field3276;
                                                var3 = 1;
                                             } else if(var0 == 6695) {
                                                var4 = class69.field1026[--class45.field377];
                                                var57 = class255.field3274[var4];
                                                if(var57 == null) {
                                                   class69.field1026[++class45.field377 - 1] = -1;
                                                } else {
                                                   class69.field1026[++class45.field377 - 1] = var57.field3277;
                                                }

                                                var3 = 1;
                                             } else if(var0 == 6696) {
                                                var4 = class69.field1026[--class45.field377];
                                                var57 = class255.field3274[var4];
                                                if(var57 == null) {
                                                   class69.field1026[++class45.field377 - 1] = -1;
                                                } else {
                                                   class69.field1026[++class45.field377 - 1] = var57.field3260;
                                                }

                                                var3 = 1;
                                             } else if(var0 == 6697) {
                                                class69.field1026[++class45.field377 - 1] = class173.field2293.field312;
                                                var3 = 1;
                                             } else if(var0 == 6698) {
                                                class69.field1026[++class45.field377 - 1] = class173.field2293.field308.method4467();
                                                var3 = 1;
                                             } else if(var0 == 6699) {
                                                class69.field1026[++class45.field377 - 1] = class173.field2293.field309.method4467();
                                                var3 = 1;
                                             } else {
                                                var3 = 2;
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }

                        return var3;
                     } else {
                        return 2;
                     }
                  } else {
                     if(var0 == 6500) {
                        class69.field1026[++class45.field377 - 1] = class248.method4734()?1:0;
                        var3 = 1;
                     } else {
                        class65 var14;
                        if(var0 == 6501) {
                           var14 = class294.method5520();
                           if(var14 != null) {
                              class69.field1026[++class45.field377 - 1] = var14.field960;
                              class69.field1026[++class45.field377 - 1] = var14.field961;
                              class69.field1021[++class83.field1207 - 1] = var14.field964;
                              class69.field1026[++class45.field377 - 1] = var14.field952;
                              class69.field1026[++class45.field377 - 1] = var14.field957;
                              class69.field1021[++class83.field1207 - 1] = var14.field963;
                           } else {
                              class69.field1026[++class45.field377 - 1] = -1;
                              class69.field1026[++class45.field377 - 1] = 0;
                              class69.field1021[++class83.field1207 - 1] = "";
                              class69.field1026[++class45.field377 - 1] = 0;
                              class69.field1026[++class45.field377 - 1] = 0;
                              class69.field1021[++class83.field1207 - 1] = "";
                           }

                           var3 = 1;
                        } else if(var0 == 6502) {
                           var14 = class115.method2704();
                           if(var14 != null) {
                              class69.field1026[++class45.field377 - 1] = var14.field960;
                              class69.field1026[++class45.field377 - 1] = var14.field961;
                              class69.field1021[++class83.field1207 - 1] = var14.field964;
                              class69.field1026[++class45.field377 - 1] = var14.field952;
                              class69.field1026[++class45.field377 - 1] = var14.field957;
                              class69.field1021[++class83.field1207 - 1] = var14.field963;
                           } else {
                              class69.field1026[++class45.field377 - 1] = -1;
                              class69.field1026[++class45.field377 - 1] = 0;
                              class69.field1021[++class83.field1207 - 1] = "";
                              class69.field1026[++class45.field377 - 1] = 0;
                              class69.field1026[++class45.field377 - 1] = 0;
                              class69.field1021[++class83.field1207 - 1] = "";
                           }

                           var3 = 1;
                        } else {
                           class65 var15;
                           if(var0 == 6506) {
                              var4 = class69.field1026[--class45.field377];
                              var15 = null;

                              for(var6 = 0; var6 < class65.field955; ++var6) {
                                 if(var4 == class143.field1914[var6].field960) {
                                    var15 = class143.field1914[var6];
                                    break;
                                 }
                              }

                              if(var15 != null) {
                                 class69.field1026[++class45.field377 - 1] = var15.field960;
                                 class69.field1026[++class45.field377 - 1] = var15.field961;
                                 class69.field1021[++class83.field1207 - 1] = var15.field964;
                                 class69.field1026[++class45.field377 - 1] = var15.field952;
                                 class69.field1026[++class45.field377 - 1] = var15.field957;
                                 class69.field1021[++class83.field1207 - 1] = var15.field963;
                              } else {
                                 class69.field1026[++class45.field377 - 1] = -1;
                                 class69.field1026[++class45.field377 - 1] = 0;
                                 class69.field1021[++class83.field1207 - 1] = "";
                                 class69.field1026[++class45.field377 - 1] = 0;
                                 class69.field1026[++class45.field377 - 1] = 0;
                                 class69.field1021[++class83.field1207 - 1] = "";
                              }

                              var3 = 1;
                           } else if(var0 == 6507) {
                              class45.field377 -= 4;
                              var4 = class69.field1026[class45.field377];
                              var5 = class69.field1026[class45.field377 + 1] == 1;
                              var6 = class69.field1026[class45.field377 + 2];
                              boolean var18 = class69.field1026[class45.field377 + 3] == 1;
                              class138.method3160(var4, var5, var6, var18);
                              var3 = 1;
                           } else if(var0 == 6511) {
                              var4 = class69.field1026[--class45.field377];
                              if(var4 >= 0 && var4 < class65.field955) {
                                 var15 = class143.field1914[var4];
                                 class69.field1026[++class45.field377 - 1] = var15.field960;
                                 class69.field1026[++class45.field377 - 1] = var15.field961;
                                 class69.field1021[++class83.field1207 - 1] = var15.field964;
                                 class69.field1026[++class45.field377 - 1] = var15.field952;
                                 class69.field1026[++class45.field377 - 1] = var15.field957;
                                 class69.field1021[++class83.field1207 - 1] = var15.field963;
                              } else {
                                 class69.field1026[++class45.field377 - 1] = -1;
                                 class69.field1026[++class45.field377 - 1] = 0;
                                 class69.field1021[++class83.field1207 - 1] = "";
                                 class69.field1026[++class45.field377 - 1] = 0;
                                 class69.field1026[++class45.field377 - 1] = 0;
                                 class69.field1021[++class83.field1207 - 1] = "";
                              }

                              var3 = 1;
                           } else if(var0 == 6512) {
                              client.field753 = class69.field1026[--class45.field377] == 1;
                              var3 = 1;
                           } else {
                              class264 var16;
                              if(var0 == 6513) {
                                 class45.field377 -= 2;
                                 var4 = class69.field1026[class45.field377];
                                 var24 = class69.field1026[class45.field377 + 1];
                                 var16 = class182.method3811(var24);
                                 if(var16.method4956()) {
                                    class69.field1021[++class83.field1207 - 1] = class59.method1125(var4).method5175(var24, var16.field3347);
                                 } else {
                                    class69.field1026[++class45.field377 - 1] = class59.method1125(var4).method5196(var24, var16.field3348);
                                 }

                                 var3 = 1;
                              } else if(var0 == 6514) {
                                 class45.field377 -= 2;
                                 var4 = class69.field1026[class45.field377];
                                 var24 = class69.field1026[class45.field377 + 1];
                                 var16 = class182.method3811(var24);
                                 if(var16.method4956()) {
                                    class69.field1021[++class83.field1207 - 1] = class40.method766(var4).method5057(var24, var16.field3347);
                                 } else {
                                    class69.field1026[++class45.field377 - 1] = class40.method766(var4).method5078(var24, var16.field3348);
                                 }

                                 var3 = 1;
                              } else if(var0 == 6515) {
                                 class45.field377 -= 2;
                                 var4 = class69.field1026[class45.field377];
                                 var24 = class69.field1026[class45.field377 + 1];
                                 var16 = class182.method3811(var24);
                                 if(var16.method4956()) {
                                    class69.field1021[++class83.field1207 - 1] = class120.method2784(var4).method5111(var24, var16.field3347);
                                 } else {
                                    class69.field1026[++class45.field377 - 1] = class120.method2784(var4).method5103(var24, var16.field3348);
                                 }

                                 var3 = 1;
                              } else if(var0 == 6516) {
                                 class45.field377 -= 2;
                                 var4 = class69.field1026[class45.field377];
                                 var24 = class69.field1026[class45.field377 + 1];
                                 var16 = class182.method3811(var24);
                                 class265 var10;
                                 byte[] var11;
                                 class265 var19;
                                 if(var16.method4956()) {
                                    String[] var7 = class69.field1021;
                                    var17 = ++class83.field1207 - 1;
                                    var10 = (class265)class265.field3352.method4023((long)var4);
                                    if(var10 != null) {
                                       var19 = var10;
                                    } else {
                                       var11 = class265.field3351.method4626(34, var4);
                                       var10 = new class265();
                                       if(var11 != null) {
                                          var10.method4990(new class182(var11));
                                       }

                                       var10.method4976();
                                       class265.field3352.method4028(var10, (long)var4);
                                       var19 = var10;
                                    }

                                    var7[var17] = var19.method4980(var24, var16.field3347);
                                 } else {
                                    int[] var25 = class69.field1026;
                                    var17 = ++class45.field377 - 1;
                                    var10 = (class265)class265.field3352.method4023((long)var4);
                                    if(var10 != null) {
                                       var19 = var10;
                                    } else {
                                       var11 = class265.field3351.method4626(34, var4);
                                       var10 = new class265();
                                       if(var11 != null) {
                                          var10.method4990(new class182(var11));
                                       }

                                       var10.method4976();
                                       class265.field3352.method4028(var10, (long)var4);
                                       var19 = var10;
                                    }

                                    var25[var17] = var19.method4982(var24, var16.field3348);
                                 }

                                 var3 = 1;
                              } else if(var0 == 6518) {
                                 class69.field1026[++class45.field377 - 1] = client.field601?1:0;
                                 var3 = 1;
                              } else if(var0 == 6520) {
                                 var3 = 1;
                              } else if(var0 == 6521) {
                                 var3 = 1;
                              } else if(var0 == 6522) {
                                 --class83.field1207;
                                 --class45.field377;
                                 var3 = 1;
                              } else if(var0 == 6523) {
                                 --class83.field1207;
                                 --class45.field377;
                                 var3 = 1;
                              } else {
                                 var3 = 2;
                              }
                           }
                        }
                     }

                     return var3;
                  }
               }
            }
         }
      }
   }
}
