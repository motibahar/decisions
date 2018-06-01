package com.example.decision;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Eden on 01/12/2017.
 */

public class Utils {
  final static public String EXTRA_IS_JOKES = "IS_JOKES";
  final static public String JOKE1 = "השארתי לו רשימת קניות על המקרר\n" +
          "\n" +
          "עוף\n" +
          "\n" +
          "מפה\n" +
          "\n" +
          "שמן\n" +
          "\n" +
          "בטטה\n" +
          "\n" +
          "הוא עזב בלי להגיד מילה\n";
  final static public String JOKE2 = "אמא שלי איימה עלי שאם אעשה עוד טעות אחת היא תמכור אותי.\n" +
          " תקנו אותי אם אני טועה.\n";
  final static public String JOKE3 = "*מתעטש ליד אמא* \n" +
          "מה אתה חולה ? להכין לך מרק עוף ? להכין לך תה ? אולי לא תלך לבית ספר ?\n" +
          "\n" +
          "*מתעטש ליד אבא*\n" +
          "לבריאות אור\n" +
          "אבא אני יהלי...\n";
  final static public String JOKE4 = "איך לזהות עצלנים , חוק מס' 3523622362 :\n" +
          "נכון שהתעצלת לקרוא את המספר ?\n";
  final static public String JOKE5 = "3 אנשים יושבים בבית יולדות.\n" +
          "היולדת יוצאת ואומרת לאחד מזל טוב יש לך 7 תינוקות!\n" +
          "האיש אומר איזה צירוף מקרים אני גר בבאר שבע.\n" +
          "היולדת יוצאת לאיש השני ואומרת מזל טוב יש לך 8 תינוקות!\n" +
          "האיש אומר איזה צירוף מקרים אני גר בקרית שמונה.\n" +
          "היולדת יוצאת לאיש השלישי ורואה אותו בורח במהירות. \n" +
          "היא רצה אחריו ושואלת אותו למה אתה בורח?\n" +
          "האיש עונה לה \"אני גר באלפי מנשה!!!\"\n";
  final static public String JOKE6 = "שיכור ופוזל התנגשו ברחוב ונפלו.\n" +
          "הפוזל: \"אולי תסתכל לאן שאתה הולך?!\"\n" +
          "השיכור: \"אולי תלך לאן שאתה מסתכל?!\"\n";
  final static public String JOKE7 = "שאלה: \"למה כשחסידה עומדת היא מרימה רגל אחת?\"\n" +
          "תשובה: \"כי אם היא תרים את שתי הרגליים, היא תיפול\u0085\" ";
  final static public String JOKE8 = "איך קוראים לרוסי עם שיתוק?\n" +
          "מקס עם מום\n";
  final static public String JOKE9 = "איש אחד שמן יושב מחוץ למעון, יוצאת הגננת ושואלת אותו \"אתה מחכה לילד?\"\n" +
          "השמן משיב \"לא, אני סתם שמן\"\n";
  final static public String JOKE10 = "המורה: מי שחושב שהוא אידיוט שיקום\n" +
          "\n" +
          "דני קם\n" +
          "\n" +
          "המורה: \"דני מדוע אתה חושב שאתה אידיוט?\" \n" +
          "\n" +
          "דני: \"אני לא חושב כך המורה, אבל פשוט לא נעים לי שאת עומדת לבד\"\n";
  final static public String JOKE11 = "משוגע אחד הולך ברחוב עם שתי סיגריות בפה\n" +
          "\n" +
          "פוגש אותו חברו ושואל: \"למה יש לך שתי סיגריות בפה?\" \n" +
          "\n" +
          "עונה המשוגע: \"אחי נכנס לכלא, אז אני מעשן בשבילו.\" \n" +
          "\n" +
          "כעבור זמן רב רואה החבר את המשוגע עם סיגריה אחת בפה. \n" +
          "\n" +
          "אומר החבר: \"מזל טוב! אני רואה שאחיך יצא מהכלא!!!\" \n" +
          "\n" +
          "עונה המשוגע: \"לא, אני הפסקתי לעשן\".\n";
  final static public String JOKE12 = "אחד יושב בחתונה של גרוזינים ואומר לזה שלידו \"יו החתן כל כך מכוער ושעיר\"\n" +
          "\n" +
          "זה שלידו עונה: \"זאת בכלל הכלה, והיא הבת שלי\"\n" +
          "\n" +
          "הוא עונה: \"אני ממש מצטער, לא ידעתי שאתה אבא שלה\"\n" +
          "\n" +
          "אז זה שלידו עונה: \"אני לא אבא שלה, אני אמא שלה\"\n";
  final static public String JOKE13 = "היה היה ילד אחד עם יד אחת קצרה ויד אחת ארוכה\n" +
          "הגיע היום שהילד עלה לכיתה א, הגיע לבית הספר, עלה לכיתה והמורה אמרה לכל הכיתה לא להתייחס ליד הקצרה של הילד. הילד רץ הביתה בוכה ופתאום הוא מוצא מנורה!\n" +
          "מתחיל לשפשף אותה פתאום יוצא ג'יני שאומר לו: בקש שלוש משאלות אבל תחשוב טוב טוב לפני שאתה מבקש!\n" +
          "הילד אומר: הלוואי שהידיים שלי היו באותו אורך!(שתי הידיים נהיו קצרות)הפוך!(הידיים התהפכו) מפגר!בלעלעלעלעלע\n";
  final static public String JOKE14 = "שתי פרות בשדה שוחחו ביניהן. הראשונה: \"שמעת על המחלה החדשה שנקראת הפרה המשוגעת?\"\n" +
          "השנייה: \"כן, איזה מסכנות הפרות האלה.. מזל שאנחנו תנינים...\"\n";
  final static public String JOKE15 = "15";
  final static public String JOKE16 = "16";
  final static public String JOKE17 = "17";
  final static public String JOKE18 = "18";
  final static public String JOKE19 = "19";
  final static public String JOKE20 = "20";
  final static public String JOKE21 = "21";
  final static public String JOKE22 = "22";





  final static public String FACT1 = "באלבמה אסור לשים גביע גלידה בכיס האחורי של המכנסיים.";
  final static public String FACT2 = "50% מכל ההריונות באמריקה הם לא מתוכננים.";
  final static public String FACT3 = "התנ\"ך הוא הספר שנגנב הכי הרבה פעמים מחנויות בהיסטוריה.";
  final static public String FACT4 = "כשאתם מצמידים צדף לאוזן, אתם בעצם שומעים את הדם זורם לכם בורידים, לא את האוקיינוס.";
  final static public String FACT5 = "רק 55% מכלל האמריקאים יודעים שהשמש היא כוכב.";
  final static public String FACT6 = "בהודו יש יותר טלפונים ניידים מאשר בתי שימוש!";
  final static public String FACT7 = "בכל דקה ביום מועלים ליוטיוב סרטונים באורך של עשרים וארבע שעות.";
  final static public String FACT8 = "אישה אומרת בערך 7000 מילים ביום, הגבר אומר בממוצע 2000.";
  final static public String FACT9 = "היפופוטומונסטרוססקויפדליפוביה הוא הפחד ממילים ארוכות.";
  final static public String FACT10 = "הסיכוי שתמות בדרך לקנות כרטיס לוטו הוא יותר גדול מהסיכוי שתזכה בלוטו.";
  final static public String FACT11 = "אם תגעו בלשון בזמן פיהוק, הפיהוק יפסק.";
  final static public String FACT12 = "שאגת האריה נשמעת ממרחק של 7 קילומטרים.";
  final static public String FACT13 = "אנטידאופוביה הוא הפחד שבמקום כל שהו בעולם, יש ברווז שצופה בך.";
  final static public String FACT14 = "2% מהאנשים בעולם הם ג'ינג'ים.";
  final static public String FACT15 = "פנינים נמסות בחומץ.";
  final static public String FACT16 = "הלק הראשון הומצא בסין, בשנת 3000 לפנה\"ס. ";
  final static public String FACT17 = "לשבלול יש כ-5000 שיניים.";
  final static public String FACT18 = "בסינגפור אסור למכור מסטיקים.";
  final static public String FACT19 = "קרוקודיל אינו יכול להוציא לשון.";
  final static public String FACT20 = "אם תתעטש חזק מספיק, אתה יכול לסדוק צלע.";
  final static public String FACT21 = "התנין, אחד הזוחלים האימתניים, כלל לא מסוגל לנוע אחורה.";
  final static public String FACT22 = "פיהוק הוא דבר מדבק – אפילו חשיבה על פיהוק מספיקה.";

  final static public String[] JOKES =
          {JOKE1, JOKE2, JOKE3, JOKE4, JOKE5, JOKE6, JOKE7, JOKE8,
                  JOKE9, JOKE10, JOKE11, JOKE12, JOKE13, JOKE14, JOKE15, JOKE16,
                  JOKE17, JOKE18, JOKE19, JOKE20, JOKE21, JOKE22};


  final static public String[] FACTS =
          {FACT1, FACT2, FACT3, FACT4, FACT5, FACT6, FACT7, FACT8,
                  FACT9, FACT10, FACT11, FACT12, FACT13, FACT14, FACT15, FACT16,
                  FACT17, FACT18, FACT19, FACT20, FACT21, FACT22};
}
