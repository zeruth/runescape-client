import java.io.EOFException;
import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ff")
public final class class162 {

   @ObfuscatedName("w")
   static byte[] field2027 = new byte[520];
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Ldd;"
   )
   class109 field2023 = null;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Ldd;"
   )
   class109 field2025 = null;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 69040701
   )
   int field2026;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1834258411
   )
   int field2024 = '\ufde8';


   @ObfuscatedSignature(
      signature = "(ILdd;Ldd;I)V"
   )
   public class162(int var1, class109 var2, class109 var3, int var4) {
      this.field2026 = var1;
      this.field2023 = var2;
      this.field2025 = var3;
      this.field2024 = var4;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IB)[B",
      garbageValue = "127"
   )
   public byte[] method3388(int var1) {
      class109 var2 = this.field2023;
      synchronized(this.field2023) {
         try {
            Object var10000;
            if(this.field2025.method2531() < (long)(var1 * 6 + 6)) {
               var10000 = null;
               return (byte[])var10000;
            } else {
               this.field2025.method2521((long)(var1 * 6));
               this.field2025.method2528(field2027, 0, 6);
               int var3 = ((field2027[0] & 255) << 16) + (field2027[2] & 255) + ((field2027[1] & 255) << 8);
               int var4 = (field2027[5] & 255) + ((field2027[3] & 255) << 16) + ((field2027[4] & 255) << 8);
               if(var3 < 0 || var3 > this.field2024) {
                  var10000 = null;
                  return (byte[])var10000;
               } else if(var4 <= 0 || (long)var4 > this.field2023.method2531() / 520L) {
                  var10000 = null;
                  return (byte[])var10000;
               } else {
                  byte[] var5 = new byte[var3];
                  int var6 = 0;

                  for(int var7 = 0; var6 < var3; ++var7) {
                     if(var4 == 0) {
                        var10000 = null;
                        return (byte[])var10000;
                     }

                     this.field2023.method2521((long)(var4 * 520));
                     int var8 = var3 - var6;
                     if(var8 > 512) {
                        var8 = 512;
                     }

                     this.field2023.method2528(field2027, 0, var8 + 8);
                     int var9 = (field2027[1] & 255) + ((field2027[0] & 255) << 8);
                     int var10 = (field2027[3] & 255) + ((field2027[2] & 255) << 8);
                     int var11 = ((field2027[5] & 255) << 8) + ((field2027[4] & 255) << 16) + (field2027[6] & 255);
                     int var12 = field2027[7] & 255;
                     if(var9 != var1 || var7 != var10 || var12 != this.field2026) {
                        var10000 = null;
                        return (byte[])var10000;
                     }

                     if(var11 < 0 || (long)var11 > this.field2023.method2531() / 520L) {
                        var10000 = null;
                        return (byte[])var10000;
                     }

                     for(int var13 = 0; var13 < var8; ++var13) {
                        var5[var6++] = field2027[var13 + 8];
                     }

                     var4 = var11;
                  }

                  byte[] var18 = var5;
                  return var18;
               }
            }
         } catch (IOException var16) {
            return null;
         }
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(I[BIB)Z",
      garbageValue = "-8"
   )
   public boolean method3389(int var1, byte[] var2, int var3) {
      class109 var4 = this.field2023;
      synchronized(this.field2023) {
         if(var3 >= 0 && var3 <= this.field2024) {
            boolean var5 = this.method3390(var1, var2, var3, true);
            if(!var5) {
               var5 = this.method3390(var1, var2, var3, false);
            }

            return var5;
         } else {
            throw new IllegalArgumentException();
         }
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I[BIZB)Z",
      garbageValue = "-14"
   )
   boolean method3390(int var1, byte[] var2, int var3, boolean var4) {
      class109 var5 = this.field2023;
      synchronized(this.field2023) {
         try {
            int var6;
            boolean var10000;
            if(var4) {
               if(this.field2025.method2531() < (long)(var1 * 6 + 6)) {
                  var10000 = false;
                  return var10000;
               }

               this.field2025.method2521((long)(var1 * 6));
               this.field2025.method2528(field2027, 0, 6);
               var6 = (field2027[5] & 255) + ((field2027[3] & 255) << 16) + ((field2027[4] & 255) << 8);
               if(var6 <= 0 || (long)var6 > this.field2023.method2531() / 520L) {
                  var10000 = false;
                  return var10000;
               }
            } else {
               var6 = (int)((this.field2023.method2531() + 519L) / 520L);
               if(var6 == 0) {
                  var6 = 1;
               }
            }

            field2027[0] = (byte)(var3 >> 16);
            field2027[1] = (byte)(var3 >> 8);
            field2027[2] = (byte)var3;
            field2027[3] = (byte)(var6 >> 16);
            field2027[4] = (byte)(var6 >> 8);
            field2027[5] = (byte)var6;
            this.field2025.method2521((long)(var1 * 6));
            this.field2025.method2526(field2027, 0, 6);
            int var7 = 0;
            int var8 = 0;

            while(true) {
               if(var7 < var3) {
                  label135: {
                     int var9 = 0;
                     int var14;
                     if(var4) {
                        this.field2023.method2521((long)(var6 * 520));

                        try {
                           this.field2023.method2528(field2027, 0, 8);
                        } catch (EOFException var16) {
                           break label135;
                        }

                        var14 = (field2027[1] & 255) + ((field2027[0] & 255) << 8);
                        int var11 = (field2027[3] & 255) + ((field2027[2] & 255) << 8);
                        var9 = ((field2027[5] & 255) << 8) + ((field2027[4] & 255) << 16) + (field2027[6] & 255);
                        int var12 = field2027[7] & 255;
                        if(var14 != var1 || var8 != var11 || var12 != this.field2026) {
                           var10000 = false;
                           return var10000;
                        }

                        if(var9 < 0 || (long)var9 > this.field2023.method2531() / 520L) {
                           var10000 = false;
                           return var10000;
                        }
                     }

                     if(var9 == 0) {
                        var4 = false;
                        var9 = (int)((this.field2023.method2531() + 519L) / 520L);
                        if(var9 == 0) {
                           ++var9;
                        }

                        if(var6 == var9) {
                           ++var9;
                        }
                     }

                     if(var3 - var7 <= 512) {
                        var9 = 0;
                     }

                     field2027[0] = (byte)(var1 >> 8);
                     field2027[1] = (byte)var1;
                     field2027[2] = (byte)(var8 >> 8);
                     field2027[3] = (byte)var8;
                     field2027[4] = (byte)(var9 >> 16);
                     field2027[5] = (byte)(var9 >> 8);
                     field2027[6] = (byte)var9;
                     field2027[7] = (byte)this.field2026;
                     this.field2023.method2521((long)(var6 * 520));
                     this.field2023.method2526(field2027, 0, 8);
                     var14 = var3 - var7;
                     if(var14 > 512) {
                        var14 = 512;
                     }

                     this.field2023.method2526(var2, var7, var14);
                     var7 += var14;
                     var6 = var9;
                     ++var8;
                     continue;
                  }
               }

               var10000 = true;
               return var10000;
            }
         } catch (IOException var17) {
            return false;
         }
      }
   }

   @ObfuscatedName("jj")
   @ObfuscatedSignature(
      signature = "(Lhl;B)Lhl;",
      garbageValue = "48"
   )
   static class230 method3387(class230 var0) {
      class230 var2 = var0;
      int var3 = class227.method4514(class95.method2252(var0));
      class230 var1;
      if(var3 == 0) {
         var1 = null;
      } else {
         int var4 = 0;

         while(true) {
            if(var4 >= var3) {
               var1 = var2;
               break;
            }

            var2 = class61.method1188(var2.field2642);
            if(var2 == null) {
               var1 = null;
               break;
            }

            ++var4;
         }
      }

      class230 var5 = var1;
      if(var1 == null) {
         var5 = var0.field2624;
      }

      return var5;
   }
}
