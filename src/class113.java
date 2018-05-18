import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("do")
public class class113 extends class127 {

   @ObfuscatedName("aj")
   static int[] field1502 = new int[10000];
   @ObfuscatedName("ae")
   static int[] field1524 = new int[10000];
   @ObfuscatedName("au")
   static int field1503 = 0;
   @ObfuscatedName("av")
   static int[] field1525 = class122.field1702;
   @ObfuscatedName("ab")
   static int[] field1481 = class122.field1708;
   @ObfuscatedName("w")
   int field1523 = 0;
   @ObfuscatedName("m")
   int[] field1491;
   @ObfuscatedName("q")
   int[] field1483;
   @ObfuscatedName("b")
   int[] field1484;
   @ObfuscatedName("f")
   int field1482 = 0;
   @ObfuscatedName("n")
   int[] field1486;
   @ObfuscatedName("h")
   int[] field1487;
   @ObfuscatedName("x")
   int[] field1488;
   @ObfuscatedName("j")
   byte[] field1489;
   @ObfuscatedName("a")
   byte[] field1509;
   @ObfuscatedName("l")
   byte[] field1510;
   @ObfuscatedName("d")
   byte[] field1518;
   @ObfuscatedName("s")
   short[] field1493;
   @ObfuscatedName("p")
   short[] field1494;
   @ObfuscatedName("g")
   byte field1495 = 0;
   @ObfuscatedName("y")
   int field1521;
   @ObfuscatedName("c")
   byte[] field1497;
   @ObfuscatedName("e")
   short[] field1500;
   @ObfuscatedName("t")
   short[] field1526;
   @ObfuscatedName("u")
   short[] field1492;
   @ObfuscatedName("i")
   short[] field1501;
   @ObfuscatedName("z")
   short[] field1508;
   @ObfuscatedName("k")
   short[] field1527;
   @ObfuscatedName("r")
   short[] field1504;
   @ObfuscatedName("v")
   short[] field1505;
   @ObfuscatedName("o")
   short[] field1506;
   @ObfuscatedName("ai")
   byte[] field1507;
   @ObfuscatedName("at")
   int[] field1520;
   @ObfuscatedName("ad")
   int[] field1485;
   @ObfuscatedName("ac")
   int[][] field1516;
   @ObfuscatedName("ay")
   int[][] field1511;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "[Ldy;"
   )
   class129[] field1512;
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      signature = "[Ldv;"
   )
   class121[] field1513;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "[Ldv;"
   )
   class121[] field1514;
   @ObfuscatedName("ag")
   public short field1515;
   @ObfuscatedName("ah")
   public short field1490;
   @ObfuscatedName("az")
   boolean field1517 = false;
   @ObfuscatedName("ao")
   int field1499;
   @ObfuscatedName("ap")
   int field1519;
   @ObfuscatedName("af")
   int field1498;
   @ObfuscatedName("am")
   int field1496;
   @ObfuscatedName("aq")
   int field1522;


   class113() {}

   @ObfuscatedSignature(
      signature = "([Ldo;I)V"
   )
   public class113(class113[] var1, int var2) {
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      this.field1523 = 0;
      this.field1482 = 0;
      this.field1521 = 0;
      this.field1495 = -1;

      int var9;
      class113 var10;
      for(var9 = 0; var9 < var2; ++var9) {
         var10 = var1[var9];
         if(var10 != null) {
            this.field1523 += var10.field1523;
            this.field1482 += var10.field1482;
            this.field1521 += var10.field1521;
            if(var10.field1509 != null) {
               var4 = true;
            } else {
               if(this.field1495 == -1) {
                  this.field1495 = var10.field1495;
               }

               if(this.field1495 != var10.field1495) {
                  var4 = true;
               }
            }

            var3 |= var10.field1489 != null;
            var5 |= var10.field1510 != null;
            var6 |= var10.field1485 != null;
            var7 |= var10.field1494 != null;
            var8 |= var10.field1518 != null;
         }
      }

      this.field1491 = new int[this.field1523];
      this.field1483 = new int[this.field1523];
      this.field1484 = new int[this.field1523];
      this.field1520 = new int[this.field1523];
      this.field1486 = new int[this.field1482];
      this.field1487 = new int[this.field1482];
      this.field1488 = new int[this.field1482];
      if(var3) {
         this.field1489 = new byte[this.field1482];
      }

      if(var4) {
         this.field1509 = new byte[this.field1482];
      }

      if(var5) {
         this.field1510 = new byte[this.field1482];
      }

      if(var6) {
         this.field1485 = new int[this.field1482];
      }

      if(var7) {
         this.field1494 = new short[this.field1482];
      }

      if(var8) {
         this.field1518 = new byte[this.field1482];
      }

      this.field1493 = new short[this.field1482];
      if(this.field1521 > 0) {
         this.field1497 = new byte[this.field1521];
         this.field1500 = new short[this.field1521];
         this.field1526 = new short[this.field1521];
         this.field1492 = new short[this.field1521];
         this.field1501 = new short[this.field1521];
         this.field1508 = new short[this.field1521];
         this.field1527 = new short[this.field1521];
         this.field1504 = new short[this.field1521];
         this.field1507 = new byte[this.field1521];
         this.field1505 = new short[this.field1521];
         this.field1506 = new short[this.field1521];
      }

      this.field1523 = 0;
      this.field1482 = 0;
      this.field1521 = 0;

      for(var9 = 0; var9 < var2; ++var9) {
         var10 = var1[var9];
         if(var10 != null) {
            int var11;
            for(var11 = 0; var11 < var10.field1482; ++var11) {
               if(var3 && var10.field1489 != null) {
                  this.field1489[this.field1482] = var10.field1489[var11];
               }

               if(var4) {
                  if(var10.field1509 != null) {
                     this.field1509[this.field1482] = var10.field1509[var11];
                  } else {
                     this.field1509[this.field1482] = var10.field1495;
                  }
               }

               if(var5 && var10.field1510 != null) {
                  this.field1510[this.field1482] = var10.field1510[var11];
               }

               if(var6 && var10.field1485 != null) {
                  this.field1485[this.field1482] = var10.field1485[var11];
               }

               if(var7) {
                  if(var10.field1494 != null) {
                     this.field1494[this.field1482] = var10.field1494[var11];
                  } else {
                     this.field1494[this.field1482] = -1;
                  }
               }

               if(var8) {
                  if(var10.field1518 != null && var10.field1518[var11] != -1) {
                     this.field1518[this.field1482] = (byte)(this.field1521 + var10.field1518[var11]);
                  } else {
                     this.field1518[this.field1482] = -1;
                  }
               }

               this.field1493[this.field1482] = var10.field1493[var11];
               this.field1486[this.field1482] = this.method2646(var10, var10.field1486[var11]);
               this.field1487[this.field1482] = this.method2646(var10, var10.field1487[var11]);
               this.field1488[this.field1482] = this.method2646(var10, var10.field1488[var11]);
               ++this.field1482;
            }

            for(var11 = 0; var11 < var10.field1521; ++var11) {
               byte var12 = this.field1497[this.field1521] = var10.field1497[var11];
               if(var12 == 0) {
                  this.field1500[this.field1521] = (short)this.method2646(var10, var10.field1500[var11]);
                  this.field1526[this.field1521] = (short)this.method2646(var10, var10.field1526[var11]);
                  this.field1492[this.field1521] = (short)this.method2646(var10, var10.field1492[var11]);
               }

               if(var12 >= 1 && var12 <= 3) {
                  this.field1500[this.field1521] = var10.field1500[var11];
                  this.field1526[this.field1521] = var10.field1526[var11];
                  this.field1492[this.field1521] = var10.field1492[var11];
                  this.field1501[this.field1521] = var10.field1501[var11];
                  this.field1508[this.field1521] = var10.field1508[var11];
                  this.field1527[this.field1521] = var10.field1527[var11];
                  this.field1504[this.field1521] = var10.field1504[var11];
                  this.field1507[this.field1521] = var10.field1507[var11];
                  this.field1505[this.field1521] = var10.field1505[var11];
               }

               if(var12 == 2) {
                  this.field1506[this.field1521] = var10.field1506[var11];
               }

               ++this.field1521;
            }
         }
      }

   }

   class113(byte[] var1) {
      if(var1[var1.length - 1] == -1 && var1[var1.length - 2] == -1) {
         this.method2620(var1);
      } else {
         this.method2622(var1);
      }

   }

   @ObfuscatedSignature(
      signature = "(Ldo;ZZZZ)V",
      garbageValue = "1"
   )
   public class113(class113 var1, boolean var2, boolean var3, boolean var4, boolean var5) {
      this.field1523 = var1.field1523;
      this.field1482 = var1.field1482;
      this.field1521 = var1.field1521;
      int var6;
      if(var2) {
         this.field1491 = var1.field1491;
         this.field1483 = var1.field1483;
         this.field1484 = var1.field1484;
      } else {
         this.field1491 = new int[this.field1523];
         this.field1483 = new int[this.field1523];
         this.field1484 = new int[this.field1523];

         for(var6 = 0; var6 < this.field1523; ++var6) {
            this.field1491[var6] = var1.field1491[var6];
            this.field1483[var6] = var1.field1483[var6];
            this.field1484[var6] = var1.field1484[var6];
         }
      }

      if(var3) {
         this.field1493 = var1.field1493;
      } else {
         this.field1493 = new short[this.field1482];

         for(var6 = 0; var6 < this.field1482; ++var6) {
            this.field1493[var6] = var1.field1493[var6];
         }
      }

      if(!var4 && var1.field1494 != null) {
         this.field1494 = new short[this.field1482];

         for(var6 = 0; var6 < this.field1482; ++var6) {
            this.field1494[var6] = var1.field1494[var6];
         }
      } else {
         this.field1494 = var1.field1494;
      }

      this.field1510 = var1.field1510;
      this.field1486 = var1.field1486;
      this.field1487 = var1.field1487;
      this.field1488 = var1.field1488;
      this.field1489 = var1.field1489;
      this.field1509 = var1.field1509;
      this.field1518 = var1.field1518;
      this.field1495 = var1.field1495;
      this.field1497 = var1.field1497;
      this.field1500 = var1.field1500;
      this.field1526 = var1.field1526;
      this.field1492 = var1.field1492;
      this.field1501 = var1.field1501;
      this.field1508 = var1.field1508;
      this.field1527 = var1.field1527;
      this.field1504 = var1.field1504;
      this.field1507 = var1.field1507;
      this.field1505 = var1.field1505;
      this.field1506 = var1.field1506;
      this.field1520 = var1.field1520;
      this.field1485 = var1.field1485;
      this.field1516 = var1.field1516;
      this.field1511 = var1.field1511;
      this.field1513 = var1.field1513;
      this.field1512 = var1.field1512;
      this.field1514 = var1.field1514;
      this.field1515 = var1.field1515;
      this.field1490 = var1.field1490;
   }

   @ObfuscatedName("m")
   void method2620(byte[] var1) {
      class182 var2 = new class182(var1);
      class182 var3 = new class182(var1);
      class182 var4 = new class182(var1);
      class182 var5 = new class182(var1);
      class182 var6 = new class182(var1);
      class182 var7 = new class182(var1);
      class182 var8 = new class182(var1);
      var2.field2359 = var1.length - 23;
      int var9 = var2.method3574();
      int var10 = var2.method3574();
      int var11 = var2.method3742();
      int var12 = var2.method3742();
      int var13 = var2.method3742();
      int var14 = var2.method3742();
      int var15 = var2.method3742();
      int var16 = var2.method3742();
      int var17 = var2.method3742();
      int var18 = var2.method3574();
      int var19 = var2.method3574();
      int var20 = var2.method3574();
      int var21 = var2.method3574();
      int var22 = var2.method3574();
      int var23 = 0;
      int var24 = 0;
      int var25 = 0;
      int var26;
      if(var11 > 0) {
         this.field1497 = new byte[var11];
         var2.field2359 = 0;

         for(var26 = 0; var26 < var11; ++var26) {
            byte var27 = this.field1497[var26] = var2.method3569();
            if(var27 == 0) {
               ++var23;
            }

            if(var27 >= 1 && var27 <= 3) {
               ++var24;
            }

            if(var27 == 2) {
               ++var25;
            }
         }
      }

      var26 = var11 + var9;
      int var28 = var26;
      if(var12 == 1) {
         var26 += var10;
      }

      int var29 = var26;
      var26 += var10;
      int var30 = var26;
      if(var13 == 255) {
         var26 += var10;
      }

      int var31 = var26;
      if(var15 == 1) {
         var26 += var10;
      }

      int var32 = var26;
      if(var17 == 1) {
         var26 += var9;
      }

      int var33 = var26;
      if(var14 == 1) {
         var26 += var10;
      }

      int var34 = var26;
      var26 += var21;
      int var35 = var26;
      if(var16 == 1) {
         var26 += var10 * 2;
      }

      int var36 = var26;
      var26 += var22;
      int var37 = var26;
      var26 += var10 * 2;
      int var38 = var26;
      var26 += var18;
      int var39 = var26;
      var26 += var19;
      int var40 = var26;
      var26 += var20;
      int var41 = var26;
      var26 += var23 * 6;
      int var42 = var26;
      var26 += var24 * 6;
      int var43 = var26;
      var26 += var24 * 6;
      int var44 = var26;
      var26 += var24 * 2;
      int var45 = var26;
      var26 += var24;
      int var46 = var26;
      var26 += var24 * 2 + var25 * 2;
      this.field1523 = var9;
      this.field1482 = var10;
      this.field1521 = var11;
      this.field1491 = new int[var9];
      this.field1483 = new int[var9];
      this.field1484 = new int[var9];
      this.field1486 = new int[var10];
      this.field1487 = new int[var10];
      this.field1488 = new int[var10];
      if(var17 == 1) {
         this.field1520 = new int[var9];
      }

      if(var12 == 1) {
         this.field1489 = new byte[var10];
      }

      if(var13 == 255) {
         this.field1509 = new byte[var10];
      } else {
         this.field1495 = (byte)var13;
      }

      if(var14 == 1) {
         this.field1510 = new byte[var10];
      }

      if(var15 == 1) {
         this.field1485 = new int[var10];
      }

      if(var16 == 1) {
         this.field1494 = new short[var10];
      }

      if(var16 == 1 && var11 > 0) {
         this.field1518 = new byte[var10];
      }

      this.field1493 = new short[var10];
      if(var11 > 0) {
         this.field1500 = new short[var11];
         this.field1526 = new short[var11];
         this.field1492 = new short[var11];
         if(var24 > 0) {
            this.field1501 = new short[var24];
            this.field1508 = new short[var24];
            this.field1527 = new short[var24];
            this.field1504 = new short[var24];
            this.field1507 = new byte[var24];
            this.field1505 = new short[var24];
         }

         if(var25 > 0) {
            this.field1506 = new short[var25];
         }
      }

      var2.field2359 = var11;
      var3.field2359 = var38;
      var4.field2359 = var39;
      var5.field2359 = var40;
      var6.field2359 = var32;
      int var48 = 0;
      int var49 = 0;
      int var50 = 0;

      int var51;
      int var52;
      int var53;
      int var54;
      int var55;
      for(var51 = 0; var51 < var9; ++var51) {
         var52 = var2.method3742();
         var53 = 0;
         if((var52 & 1) != 0) {
            var53 = var3.method3581();
         }

         var54 = 0;
         if((var52 & 2) != 0) {
            var54 = var4.method3581();
         }

         var55 = 0;
         if((var52 & 4) != 0) {
            var55 = var5.method3581();
         }

         this.field1491[var51] = var48 + var53;
         this.field1483[var51] = var49 + var54;
         this.field1484[var51] = var50 + var55;
         var48 = this.field1491[var51];
         var49 = this.field1483[var51];
         var50 = this.field1484[var51];
         if(var17 == 1) {
            this.field1520[var51] = var6.method3742();
         }
      }

      var2.field2359 = var37;
      var3.field2359 = var28;
      var4.field2359 = var30;
      var5.field2359 = var33;
      var6.field2359 = var31;
      var7.field2359 = var35;
      var8.field2359 = var36;

      for(var51 = 0; var51 < var10; ++var51) {
         this.field1493[var51] = (short)var2.method3574();
         if(var12 == 1) {
            this.field1489[var51] = var3.method3569();
         }

         if(var13 == 255) {
            this.field1509[var51] = var4.method3569();
         }

         if(var14 == 1) {
            this.field1510[var51] = var5.method3569();
         }

         if(var15 == 1) {
            this.field1485[var51] = var6.method3742();
         }

         if(var16 == 1) {
            this.field1494[var51] = (short)(var7.method3574() - 1);
         }

         if(this.field1518 != null && this.field1494[var51] != -1) {
            this.field1518[var51] = (byte)(var8.method3742() - 1);
         }
      }

      var2.field2359 = var34;
      var3.field2359 = var29;
      var51 = 0;
      var52 = 0;
      var53 = 0;
      var54 = 0;

      int var56;
      for(var55 = 0; var55 < var10; ++var55) {
         var56 = var3.method3742();
         if(var56 == 1) {
            var51 = var2.method3581() + var54;
            var52 = var2.method3581() + var51;
            var53 = var2.method3581() + var52;
            var54 = var53;
            this.field1486[var55] = var51;
            this.field1487[var55] = var52;
            this.field1488[var55] = var53;
         }

         if(var56 == 2) {
            var52 = var53;
            var53 = var2.method3581() + var54;
            var54 = var53;
            this.field1486[var55] = var51;
            this.field1487[var55] = var52;
            this.field1488[var55] = var53;
         }

         if(var56 == 3) {
            var51 = var53;
            var53 = var2.method3581() + var54;
            var54 = var53;
            this.field1486[var55] = var51;
            this.field1487[var55] = var52;
            this.field1488[var55] = var53;
         }

         if(var56 == 4) {
            int var57 = var51;
            var51 = var52;
            var52 = var57;
            var53 = var2.method3581() + var54;
            var54 = var53;
            this.field1486[var55] = var51;
            this.field1487[var55] = var57;
            this.field1488[var55] = var53;
         }
      }

      var2.field2359 = var41;
      var3.field2359 = var42;
      var4.field2359 = var43;
      var5.field2359 = var44;
      var6.field2359 = var45;
      var7.field2359 = var46;

      for(var55 = 0; var55 < var11; ++var55) {
         var56 = this.field1497[var55] & 255;
         if(var56 == 0) {
            this.field1500[var55] = (short)var2.method3574();
            this.field1526[var55] = (short)var2.method3574();
            this.field1492[var55] = (short)var2.method3574();
         }

         if(var56 == 1) {
            this.field1500[var55] = (short)var3.method3574();
            this.field1526[var55] = (short)var3.method3574();
            this.field1492[var55] = (short)var3.method3574();
            this.field1501[var55] = (short)var4.method3574();
            this.field1508[var55] = (short)var4.method3574();
            this.field1527[var55] = (short)var4.method3574();
            this.field1504[var55] = (short)var5.method3574();
            this.field1507[var55] = var6.method3569();
            this.field1505[var55] = (short)var7.method3574();
         }

         if(var56 == 2) {
            this.field1500[var55] = (short)var3.method3574();
            this.field1526[var55] = (short)var3.method3574();
            this.field1492[var55] = (short)var3.method3574();
            this.field1501[var55] = (short)var4.method3574();
            this.field1508[var55] = (short)var4.method3574();
            this.field1527[var55] = (short)var4.method3574();
            this.field1504[var55] = (short)var5.method3574();
            this.field1507[var55] = var6.method3569();
            this.field1505[var55] = (short)var7.method3574();
            this.field1506[var55] = (short)var7.method3574();
         }

         if(var56 == 3) {
            this.field1500[var55] = (short)var3.method3574();
            this.field1526[var55] = (short)var3.method3574();
            this.field1492[var55] = (short)var3.method3574();
            this.field1501[var55] = (short)var4.method3574();
            this.field1508[var55] = (short)var4.method3574();
            this.field1527[var55] = (short)var4.method3574();
            this.field1504[var55] = (short)var5.method3574();
            this.field1507[var55] = var6.method3569();
            this.field1505[var55] = (short)var7.method3574();
         }
      }

      var2.field2359 = var26;
      var55 = var2.method3742();
      if(var55 != 0) {
         new class126();
         var2.method3574();
         var2.method3574();
         var2.method3574();
         var2.method3573();
      }

   }

   @ObfuscatedName("q")
   void method2622(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      class182 var4 = new class182(var1);
      class182 var5 = new class182(var1);
      class182 var6 = new class182(var1);
      class182 var7 = new class182(var1);
      class182 var8 = new class182(var1);
      var4.field2359 = var1.length - 18;
      int var9 = var4.method3574();
      int var10 = var4.method3574();
      int var11 = var4.method3742();
      int var12 = var4.method3742();
      int var13 = var4.method3742();
      int var14 = var4.method3742();
      int var15 = var4.method3742();
      int var16 = var4.method3742();
      int var17 = var4.method3574();
      int var18 = var4.method3574();
      int var19 = var4.method3574();
      int var20 = var4.method3574();
      byte var21 = 0;
      int var45 = var21 + var9;
      int var23 = var45;
      var45 += var10;
      int var24 = var45;
      if(var13 == 255) {
         var45 += var10;
      }

      int var25 = var45;
      if(var15 == 1) {
         var45 += var10;
      }

      int var26 = var45;
      if(var12 == 1) {
         var45 += var10;
      }

      int var27 = var45;
      if(var16 == 1) {
         var45 += var9;
      }

      int var28 = var45;
      if(var14 == 1) {
         var45 += var10;
      }

      int var29 = var45;
      var45 += var20;
      int var30 = var45;
      var45 += var10 * 2;
      int var31 = var45;
      var45 += var11 * 6;
      int var32 = var45;
      var45 += var17;
      int var33 = var45;
      var45 += var18;
      int var10000 = var45 + var19;
      this.field1523 = var9;
      this.field1482 = var10;
      this.field1521 = var11;
      this.field1491 = new int[var9];
      this.field1483 = new int[var9];
      this.field1484 = new int[var9];
      this.field1486 = new int[var10];
      this.field1487 = new int[var10];
      this.field1488 = new int[var10];
      if(var11 > 0) {
         this.field1497 = new byte[var11];
         this.field1500 = new short[var11];
         this.field1526 = new short[var11];
         this.field1492 = new short[var11];
      }

      if(var16 == 1) {
         this.field1520 = new int[var9];
      }

      if(var12 == 1) {
         this.field1489 = new byte[var10];
         this.field1518 = new byte[var10];
         this.field1494 = new short[var10];
      }

      if(var13 == 255) {
         this.field1509 = new byte[var10];
      } else {
         this.field1495 = (byte)var13;
      }

      if(var14 == 1) {
         this.field1510 = new byte[var10];
      }

      if(var15 == 1) {
         this.field1485 = new int[var10];
      }

      this.field1493 = new short[var10];
      var4.field2359 = var21;
      var5.field2359 = var32;
      var6.field2359 = var33;
      var7.field2359 = var45;
      var8.field2359 = var27;
      int var35 = 0;
      int var36 = 0;
      int var37 = 0;

      int var38;
      int var39;
      int var40;
      int var41;
      int var42;
      for(var38 = 0; var38 < var9; ++var38) {
         var39 = var4.method3742();
         var40 = 0;
         if((var39 & 1) != 0) {
            var40 = var5.method3581();
         }

         var41 = 0;
         if((var39 & 2) != 0) {
            var41 = var6.method3581();
         }

         var42 = 0;
         if((var39 & 4) != 0) {
            var42 = var7.method3581();
         }

         this.field1491[var38] = var35 + var40;
         this.field1483[var38] = var36 + var41;
         this.field1484[var38] = var37 + var42;
         var35 = this.field1491[var38];
         var36 = this.field1483[var38];
         var37 = this.field1484[var38];
         if(var16 == 1) {
            this.field1520[var38] = var8.method3742();
         }
      }

      var4.field2359 = var30;
      var5.field2359 = var26;
      var6.field2359 = var24;
      var7.field2359 = var28;
      var8.field2359 = var25;

      for(var38 = 0; var38 < var10; ++var38) {
         this.field1493[var38] = (short)var4.method3574();
         if(var12 == 1) {
            var39 = var5.method3742();
            if((var39 & 1) == 1) {
               this.field1489[var38] = 1;
               var2 = true;
            } else {
               this.field1489[var38] = 0;
            }

            if((var39 & 2) == 2) {
               this.field1518[var38] = (byte)(var39 >> 2);
               this.field1494[var38] = this.field1493[var38];
               this.field1493[var38] = 127;
               if(this.field1494[var38] != -1) {
                  var3 = true;
               }
            } else {
               this.field1518[var38] = -1;
               this.field1494[var38] = -1;
            }
         }

         if(var13 == 255) {
            this.field1509[var38] = var6.method3569();
         }

         if(var14 == 1) {
            this.field1510[var38] = var7.method3569();
         }

         if(var15 == 1) {
            this.field1485[var38] = var8.method3742();
         }
      }

      var4.field2359 = var29;
      var5.field2359 = var23;
      var38 = 0;
      var39 = 0;
      var40 = 0;
      var41 = 0;

      int var43;
      int var44;
      for(var42 = 0; var42 < var10; ++var42) {
         var43 = var5.method3742();
         if(var43 == 1) {
            var38 = var4.method3581() + var41;
            var39 = var4.method3581() + var38;
            var40 = var4.method3581() + var39;
            var41 = var40;
            this.field1486[var42] = var38;
            this.field1487[var42] = var39;
            this.field1488[var42] = var40;
         }

         if(var43 == 2) {
            var39 = var40;
            var40 = var4.method3581() + var41;
            var41 = var40;
            this.field1486[var42] = var38;
            this.field1487[var42] = var39;
            this.field1488[var42] = var40;
         }

         if(var43 == 3) {
            var38 = var40;
            var40 = var4.method3581() + var41;
            var41 = var40;
            this.field1486[var42] = var38;
            this.field1487[var42] = var39;
            this.field1488[var42] = var40;
         }

         if(var43 == 4) {
            var44 = var38;
            var38 = var39;
            var39 = var44;
            var40 = var4.method3581() + var41;
            var41 = var40;
            this.field1486[var42] = var38;
            this.field1487[var42] = var44;
            this.field1488[var42] = var40;
         }
      }

      var4.field2359 = var31;

      for(var42 = 0; var42 < var11; ++var42) {
         this.field1497[var42] = 0;
         this.field1500[var42] = (short)var4.method3574();
         this.field1526[var42] = (short)var4.method3574();
         this.field1492[var42] = (short)var4.method3574();
      }

      if(this.field1518 != null) {
         boolean var46 = false;

         for(var43 = 0; var43 < var10; ++var43) {
            var44 = this.field1518[var43] & 255;
            if(var44 != 255) {
               if(this.field1486[var43] == (this.field1500[var44] & '\uffff') && this.field1487[var43] == (this.field1526[var44] & '\uffff') && this.field1488[var43] == (this.field1492[var44] & '\uffff')) {
                  this.field1518[var43] = -1;
               } else {
                  var46 = true;
               }
            }
         }

         if(!var46) {
            this.field1518 = null;
         }
      }

      if(!var3) {
         this.field1494 = null;
      }

      if(!var2) {
         this.field1489 = null;
      }

   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Ldo;I)I"
   )
   final int method2646(class113 var1, int var2) {
      int var3 = -1;
      int var4 = var1.field1491[var2];
      int var5 = var1.field1483[var2];
      int var6 = var1.field1484[var2];

      for(int var7 = 0; var7 < this.field1523; ++var7) {
         if(var4 == this.field1491[var7] && var5 == this.field1483[var7] && var6 == this.field1484[var7]) {
            var3 = var7;
            break;
         }
      }

      if(var3 == -1) {
         this.field1491[this.field1523] = var4;
         this.field1483[this.field1523] = var5;
         this.field1484[this.field1523] = var6;
         if(var1.field1520 != null) {
            this.field1520[this.field1523] = var1.field1520[var2];
         }

         var3 = this.field1523++;
      }

      return var3;
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "()Ldo;"
   )
   public class113 method2624() {
      class113 var1 = new class113();
      if(this.field1489 != null) {
         var1.field1489 = new byte[this.field1482];

         for(int var2 = 0; var2 < this.field1482; ++var2) {
            var1.field1489[var2] = this.field1489[var2];
         }
      }

      var1.field1523 = this.field1523;
      var1.field1482 = this.field1482;
      var1.field1521 = this.field1521;
      var1.field1491 = this.field1491;
      var1.field1483 = this.field1483;
      var1.field1484 = this.field1484;
      var1.field1486 = this.field1486;
      var1.field1487 = this.field1487;
      var1.field1488 = this.field1488;
      var1.field1509 = this.field1509;
      var1.field1510 = this.field1510;
      var1.field1518 = this.field1518;
      var1.field1493 = this.field1493;
      var1.field1494 = this.field1494;
      var1.field1495 = this.field1495;
      var1.field1497 = this.field1497;
      var1.field1500 = this.field1500;
      var1.field1526 = this.field1526;
      var1.field1492 = this.field1492;
      var1.field1501 = this.field1501;
      var1.field1508 = this.field1508;
      var1.field1527 = this.field1527;
      var1.field1504 = this.field1504;
      var1.field1507 = this.field1507;
      var1.field1505 = this.field1505;
      var1.field1506 = this.field1506;
      var1.field1520 = this.field1520;
      var1.field1485 = this.field1485;
      var1.field1516 = this.field1516;
      var1.field1511 = this.field1511;
      var1.field1513 = this.field1513;
      var1.field1512 = this.field1512;
      var1.field1515 = this.field1515;
      var1.field1490 = this.field1490;
      return var1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "([[IIIIZI)Ldo;"
   )
   public class113 method2625(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.method2637();
      int var7 = var2 + this.field1519;
      int var8 = var2 + this.field1498;
      int var9 = var4 + this.field1522;
      int var10 = var4 + this.field1496;
      if(var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
         var7 >>= 7;
         var8 = var8 + 127 >> 7;
         var9 >>= 7;
         var10 = var10 + 127 >> 7;
         if(var3 == var1[var7][var9] && var3 == var1[var8][var9] && var3 == var1[var7][var10] && var3 == var1[var8][var10]) {
            return this;
         } else {
            class113 var11 = new class113();
            var11.field1523 = this.field1523;
            var11.field1482 = this.field1482;
            var11.field1521 = this.field1521;
            var11.field1491 = this.field1491;
            var11.field1484 = this.field1484;
            var11.field1486 = this.field1486;
            var11.field1487 = this.field1487;
            var11.field1488 = this.field1488;
            var11.field1489 = this.field1489;
            var11.field1509 = this.field1509;
            var11.field1510 = this.field1510;
            var11.field1518 = this.field1518;
            var11.field1493 = this.field1493;
            var11.field1494 = this.field1494;
            var11.field1495 = this.field1495;
            var11.field1497 = this.field1497;
            var11.field1500 = this.field1500;
            var11.field1526 = this.field1526;
            var11.field1492 = this.field1492;
            var11.field1501 = this.field1501;
            var11.field1508 = this.field1508;
            var11.field1527 = this.field1527;
            var11.field1504 = this.field1504;
            var11.field1507 = this.field1507;
            var11.field1505 = this.field1505;
            var11.field1506 = this.field1506;
            var11.field1520 = this.field1520;
            var11.field1485 = this.field1485;
            var11.field1516 = this.field1516;
            var11.field1511 = this.field1511;
            var11.field1515 = this.field1515;
            var11.field1490 = this.field1490;
            var11.field1483 = new int[var11.field1523];
            int var12;
            int var13;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            if(var6 == 0) {
               for(var12 = 0; var12 < var11.field1523; ++var12) {
                  var13 = var2 + this.field1491[var12];
                  var14 = var4 + this.field1484[var12];
                  var15 = var13 & 127;
                  var16 = var14 & 127;
                  var17 = var13 >> 7;
                  var18 = var14 >> 7;
                  var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                  var20 = var1[var17][var18 + 1] * (128 - var15) + var15 * var1[var17 + 1][var18 + 1] >> 7;
                  var21 = var19 * (128 - var16) + var20 * var16 >> 7;
                  var11.field1483[var12] = var21 + this.field1483[var12] - var3;
               }
            } else {
               for(var12 = 0; var12 < var11.field1523; ++var12) {
                  var13 = (-this.field1483[var12] << 16) / super.field1805;
                  if(var13 < var6) {
                     var14 = var2 + this.field1491[var12];
                     var15 = var4 + this.field1484[var12];
                     var16 = var14 & 127;
                     var17 = var15 & 127;
                     var18 = var14 >> 7;
                     var19 = var15 >> 7;
                     var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
                     var21 = var1[var18][var19 + 1] * (128 - var16) + var16 * var1[var18 + 1][var19 + 1] >> 7;
                     int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
                     var11.field1483[var12] = (var6 - var13) * (var22 - var3) / var6 + this.field1483[var12];
                  }
               }
            }

            var11.method2638();
            return var11;
         }
      } else {
         return this;
      }
   }

   @ObfuscatedName("l")
   void method2626() {
      int[] var1;
      int var2;
      int var3;
      int var4;
      if(this.field1520 != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.field1523; ++var3) {
            var4 = this.field1520[var3];
            ++var1[var4];
            if(var4 > var2) {
               var2 = var4;
            }
         }

         this.field1516 = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.field1516[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.field1523; this.field1516[var4][var1[var4]++] = var3++) {
            var4 = this.field1520[var3];
         }

         this.field1520 = null;
      }

      if(this.field1485 != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.field1482; ++var3) {
            var4 = this.field1485[var3];
            ++var1[var4];
            if(var4 > var2) {
               var2 = var4;
            }
         }

         this.field1511 = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.field1511[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.field1482; this.field1511[var4][var1[var4]++] = var3++) {
            var4 = this.field1485[var3];
         }

         this.field1485 = null;
      }

   }

   @ObfuscatedName("d")
   public void method2649() {
      for(int var1 = 0; var1 < this.field1523; ++var1) {
         int var2 = this.field1491[var1];
         this.field1491[var1] = this.field1484[var1];
         this.field1484[var1] = -var2;
      }

      this.method2638();
   }

   @ObfuscatedName("p")
   public void method2627() {
      for(int var1 = 0; var1 < this.field1523; ++var1) {
         this.field1491[var1] = -this.field1491[var1];
         this.field1484[var1] = -this.field1484[var1];
      }

      this.method2638();
   }

   @ObfuscatedName("g")
   public void method2641() {
      for(int var1 = 0; var1 < this.field1523; ++var1) {
         int var2 = this.field1484[var1];
         this.field1484[var1] = this.field1491[var1];
         this.field1491[var1] = -var2;
      }

      this.method2638();
   }

   @ObfuscatedName("y")
   public void method2663(int var1) {
      int var2 = field1525[var1];
      int var3 = field1481[var1];

      for(int var4 = 0; var4 < this.field1523; ++var4) {
         int var5 = var2 * this.field1484[var4] + var3 * this.field1491[var4] >> 16;
         this.field1484[var4] = var3 * this.field1484[var4] - var2 * this.field1491[var4] >> 16;
         this.field1491[var4] = var5;
      }

      this.method2638();
   }

   @ObfuscatedName("c")
   public void method2630(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field1523; ++var4) {
         this.field1491[var4] += var1;
         this.field1483[var4] += var2;
         this.field1484[var4] += var3;
      }

      this.method2638();
   }

   @ObfuscatedName("e")
   public void method2689(short var1, short var2) {
      for(int var3 = 0; var3 < this.field1482; ++var3) {
         if(this.field1493[var3] == var1) {
            this.field1493[var3] = var2;
         }
      }

   }

   @ObfuscatedName("t")
   public void method2632(short var1, short var2) {
      if(this.field1494 != null) {
         for(int var3 = 0; var3 < this.field1482; ++var3) {
            if(this.field1494[var3] == var1) {
               this.field1494[var3] = var2;
            }
         }

      }
   }

   @ObfuscatedName("u")
   public void method2633() {
      int var1;
      for(var1 = 0; var1 < this.field1523; ++var1) {
         this.field1484[var1] = -this.field1484[var1];
      }

      for(var1 = 0; var1 < this.field1482; ++var1) {
         int var2 = this.field1486[var1];
         this.field1486[var1] = this.field1488[var1];
         this.field1488[var1] = var2;
      }

      this.method2638();
   }

   @ObfuscatedName("i")
   public void method2674(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field1523; ++var4) {
         this.field1491[var4] = this.field1491[var4] * var1 / 128;
         this.field1483[var4] = var2 * this.field1483[var4] / 128;
         this.field1484[var4] = var3 * this.field1484[var4] / 128;
      }

      this.method2638();
   }

   @ObfuscatedName("r")
   public void method2635() {
      if(this.field1513 == null) {
         this.field1513 = new class121[this.field1523];

         int var1;
         for(var1 = 0; var1 < this.field1523; ++var1) {
            this.field1513[var1] = new class121();
         }

         for(var1 = 0; var1 < this.field1482; ++var1) {
            int var2 = this.field1486[var1];
            int var3 = this.field1487[var1];
            int var4 = this.field1488[var1];
            int var5 = this.field1491[var3] - this.field1491[var2];
            int var6 = this.field1483[var3] - this.field1483[var2];
            int var7 = this.field1484[var3] - this.field1484[var2];
            int var8 = this.field1491[var4] - this.field1491[var2];
            int var9 = this.field1483[var4] - this.field1483[var2];
            int var10 = this.field1484[var4] - this.field1484[var2];
            int var11 = var6 * var10 - var9 * var7;
            int var12 = var7 * var8 - var10 * var5;

            int var13;
            for(var13 = var5 * var9 - var8 * var6; var11 > 8192 || var12 > 8192 || var13 > 8192 || var11 < -8192 || var12 < -8192 || var13 < -8192; var13 >>= 1) {
               var11 >>= 1;
               var12 >>= 1;
            }

            int var14 = (int)Math.sqrt((double)(var11 * var11 + var12 * var12 + var13 * var13));
            if(var14 <= 0) {
               var14 = 1;
            }

            var11 = var11 * 256 / var14;
            var12 = var12 * 256 / var14;
            var13 = var13 * 256 / var14;
            byte var15;
            if(this.field1489 == null) {
               var15 = 0;
            } else {
               var15 = this.field1489[var1];
            }

            if(var15 == 0) {
               class121 var16 = this.field1513[var2];
               var16.field1696 += var11;
               var16.field1694 += var12;
               var16.field1695 += var13;
               ++var16.field1698;
               var16 = this.field1513[var3];
               var16.field1696 += var11;
               var16.field1694 += var12;
               var16.field1695 += var13;
               ++var16.field1698;
               var16 = this.field1513[var4];
               var16.field1696 += var11;
               var16.field1694 += var12;
               var16.field1695 += var13;
               ++var16.field1698;
            } else if(var15 == 1) {
               if(this.field1512 == null) {
                  this.field1512 = new class129[this.field1482];
               }

               class129 var17 = this.field1512[var1] = new class129();
               var17.field1820 = var11;
               var17.field1821 = var12;
               var17.field1819 = var13;
            }
         }

      }
   }

   @ObfuscatedName("v")
   void method2638() {
      this.field1513 = null;
      this.field1514 = null;
      this.field1512 = null;
      this.field1517 = false;
   }

   @ObfuscatedName("o")
   void method2637() {
      if(!this.field1517) {
         super.field1805 = 0;
         this.field1499 = 0;
         this.field1519 = 999999;
         this.field1498 = -999999;
         this.field1496 = -99999;
         this.field1522 = 99999;

         for(int var1 = 0; var1 < this.field1523; ++var1) {
            int var2 = this.field1491[var1];
            int var3 = this.field1483[var1];
            int var4 = this.field1484[var1];
            if(var2 < this.field1519) {
               this.field1519 = var2;
            }

            if(var2 > this.field1498) {
               this.field1498 = var2;
            }

            if(var4 < this.field1522) {
               this.field1522 = var4;
            }

            if(var4 > this.field1496) {
               this.field1496 = var4;
            }

            if(-var3 > super.field1805) {
               super.field1805 = -var3;
            }

            if(var3 > this.field1499) {
               this.field1499 = var3;
            }
         }

         this.field1517 = true;
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "(IIIII)Ldk;"
   )
   public final class119 method2631(int var1, int var2, int var3, int var4, int var5) {
      this.method2635();
      int var6 = (int)Math.sqrt((double)(var5 * var5 + var3 * var3 + var4 * var4));
      int var7 = var6 * var2 >> 8;
      class119 var8 = new class119();
      var8.field1622 = new int[this.field1482];
      var8.field1671 = new int[this.field1482];
      var8.field1626 = new int[this.field1482];
      if(this.field1521 > 0 && this.field1518 != null) {
         int[] var9 = new int[this.field1521];

         int var10;
         for(var10 = 0; var10 < this.field1482; ++var10) {
            if(this.field1518[var10] != -1) {
               ++var9[this.field1518[var10] & 255];
            }
         }

         var8.field1630 = 0;

         for(var10 = 0; var10 < this.field1521; ++var10) {
            if(var9[var10] > 0 && this.field1497[var10] == 0) {
               ++var8.field1630;
            }
         }

         var8.field1635 = new int[var8.field1630];
         var8.field1632 = new int[var8.field1630];
         var8.field1633 = new int[var8.field1630];
         var10 = 0;

         int var11;
         for(var11 = 0; var11 < this.field1521; ++var11) {
            if(var9[var11] > 0 && this.field1497[var11] == 0) {
               var8.field1635[var10] = this.field1500[var11] & '\uffff';
               var8.field1632[var10] = this.field1526[var11] & '\uffff';
               var8.field1633[var10] = this.field1492[var11] & '\uffff';
               var9[var11] = var10++;
            } else {
               var9[var11] = -1;
            }
         }

         var8.field1627 = new byte[this.field1482];

         for(var11 = 0; var11 < this.field1482; ++var11) {
            if(this.field1518[var11] != -1) {
               var8.field1627[var11] = (byte)var9[this.field1518[var11] & 255];
            } else {
               var8.field1627[var11] = -1;
            }
         }
      }

      for(int var16 = 0; var16 < this.field1482; ++var16) {
         byte var17;
         if(this.field1489 == null) {
            var17 = 0;
         } else {
            var17 = this.field1489[var16];
         }

         byte var18;
         if(this.field1510 == null) {
            var18 = 0;
         } else {
            var18 = this.field1510[var16];
         }

         short var12;
         if(this.field1494 == null) {
            var12 = -1;
         } else {
            var12 = this.field1494[var16];
         }

         if(var18 == -2) {
            var17 = 3;
         }

         if(var18 == -1) {
            var17 = 2;
         }

         class121 var13;
         int var14;
         class129 var19;
         if(var12 == -1) {
            if(var17 == 0) {
               int var15 = this.field1493[var16] & '\uffff';
               if(this.field1514 != null && this.field1514[this.field1486[var16]] != null) {
                  var13 = this.field1514[this.field1486[var16]];
               } else {
                  var13 = this.field1513[this.field1486[var16]];
               }

               var14 = (var4 * var13.field1694 + var5 * var13.field1695 + var3 * var13.field1696) / (var7 * var13.field1698) + var1;
               var8.field1622[var16] = method2639(var15, var14);
               if(this.field1514 != null && this.field1514[this.field1487[var16]] != null) {
                  var13 = this.field1514[this.field1487[var16]];
               } else {
                  var13 = this.field1513[this.field1487[var16]];
               }

               var14 = (var4 * var13.field1694 + var5 * var13.field1695 + var3 * var13.field1696) / (var7 * var13.field1698) + var1;
               var8.field1671[var16] = method2639(var15, var14);
               if(this.field1514 != null && this.field1514[this.field1488[var16]] != null) {
                  var13 = this.field1514[this.field1488[var16]];
               } else {
                  var13 = this.field1513[this.field1488[var16]];
               }

               var14 = (var4 * var13.field1694 + var5 * var13.field1695 + var3 * var13.field1696) / (var7 * var13.field1698) + var1;
               var8.field1626[var16] = method2639(var15, var14);
            } else if(var17 == 1) {
               var19 = this.field1512[var16];
               var14 = (var4 * var19.field1821 + var5 * var19.field1819 + var3 * var19.field1820) / (var7 / 2 + var7) + var1;
               var8.field1622[var16] = method2639(this.field1493[var16] & '\uffff', var14);
               var8.field1626[var16] = -1;
            } else if(var17 == 3) {
               var8.field1622[var16] = 128;
               var8.field1626[var16] = -1;
            } else {
               var8.field1626[var16] = -2;
            }
         } else if(var17 == 0) {
            if(this.field1514 != null && this.field1514[this.field1486[var16]] != null) {
               var13 = this.field1514[this.field1486[var16]];
            } else {
               var13 = this.field1513[this.field1486[var16]];
            }

            var14 = (var4 * var13.field1694 + var5 * var13.field1695 + var3 * var13.field1696) / (var7 * var13.field1698) + var1;
            var8.field1622[var16] = method2676(var14);
            if(this.field1514 != null && this.field1514[this.field1487[var16]] != null) {
               var13 = this.field1514[this.field1487[var16]];
            } else {
               var13 = this.field1513[this.field1487[var16]];
            }

            var14 = (var4 * var13.field1694 + var5 * var13.field1695 + var3 * var13.field1696) / (var7 * var13.field1698) + var1;
            var8.field1671[var16] = method2676(var14);
            if(this.field1514 != null && this.field1514[this.field1488[var16]] != null) {
               var13 = this.field1514[this.field1488[var16]];
            } else {
               var13 = this.field1513[this.field1488[var16]];
            }

            var14 = (var4 * var13.field1694 + var5 * var13.field1695 + var3 * var13.field1696) / (var7 * var13.field1698) + var1;
            var8.field1626[var16] = method2676(var14);
         } else if(var17 == 1) {
            var19 = this.field1512[var16];
            var14 = (var4 * var19.field1821 + var5 * var19.field1819 + var3 * var19.field1820) / (var7 / 2 + var7) + var1;
            var8.field1622[var16] = method2676(var14);
            var8.field1626[var16] = -1;
         } else {
            var8.field1626[var16] = -2;
         }
      }

      this.method2626();
      var8.field1654 = this.field1523;
      var8.field1669 = this.field1491;
      var8.field1624 = this.field1483;
      var8.field1617 = this.field1484;
      var8.field1618 = this.field1482;
      var8.field1664 = this.field1486;
      var8.field1620 = this.field1487;
      var8.field1621 = this.field1488;
      var8.field1648 = this.field1509;
      var8.field1629 = this.field1510;
      var8.field1619 = this.field1495;
      var8.field1615 = this.field1516;
      var8.field1660 = this.field1511;
      var8.field1628 = this.field1494;
      return var8;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Liv;II)Ldo;"
   )
   public static class113 method2619(class247 var0, int var1, int var2) {
      byte[] var3 = var0.method4626(var1, var2);
      return var3 == null?null:new class113(var3);
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(Ldo;Ldo;IIIZ)V"
   )
   static void method2660(class113 var0, class113 var1, int var2, int var3, int var4, boolean var5) {
      var0.method2637();
      var0.method2635();
      var1.method2637();
      var1.method2635();
      ++field1503;
      int var6 = 0;
      int[] var7 = var1.field1491;
      int var8 = var1.field1523;

      int var9;
      for(var9 = 0; var9 < var0.field1523; ++var9) {
         class121 var10 = var0.field1513[var9];
         if(var10.field1698 != 0) {
            int var11 = var0.field1483[var9] - var3;
            if(var11 <= var1.field1499) {
               int var12 = var0.field1491[var9] - var2;
               if(var12 >= var1.field1519 && var12 <= var1.field1498) {
                  int var13 = var0.field1484[var9] - var4;
                  if(var13 >= var1.field1522 && var13 <= var1.field1496) {
                     for(int var14 = 0; var14 < var8; ++var14) {
                        class121 var15 = var1.field1513[var14];
                        if(var12 == var7[var14] && var13 == var1.field1484[var14] && var11 == var1.field1483[var14] && var15.field1698 != 0) {
                           if(var0.field1514 == null) {
                              var0.field1514 = new class121[var0.field1523];
                           }

                           if(var1.field1514 == null) {
                              var1.field1514 = new class121[var8];
                           }

                           class121 var16 = var0.field1514[var9];
                           if(var16 == null) {
                              var16 = var0.field1514[var9] = new class121(var10);
                           }

                           class121 var17 = var1.field1514[var14];
                           if(var17 == null) {
                              var17 = var1.field1514[var14] = new class121(var15);
                           }

                           var16.field1696 += var15.field1696;
                           var16.field1694 += var15.field1694;
                           var16.field1695 += var15.field1695;
                           var16.field1698 += var15.field1698;
                           var17.field1696 += var10.field1696;
                           var17.field1694 += var10.field1694;
                           var17.field1695 += var10.field1695;
                           var17.field1698 += var10.field1698;
                           ++var6;
                           field1502[var9] = field1503;
                           field1524[var14] = field1503;
                        }
                     }
                  }
               }
            }
         }
      }

      if(var6 >= 3 && var5) {
         for(var9 = 0; var9 < var0.field1482; ++var9) {
            if(field1502[var0.field1486[var9]] == field1503 && field1502[var0.field1487[var9]] == field1503 && field1502[var0.field1488[var9]] == field1503) {
               if(var0.field1489 == null) {
                  var0.field1489 = new byte[var0.field1482];
               }

               var0.field1489[var9] = 2;
            }
         }

         for(var9 = 0; var9 < var1.field1482; ++var9) {
            if(field1503 == field1524[var1.field1486[var9]] && field1503 == field1524[var1.field1487[var9]] && field1503 == field1524[var1.field1488[var9]]) {
               if(var1.field1489 == null) {
                  var1.field1489 = new byte[var1.field1482];
               }

               var1.field1489[var9] = 2;
            }
         }

      }
   }

   @ObfuscatedName("ad")
   static final int method2639(int var0, int var1) {
      var1 = (var0 & 127) * var1 >> 7;
      if(var1 < 2) {
         var1 = 2;
      } else if(var1 > 126) {
         var1 = 126;
      }

      return (var0 & '\uff80') + var1;
   }

   @ObfuscatedName("ac")
   static final int method2676(int var0) {
      if(var0 < 2) {
         var0 = 2;
      } else if(var0 > 126) {
         var0 = 126;
      }

      return var0;
   }
}
