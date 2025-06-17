import javax.microedition.rms.*;
import java.util.Calendar;

public final class SaveFileNTGT {
   private static SaveFileNTGT ntgtAA;
   private static final String RMS_NAME = "SaveFileNTGT";

   public static SaveFileNTGT ntgtAA() {
      if (ntgtAA == null) {
         ntgtAA = new SaveFileNTGT();
      }
      return ntgtAA;
   }

   public final void ntgtAA(String var1, String var2) {
      String var3 = getCurrentDate(); // Format date as "dd-MM-yyyy"
      String recordName = var3 + "_" + var1;

      try {
         RecordStore recordStore = RecordStore.openRecordStore(RMS_NAME, true);
         String fullRecord = recordName + ":" + var2; // Store as "name:data"
         byte[] recordData = fullRecord.getBytes();
         recordStore.addRecord(recordData, 0, recordData.length);
         recordStore.closeRecordStore();
      } catch (RecordStoreException e) {
         e.printStackTrace();
      }
   }

   private String getCurrentDate() {
      Calendar calendar = Calendar.getInstance();
      int day = calendar.get(Calendar.DAY_OF_MONTH);
      int month = calendar.get(Calendar.MONTH) + 1; // Months are 0-based
      int year = calendar.get(Calendar.YEAR);

      return (day < 10 ? "0" + day : String.valueOf(day)) + "-" +
             (month < 10 ? "0" + month : String.valueOf(month)) + "-" +
             year;
   }
}
