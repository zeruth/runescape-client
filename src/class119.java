import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dk")
public class class119 extends class127 {

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Ldk;"
   )
   static class119 field1623 = new class119();
   @ObfuscatedName("m")
   static byte[] field1611 = new byte[1];
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Ldk;"
   )
   static class119 field1612 = new class119();
   @ObfuscatedName("b")
   static byte[] field1613 = new byte[1];
   @ObfuscatedName("af")
   static boolean[] field1610 = new boolean[4700];
   @ObfuscatedName("am")
   static boolean[] field1650 = new boolean[4700];
   @ObfuscatedName("aq")
   static int[] field1651 = new int[4700];
   @ObfuscatedName("aj")
   static int[] field1652 = new int[4700];
   @ObfuscatedName("ae")
   static int[] field1653 = new int[4700];
   @ObfuscatedName("au")
   static int[] field1614 = new int[4700];
   @ObfuscatedName("av")
   static int[] field1655 = new int[4700];
   @ObfuscatedName("ab")
   static int[] field1656 = new int[4700];
   @ObfuscatedName("ar")
   static int[] field1658 = new int[1600];
   @ObfuscatedName("ax")
   static int[][] field1659 = new int[1600][512];
   @ObfuscatedName("al")
   static int[] field1631 = new int[12];
   @ObfuscatedName("ak")
   static int[][] field1661 = new int[12][2000];
   @ObfuscatedName("bc")
   static int[] field1662 = new int[2000];
   @ObfuscatedName("bo")
   static int[] field1663 = new int[2000];
   @ObfuscatedName("bx")
   static int[] field1634 = new int[12];
   @ObfuscatedName("be")
   static int[] field1665 = new int[10];
   @ObfuscatedName("br")
   static int[] field1666 = new int[10];
   @ObfuscatedName("bk")
   static int[] field1667 = new int[10];
   @ObfuscatedName("bn")
   static int field1668;
   @ObfuscatedName("bp")
   static int field1616;
   @ObfuscatedName("bu")
   static int field1670;
   @ObfuscatedName("by")
   static boolean field1672 = true;
   @ObfuscatedName("bi")
   static int[] field1674 = class122.field1702;
   @ObfuscatedName("bb")
   static int[] field1644 = class122.field1708;
   @ObfuscatedName("bt")
   static int[] field1676 = class122.field1721;
   @ObfuscatedName("bm")
   static int[] field1677 = class122.field1704;
   @ObfuscatedName("f")
   int field1654 = 0;
   @ObfuscatedName("n")
   int[] field1669;
   @ObfuscatedName("h")
   int[] field1624;
   @ObfuscatedName("x")
   int[] field1617;
   @ObfuscatedName("j")
   int field1618 = 0;
   @ObfuscatedName("a")
   int[] field1664;
   @ObfuscatedName("l")
   int[] field1620;
   @ObfuscatedName("d")
   int[] field1621;
   @ObfuscatedName("s")
   int[] field1622;
   @ObfuscatedName("p")
   int[] field1671;
   @ObfuscatedName("g")
   int[] field1626;
   @ObfuscatedName("y")
   byte[] field1648;
   @ObfuscatedName("c")
   byte[] field1629;
   @ObfuscatedName("e")
   byte[] field1627;
   @ObfuscatedName("t")
   short[] field1628;
   @ObfuscatedName("u")
   byte field1619 = 0;
   @ObfuscatedName("i")
   int field1630 = 0;
   @ObfuscatedName("z")
   int[] field1635;
   @ObfuscatedName("k")
   int[] field1632;
   @ObfuscatedName("r")
   int[] field1633;
   @ObfuscatedName("v")
   int[][] field1615;
   @ObfuscatedName("o")
   int[][] field1660;
   @ObfuscatedName("ai")
   public boolean field1636 = false;
   @ObfuscatedName("at")
   int field1637;
   @ObfuscatedName("ad")
   int field1625;
   @ObfuscatedName("ac")
   int field1639;
   @ObfuscatedName("ay")
   int field1640;
   @ObfuscatedName("an")
   int field1641;
   @ObfuscatedName("as")
   int field1642;
   @ObfuscatedName("aw")
   int field1638;
   @ObfuscatedName("ag")
   int field1649;
   @ObfuscatedName("ah")
   int field1645 = -1;
   @ObfuscatedName("az")
   int field1675 = -1;
   @ObfuscatedName("ao")
   int field1647 = -1;


   class119() {}

   @ObfuscatedSignature(
      signature = "([Ldk;I)V"
   )
   public class119(class119[] var1, int var2) {
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      this.field1654 = 0;
      this.field1618 = 0;
      this.field1630 = 0;
      this.field1619 = -1;

      int var7;
      class119 var8;
      for(var7 = 0; var7 < var2; ++var7) {
         var8 = var1[var7];
         if(var8 != null) {
            this.field1654 += var8.field1654;
            this.field1618 += var8.field1618;
            this.field1630 += var8.field1630;
            if(var8.field1648 != null) {
               var3 = true;
            } else {
               if(this.field1619 == -1) {
                  this.field1619 = var8.field1619;
               }

               if(this.field1619 != var8.field1619) {
                  var3 = true;
               }
            }

            var4 |= var8.field1629 != null;
            var5 |= var8.field1628 != null;
            var6 |= var8.field1627 != null;
         }
      }

      this.field1669 = new int[this.field1654];
      this.field1624 = new int[this.field1654];
      this.field1617 = new int[this.field1654];
      this.field1664 = new int[this.field1618];
      this.field1620 = new int[this.field1618];
      this.field1621 = new int[this.field1618];
      this.field1622 = new int[this.field1618];
      this.field1671 = new int[this.field1618];
      this.field1626 = new int[this.field1618];
      if(var3) {
         this.field1648 = new byte[this.field1618];
      }

      if(var4) {
         this.field1629 = new byte[this.field1618];
      }

      if(var5) {
         this.field1628 = new short[this.field1618];
      }

      if(var6) {
         this.field1627 = new byte[this.field1618];
      }

      if(this.field1630 > 0) {
         this.field1635 = new int[this.field1630];
         this.field1632 = new int[this.field1630];
         this.field1633 = new int[this.field1630];
      }

      this.field1654 = 0;
      this.field1618 = 0;
      this.field1630 = 0;

      for(var7 = 0; var7 < var2; ++var7) {
         var8 = var1[var7];
         if(var8 != null) {
            int var9;
            for(var9 = 0; var9 < var8.field1618; ++var9) {
               this.field1664[this.field1618] = this.field1654 + var8.field1664[var9];
               this.field1620[this.field1618] = this.field1654 + var8.field1620[var9];
               this.field1621[this.field1618] = this.field1654 + var8.field1621[var9];
               this.field1622[this.field1618] = var8.field1622[var9];
               this.field1671[this.field1618] = var8.field1671[var9];
               this.field1626[this.field1618] = var8.field1626[var9];
               if(var3) {
                  if(var8.field1648 != null) {
                     this.field1648[this.field1618] = var8.field1648[var9];
                  } else {
                     this.field1648[this.field1618] = var8.field1619;
                  }
               }

               if(var4 && var8.field1629 != null) {
                  this.field1629[this.field1618] = var8.field1629[var9];
               }

               if(var5) {
                  if(var8.field1628 != null) {
                     this.field1628[this.field1618] = var8.field1628[var9];
                  } else {
                     this.field1628[this.field1618] = -1;
                  }
               }

               if(var6) {
                  if(var8.field1627 != null && var8.field1627[var9] != -1) {
                     this.field1627[this.field1618] = (byte)(this.field1630 + var8.field1627[var9]);
                  } else {
                     this.field1627[this.field1618] = -1;
                  }
               }

               ++this.field1618;
            }

            for(var9 = 0; var9 < var8.field1630; ++var9) {
               this.field1635[this.field1630] = this.field1654 + var8.field1635[var9];
               this.field1632[this.field1630] = this.field1654 + var8.field1632[var9];
               this.field1633[this.field1630] = this.field1654 + var8.field1633[var9];
               ++this.field1630;
            }

            for(var9 = 0; var9 < var8.field1654; ++var9) {
               this.field1669[this.field1654] = var8.field1669[var9];
               this.field1624[this.field1654] = var8.field1624[var9];
               this.field1617[this.field1654] = var8.field1617[var9];
               ++this.field1654;
            }
         }
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "([[IIIIZI)Ldk;"
   )
   public class119 method2720(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.method2725();
      int var7 = var2 - this.field1639;
      int var8 = var2 + this.field1639;
      int var9 = var4 - this.field1639;
      int var10 = var4 + this.field1639;
      if(var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
         var7 >>= 7;
         var8 = var8 + 127 >> 7;
         var9 >>= 7;
         var10 = var10 + 127 >> 7;
         if(var3 == var1[var7][var9] && var3 == var1[var8][var9] && var3 == var1[var7][var10] && var3 == var1[var8][var10]) {
            return this;
         } else {
            class119 var11;
            if(var5) {
               var11 = new class119();
               var11.field1654 = this.field1654;
               var11.field1618 = this.field1618;
               var11.field1630 = this.field1630;
               var11.field1669 = this.field1669;
               var11.field1617 = this.field1617;
               var11.field1664 = this.field1664;
               var11.field1620 = this.field1620;
               var11.field1621 = this.field1621;
               var11.field1622 = this.field1622;
               var11.field1671 = this.field1671;
               var11.field1626 = this.field1626;
               var11.field1648 = this.field1648;
               var11.field1629 = this.field1629;
               var11.field1627 = this.field1627;
               var11.field1628 = this.field1628;
               var11.field1619 = this.field1619;
               var11.field1635 = this.field1635;
               var11.field1632 = this.field1632;
               var11.field1633 = this.field1633;
               var11.field1615 = this.field1615;
               var11.field1660 = this.field1660;
               var11.field1636 = this.field1636;
               var11.field1624 = new int[var11.field1654];
            } else {
               var11 = this;
            }

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
               for(var12 = 0; var12 < var11.field1654; ++var12) {
                  var13 = var2 + this.field1669[var12];
                  var14 = var4 + this.field1617[var12];
                  var15 = var13 & 127;
                  var16 = var14 & 127;
                  var17 = var13 >> 7;
                  var18 = var14 >> 7;
                  var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                  var20 = var1[var17][var18 + 1] * (128 - var15) + var15 * var1[var17 + 1][var18 + 1] >> 7;
                  var21 = var19 * (128 - var16) + var20 * var16 >> 7;
                  var11.field1624[var12] = var21 + this.field1624[var12] - var3;
               }
            } else {
               for(var12 = 0; var12 < var11.field1654; ++var12) {
                  var13 = (-this.field1624[var12] << 16) / super.field1805;
                  if(var13 < var6) {
                     var14 = var2 + this.field1669[var12];
                     var15 = var4 + this.field1617[var12];
                     var16 = var14 & 127;
                     var17 = var15 & 127;
                     var18 = var14 >> 7;
                     var19 = var15 >> 7;
                     var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
                     var21 = var1[var18][var19 + 1] * (128 - var16) + var16 * var1[var18 + 1][var19 + 1] >> 7;
                     int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
                     var11.field1624[var12] = (var6 - var13) * (var22 - var3) / var6 + this.field1624[var12];
                  }
               }
            }

            var11.method2728();
            return var11;
         }
      } else {
         return this;
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Z)Ldk;"
   )
   public class119 method2729(boolean var1) {
      if(!var1 && field1611.length < this.field1618) {
         field1611 = new byte[this.field1618 + 100];
      }

      return this.method2723(var1, field1623, field1611);
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Z)Ldk;"
   )
   public class119 method2722(boolean var1) {
      if(!var1 && field1613.length < this.field1618) {
         field1613 = new byte[this.field1618 + 100];
      }

      return this.method2723(var1, field1612, field1613);
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(ZLdk;[B)Ldk;"
   )
   class119 method2723(boolean var1, class119 var2, byte[] var3) {
      var2.field1654 = this.field1654;
      var2.field1618 = this.field1618;
      var2.field1630 = this.field1630;
      if(var2.field1669 == null || var2.field1669.length < this.field1654) {
         var2.field1669 = new int[this.field1654 + 100];
         var2.field1624 = new int[this.field1654 + 100];
         var2.field1617 = new int[this.field1654 + 100];
      }

      int var4;
      for(var4 = 0; var4 < this.field1654; ++var4) {
         var2.field1669[var4] = this.field1669[var4];
         var2.field1624[var4] = this.field1624[var4];
         var2.field1617[var4] = this.field1617[var4];
      }

      if(var1) {
         var2.field1629 = this.field1629;
      } else {
         var2.field1629 = var3;
         if(this.field1629 == null) {
            for(var4 = 0; var4 < this.field1618; ++var4) {
               var2.field1629[var4] = 0;
            }
         } else {
            for(var4 = 0; var4 < this.field1618; ++var4) {
               var2.field1629[var4] = this.field1629[var4];
            }
         }
      }

      var2.field1664 = this.field1664;
      var2.field1620 = this.field1620;
      var2.field1621 = this.field1621;
      var2.field1622 = this.field1622;
      var2.field1671 = this.field1671;
      var2.field1626 = this.field1626;
      var2.field1648 = this.field1648;
      var2.field1627 = this.field1627;
      var2.field1628 = this.field1628;
      var2.field1619 = this.field1619;
      var2.field1635 = this.field1635;
      var2.field1632 = this.field1632;
      var2.field1633 = this.field1633;
      var2.field1615 = this.field1615;
      var2.field1660 = this.field1660;
      var2.field1636 = this.field1636;
      var2.method2728();
      return var2;
   }

   @ObfuscatedName("j")
   void method2724(int var1) {
      if(this.field1645 == -1) {
         int var2 = 0;
         int var3 = 0;
         int var4 = 0;
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         int var8 = field1644[var1];
         int var9 = field1674[var1];

         for(int var10 = 0; var10 < this.field1654; ++var10) {
            int var11 = class122.method2836(this.field1669[var10], this.field1617[var10], var8, var9);
            int var12 = this.field1624[var10];
            int var13 = class122.method2856(this.field1669[var10], this.field1617[var10], var8, var9);
            if(var11 < var2) {
               var2 = var11;
            }

            if(var11 > var5) {
               var5 = var11;
            }

            if(var12 < var3) {
               var3 = var12;
            }

            if(var12 > var6) {
               var6 = var12;
            }

            if(var13 < var4) {
               var4 = var13;
            }

            if(var13 > var7) {
               var7 = var13;
            }
         }

         this.field1642 = (var5 + var2) / 2;
         this.field1638 = (var6 + var3) / 2;
         this.field1649 = (var7 + var4) / 2;
         this.field1645 = (var5 - var2 + 1) / 2;
         this.field1675 = (var6 - var3 + 1) / 2;
         this.field1647 = (var7 - var4 + 1) / 2;
         if(this.field1645 < 32) {
            this.field1645 = 32;
         }

         if(this.field1647 < 32) {
            this.field1647 = 32;
         }

         if(this.field1636) {
            this.field1645 += 8;
            this.field1647 += 8;
         }

      }
   }

   @ObfuscatedName("a")
   public void method2725() {
      if(this.field1637 != 1) {
         this.field1637 = 1;
         super.field1805 = 0;
         this.field1625 = 0;
         this.field1639 = 0;

         for(int var1 = 0; var1 < this.field1654; ++var1) {
            int var2 = this.field1669[var1];
            int var3 = this.field1624[var1];
            int var4 = this.field1617[var1];
            if(-var3 > super.field1805) {
               super.field1805 = -var3;
            }

            if(var3 > this.field1625) {
               this.field1625 = var3;
            }

            int var5 = var2 * var2 + var4 * var4;
            if(var5 > this.field1639) {
               this.field1639 = var5;
            }
         }

         this.field1639 = (int)(Math.sqrt((double)this.field1639) + 0.99D);
         this.field1641 = (int)(Math.sqrt((double)(this.field1639 * this.field1639 + super.field1805 * super.field1805)) + 0.99D);
         this.field1640 = this.field1641 + (int)(Math.sqrt((double)(this.field1639 * this.field1639 + this.field1625 * this.field1625)) + 0.99D);
      }
   }

   @ObfuscatedName("l")
   void method2726() {
      if(this.field1637 != 2) {
         this.field1637 = 2;
         this.field1639 = 0;

         for(int var1 = 0; var1 < this.field1654; ++var1) {
            int var2 = this.field1669[var1];
            int var3 = this.field1624[var1];
            int var4 = this.field1617[var1];
            int var5 = var2 * var2 + var4 * var4 + var3 * var3;
            if(var5 > this.field1639) {
               this.field1639 = var5;
            }
         }

         this.field1639 = (int)(Math.sqrt((double)this.field1639) + 0.99D);
         this.field1641 = this.field1639;
         this.field1640 = this.field1639 + this.field1639;
      }
   }

   @ObfuscatedName("d")
   public int method2727() {
      this.method2725();
      return this.field1639;
   }

   @ObfuscatedName("p")
   void method2728() {
      this.field1637 = 0;
      this.field1645 = -1;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Lec;I)V"
   )
   public void method2783(class130 var1, int var2) {
      if(this.field1615 != null) {
         if(var2 != -1) {
            class117 var3 = var1.field1825[var2];
            class124 var4 = var3.field1577;
            field1668 = 0;
            field1616 = 0;
            field1670 = 0;

            for(int var5 = 0; var5 < var3.field1578; ++var5) {
               int var6 = var3.field1579[var5];
               this.method2739(var4.field1737[var6], var4.field1735[var6], var3.field1580[var5], var3.field1581[var5], var3.field1582[var5]);
            }

            this.method2728();
         }
      }
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(Lec;ILec;I[I)V"
   )
   public void method2777(class130 var1, int var2, class130 var3, int var4, int[] var5) {
      if(var2 != -1) {
         if(var5 != null && var4 != -1) {
            class117 var6 = var1.field1825[var2];
            class117 var7 = var3.field1825[var4];
            class124 var8 = var6.field1577;
            field1668 = 0;
            field1616 = 0;
            field1670 = 0;
            byte var9 = 0;
            int var13 = var9 + 1;
            int var10 = var5[var9];

            int var11;
            int var12;
            for(var11 = 0; var11 < var6.field1578; ++var11) {
               for(var12 = var6.field1579[var11]; var12 > var10; var10 = var5[var13++]) {
                  ;
               }

               if(var12 != var10 || var8.field1737[var12] == 0) {
                  this.method2739(var8.field1737[var12], var8.field1735[var12], var6.field1580[var11], var6.field1581[var11], var6.field1582[var11]);
               }
            }

            field1668 = 0;
            field1616 = 0;
            field1670 = 0;
            var9 = 0;
            var13 = var9 + 1;
            var10 = var5[var9];

            for(var11 = 0; var11 < var7.field1578; ++var11) {
               for(var12 = var7.field1579[var11]; var12 > var10; var10 = var5[var13++]) {
                  ;
               }

               if(var12 == var10 || var8.field1737[var12] == 0) {
                  this.method2739(var8.field1737[var12], var8.field1735[var12], var7.field1580[var11], var7.field1581[var11], var7.field1582[var11]);
               }
            }

            this.method2728();
         } else {
            this.method2783(var1, var2);
         }
      }
   }

   @ObfuscatedName("c")
   void method2739(int var1, int[] var2, int var3, int var4, int var5) {
      int var6 = var2.length;
      int var7;
      int var8;
      int var11;
      int var12;
      if(var1 == 0) {
         var7 = 0;
         field1668 = 0;
         field1616 = 0;
         field1670 = 0;

         for(var8 = 0; var8 < var6; ++var8) {
            int var9 = var2[var8];
            if(var9 < this.field1615.length) {
               int[] var10 = this.field1615[var9];

               for(var11 = 0; var11 < var10.length; ++var11) {
                  var12 = var10[var11];
                  field1668 += this.field1669[var12];
                  field1616 += this.field1624[var12];
                  field1670 += this.field1617[var12];
                  ++var7;
               }
            }
         }

         if(var7 > 0) {
            field1668 = var3 + field1668 / var7;
            field1616 = var4 + field1616 / var7;
            field1670 = var5 + field1670 / var7;
         } else {
            field1668 = var3;
            field1616 = var4;
            field1670 = var5;
         }

      } else {
         int[] var18;
         int var19;
         if(var1 == 1) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if(var8 < this.field1615.length) {
                  var18 = this.field1615[var8];

                  for(var19 = 0; var19 < var18.length; ++var19) {
                     var11 = var18[var19];
                     this.field1669[var11] += var3;
                     this.field1624[var11] += var4;
                     this.field1617[var11] += var5;
                  }
               }
            }

         } else if(var1 == 2) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if(var8 < this.field1615.length) {
                  var18 = this.field1615[var8];

                  for(var19 = 0; var19 < var18.length; ++var19) {
                     var11 = var18[var19];
                     this.field1669[var11] -= field1668;
                     this.field1624[var11] -= field1616;
                     this.field1617[var11] -= field1670;
                     var12 = (var3 & 255) * 8;
                     int var13 = (var4 & 255) * 8;
                     int var14 = (var5 & 255) * 8;
                     int var15;
                     int var16;
                     int var17;
                     if(var14 != 0) {
                        var15 = field1674[var14];
                        var16 = field1644[var14];
                        var17 = var15 * this.field1624[var11] + var16 * this.field1669[var11] >> 16;
                        this.field1624[var11] = var16 * this.field1624[var11] - var15 * this.field1669[var11] >> 16;
                        this.field1669[var11] = var17;
                     }

                     if(var12 != 0) {
                        var15 = field1674[var12];
                        var16 = field1644[var12];
                        var17 = var16 * this.field1624[var11] - var15 * this.field1617[var11] >> 16;
                        this.field1617[var11] = var15 * this.field1624[var11] + var16 * this.field1617[var11] >> 16;
                        this.field1624[var11] = var17;
                     }

                     if(var13 != 0) {
                        var15 = field1674[var13];
                        var16 = field1644[var13];
                        var17 = var15 * this.field1617[var11] + var16 * this.field1669[var11] >> 16;
                        this.field1617[var11] = var16 * this.field1617[var11] - var15 * this.field1669[var11] >> 16;
                        this.field1669[var11] = var17;
                     }

                     this.field1669[var11] += field1668;
                     this.field1624[var11] += field1616;
                     this.field1617[var11] += field1670;
                  }
               }
            }

         } else if(var1 == 3) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if(var8 < this.field1615.length) {
                  var18 = this.field1615[var8];

                  for(var19 = 0; var19 < var18.length; ++var19) {
                     var11 = var18[var19];
                     this.field1669[var11] -= field1668;
                     this.field1624[var11] -= field1616;
                     this.field1617[var11] -= field1670;
                     this.field1669[var11] = var3 * this.field1669[var11] / 128;
                     this.field1624[var11] = var4 * this.field1624[var11] / 128;
                     this.field1617[var11] = var5 * this.field1617[var11] / 128;
                     this.field1669[var11] += field1668;
                     this.field1624[var11] += field1616;
                     this.field1617[var11] += field1670;
                  }
               }
            }

         } else if(var1 == 5) {
            if(this.field1660 != null && this.field1629 != null) {
               for(var7 = 0; var7 < var6; ++var7) {
                  var8 = var2[var7];
                  if(var8 < this.field1660.length) {
                     var18 = this.field1660[var8];

                     for(var19 = 0; var19 < var18.length; ++var19) {
                        var11 = var18[var19];
                        var12 = (this.field1629[var11] & 255) + var3 * 8;
                        if(var12 < 0) {
                           var12 = 0;
                        } else if(var12 > 255) {
                           var12 = 255;
                        }

                        this.field1629[var11] = (byte)var12;
                     }
                  }
               }
            }

         }
      }
   }

   @ObfuscatedName("e")
   public void method2732() {
      for(int var1 = 0; var1 < this.field1654; ++var1) {
         int var2 = this.field1669[var1];
         this.field1669[var1] = this.field1617[var1];
         this.field1617[var1] = -var2;
      }

      this.method2728();
   }

   @ObfuscatedName("t")
   public void method2770() {
      for(int var1 = 0; var1 < this.field1654; ++var1) {
         this.field1669[var1] = -this.field1669[var1];
         this.field1617[var1] = -this.field1617[var1];
      }

      this.method2728();
   }

   @ObfuscatedName("u")
   public void method2734() {
      for(int var1 = 0; var1 < this.field1654; ++var1) {
         int var2 = this.field1617[var1];
         this.field1617[var1] = this.field1669[var1];
         this.field1669[var1] = -var2;
      }

      this.method2728();
   }

   @ObfuscatedName("i")
   public void method2735(int var1) {
      int var2 = field1674[var1];
      int var3 = field1644[var1];

      for(int var4 = 0; var4 < this.field1654; ++var4) {
         int var5 = var3 * this.field1624[var4] - var2 * this.field1617[var4] >> 16;
         this.field1617[var4] = var2 * this.field1624[var4] + var3 * this.field1617[var4] >> 16;
         this.field1624[var4] = var5;
      }

      this.method2728();
   }

   @ObfuscatedName("r")
   public void method2736(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field1654; ++var4) {
         this.field1669[var4] += var1;
         this.field1624[var4] += var2;
         this.field1617[var4] += var3;
      }

      this.method2728();
   }

   @ObfuscatedName("v")
   public void method2759(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field1654; ++var4) {
         this.field1669[var4] = this.field1669[var4] * var1 / 128;
         this.field1624[var4] = var2 * this.field1624[var4] / 128;
         this.field1617[var4] = var3 * this.field1617[var4] / 128;
      }

      this.method2728();
   }

   @ObfuscatedName("o")
   public final void method2738(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      field1658[0] = -1;
      if(this.field1637 != 2 && this.field1637 != 1) {
         this.method2726();
      }

      int var8 = class122.field1705;
      int var9 = class122.field1713;
      int var10 = field1674[var1];
      int var11 = field1644[var1];
      int var12 = field1674[var2];
      int var13 = field1644[var2];
      int var14 = field1674[var3];
      int var15 = field1644[var3];
      int var16 = field1674[var4];
      int var17 = field1644[var4];
      int var18 = var16 * var6 + var17 * var7 >> 16;

      for(int var19 = 0; var19 < this.field1654; ++var19) {
         int var20 = this.field1669[var19];
         int var21 = this.field1624[var19];
         int var22 = this.field1617[var19];
         int var23;
         if(var3 != 0) {
            var23 = var21 * var14 + var20 * var15 >> 16;
            var21 = var21 * var15 - var20 * var14 >> 16;
            var20 = var23;
         }

         if(var1 != 0) {
            var23 = var21 * var11 - var22 * var10 >> 16;
            var22 = var21 * var10 + var22 * var11 >> 16;
            var21 = var23;
         }

         if(var2 != 0) {
            var23 = var22 * var12 + var20 * var13 >> 16;
            var22 = var22 * var13 - var20 * var12 >> 16;
            var20 = var23;
         }

         var20 += var5;
         var21 += var6;
         var22 += var7;
         var23 = var21 * var17 - var22 * var16 >> 16;
         var22 = var21 * var16 + var22 * var17 >> 16;
         field1653[var19] = var22 - var18;
         field1651[var19] = var20 * class122.field1711 / var22 + var8;
         field1652[var19] = var23 * class122.field1711 / var22 + var9;
         if(this.field1630 > 0) {
            field1614[var19] = var20;
            field1655[var19] = var23;
            field1656[var19] = var22;
         }
      }

      try {
         this.method2741(false, false, false, 0L);
      } catch (Exception var25) {
         ;
      }

   }

   @ObfuscatedName("ai")
   public final void method2746(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      field1658[0] = -1;
      if(this.field1637 != 2 && this.field1637 != 1) {
         this.method2726();
      }

      int var9 = class122.field1705;
      int var10 = class122.field1713;
      int var11 = field1674[var1];
      int var12 = field1644[var1];
      int var13 = field1674[var2];
      int var14 = field1644[var2];
      int var15 = field1674[var3];
      int var16 = field1644[var3];
      int var17 = field1674[var4];
      int var18 = field1644[var4];
      int var19 = var17 * var6 + var18 * var7 >> 16;

      for(int var20 = 0; var20 < this.field1654; ++var20) {
         int var21 = this.field1669[var20];
         int var22 = this.field1624[var20];
         int var23 = this.field1617[var20];
         int var24;
         if(var3 != 0) {
            var24 = var22 * var15 + var21 * var16 >> 16;
            var22 = var22 * var16 - var21 * var15 >> 16;
            var21 = var24;
         }

         if(var1 != 0) {
            var24 = var22 * var12 - var23 * var11 >> 16;
            var23 = var22 * var11 + var23 * var12 >> 16;
            var22 = var24;
         }

         if(var2 != 0) {
            var24 = var23 * var13 + var21 * var14 >> 16;
            var23 = var23 * var14 - var21 * var13 >> 16;
            var21 = var24;
         }

         var21 += var5;
         var22 += var6;
         var23 += var7;
         var24 = var22 * var18 - var23 * var17 >> 16;
         var23 = var22 * var17 + var23 * var18 >> 16;
         field1653[var20] = var23 - var19;
         field1651[var20] = var9 + var21 * class122.field1711 / var8;
         field1652[var20] = var10 + var24 * class122.field1711 / var8;
         if(this.field1630 > 0) {
            field1614[var20] = var21;
            field1655[var20] = var24;
            field1656[var20] = var23;
         }
      }

      try {
         this.method2741(false, false, false, 0L);
      } catch (Exception var26) {
         ;
      }

   }

   @ObfuscatedName("at")
   final void method2741(boolean var1, boolean var2, boolean var3, long var4) {
      if(this.field1640 < 1600) {
         int var6;
         for(var6 = 0; var6 < this.field1640; ++var6) {
            field1658[var6] = 0;
         }

         var6 = var3?20:5;

         int var7;
         int var8;
         int var10;
         int var11;
         int var12;
         int var13;
         int var15;
         int var16;
         int var18;
         int var27;
         for(var7 = 0; var7 < this.field1618; ++var7) {
            if(this.field1626[var7] != -2) {
               var8 = this.field1664[var7];
               var27 = this.field1620[var7];
               var10 = this.field1621[var7];
               var11 = field1651[var8];
               var12 = field1651[var27];
               var13 = field1651[var10];
               int var17;
               int var34;
               if(var1 && (var11 == -5000 || var12 == -5000 || var13 == -5000)) {
                  var34 = field1614[var8];
                  var15 = field1614[var27];
                  var16 = field1614[var10];
                  var17 = field1655[var8];
                  var18 = field1655[var27];
                  int var19 = field1655[var10];
                  int var20 = field1656[var8];
                  int var21 = field1656[var27];
                  int var22 = field1656[var10];
                  var34 -= var15;
                  var16 -= var15;
                  var17 -= var18;
                  var19 -= var18;
                  var20 -= var21;
                  var22 -= var21;
                  int var23 = var17 * var22 - var20 * var19;
                  int var24 = var20 * var16 - var34 * var22;
                  int var25 = var34 * var19 - var17 * var16;
                  if(var15 * var23 + var18 * var24 + var21 * var25 > 0) {
                     field1650[var7] = true;
                     int var26 = (field1653[var8] + field1653[var27] + field1653[var10]) / 3 + this.field1641;
                     field1659[var26][field1658[var26]++] = var7;
                  }
               } else {
                  if(var2) {
                     var15 = field1652[var8];
                     var16 = field1652[var27];
                     var17 = field1652[var10];
                     var18 = var6 + class120.field1680;
                     boolean var14;
                     if(var18 < var15 && var18 < var16 && var18 < var17) {
                        var14 = false;
                     } else {
                        var18 = class120.field1680 - var6;
                        if(var18 > var15 && var18 > var16 && var18 > var17) {
                           var14 = false;
                        } else {
                           var18 = var6 + class120.field1681;
                           if(var18 < var11 && var18 < var12 && var18 < var13) {
                              var14 = false;
                           } else {
                              var18 = class120.field1681 - var6;
                              if(var18 > var11 && var18 > var12 && var18 > var13) {
                                 var14 = false;
                              } else {
                                 var14 = true;
                              }
                           }
                        }
                     }

                     if(var14) {
                        class120.field1688[++class120.field1686 - 1] = var4;
                        var2 = false;
                     }
                  }

                  if((var11 - var12) * (field1652[var10] - field1652[var27]) - (var13 - var12) * (field1652[var8] - field1652[var27]) > 0) {
                     field1650[var7] = false;
                     if(var11 >= 0 && var12 >= 0 && var13 >= 0 && var11 <= class122.field1714 && var12 <= class122.field1714 && var13 <= class122.field1714) {
                        field1610[var7] = false;
                     } else {
                        field1610[var7] = true;
                     }

                     var34 = (field1653[var8] + field1653[var27] + field1653[var10]) / 3 + this.field1641;
                     field1659[var34][field1658[var34]++] = var7;
                  }
               }
            }
         }

         int[] var9;
         if(this.field1648 == null) {
            for(var7 = this.field1640 - 1; var7 >= 0; --var7) {
               var8 = field1658[var7];
               if(var8 > 0) {
                  var9 = field1659[var7];

                  for(var10 = 0; var10 < var8; ++var10) {
                     this.method2742(var9[var10]);
                  }
               }
            }

         } else {
            for(var7 = 0; var7 < 12; ++var7) {
               field1631[var7] = 0;
               field1634[var7] = 0;
            }

            for(var7 = this.field1640 - 1; var7 >= 0; --var7) {
               var8 = field1658[var7];
               if(var8 > 0) {
                  var9 = field1659[var7];

                  for(var10 = 0; var10 < var8; ++var10) {
                     var11 = var9[var10];
                     byte var33 = this.field1648[var11];
                     var13 = field1631[var33]++;
                     field1661[var33][var13] = var11;
                     if(var33 < 10) {
                        field1634[var33] += var7;
                     } else if(var33 == 10) {
                        field1662[var13] = var7;
                     } else {
                        field1663[var13] = var7;
                     }
                  }
               }
            }

            var7 = 0;
            if(field1631[1] > 0 || field1631[2] > 0) {
               var7 = (field1634[1] + field1634[2]) / (field1631[1] + field1631[2]);
            }

            var8 = 0;
            if(field1631[3] > 0 || field1631[4] > 0) {
               var8 = (field1634[3] + field1634[4]) / (field1631[3] + field1631[4]);
            }

            var27 = 0;
            if(field1631[6] > 0 || field1631[8] > 0) {
               var27 = (field1634[8] + field1634[6]) / (field1631[8] + field1631[6]);
            }

            var11 = 0;
            var12 = field1631[10];
            int[] var30 = field1661[10];
            int[] var31 = field1662;
            if(var11 == var12) {
               var11 = 0;
               var12 = field1631[11];
               var30 = field1661[11];
               var31 = field1663;
            }

            if(var11 < var12) {
               var10 = var31[var11];
            } else {
               var10 = -1000;
            }

            for(var15 = 0; var15 < 10; ++var15) {
               while(var15 == 0 && var10 > var7) {
                  this.method2742(var30[var11++]);
                  if(var11 == var12 && var30 != field1661[11]) {
                     var11 = 0;
                     var12 = field1631[11];
                     var30 = field1661[11];
                     var31 = field1663;
                  }

                  if(var11 < var12) {
                     var10 = var31[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               while(var15 == 3 && var10 > var8) {
                  this.method2742(var30[var11++]);
                  if(var11 == var12 && var30 != field1661[11]) {
                     var11 = 0;
                     var12 = field1631[11];
                     var30 = field1661[11];
                     var31 = field1663;
                  }

                  if(var11 < var12) {
                     var10 = var31[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               while(var15 == 5 && var10 > var27) {
                  this.method2742(var30[var11++]);
                  if(var11 == var12 && var30 != field1661[11]) {
                     var11 = 0;
                     var12 = field1631[11];
                     var30 = field1661[11];
                     var31 = field1663;
                  }

                  if(var11 < var12) {
                     var10 = var31[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               var16 = field1631[var15];
               int[] var32 = field1661[var15];

               for(var18 = 0; var18 < var16; ++var18) {
                  this.method2742(var32[var18]);
               }
            }

            while(var10 != -1000) {
               this.method2742(var30[var11++]);
               if(var11 == var12 && var30 != field1661[11]) {
                  var11 = 0;
                  var30 = field1661[11];
                  var12 = field1631[11];
                  var31 = field1663;
               }

               if(var11 < var12) {
                  var10 = var31[var11];
               } else {
                  var10 = -1000;
               }
            }

         }
      }
   }

   @ObfuscatedName("ad")
   final void method2742(int var1) {
      if(field1650[var1]) {
         this.method2743(var1);
      } else {
         int var2 = this.field1664[var1];
         int var3 = this.field1620[var1];
         int var4 = this.field1621[var1];
         class122.field1710 = field1610[var1];
         if(this.field1629 == null) {
            class122.field1717 = 0;
         } else {
            class122.field1717 = this.field1629[var1] & 255;
         }

         if(this.field1628 != null && this.field1628[var1] != -1) {
            int var5;
            int var6;
            int var7;
            if(this.field1627 != null && this.field1627[var1] != -1) {
               int var8 = this.field1627[var1] & 255;
               var5 = this.field1635[var8];
               var6 = this.field1632[var8];
               var7 = this.field1633[var8];
            } else {
               var5 = var2;
               var6 = var3;
               var7 = var4;
            }

            if(this.field1626[var1] == -1) {
               class122.method2831(field1652[var2], field1652[var3], field1652[var4], field1651[var2], field1651[var3], field1651[var4], this.field1622[var1], this.field1622[var1], this.field1622[var1], field1614[var5], field1614[var6], field1614[var7], field1655[var5], field1655[var6], field1655[var7], field1656[var5], field1656[var6], field1656[var7], this.field1628[var1]);
            } else {
               class122.method2831(field1652[var2], field1652[var3], field1652[var4], field1651[var2], field1651[var3], field1651[var4], this.field1622[var1], this.field1671[var1], this.field1626[var1], field1614[var5], field1614[var6], field1614[var7], field1655[var5], field1655[var6], field1655[var7], field1656[var5], field1656[var6], field1656[var7], this.field1628[var1]);
            }
         } else if(this.field1626[var1] == -1) {
            class122.method2862(field1652[var2], field1652[var3], field1652[var4], field1651[var2], field1651[var3], field1651[var4], field1676[this.field1622[var1]]);
         } else {
            class122.method2873(field1652[var2], field1652[var3], field1652[var4], field1651[var2], field1651[var3], field1651[var4], this.field1622[var1], this.field1671[var1], this.field1626[var1]);
         }

      }
   }

   @ObfuscatedName("ac")
   final void method2743(int var1) {
      int var2 = class122.field1705;
      int var3 = class122.field1713;
      int var4 = 0;
      int var5 = this.field1664[var1];
      int var6 = this.field1620[var1];
      int var7 = this.field1621[var1];
      int var8 = field1656[var5];
      int var9 = field1656[var6];
      int var10 = field1656[var7];
      if(this.field1629 == null) {
         class122.field1717 = 0;
      } else {
         class122.field1717 = this.field1629[var1] & 255;
      }

      int var11;
      int var12;
      int var13;
      int var14;
      if(var8 >= 50) {
         field1665[var4] = field1651[var5];
         field1666[var4] = field1652[var5];
         field1667[var4++] = this.field1622[var1];
      } else {
         var11 = field1614[var5];
         var12 = field1655[var5];
         var13 = this.field1622[var1];
         if(var10 >= 50) {
            var14 = field1677[var10 - var8] * (50 - var8);
            field1665[var4] = var2 + class122.field1711 * (var11 + ((field1614[var7] - var11) * var14 >> 16)) / 50;
            field1666[var4] = var3 + class122.field1711 * (var12 + ((field1655[var7] - var12) * var14 >> 16)) / 50;
            field1667[var4++] = var13 + ((this.field1626[var1] - var13) * var14 >> 16);
         }

         if(var9 >= 50) {
            var14 = field1677[var9 - var8] * (50 - var8);
            field1665[var4] = var2 + class122.field1711 * (var11 + ((field1614[var6] - var11) * var14 >> 16)) / 50;
            field1666[var4] = var3 + class122.field1711 * (var12 + ((field1655[var6] - var12) * var14 >> 16)) / 50;
            field1667[var4++] = var13 + ((this.field1671[var1] - var13) * var14 >> 16);
         }
      }

      if(var9 >= 50) {
         field1665[var4] = field1651[var6];
         field1666[var4] = field1652[var6];
         field1667[var4++] = this.field1671[var1];
      } else {
         var11 = field1614[var6];
         var12 = field1655[var6];
         var13 = this.field1671[var1];
         if(var8 >= 50) {
            var14 = field1677[var8 - var9] * (50 - var9);
            field1665[var4] = var2 + class122.field1711 * (var11 + ((field1614[var5] - var11) * var14 >> 16)) / 50;
            field1666[var4] = var3 + class122.field1711 * (var12 + ((field1655[var5] - var12) * var14 >> 16)) / 50;
            field1667[var4++] = var13 + ((this.field1622[var1] - var13) * var14 >> 16);
         }

         if(var10 >= 50) {
            var14 = field1677[var10 - var9] * (50 - var9);
            field1665[var4] = var2 + class122.field1711 * (var11 + ((field1614[var7] - var11) * var14 >> 16)) / 50;
            field1666[var4] = var3 + class122.field1711 * (var12 + ((field1655[var7] - var12) * var14 >> 16)) / 50;
            field1667[var4++] = var13 + ((this.field1626[var1] - var13) * var14 >> 16);
         }
      }

      if(var10 >= 50) {
         field1665[var4] = field1651[var7];
         field1666[var4] = field1652[var7];
         field1667[var4++] = this.field1626[var1];
      } else {
         var11 = field1614[var7];
         var12 = field1655[var7];
         var13 = this.field1626[var1];
         if(var9 >= 50) {
            var14 = field1677[var9 - var10] * (50 - var10);
            field1665[var4] = var2 + class122.field1711 * (var11 + ((field1614[var6] - var11) * var14 >> 16)) / 50;
            field1666[var4] = var3 + class122.field1711 * (var12 + ((field1655[var6] - var12) * var14 >> 16)) / 50;
            field1667[var4++] = var13 + ((this.field1671[var1] - var13) * var14 >> 16);
         }

         if(var8 >= 50) {
            var14 = field1677[var8 - var10] * (50 - var10);
            field1665[var4] = var2 + class122.field1711 * (var11 + ((field1614[var5] - var11) * var14 >> 16)) / 50;
            field1666[var4] = var3 + class122.field1711 * (var12 + ((field1655[var5] - var12) * var14 >> 16)) / 50;
            field1667[var4++] = var13 + ((this.field1622[var1] - var13) * var14 >> 16);
         }
      }

      var11 = field1665[0];
      var12 = field1665[1];
      var13 = field1665[2];
      var14 = field1666[0];
      int var15 = field1666[1];
      int var16 = field1666[2];
      class122.field1710 = false;
      int var17;
      int var18;
      int var19;
      int var20;
      if(var4 == 3) {
         if(var11 < 0 || var12 < 0 || var13 < 0 || var11 > class122.field1714 || var12 > class122.field1714 || var13 > class122.field1714) {
            class122.field1710 = true;
         }

         if(this.field1628 != null && this.field1628[var1] != -1) {
            if(this.field1627 != null && this.field1627[var1] != -1) {
               var20 = this.field1627[var1] & 255;
               var17 = this.field1635[var20];
               var18 = this.field1632[var20];
               var19 = this.field1633[var20];
            } else {
               var17 = var5;
               var18 = var6;
               var19 = var7;
            }

            if(this.field1626[var1] == -1) {
               class122.method2831(var14, var15, var16, var11, var12, var13, this.field1622[var1], this.field1622[var1], this.field1622[var1], field1614[var17], field1614[var18], field1614[var19], field1655[var17], field1655[var18], field1655[var19], field1656[var17], field1656[var18], field1656[var19], this.field1628[var1]);
            } else {
               class122.method2831(var14, var15, var16, var11, var12, var13, field1667[0], field1667[1], field1667[2], field1614[var17], field1614[var18], field1614[var19], field1655[var17], field1655[var18], field1655[var19], field1656[var17], field1656[var18], field1656[var19], this.field1628[var1]);
            }
         } else if(this.field1626[var1] == -1) {
            class122.method2862(var14, var15, var16, var11, var12, var13, field1676[this.field1622[var1]]);
         } else {
            class122.method2873(var14, var15, var16, var11, var12, var13, field1667[0], field1667[1], field1667[2]);
         }
      }

      if(var4 == 4) {
         if(var11 < 0 || var12 < 0 || var13 < 0 || var11 > class122.field1714 || var12 > class122.field1714 || var13 > class122.field1714 || field1665[3] < 0 || field1665[3] > class122.field1714) {
            class122.field1710 = true;
         }

         if(this.field1628 != null && this.field1628[var1] != -1) {
            if(this.field1627 != null && this.field1627[var1] != -1) {
               var20 = this.field1627[var1] & 255;
               var17 = this.field1635[var20];
               var18 = this.field1632[var20];
               var19 = this.field1633[var20];
            } else {
               var17 = var5;
               var18 = var6;
               var19 = var7;
            }

            short var21 = this.field1628[var1];
            if(this.field1626[var1] == -1) {
               class122.method2831(var14, var15, var16, var11, var12, var13, this.field1622[var1], this.field1622[var1], this.field1622[var1], field1614[var17], field1614[var18], field1614[var19], field1655[var17], field1655[var18], field1655[var19], field1656[var17], field1656[var18], field1656[var19], var21);
               class122.method2831(var14, var16, field1666[3], var11, var13, field1665[3], this.field1622[var1], this.field1622[var1], this.field1622[var1], field1614[var17], field1614[var18], field1614[var19], field1655[var17], field1655[var18], field1655[var19], field1656[var17], field1656[var18], field1656[var19], var21);
            } else {
               class122.method2831(var14, var15, var16, var11, var12, var13, field1667[0], field1667[1], field1667[2], field1614[var17], field1614[var18], field1614[var19], field1655[var17], field1655[var18], field1655[var19], field1656[var17], field1656[var18], field1656[var19], var21);
               class122.method2831(var14, var16, field1666[3], var11, var13, field1665[3], field1667[0], field1667[2], field1667[3], field1614[var17], field1614[var18], field1614[var19], field1655[var17], field1655[var18], field1655[var19], field1656[var17], field1656[var18], field1656[var19], var21);
            }
         } else if(this.field1626[var1] == -1) {
            var17 = field1676[this.field1622[var1]];
            class122.method2862(var14, var15, var16, var11, var12, var13, var17);
            class122.method2862(var14, var16, field1666[3], var11, var13, field1665[3], var17);
         } else {
            class122.method2873(var14, var15, var16, var11, var12, var13, field1667[0], field1667[1], field1667[2]);
            class122.method2873(var14, var16, field1666[3], var11, var13, field1665[3], field1667[0], field1667[2], field1667[3]);
         }
      }

   }

   @ObfuscatedName("cy")
   void vmethod3079(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
      field1658[0] = -1;
      if(this.field1637 != 1) {
         this.method2725();
      }

      this.method2724(var1);
      int var11 = var5 * var8 - var4 * var6 >> 16;
      int var12 = var2 * var7 + var3 * var11 >> 16;
      int var13 = var3 * this.field1639 >> 16;
      int var14 = var12 + var13;
      if(var14 > 50 && var12 < 3500) {
         int var15 = var8 * var4 + var5 * var6 >> 16;
         int var16 = (var15 - this.field1639) * class122.field1711;
         if(var16 / var14 < class122.field1722) {
            int var17 = (var15 + this.field1639) * class122.field1711;
            if(var17 / var14 > class122.field1716) {
               int var18 = var3 * var7 - var11 * var2 >> 16;
               int var19 = var2 * this.field1639 >> 16;
               int var20 = (var18 + var19) * class122.field1711;
               if(var20 / var14 > class122.field1718) {
                  int var21 = (var3 * super.field1805 >> 16) + var19;
                  int var22 = (var18 - var21) * class122.field1711;
                  if(var22 / var14 < class122.field1719) {
                     int var23 = var13 + (var2 * super.field1805 >> 16);
                     boolean var24 = false;
                     boolean var25 = false;
                     if(var12 - var23 <= 50) {
                        var25 = true;
                     }

                     boolean var26 = var25 || this.field1630 > 0;
                     int var27 = class120.field1681;
                     int var29 = class155.method3272();
                     boolean var30 = class120.field1687;
                     boolean var32 = class27.method501(var9);
                     boolean var33 = false;
                     int var38;
                     int var39;
                     int var40;
                     int var41;
                     int var42;
                     int var47;
                     int var53;
                     int var54;
                     if(var32 && var30) {
                        boolean var34 = false;
                        if(field1672) {
                           boolean var37 = class120.field1687;
                           boolean var35;
                           if(!var37) {
                              var35 = false;
                           } else {
                              class35.method679();
                              var38 = this.field1642 + var6;
                              var39 = var7 + this.field1638;
                              var40 = var8 + this.field1649;
                              var41 = this.field1645;
                              var42 = this.field1675;
                              int var43 = this.field1647;
                              int var44 = class120.field1684 - var38;
                              int var45 = class148.field1936 - var39;
                              int var46 = class304.field3737 - var40;
                              if(Math.abs(var44) > var41 + class296.field3692) {
                                 var35 = false;
                              } else if(Math.abs(var45) > var42 + class154.field1980) {
                                 var35 = false;
                              } else if(Math.abs(var46) > var43 + class120.field1682) {
                                 var35 = false;
                              } else if(Math.abs(var46 * class291.field3662 - var45 * class120.field1685) > var43 * class154.field1980 + var42 * class120.field1682) {
                                 var35 = false;
                              } else if(Math.abs(var44 * class120.field1685 - var46 * class72.field1056) > var41 * class120.field1682 + var43 * class296.field3692) {
                                 var35 = false;
                              } else if(Math.abs(var45 * class72.field1056 - var44 * class291.field3662) > var42 * class296.field3692 + var41 * class154.field1980) {
                                 var35 = false;
                              } else {
                                 var35 = true;
                              }
                           }

                           var34 = var35;
                        } else {
                           var54 = var12 - var13;
                           if(var54 <= 50) {
                              var54 = 50;
                           }

                           if(var15 > 0) {
                              var16 /= var14;
                              var17 /= var54;
                           } else {
                              var17 /= var14;
                              var16 /= var54;
                           }

                           if(var18 > 0) {
                              var22 /= var14;
                              var20 /= var54;
                           } else {
                              var20 /= var14;
                              var22 /= var54;
                           }

                           var47 = var27 - class122.field1705;
                           var53 = var29 - class122.field1713;
                           if(var47 > var16 && var47 < var17 && var53 > var22 && var53 < var20) {
                              var34 = true;
                           }
                        }

                        if(var34) {
                           if(this.field1636) {
                              class120.field1688[++class120.field1686 - 1] = var9;
                           } else {
                              var33 = true;
                           }
                        }
                     }

                     int var52 = class122.field1705;
                     var54 = class122.field1713;
                     var47 = 0;
                     var53 = 0;
                     if(var1 != 0) {
                        var47 = field1674[var1];
                        var53 = field1644[var1];
                     }

                     for(var38 = 0; var38 < this.field1654; ++var38) {
                        var39 = this.field1669[var38];
                        var40 = this.field1624[var38];
                        var41 = this.field1617[var38];
                        if(var1 != 0) {
                           var42 = var41 * var47 + var39 * var53 >> 16;
                           var41 = var41 * var53 - var39 * var47 >> 16;
                           var39 = var42;
                        }

                        var39 += var6;
                        var40 += var7;
                        var41 += var8;
                        var42 = var41 * var4 + var5 * var39 >> 16;
                        var41 = var5 * var41 - var39 * var4 >> 16;
                        var39 = var42;
                        var42 = var3 * var40 - var41 * var2 >> 16;
                        var41 = var40 * var2 + var3 * var41 >> 16;
                        field1653[var38] = var41 - var12;
                        if(var41 >= 50) {
                           field1651[var38] = var39 * class122.field1711 / var41 + var52;
                           field1652[var38] = var42 * class122.field1711 / var41 + var54;
                        } else {
                           field1651[var38] = -5000;
                           var24 = true;
                        }

                        if(var26) {
                           field1614[var38] = var39;
                           field1655[var38] = var42;
                           field1656[var38] = var41;
                        }
                     }

                     try {
                        this.method2741(var24, var33, this.field1636, var9);
                     } catch (Exception var51) {
                        ;
                     }

                  }
               }
            }
         }
      }
   }
}
