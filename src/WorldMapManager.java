import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ay")
@Implements("WorldMapManager")
public final class WorldMapManager {
   @ObfuscatedName("ma")
   @ObfuscatedGetter(
      intValue = -1676181865
   )
   static int field268;
   @ObfuscatedName("w")
   @Export("loaded")
   boolean loaded;
   @ObfuscatedName("m")
   @Export("loading")
   boolean loading;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Law;"
   )
   class33 field266;
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Llc;"
   )
   SpritePixels field267;
   @ObfuscatedName("f")
   HashMap field277;
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "[[Lr;"
   )
   @Export("mapRegions")
   WorldMapRegion[][] mapRegions;
   @ObfuscatedName("h")
   HashMap field270;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "[Llh;"
   )
   IndexedSprite[] field271;
   @ObfuscatedName("j")
   @Export("mapFonts")
   final HashMap mapFonts;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -1123117609
   )
   @Export("mapSurfaceBaseOffsetX")
   int mapSurfaceBaseOffsetX;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -137335597
   )
   @Export("mapSurfaceBaseOffsetY")
   int mapSurfaceBaseOffsetY;
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
   public int field269;

   @ObfuscatedSignature(
      signature = "([Llh;Ljava/util/HashMap;)V"
   )
   public WorldMapManager(IndexedSprite[] var1, HashMap var2) {
      this.loaded = false;
      this.loading = false;
      this.field270 = new HashMap();
      this.field269 = 0;
      this.field271 = var1;
      this.mapFonts = var2;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Liv;Ljava/lang/String;ZI)V",
      garbageValue = "280702549"
   )
   @Export("load")
   public void load(IndexDataBase var1, String var2, boolean var3) {
      if(!this.loading) {
         this.loaded = false;
         this.loading = true;
         System.nanoTime();
         int var4 = var1.getFile(MapCacheArchiveNames.DETAILS.name);
         int var5 = var1.getChild(var4, var2);
         Buffer var6 = new Buffer(var1.takeRecordByNames(MapCacheArchiveNames.DETAILS.name, var2));
         Buffer var7 = new Buffer(var1.takeRecordByNames(MapCacheArchiveNames.COMPOSITE_MAP.name, var2));
         Buffer var8 = new Buffer(var1.takeRecordByNames(var2, MapCacheArchiveNames.AREA.name));
         System.nanoTime();
         System.nanoTime();
         this.field266 = new class33();

         try {
            this.field266.method603(var6, var8, var7, var5, var3);
         } catch (IllegalStateException var17) {
            return;
         }

         this.field266.method241();
         this.field266.method242();
         this.field266.method243();
         this.mapSurfaceBaseOffsetX = this.field266.getMinX() * 64;
         this.mapSurfaceBaseOffsetY = this.field266.getMinY() * 64;
         this.field275 = (this.field266.method238() - this.field266.getMinX() + 1) * 64;
         this.field276 = (this.field266.method270() - this.field266.getMinY() + 1) * 64;
         int var9 = this.field266.method238() - this.field266.getMinX() + 1;
         int var10 = this.field266.method270() - this.field266.getMinY() + 1;
         System.nanoTime();
         System.nanoTime();
         WorldMapRegion.field203.method4039();
         WorldMapRegion.field204.method4039();
         this.mapRegions = new WorldMapRegion[var9][var10];
         Iterator var11 = this.field266.field292.iterator();

         int var13;
         while(var11.hasNext()) {
            class10 var12 = (class10)var11.next();
            var13 = var12.field131;
            int var14 = var12.field135;
            int var15 = var13 - this.field266.getMinX();
            int var16 = var14 - this.field266.getMinY();
            this.mapRegions[var15][var16] = new WorldMapRegion(var13, var14, this.field266.method235(), this.mapFonts);
            this.mapRegions[var15][var16].method310(var12, this.field266.field291);
         }

         for(int var18 = 0; var18 < var9; ++var18) {
            for(var13 = 0; var13 < var10; ++var13) {
               if(this.mapRegions[var18][var13] == null) {
                  this.mapRegions[var18][var13] = new WorldMapRegion(this.field266.getMinX() + var18, this.field266.getMinY() + var13, this.field266.method235(), this.mapFonts);
                  this.mapRegions[var18][var13].method378(this.field266.field293, this.field266.field291);
               }
            }
         }

         System.nanoTime();
         System.nanoTime();
         if(var1.method4689(MapCacheArchiveNames.COMPOSITE_TEXTURE.name, var2)) {
            byte[] var19 = var1.takeRecordByNames(MapCacheArchiveNames.COMPOSITE_TEXTURE.name, var2);
            this.field267 = VarCInt.method4854(var19);
         }

         System.nanoTime();
         var1.method4662();
         var1.reset();
         this.loaded = true;
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
   @Export("drawMapRegion")
   public final void drawMapRegion(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int[] var9 = Rasterizer2D.graphicsPixels;
      int var10 = Rasterizer2D.graphicsPixelsWidth;
      int var11 = Rasterizer2D.graphicsPixelsHeight;
      int[] var12 = new int[4];
      Rasterizer2D.copyDrawRegion(var12);
      WorldMapRectangle var13 = this.getRegionRectForViewport(var1, var2, var3, var4);
      float var14 = this.getPixelsPerTile(var7 - var5, var3 - var1);
      int var15 = (int)Math.ceil((double)var14);
      this.field269 = var15;
      if(!this.field270.containsKey(Integer.valueOf(var15))) {
         class35 var16 = new class35(var15);
         var16.method640();
         this.field270.put(Integer.valueOf(var15), var16);
      }

      WorldMapRegion[] var22 = new WorldMapRegion[8];

      int var17;
      int var18;
      for(var17 = var13.worldMapRegionX; var17 < var13.worldMapRegionX + var13.worldMapRegionWidth; ++var17) {
         for(var18 = var13.worldMapRegionY; var18 < var13.worldMapRegionHeight + var13.worldMapRegionY; ++var18) {
            this.method524(var17, var18, var22);
            this.mapRegions[var17][var18].method314(var15, (class35)this.field270.get(Integer.valueOf(var15)), var22, this.field271);
         }
      }

      Rasterizer2D.setRasterBuffer(var9, var10, var11);
      Rasterizer2D.setDrawRegion(var12);
      var17 = (int)(64.0F * var14);
      var18 = this.mapSurfaceBaseOffsetX + var1;
      int var19 = var2 + this.mapSurfaceBaseOffsetY;

      for(int var20 = var13.worldMapRegionX; var20 < var13.worldMapRegionWidth + var13.worldMapRegionX; ++var20) {
         for(int var21 = var13.worldMapRegionY; var21 < var13.worldMapRegionHeight + var13.worldMapRegionY; ++var21) {
            this.mapRegions[var20][var21].method418(var5 + var17 * (this.mapRegions[var20][var21].field205 * 64 - var18) / 64, var8 - var17 * (this.mapRegions[var20][var21].field206 * 64 - var19 + 64) / 64, var17);
         }
      }

   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZB)V",
      garbageValue = "1"
   )
   @Export("drawMapIcons")
   public final void drawMapIcons(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13) {
      WorldMapRectangle var14 = this.getRegionRectForViewport(var1, var2, var3, var4);
      float var15 = this.getPixelsPerTile(var7 - var5, var3 - var1);
      int var16 = (int)(var15 * 64.0F);
      int var17 = this.mapSurfaceBaseOffsetX + var1;
      int var18 = var2 + this.mapSurfaceBaseOffsetY;

      int var19;
      int var20;
      for(var19 = var14.worldMapRegionX; var19 < var14.worldMapRegionX + var14.worldMapRegionWidth; ++var19) {
         for(var20 = var14.worldMapRegionY; var20 < var14.worldMapRegionY + var14.worldMapRegionHeight; ++var20) {
            if(var13) {
               this.mapRegions[var19][var20].method337();
            }

            this.mapRegions[var19][var20].method315(var5 + var16 * (this.mapRegions[var19][var20].field205 * 64 - var17) / 64, var8 - var16 * (this.mapRegions[var19][var20].field206 * 64 - var18 + 64) / 64, var16, var9);
         }
      }

      if(var10 != null && var11 > 0) {
         for(var19 = var14.worldMapRegionX; var19 < var14.worldMapRegionX + var14.worldMapRegionWidth; ++var19) {
            for(var20 = var14.worldMapRegionY; var20 < var14.worldMapRegionHeight + var14.worldMapRegionY; ++var20) {
               this.mapRegions[var19][var20].drawFlashingMapIcons(var10, var11, var12);
            }
         }
      }

   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(II[Lr;S)V",
      garbageValue = "-11249"
   )
   void method524(int var1, int var2, WorldMapRegion[] var3) {
      boolean var4 = var1 <= 0;
      boolean var5 = var1 >= this.mapRegions.length - 1;
      boolean var6 = var2 <= 0;
      boolean var7 = var2 >= this.mapRegions[0].length - 1;
      if(var7) {
         var3[class240.field3128.rsOrdinal()] = null;
      } else {
         var3[class240.field3128.rsOrdinal()] = this.mapRegions[var1][var2 + 1];
      }

      var3[class240.field3121.rsOrdinal()] = !var7 && !var5?this.mapRegions[var1 + 1][var2 + 1]:null;
      var3[class240.field3120.rsOrdinal()] = !var7 && !var4?this.mapRegions[var1 - 1][var2 + 1]:null;
      var3[class240.field3125.rsOrdinal()] = var5?null:this.mapRegions[var1 + 1][var2];
      var3[class240.field3127.rsOrdinal()] = var4?null:this.mapRegions[var1 - 1][var2];
      var3[class240.field3124.rsOrdinal()] = var6?null:this.mapRegions[var1][var2 - 1];
      var3[class240.field3123.rsOrdinal()] = !var6 && !var5?this.mapRegions[var1 + 1][var2 - 1]:null;
      var3[class240.field3122.rsOrdinal()] = !var6 && !var4?this.mapRegions[var1 - 1][var2 - 1]:null;
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

            while(true) {
               List var9;
               do {
                  if(!var8.hasNext()) {
                     return;
                  }

                  int var10 = ((Integer)var8.next()).intValue();
                  var9 = (List)this.field277.get(Integer.valueOf(var10));
               } while(var9 == null);

               Iterator var14 = var9.iterator();

               while(var14.hasNext()) {
                  MapIcon var11 = (MapIcon)var14.next();
                  int var12 = var3 * (var11.field247.worldX - this.mapSurfaceBaseOffsetX) / this.field275;
                  int var13 = var4 - (var11.field247.worldY - this.mapSurfaceBaseOffsetY) * var4 / this.field276;
                  Rasterizer2D.method5818(var12 + var1, var13 + var2, 2, 16776960, 256);
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
      if(!this.loaded) {
         return var11;
      } else {
         WorldMapRectangle var12 = this.getRegionRectForViewport(var1, var2, var3, var4);
         float var13 = this.getPixelsPerTile(var7, var3 - var1);
         int var14 = (int)(64.0F * var13);
         int var15 = this.mapSurfaceBaseOffsetX + var1;
         int var16 = var2 + this.mapSurfaceBaseOffsetY;

         for(int var17 = var12.worldMapRegionX; var17 < var12.worldMapRegionWidth + var12.worldMapRegionX; ++var17) {
            for(int var18 = var12.worldMapRegionY; var18 < var12.worldMapRegionHeight + var12.worldMapRegionY; ++var18) {
               List var19 = this.mapRegions[var17][var18].method344(var5 + var14 * (this.mapRegions[var17][var18].field205 * 64 - var15) / 64, var8 + var6 - var14 * (this.mapRegions[var17][var18].field206 * 64 - var16 + 64) / 64, var14, var9, var10);
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
   @Export("getRegionRectForViewport")
   WorldMapRectangle getRegionRectForViewport(int var1, int var2, int var3, int var4) {
      WorldMapRectangle var5 = new WorldMapRectangle(this);
      int var6 = this.mapSurfaceBaseOffsetX + var1;
      int var7 = var2 + this.mapSurfaceBaseOffsetY;
      int var8 = var3 + this.mapSurfaceBaseOffsetX;
      int var9 = var4 + this.mapSurfaceBaseOffsetY;
      int var10 = var6 / 64;
      int var11 = var7 / 64;
      int var12 = var8 / 64;
      int var13 = var9 / 64;
      var5.worldMapRegionWidth = var12 - var10 + 1;
      var5.worldMapRegionHeight = var13 - var11 + 1;
      var5.worldMapRegionX = var10 - this.field266.getMinX();
      var5.worldMapRegionY = var11 - this.field266.getMinY();
      if(var5.worldMapRegionX < 0) {
         var5.worldMapRegionWidth += var5.worldMapRegionX;
         var5.worldMapRegionX = 0;
      }

      if(var5.worldMapRegionX > this.mapRegions.length - var5.worldMapRegionWidth) {
         var5.worldMapRegionWidth = this.mapRegions.length - var5.worldMapRegionX;
      }

      if(var5.worldMapRegionY < 0) {
         var5.worldMapRegionHeight += var5.worldMapRegionY;
         var5.worldMapRegionY = 0;
      }

      if(var5.worldMapRegionY > this.mapRegions[0].length - var5.worldMapRegionHeight) {
         var5.worldMapRegionHeight = this.mapRegions[0].length - var5.worldMapRegionY;
      }

      var5.worldMapRegionWidth = Math.min(var5.worldMapRegionWidth, this.mapRegions.length);
      var5.worldMapRegionHeight = Math.min(var5.worldMapRegionHeight, this.mapRegions[0].length);
      return var5;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "-114"
   )
   @Export("getLoaded")
   public boolean getLoaded() {
      return this.loaded;
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

      for(int var1 = 0; var1 < this.mapRegions.length; ++var1) {
         for(int var2 = 0; var2 < this.mapRegions[var1].length; ++var2) {
            List var3 = this.mapRegions[var1][var2].method449();
            Iterator var4 = var3.iterator();

            while(var4.hasNext()) {
               MapIcon var5 = (MapIcon)var4.next();
               if(!this.field277.containsKey(Integer.valueOf(var5.areaId))) {
                  LinkedList var6 = new LinkedList();
                  var6.add(var5);
                  this.field277.put(Integer.valueOf(var5.areaId), var6);
               } else {
                  List var7 = (List)this.field277.get(Integer.valueOf(var5.areaId));
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
   @Export("getPixelsPerTile")
   float getPixelsPerTile(int var1, int var2) {
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
      ClassInfo var0 = (ClassInfo)class313.classInfos.last();
      return var0 != null;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(IB)Ljk;",
      garbageValue = "-107"
   )
   @Export("getKitDefinition")
   public static KitDefinition getKitDefinition(int var0) {
      KitDefinition var1 = (KitDefinition)KitDefinition.identKits.get((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = KitDefinition.identKit_ref.getConfigData(3, var0);
         var1 = new KitDefinition();
         if(var2 != null) {
            var1.decode(new Buffer(var2));
         }

         KitDefinition.identKits.put(var1, (long)var0);
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
      return ((var1 & 16711935) * var2 + var3 * (var0 & 16711935) & -16711936) + ((var1 & 65280) * var2 + (var0 & 65280) * var3 & 16711680) >> 8;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(ILcs;ZB)I",
      garbageValue = "31"
   )
   static int method528(int var0, Script var1, boolean var2) {
      String var3;
      if(var0 == 3100) {
         var3 = class69.scriptStringStack[--class83.scriptStringStackSize];
         OwnWorldComparator.sendGameMessage(0, "", var3);
         return 1;
      } else if(var0 == 3101) {
         class45.intStackSize -= 2;
         class144.method3193(MilliTimer.localPlayer, class69.intStack[class45.intStackSize], class69.intStack[class45.intStackSize + 1]);
         return 1;
      } else if(var0 == 3103) {
         class9.method99();
         return 1;
      } else {
         boolean var4;
         int var5;
         int var6;
         PacketNode var7;
         int var9;
         if(var0 == 3104) {
            var3 = class69.scriptStringStack[--class83.scriptStringStackSize];
            var6 = 0;
            var4 = false;
            boolean var16 = false;
            var5 = 0;
            var9 = var3.length();
            int var17 = 0;

            boolean var19;
            while(true) {
               if(var17 >= var9) {
                  var19 = var16;
                  break;
               }

               label381: {
                  char var23 = var3.charAt(var17);
                  if(var17 == 0) {
                     if(var23 == '-') {
                        var4 = true;
                        break label381;
                     }

                     if(var23 == '+') {
                        break label381;
                     }
                  }

                  int var21;
                  if(var23 >= '0' && var23 <= '9') {
                     var21 = var23 - '0';
                  } else if(var23 >= 'A' && var23 <= 'Z') {
                     var21 = var23 - '7';
                  } else {
                     if(var23 < 'a' || var23 > 'z') {
                        var19 = false;
                        break;
                     }

                     var21 = var23 - 'W';
                  }

                  if(var21 >= 10) {
                     var19 = false;
                     break;
                  }

                  if(var4) {
                     var21 = -var21;
                  }

                  int var25 = var5 * 10 + var21;
                  if(var5 != var25 / 10) {
                     var19 = false;
                     break;
                  }

                  var5 = var25;
                  var16 = true;
               }

               ++var17;
            }

            if(var19) {
               int var24 = GrandExchangeEvents.parseInt(var3, 10, true);
               var6 = var24;
            }

            var7 = DecorativeObject.method3115(ClientPacket.field2228, Client.field739.field1250);
            var7.packetBuffer.putInt(var6);
            Client.field739.method2019(var7);
            return 1;
         } else {
            PacketNode var8;
            if(var0 == 3105) {
               var3 = class69.scriptStringStack[--class83.scriptStringStackSize];
               var8 = DecorativeObject.method3115(ClientPacket.field2239, Client.field739.field1250);
               var8.packetBuffer.putByte(var3.length() + 1);
               var8.packetBuffer.putString(var3);
               Client.field739.method2019(var8);
               return 1;
            } else if(var0 == 3106) {
               var3 = class69.scriptStringStack[--class83.scriptStringStackSize];
               var8 = DecorativeObject.method3115(ClientPacket.field2249, Client.field739.field1250);
               var8.packetBuffer.putByte(var3.length() + 1);
               var8.packetBuffer.putString(var3);
               Client.field739.method2019(var8);
               return 1;
            } else {
               String var10;
               int var11;
               if(var0 != 3107) {
                  Widget var22;
                  if(var0 == 3108) {
                     class45.intStackSize -= 3;
                     var11 = class69.intStack[class45.intStackSize];
                     var6 = class69.intStack[class45.intStackSize + 1];
                     var9 = class69.intStack[class45.intStackSize + 2];
                     var22 = OwnWorldComparator.getWidget(var9);
                     class35.method685(var22, var11, var6);
                     return 1;
                  } else if(var0 == 3109) {
                     class45.intStackSize -= 2;
                     var11 = class69.intStack[class45.intStackSize];
                     var6 = class69.intStack[class45.intStackSize + 1];
                     var22 = var2?class184.field2379:FriendManager.field996;
                     class35.method685(var22, var11, var6);
                     return 1;
                  } else if(var0 == 3110) {
                     class8.middleMouseMovesCamera = class69.intStack[--class45.intStackSize] == 1;
                     return 1;
                  } else if(var0 == 3111) {
                     class69.intStack[++class45.intStackSize - 1] = ScriptState.preferences.hideRoofs?1:0;
                     return 1;
                  } else if(var0 == 3112) {
                     ScriptState.preferences.hideRoofs = class69.intStack[--class45.intStackSize] == 1;
                     Enum.method5008();
                     return 1;
                  } else {
                     boolean var18;
                     if(var0 == 3113) {
                        var3 = class69.scriptStringStack[--class83.scriptStringStackSize];
                        var18 = class69.intStack[--class45.intStackSize] == 1;
                        class32.method590(var3, var18, "openjs", false);
                        return 1;
                     } else if(var0 == 3115) {
                        var11 = class69.intStack[--class45.intStackSize];
                        var8 = DecorativeObject.method3115(ClientPacket.field2200, Client.field739.field1250);
                        var8.packetBuffer.putShort(var11);
                        Client.field739.method2019(var8);
                        return 1;
                     } else if(var0 == 3116) {
                        var11 = class69.intStack[--class45.intStackSize];
                        class83.scriptStringStackSize -= 2;
                        var10 = class69.scriptStringStack[class83.scriptStringStackSize];
                        String var20 = class69.scriptStringStack[class83.scriptStringStackSize + 1];
                        if(var10.length() > 500) {
                           return 1;
                        } else if(var20.length() > 500) {
                           return 1;
                        } else {
                           var7 = DecorativeObject.method3115(ClientPacket.field2205, Client.field739.field1250);
                           var7.packetBuffer.putShort(1 + Size.getLength(var10) + Size.getLength(var20));
                           var7.packetBuffer.putString(var20);
                           var7.packetBuffer.putByte(var11);
                           var7.packetBuffer.putString(var10);
                           Client.field739.method2019(var7);
                           return 1;
                        }
                     } else if(var0 == 3117) {
                        Client.field733 = class69.intStack[--class45.intStackSize] == 1;
                        return 1;
                     } else if(var0 == 3118) {
                        Client.field740 = class69.intStack[--class45.intStackSize] == 1;
                        return 1;
                     } else if(var0 == 3119) {
                        Client.field711 = class69.intStack[--class45.intStackSize] == 1;
                        return 1;
                     } else if(var0 == 3120) {
                        if(class69.intStack[--class45.intStackSize] == 1) {
                           Client.playerNameMask |= 1;
                        } else {
                           Client.playerNameMask &= -2;
                        }

                        return 1;
                     } else if(var0 == 3121) {
                        if(class69.intStack[--class45.intStackSize] == 1) {
                           Client.playerNameMask |= 2;
                        } else {
                           Client.playerNameMask &= -3;
                        }

                        return 1;
                     } else if(var0 == 3122) {
                        if(class69.intStack[--class45.intStackSize] == 1) {
                           Client.playerNameMask |= 4;
                        } else {
                           Client.playerNameMask &= -5;
                        }

                        return 1;
                     } else if(var0 == 3123) {
                        if(class69.intStack[--class45.intStackSize] == 1) {
                           Client.playerNameMask |= 8;
                        } else {
                           Client.playerNameMask &= -9;
                        }

                        return 1;
                     } else if(var0 == 3124) {
                        Client.playerNameMask = 0;
                        return 1;
                     } else if(var0 == 3125) {
                        Client.field664 = class69.intStack[--class45.intStackSize] == 1;
                        return 1;
                     } else if(var0 == 3126) {
                        Client.field715 = class69.intStack[--class45.intStackSize] == 1;
                        return 1;
                     } else if(var0 == 3127) {
                        var18 = class69.intStack[--class45.intStackSize] == 1;
                        Client.field669 = var18;
                        return 1;
                     } else if(var0 == 3128) {
                        class69.intStack[++class45.intStackSize - 1] = class275.method5250()?1:0;
                        return 1;
                     } else if(var0 == 3129) {
                        class45.intStackSize -= 2;
                        Client.field672 = class69.intStack[class45.intStackSize];
                        Client.field673 = class69.intStack[class45.intStackSize + 1];
                        return 1;
                     } else if(var0 == 3130) {
                        class45.intStackSize -= 2;
                        return 1;
                     } else if(var0 == 3131) {
                        --class45.intStackSize;
                        return 1;
                     } else {
                        return 2;
                     }
                  }
               } else {
                  var11 = class69.intStack[--class45.intStackSize];
                  var10 = class69.scriptStringStack[--class83.scriptStringStackSize];
                  var9 = class81.playerIndexesCount;
                  int[] var12 = class81.playerIndices;
                  var4 = false;
                  Name var13 = new Name(var10, WorldMapDecoration.loginType);

                  for(var5 = 0; var5 < var9; ++var5) {
                     Player var14 = Client.cachedPlayers[var12[var5]];
                     if(var14 != null && var14 != MilliTimer.localPlayer && var14.name != null && var14.name.equals(var13)) {
                        PacketNode var15;
                        if(var11 == 1) {
                           var15 = DecorativeObject.method3115(ClientPacket.field2213, Client.field739.field1250);
                           var15.packetBuffer.method3605(var12[var5]);
                           var15.packetBuffer.method3594(0);
                           Client.field739.method2019(var15);
                        } else if(var11 == 4) {
                           var15 = DecorativeObject.method3115(ClientPacket.field2218, Client.field739.field1250);
                           var15.packetBuffer.putByte(0);
                           var15.packetBuffer.method3725(var12[var5]);
                           Client.field739.method2019(var15);
                        } else if(var11 == 6) {
                           var15 = DecorativeObject.method3115(ClientPacket.field2164, Client.field739.field1250);
                           var15.packetBuffer.method3707(var12[var5]);
                           var15.packetBuffer.method3594(0);
                           Client.field739.method2019(var15);
                        } else if(var11 == 7) {
                           var15 = DecorativeObject.method3115(ClientPacket.field2180, Client.field739.field1250);
                           var15.packetBuffer.method3725(var12[var5]);
                           var15.packetBuffer.method3594(0);
                           Client.field739.method2019(var15);
                        }

                        var4 = true;
                        break;
                     }
                  }

                  if(!var4) {
                     OwnWorldComparator.sendGameMessage(4, "", "Unable to find " + var10);
                  }

                  return 1;
               }
            }
         }
      }
   }
}
