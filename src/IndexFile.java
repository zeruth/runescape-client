import java.io.EOFException;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ff")
@Implements("IndexFile")
public final class IndexFile {
   @ObfuscatedName("w")
   @Export("IndexStore_buffer")
   static byte[] IndexStore_buffer;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Ldd;"
   )
   @Export("dataFile")
   CacheFile dataFile;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Ldd;"
   )
   @Export("indexFile")
   CacheFile indexFile;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 69040701
   )
   @Export("index")
   int index;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1834258411
   )
   @Export("maxSize")
   int maxSize;

   static {
      IndexStore_buffer = new byte[520];
   }

   @ObfuscatedSignature(
      signature = "(ILdd;Ldd;I)V"
   )
   public IndexFile(int var1, CacheFile var2, CacheFile var3, int var4) {
      this.dataFile = null;
      this.indexFile = null;
      this.maxSize = 65000;
      this.index = var1;
      this.dataFile = var2;
      this.indexFile = var3;
      this.maxSize = var4;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IB)[B",
      garbageValue = "127"
   )
   @Export("read")
   public byte[] read(int var1) {
      CacheFile var2 = this.dataFile;
      CacheFile var3 = this.dataFile;
      synchronized(this.dataFile) {
         byte[] var10000;
         try {
            Object var4;
            if(this.indexFile.length() < (long)(var1 * 6 + 6)) {
               var4 = null;
               var10000 = (byte[])var4;
               return var10000;
            }

            this.indexFile.seek((long)(var1 * 6));
            this.indexFile.read(IndexStore_buffer, 0, 6);
            int var5 = ((IndexStore_buffer[0] & 255) << 16) + (IndexStore_buffer[2] & 255) + ((IndexStore_buffer[1] & 255) << 8);
            int var6 = (IndexStore_buffer[5] & 255) + ((IndexStore_buffer[3] & 255) << 16) + ((IndexStore_buffer[4] & 255) << 8);
            if(var5 < 0 || var5 > this.maxSize) {
               var4 = null;
               var10000 = (byte[])var4;
               return var10000;
            }

            if(var6 > 0 && (long)var6 <= this.dataFile.length() / 520L) {
               byte[] var7 = new byte[var5];
               int var8 = 0;
               int var9 = 0;

               while(var8 < var5) {
                  if(var6 == 0) {
                     var4 = null;
                     var10000 = (byte[])var4;
                     return var10000;
                  }

                  this.dataFile.seek((long)(var6 * 520));
                  int var10 = var5 - var8;
                  if(var10 > 512) {
                     var10 = 512;
                  }

                  this.dataFile.read(IndexStore_buffer, 0, var10 + 8);
                  int var11 = (IndexStore_buffer[1] & 255) + ((IndexStore_buffer[0] & 255) << 8);
                  int var12 = (IndexStore_buffer[3] & 255) + ((IndexStore_buffer[2] & 255) << 8);
                  int var13 = ((IndexStore_buffer[5] & 255) << 8) + ((IndexStore_buffer[4] & 255) << 16) + (IndexStore_buffer[6] & 255);
                  int var14 = IndexStore_buffer[7] & 255;
                  if(var11 == var1 && var9 == var12 && var14 == this.index) {
                     if(var13 >= 0 && (long)var13 <= this.dataFile.length() / 520L) {
                        for(int var15 = 0; var15 < var10; ++var15) {
                           var7[var8++] = IndexStore_buffer[var15 + 8];
                        }

                        var6 = var13;
                        ++var9;
                        continue;
                     }

                     var4 = null;
                     var10000 = (byte[])var4;
                     return var10000;
                  }

                  var4 = null;
                  var10000 = (byte[])var4;
                  return var10000;
               }

               var10000 = var7;
               return var10000;
            }

            var4 = null;
            var10000 = (byte[])var4;
         } catch (IOException var16) {
            return null;
         }

         return var10000;
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(I[BIB)Z",
      garbageValue = "-8"
   )
   @Export("write")
   public boolean write(int var1, byte[] var2, int var3) {
      CacheFile var4 = this.dataFile;
      CacheFile var5 = this.dataFile;
      synchronized(this.dataFile) {
         if(var3 >= 0 && var3 <= this.maxSize) {
            boolean var6 = this.write0(var1, var2, var3, true);
            if(!var6) {
               var6 = this.write0(var1, var2, var3, false);
            }

            return var6;
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
   @Export("write0")
   boolean write0(int var1, byte[] var2, int var3, boolean var4) {
      CacheFile var5 = this.dataFile;
      CacheFile var6 = this.dataFile;
      synchronized(this.dataFile) {
         try {
            int var7;
            boolean var8;
            boolean var10000;
            if(var4) {
               if(this.indexFile.length() < (long)(var1 * 6 + 6)) {
                  var8 = false;
                  var10000 = var8;
                  return var10000;
               }

               this.indexFile.seek((long)(var1 * 6));
               this.indexFile.read(IndexStore_buffer, 0, 6);
               var7 = (IndexStore_buffer[5] & 255) + ((IndexStore_buffer[3] & 255) << 16) + ((IndexStore_buffer[4] & 255) << 8);
               if(var7 <= 0 || (long)var7 > this.dataFile.length() / 520L) {
                  var8 = false;
                  var10000 = var8;
                  return var10000;
               }
            } else {
               var7 = (int)((this.dataFile.length() + 519L) / 520L);
               if(var7 == 0) {
                  var7 = 1;
               }
            }

            IndexStore_buffer[0] = (byte)(var3 >> 16);
            IndexStore_buffer[1] = (byte)(var3 >> 8);
            IndexStore_buffer[2] = (byte)var3;
            IndexStore_buffer[3] = (byte)(var7 >> 16);
            IndexStore_buffer[4] = (byte)(var7 >> 8);
            IndexStore_buffer[5] = (byte)var7;
            this.indexFile.seek((long)(var1 * 6));
            this.indexFile.write(IndexStore_buffer, 0, 6);
            int var9 = 0;
            int var10 = 0;

            while(true) {
               if(var9 < var3) {
                  label129: {
                     int var11 = 0;
                     int var12;
                     if(var4) {
                        this.dataFile.seek((long)(var7 * 520));

                        try {
                           this.dataFile.read(IndexStore_buffer, 0, 8);
                        } catch (EOFException var15) {
                           break label129;
                        }

                        var12 = (IndexStore_buffer[1] & 255) + ((IndexStore_buffer[0] & 255) << 8);
                        int var13 = (IndexStore_buffer[3] & 255) + ((IndexStore_buffer[2] & 255) << 8);
                        var11 = ((IndexStore_buffer[5] & 255) << 8) + ((IndexStore_buffer[4] & 255) << 16) + (IndexStore_buffer[6] & 255);
                        int var14 = IndexStore_buffer[7] & 255;
                        if(var12 != var1 || var10 != var13 || var14 != this.index) {
                           var8 = false;
                           var10000 = var8;
                           return var10000;
                        }

                        if(var11 < 0 || (long)var11 > this.dataFile.length() / 520L) {
                           var8 = false;
                           var10000 = var8;
                           return var10000;
                        }
                     }

                     if(var11 == 0) {
                        var4 = false;
                        var11 = (int)((this.dataFile.length() + 519L) / 520L);
                        if(var11 == 0) {
                           ++var11;
                        }

                        if(var7 == var11) {
                           ++var11;
                        }
                     }

                     if(var3 - var9 <= 512) {
                        var11 = 0;
                     }

                     IndexStore_buffer[0] = (byte)(var1 >> 8);
                     IndexStore_buffer[1] = (byte)var1;
                     IndexStore_buffer[2] = (byte)(var10 >> 8);
                     IndexStore_buffer[3] = (byte)var10;
                     IndexStore_buffer[4] = (byte)(var11 >> 16);
                     IndexStore_buffer[5] = (byte)(var11 >> 8);
                     IndexStore_buffer[6] = (byte)var11;
                     IndexStore_buffer[7] = (byte)this.index;
                     this.dataFile.seek((long)(var7 * 520));
                     this.dataFile.write(IndexStore_buffer, 0, 8);
                     var12 = var3 - var9;
                     if(var12 > 512) {
                        var12 = 512;
                     }

                     this.dataFile.write(var2, var9, var12);
                     var9 += var12;
                     var7 = var11;
                     ++var10;
                     continue;
                  }
               }

               var8 = true;
               var10000 = var8;
               return var10000;
            }
         } catch (IOException var16) {
            return false;
         }
      }
   }

   @ObfuscatedName("jj")
   @ObfuscatedSignature(
      signature = "(Lhl;B)Lhl;",
      garbageValue = "48"
   )
   static Widget method3387(Widget var0) {
      Widget var1 = var0;
      int var2 = PlayerComposition.method4514(AbstractSoundSystem.getWidgetClickMask(var0));
      Widget var3;
      if(var2 == 0) {
         var3 = null;
      } else {
         label29: {
            for(int var4 = 0; var4 < var2; ++var4) {
               var1 = OwnWorldComparator.getWidget(var1.parentId);
               if(var1 == null) {
                  var3 = null;
                  break label29;
               }
            }

            var3 = var1;
         }
      }

      Widget var5 = var3;
      if(var3 == null) {
         var5 = var0.dragParent;
      }

      return var5;
   }
}
