import java.util.Calendar;
import java.util.TimeZone;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gp")
public class class192 {

   @ObfuscatedName("w")
   public static final String[][] field2417 = new String[][]{{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez"}};
   @ObfuscatedName("m")
   public static final String[] field2414 = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
   @ObfuscatedName("q")
   public static Calendar field2418;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "[Llh;"
   )
   static class317[] field2416;
   @ObfuscatedName("n")
   static int[] field2413;
   @ObfuscatedName("is")
   @ObfuscatedGetter(
      intValue = 1298828229
   )
   static int field2415;


   static {
      Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
      field2418 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
   }
}
