import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kb")
@Implements("ClanMemberManager")
public class ClanMemberManager extends NameableContainer {
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lla;"
   )
   final JagexLoginType field3668;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lki;"
   )
   final class288 field3666;
   @ObfuscatedName("a")
   public String field3667 = null;
   @ObfuscatedName("l")
   public String field3669 = null;
   @ObfuscatedName("d")
   public byte field3674;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -182421895
   )
   public int field3671;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1322445059
   )
   int field3672 = 1;

   @ObfuscatedSignature(
      signature = "(Lla;Lki;)V"
   )
   public ClanMemberManager(JagexLoginType var1, class288 var2) {
      super(100);
      this.field3668 = var1;
      this.field3666 = var2;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(B)Ljn;",
      garbageValue = "-39"
   )
   Nameable vmethod5491() {
      return new ClanMember();
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(II)[Ljn;",
      garbageValue = "-1283030275"
   )
   Nameable[] vmethod5492(int var1) {
      return new ClanMember[var1];
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "-1529272657"
   )
   final void method5493(String var1) {
      long var2 = 0L;
      int var4 = var1.length();

      for(int var5 = 0; var5 < var4; ++var5) {
         var2 *= 37L;
         char var6 = var1.charAt(var5);
         if (var6 >= 'A' && var6 <= 'Z') {
            var2 += (long)(var6 + 1 - 65);
         } else if (var6 >= 'a' && var6 <= 'z') {
            var2 += (long)(var6 + 1 - 97);
         } else if (var6 >= '0' && var6 <= '9') {
            var2 += (long)(var6 + 27 - 48);
         }

         if (var2 >= 177917621779460413L) {
            break;
         }
      }

      while(0L == var2 % 37L && 0L != var2) {
         var2 /= 37L;
      }

      String var7 = class302.method5659(var2);
      if (var7 == null) {
         var7 = "";
      }

      this.field3667 = var7;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;S)V",
      garbageValue = "128"
   )
   final void method5494(String var1) {
      long var2 = 0L;
      int var4 = var1.length();

      for(int var5 = 0; var5 < var4; ++var5) {
         var2 *= 37L;
         char var6 = var1.charAt(var5);
         if (var6 >= 'A' && var6 <= 'Z') {
            var2 += (long)(var6 + 1 - 65);
         } else if (var6 >= 'a' && var6 <= 'z') {
            var2 += (long)(var6 + 1 - 97);
         } else if (var6 >= '0' && var6 <= '9') {
            var2 += (long)(var6 + 27 - 48);
         }

         if (var2 >= 177917621779460413L) {
            break;
         }
      }

      while(0L == var2 % 37L && var2 != 0L) {
         var2 /= 37L;
      }

      String var7 = class302.method5659(var2);
      if (var7 == null) {
         var7 = "";
      }

      this.field3669 = var7;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgy;I)V",
      garbageValue = "-1237689075"
   )
   public final void method5507(Buffer var1) {
      this.method5494(var1.readString());
      long var2 = var1.readLong();
      long var4 = var2;
      String var6;
      int var7;
      if (var2 > 0L && var2 < 6582952005840035281L) {
         if (0L == var2 % 37L) {
            var6 = null;
         } else {
            var7 = 0;

            for(long var8 = var2; var8 != 0L; var8 /= 37L) {
               ++var7;
            }

            StringBuilder var11 = new StringBuilder(var7);

            while(var4 != 0L) {
               long var9 = var4;
               var4 /= 37L;
               var11.append(class303.field3732[(int)(var9 - var4 * 37L)]);
            }

            var6 = var11.reverse().toString();
         }
      } else {
         var6 = null;
      }

      this.method5493(var6);
      this.field3674 = var1.readByte();
      var7 = var1.readUnsignedByte();
      if (var7 != 255) {
         this.method5340();

         for(int var12 = 0; var12 < var7; ++var12) {
            ClanMember var13 = (ClanMember)this.method5349(new Name(var1.readString(), this.field3668));
            int var10 = var1.readUnsignedShort();
            var13.method5432(var10, ++this.field3672 - 1);
            var13.rank = var1.readByte();
            var1.readString();
            this.method5499(var13);
         }
      }

   }

   @ObfuscatedName("ca")
   @ObfuscatedSignature(
      signature = "(Lgy;I)V",
      garbageValue = "-1624046819"
   )
   public final void method5496(Buffer var1) {
      Name var2 = new Name(var1.readString(), this.field3668);
      int var3 = var1.readUnsignedShort();
      byte var4 = var1.readByte();
      boolean var5 = false;
      if (var4 == -128) {
         var5 = true;
      }

      ClanMember var6;
      if (var5) {
         if (this.getCount() == 0) {
            return;
         }

         var6 = (ClanMember)this.method5374(var2);
         if (var6 != null && var6.method5433() == var3) {
            this.method5362(var6);
         }
      } else {
         var1.readString();
         var6 = (ClanMember)this.method5374(var2);
         if (var6 == null) {
            if (this.getCount() > super.field3642) {
               return;
            }

            var6 = (ClanMember)this.method5349(var2);
         }

         var6.method5432(var3, ++this.field3672 - 1);
         var6.rank = var4;
         this.method5499(var6);
      }

   }

   @ObfuscatedName("cm")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-265283783"
   )
   public final void method5518() {
      for(int var1 = 0; var1 < this.getCount(); ++var1) {
         ((ClanMember)this.get(var1)).method5275();
      }

   }

   @ObfuscatedName("cb")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "1"
   )
   public final void method5498() {
      for(int var1 = 0; var1 < this.getCount(); ++var1) {
         ((ClanMember)this.get(var1)).method5279();
      }

   }

   @ObfuscatedName("cg")
   @ObfuscatedSignature(
      signature = "(Ljw;B)V",
      garbageValue = "18"
   )
   final void method5499(ClanMember var1) {
      if (var1.getRsName().equals(this.field3666.vmethod5443())) {
         this.field3671 = var1.rank;
      }

   }

   @ObfuscatedName("hp")
   @ObfuscatedSignature(
      signature = "(IIZB)V",
      garbageValue = "-10"
   )
   static final void method5501(int var0, int var1, boolean var2) {
      if (!var2 || var0 != class11.field82 || class54.field495 != var1) {
         class11.field82 = var0;
         class54.field495 = var1;
         Resampler.setGameState(25);
         class16.method187("Loading - please wait.", true);
         int var3 = class178.baseX;
         int var4 = CombatInfoListHolder.baseY;
         class178.baseX = (var0 - 6) * 8;
         CombatInfoListHolder.baseY = (var1 - 6) * 8;
         int var5 = class178.baseX - var3;
         int var6 = CombatInfoListHolder.baseY - var4;
         var3 = class178.baseX;
         var4 = CombatInfoListHolder.baseY;

         int var7;
         int var8;
         for(var7 = 0; var7 < 32768; ++var7) {
            NPC var9 = Client.cachedNPCs[var7];
            if (var9 != null) {
               for(var8 = 0; var8 < 10; ++var8) {
                  var9.pathX[var8] -= var5;
                  var9.pathY[var8] -= var6;
               }

               var9.x -= var5 * 128;
               var9.y -= var6 * 128;
            }
         }

         for(var7 = 0; var7 < 2048; ++var7) {
            Player var20 = Client.cachedPlayers[var7];
            if (var20 != null) {
               for(var8 = 0; var8 < 10; ++var8) {
                  var20.pathX[var8] -= var5;
                  var20.pathY[var8] -= var6;
               }

               var20.x -= var5 * 128;
               var20.y -= var6 * 128;
            }
         }

         byte var21 = 0;
         byte var10 = 104;
         byte var11 = 1;
         if (var5 < 0) {
            var21 = 103;
            var10 = -1;
            var11 = -1;
         }

         byte var12 = 0;
         byte var13 = 104;
         byte var14 = 1;
         if (var6 < 0) {
            var12 = 103;
            var13 = -1;
            var14 = -1;
         }

         int var15;
         for(int var16 = var21; var10 != var16; var16 += var11) {
            for(var15 = var12; var15 != var13; var15 += var14) {
               int var17 = var16 + var5;
               int var18 = var15 + var6;

               for(int var19 = 0; var19 < 4; ++var19) {
                  if (var17 >= 0 && var18 >= 0 && var17 < 104 && var18 < 104) {
                     Client.groundItemDeque[var19][var16][var15] = Client.groundItemDeque[var19][var17][var18];
                  } else {
                     Client.groundItemDeque[var19][var16][var15] = null;
                  }
               }
            }
         }

         for(PendingSpawn var22 = (PendingSpawn)Client.pendingSpawns.getFront(); var22 != null; var22 = (PendingSpawn)Client.pendingSpawns.getNext()) {
            var22.x -= var5;
            var22.y -= var6;
            if (var22.x < 0 || var22.y < 0 || var22.x >= 104 || var22.y >= 104) {
               var22.unlink();
            }
         }

         if (Client.destinationX != 0) {
            Client.destinationX -= var5;
            Client.destinationY -= var6;
         }

         Client.queuedSoundEffectCount = 0;
         Client.field746 = false;
         WorldMapType3.cameraX -= var5 << 7;
         class13.cameraY -= var6 << 7;
         Signlink.field1979 -= var5 << 7;
         ItemContainer.field481 -= var6 << 7;
         Client.field815 = -1;
         Client.graphicsObjectDeque.clear();
         Client.projectiles.clear();

         for(var15 = 0; var15 < 4; ++var15) {
            Client.collisionMaps[var15].reset();
         }
      }

   }
}
