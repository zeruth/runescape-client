import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bk")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
   @ObfuscatedName("g")
   static int[][][] field534;
   @ObfuscatedName("w")
   @Export("isRunning")
   boolean isRunning = true;
   @ObfuscatedName("m")
   @Export("lock")
   Object lock = new Object();
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -528874791
   )
   @Export("index")
   int index = 0;
   @ObfuscatedName("b")
   @Export("xs")
   int[] xs = new int[500];
   @ObfuscatedName("f")
   @Export("ys")
   int[] ys = new int[500];

   public void run() {
      // $FF: Couldn't be decompiled
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Lbr;II)V",
      garbageValue = "-406786730"
   )
   @Export("runScript")
   static void runScript(ScriptEvent param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(B)Ljava/lang/String;",
      garbageValue = "-9"
   )
   static String method1085() {
      return ScriptState.preferences.hideUsername ? TextureProvider.method2592(class78.username) : class78.username;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(ILcs;ZI)I",
      garbageValue = "-2106134469"
   )
   static int method1090(int var0, Script var1, boolean var2) {
      Widget var3;
      if (var0 >= 2000) {
         var0 -= 1000;
         var3 = OwnWorldComparator.getWidget(class69.intStack[--class45.intStackSize]);
      } else {
         var3 = var2 ? class184.field2379 : FriendManager.field996;
      }

      String var4 = class69.scriptStringStack[--class83.scriptStringStackSize];
      int[] var5 = null;
      if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
         int var6 = class69.intStack[--class45.intStackSize];
         if (var6 > 0) {
            for(var5 = new int[var6]; var6-- > 0; var5[var6] = class69.intStack[--class45.intStackSize]) {
               ;
            }
         }

         var4 = var4.substring(0, var4.length() - 1);
      }

      Object[] var8 = new Object[var4.length() + 1];

      int var7;
      for(var7 = var8.length - 1; var7 >= 1; --var7) {
         if (var4.charAt(var7 - 1) == 's') {
            var8[var7] = class69.scriptStringStack[--class83.scriptStringStackSize];
         } else {
            var8[var7] = new Integer(class69.intStack[--class45.intStackSize]);
         }
      }

      var7 = class69.intStack[--class45.intStackSize];
      if (var7 != -1) {
         var8[0] = new Integer(var7);
      } else {
         var8 = null;
      }

      if (var0 == 1400) {
         var3.onClickListener = var8;
      } else if (var0 == 1401) {
         var3.onHoldListener = var8;
      } else if (var0 == 1402) {
         var3.onReleaseListener = var8;
      } else if (var0 == 1403) {
         var3.onMouseOverListener = var8;
      } else if (var0 == 1404) {
         var3.onMouseLeaveListener = var8;
      } else if (var0 == 1405) {
         var3.onDragListener = var8;
      } else if (var0 == 1406) {
         var3.onTargetLeaveListener = var8;
      } else if (var0 == 1407) {
         var3.onVarTransmitListener = var8;
         var3.varTransmitTriggers = var5;
      } else if (var0 == 1408) {
         var3.onTimerListener = var8;
      } else if (var0 == 1409) {
         var3.onOpListener = var8;
      } else if (var0 == 1410) {
         var3.onDragCompleteListener = var8;
      } else if (var0 == 1411) {
         var3.onClickRepeatListener = var8;
      } else if (var0 == 1412) {
         var3.onMouseRepeatListener = var8;
      } else if (var0 == 1414) {
         var3.onInvTransmitListener = var8;
         var3.invTransmitTriggers = var5;
      } else if (var0 == 1415) {
         var3.onStatTransmitListener = var8;
         var3.statTransmitTriggers = var5;
      } else if (var0 == 1416) {
         var3.onTargetEnterListener = var8;
      } else if (var0 == 1417) {
         var3.onScrollWheelListener = var8;
      } else if (var0 == 1418) {
         var3.onChatTransmitListener = var8;
      } else if (var0 == 1419) {
         var3.onKeyListener = var8;
      } else if (var0 == 1420) {
         var3.onFriendTransmitListener = var8;
      } else if (var0 == 1421) {
         var3.onClanTransmitListener = var8;
      } else if (var0 == 1422) {
         var3.onMiscTransmitListener = var8;
      } else if (var0 == 1423) {
         var3.onDialogAbortListener = var8;
      } else if (var0 == 1424) {
         var3.onSubChangeListener = var8;
      } else if (var0 == 1425) {
         var3.onStockTransmitListener = var8;
      } else if (var0 == 1426) {
         var3.onCamFinishedListener = var8;
      } else {
         if (var0 != 1427) {
            return 2;
         }

         var3.onResizeListener = var8;
      }

      var3.hasListener = true;
      return 1;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)Ljava/lang/String;",
      garbageValue = "825066086"
   )
   public static String method1089(String var0) {
      int var1 = var0.length();
      char[] var2 = new char[var1];
      byte var3 = 2;

      for(int var4 = 0; var4 < var1; ++var4) {
         char var5 = var0.charAt(var4);
         if (var3 == 0) {
            var5 = Character.toLowerCase(var5);
         } else if (var3 == 2 || Character.isUpperCase(var5)) {
            char var6;
            if (var5 != 181 && var5 != 131) {
               var6 = Character.toTitleCase(var5);
            } else {
               var6 = var5;
            }

            var5 = var6;
         }

         if (Character.isLetter(var5)) {
            var3 = 0;
         } else if (var5 != '.' && var5 != '?' && var5 != '!') {
            if (Character.isSpaceChar(var5)) {
               if (var3 != 2) {
                  var3 = 1;
               }
            } else {
               var3 = 1;
            }
         } else {
            var3 = 2;
         }

         var2[var4] = var5;
      }

      return new String(var2);
   }
}
