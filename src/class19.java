import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("u")
public class class19 {

   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -1304585155
   )
   static int field167;
   @ObfuscatedName("j")
   static int[][] field162;
   @ObfuscatedName("bk")
   @ObfuscatedSignature(
      signature = "Lla;"
   )
   static class322 field168;
   @ObfuscatedName("cv")
   @ObfuscatedSignature(
      signature = "Lic;"
   )
   static class249 field169;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 562997841
   )
   final int field163;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 1184023187
   )
   final int field160;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 707908647
   )
   final int field165;


   class19(int var1, int var2, int var3) {
      this.field163 = var1;
      this.field160 = var2;
      this.field165 = var3;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(Ldu;I)V",
      garbageValue = "217117259"
   )
   static final void method222(class105 var0) {
      var0.field1409 = false;
      if(var0.field1408 != null) {
         var0.field1408.field1440 = 0;
      }

      for(class105 var1 = var0.vmethod4421(); var1 != null; var1 = var0.vmethod4422()) {
         method222(var1);
      }

   }

   @ObfuscatedName("fa")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1362629320"
   )
   static void method221(int var0) {
      if(var0 == -3) {
         class102.method2307("Connection timed out.", "Please try using a different world.", "");
      } else if(var0 == -2) {
         class102.method2307("", "Error connecting to server.", "");
      } else if(var0 == -1) {
         class102.method2307("No response from server.", "Please try using a different world.", "");
      } else if(var0 == 3) {
         class78.field1135 = 3;
      } else if(var0 == 4) {
         class102.method2307("Your account has been disabled.", "Please check your message-centre for details.", "");
      } else if(var0 == 5) {
         class102.method2307("Your account has not logged out from its last", "session or the server is too busy right now.", "Please try again in a few minutes.");
      } else if(var0 == 6) {
         class102.method2307("RuneScape has been updated!", "Please reload this page.", "");
      } else if(var0 == 7) {
         class102.method2307("This world is full.", "Please use a different world.", "");
      } else if(var0 == 8) {
         class102.method2307("Unable to connect.", "Login server offline.", "");
      } else if(var0 == 9) {
         class102.method2307("Login limit exceeded.", "Too many connections from your address.", "");
      } else if(var0 == 10) {
         class102.method2307("Unable to connect.", "Bad session id.", "");
      } else if(var0 == 11) {
         class102.method2307("We suspect someone knows your password.", "Press \'change your password\' on front page.", "");
      } else if(var0 == 12) {
         class102.method2307("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
      } else if(var0 == 13) {
         class102.method2307("Could not complete login.", "Please try using a different world.", "");
      } else if(var0 == 14) {
         class102.method2307("The server is being updated.", "Please wait 1 minute and try again.", "");
      } else if(var0 == 16) {
         class102.method2307("Too many login attempts.", "Please wait a few minutes before trying again.", "");
      } else if(var0 == 17) {
         class102.method2307("You are standing in a members-only area.", "To play on this world move to a free area first", "");
      } else if(var0 == 18) {
         class102.method2307("Account locked as we suspect it has been stolen.", "Press \'recover a locked account\' on front page.", "");
      } else if(var0 == 19) {
         class102.method2307("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
      } else if(var0 == 20) {
         class102.method2307("Invalid loginserver requested.", "Please try using a different world.", "");
      } else if(var0 == 22) {
         class102.method2307("Malformed login packet.", "Please try again.", "");
      } else if(var0 == 23) {
         class102.method2307("No reply from loginserver.", "Please wait 1 minute and try again.", "");
      } else if(var0 == 24) {
         class102.method2307("Error loading your profile.", "Please contact customer support.", "");
      } else if(var0 == 25) {
         class102.method2307("Unexpected loginserver response.", "Please try using a different world.", "");
      } else if(var0 == 26) {
         class102.method2307("This computers address has been blocked", "as it was used to break our rules.", "");
      } else if(var0 == 27) {
         class102.method2307("", "Service unavailable.", "");
      } else if(var0 == 31) {
         class102.method2307("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
      } else if(var0 == 32) {
         class102.method2307("Your attempt to log into your account was", "unsuccessful.  Don\'t worry, you can sort", "this out by visiting the billing system.");
      } else if(var0 == 37) {
         class102.method2307("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
      } else if(var0 == 38) {
         class102.method2307("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
      } else if(var0 == 55) {
         class78.field1135 = 8;
      } else {
         if(var0 == 56) {
            class102.method2307("Enter the 6-digit code generated by your", "authenticator app.", "");
            class102.method2310(11);
            return;
         }

         if(var0 == 57) {
            class102.method2307("The code you entered was incorrect.", "Please try again.", "");
            class102.method2310(11);
            return;
         }

         if(var0 == 61) {
            class78.field1135 = 7;
         } else {
            class102.method2307("Unexpected server response", "Please try using a different world.", "");
         }
      }

      class102.method2310(10);
   }

   @ObfuscatedName("jx")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-611935095"
   )
   static boolean method220() {
      return client.field669 || class39.field340[81];
   }
}
