package com.example.wordle;

import java.util.ArrayList;
import java.util.Random;

public class HebWords {

    ArrayList words;
    String chosenWord;
    int size;
    public HebWords()
    {
        words = new ArrayList();
        words.add("ישראל");
        words.add("אנחנו");
        words.add("אנשים");
        words.add("עבודה");
        words.add("ילדים");
        words.add("הייתה");
        words.add("אתרים");
        words.add("חדשות");
        words.add("שונים");
        words.add("עכשיו");
        words.add("מדובר");
        words.add("אחרים");
        words.add("ראשון");
        words.add("שימוש");
        words.add("מערכת");
        words.add("שירות");
        words.add("דברים");
        words.add("עדיין");
        words.add("עיצוב");
        words.add("בצורה");
        words.add("אפילו");
        words.add("צילום");
        words.add("הייתי");
        words.add("חיפוש");
        words.add("רוצים");
        words.add("למרות");
        words.add("תגובה");
        words.add("חברות");
        words.add("טיפול");
        words.add("חדשים");
        words.add("שאלות");
        words.add("גבוהה");
        words.add("חשבון");
        words.add("יכולה");
        words.add("אודות");
        words.add("אותנו");
        words.add("פעולה");
        words.add("כתובת");
        words.add("שונות");
        words.add("גדולה");
        words.add("ביטוח");
        words.add("תוכלו");
        words.add("ניהול");
        words.add("עריכה");
        words.add("ספרים");
        words.add("עושים");
        words.add("עסקים");
        words.add("בניית");
        words.add("מגוון");
        words.add("מומלץ");
        words.add("אחרות");
        words.add("אישית");
        words.add("פעמים");
        words.add("יהודה");
        words.add("דווקא");
        words.add("תהליך");
        words.add("לקראת");
        words.add("פרטים");
        words.add("מיוחד");
        words.add("משפחה");
        words.add("פורסם");
        words.add("מתאים");
        words.add("פרסום");
        words.add("סיפור");
        words.add("שינוי");
        words.add("נוספת");
        words.add("מספיק");
        words.add("שלושה");
        words.add("קידום");
        words.add("הכנסת");
        words.add("כניסה");
        words.add("ספורט");
        words.add("איכות");
        words.add("למעלה");
        words.add("מישהו");
        words.add("מסלול");
        words.add("טובים");
        words.add("נסיעה");
        words.add("תרבות");
        words.add("חברים");
        words.add("עניין");
        words.add("צריכה");
        words.add("ייעוץ");
        words.add("תמונה");
        words.add("יצירת");
        words.add("קטנים");
        words.add("עליהם");
        words.add("אירוע");
        words.add("מקצוע");
        words.add("וידאו");
        words.add("לעומת");
        words.add("תרגום");
        words.add("אצלנו");
        words.add("חינוך");
        words.add("יהודי");
        words.add("פיתוח");
        words.add("לאומי");
        words.add("שקלים");
        words.add("מעולה");
        words.add("מדינת");
        words.add("משחקי");
        words.add("עורכי");
        words.add("תשלום");
        words.add("הודעה");
        words.add("שיווק");
        words.add("תגיות");
        words.add("אהבתי");
        words.add("מילים");
        words.add("מוצרי");
        words.add("לגמרי");
        words.add("שיתוף");
        words.add("שניתן");
        words.add("רשימת");
        words.add("קבוצת");
        words.add("הפנים");
        words.add("חדרים");
        words.add("דירות");
        words.add("בעיות");
        words.add("דרכים");
        words.add("מהווה");
        words.add("תקווה");
        words.add("חולים");
        words.add("עלינו");
        words.add("אלינו");
        words.add("אברהם");
        words.add("השאלה");
        words.add("ארגון");
        words.add("טלפון");
        words.add("הרשמה");
        words.add("מלחמת");
        words.add("רואים");
        words.add("עשרות");
        words.add("משתמש");
        words.add("אישור");
        words.add("תיקון");
        words.add("ביצוע");
        words.add("לימוד");
        words.add("יודעת");
        words.add("הולדת");
        words.add("היינו");
        words.add("אוהבת");
        words.add("יחסית");
        words.add("עברית");
        words.add("ניתוח");
        words.add("יכולת");
        words.add("תכנית");
        words.add("ייתכן");
        words.add("כיוון");
        words.add("שלישי");
        words.add("רפואי");
        words.add("כתבות");
        words.add("הליכה");
        words.add("מדינה");
        words.add("סרטים");
        words.add("אוויר");
        words.add("ארצות");
        words.add("כרטיס");
        words.add("לבנות");
        words.add("מדהים");
        words.add("אומרת");
        words.add("תפריט");
        words.add("עריכת");
        words.add("פורום");
        words.add("מצווה");
        words.add("שיעור");
        words.add("תמיכה");
        words.add("טיפים");
        words.add("שירים");
        words.add("הגיעו");
        words.add("מאפשר");
        words.add("מתחיל");
        words.add("פתרון");
        words.add("נמצאת");
        words.add("מדריך");
        words.add("קיימת");
        words.add("הורים");
        words.add("אתמול");
        words.add("קישור");
        words.add("ישירה");
        words.add("השכרת");
        words.add("גברים");
        words.add("לשעבר");
        words.add("ניווט");
        words.add("מסוים");
        words.add("תחומי");
        words.add("תקופה");
        words.add("טובות");
        words.add("תשובה");
        words.add("ארוחת");
        words.add("מאוחר");
        words.add("ראיתי");
        words.add("לוקחת");
        words.add("קבוצה");
        words.add("מושלם");
        words.add("אמנות");
        words.add("נכונה");
        words.add("תכנון");
        words.add("מרכזי");
        words.add("ביטוי");
        words.add("כולנו");
        words.add("קריאה");
        words.add("שמואל");
        words.add("קטנות");
        words.add("תביעה");
        words.add("כוחות");
        words.add("הרשות");
        words.add("תקופת");
        words.add("בדיקת");
        words.add("מקווה");
        words.add("הביתה");
        words.add("החלטה");
        words.add("צבעים");
        words.add("ראשית");
        words.add("מומחה");
        words.add("שולחן");
        words.add("מיקום");
        words.add("תנאים");
        words.add("שליטה");
        words.add("אליהם");
        words.add("ציבור");
        words.add("הערות");
        words.add("הוצאת");
        words.add("רפואה");
        words.add("תוכנה");
        words.add("פרטית");
        words.add("תאריך");
        words.add("כתיבת");
        words.add("איתנו");
        words.add("משפטי");
        words.add("שמונה");
        words.add("ארוכה");
        words.add("חמישי");
        words.add("תפקיד");
        words.add("ארבעה");
        words.add("נתניה");
        words.add("הדירה");
        words.add("בעלות");
        words.add("פתיחת");
        words.add("אפשרי");
        words.add("ניקוי");
        words.add("ישיבה");
        words.add("פרחים");
        words.add("הבנתי");
        words.add("כלשהו");
        words.add("חוויה");
        words.add("שילוב");
        words.add("תצוגה");
        words.add("מניות");
        words.add("כוללת");
        words.add("אופנה");
        words.add("תושבי");
        words.add("רציתי");
        words.add("המטרה");
        words.add("רישום");
        words.add("עבודת");
        words.add("לחיים");
        words.add("קפיצה");
        words.add("תנועה");
        words.add("מעלות");
        words.add("בלילה");
        words.add("מאמין");
        words.add("תזונה");
        words.add("מכירה");
        words.add("אשדוד");
        words.add("אימון");
        words.add("כללית");
        words.add("יוכלו");
        words.add("יצירה");
        words.add("ערכים");
        words.add("מהירה");
        words.add("קניון");
        words.add("מרגיש");
        words.add("הכנסה");
        words.add("קדימה");
        words.add("אמרתי");
        words.add("מטרים");
        words.add("רעיון");
        words.add("הצעות");
        words.add("מצליח");
        words.add("הגיעה");
        words.add("פגיעה");
        words.add("פשוטה");
        words.add("מוקדם");
        words.add("הריון");
        words.add("אליכם");
        words.add("רכישת");
        words.add("חייבת");
        words.add("טיסות");
        words.add("אחסון");
        words.add("עצמית");
        words.add("הרכבת");
        words.add("מצוין");
        words.add("ביטול");
        words.add("מציעה");
        words.add("הנשים");
        words.add("חושבת");
        words.add("רשתות");
        words.add("למידה");
        words.add("פרסמו");
        words.add("חשבתי");
        words.add("עליכם");
        words.add("מגזין");
        words.add("הצלחה");
        words.add("חשובה");
        words.add("בנייה");
        words.add("דניאל");
        words.add("ברורה");
        words.add("ליווי");
        words.add("נקודת");
        words.add("מלחמה");
        words.add("ביקור");
        words.add("בדיקה");
        words.add("הצליח");
        words.add("חיבור");
        words.add("מצרים");
        words.add("ביולי");
        words.add("אליהו");
        words.add("מכשיר");
        words.add("חומרי");
        words.add("הסדרה");
        words.add("חופשי");
        words.add("פתאום");
        words.add("רביעי");
        words.add("שמעון");
        words.add("חברתי");
        words.add("בניין");
        words.add("הגישה");
        words.add("מצאתי");
        words.add("תמצאו");
        words.add("איננו");
        words.add("מנהלת");
        words.add("ממוקם");
        words.add("תוספת");
        words.add("משפחת");
        words.add("משלוח");
        words.add("הדרכה");
        words.add("ספרות");
        words.add("הוספת");
        words.add("אירוח");
        words.add("ייצור");
        words.add("יחסים");
        words.add("העברת");
        words.add("התחבר");
        words.add("מחלקת");
        words.add("בחירת");
        words.add("אמצעי");
        words.add("נמוכה");
        words.add("מקרים");
        words.add("התחיל");
        words.add("הורדה");
        words.add("תחילת");
        words.add("תינוק");
        words.add("עובדת");
        words.add("עובדי");
        words.add("סיכוי");
        words.add("אריאל");
        words.add("תשומת");
        words.add("מסכים");
        words.add("משותף");
        words.add("הזמנת");
        words.add("שיחות");
        words.add("אשראי");
        words.add("שיכול");
        words.add("מתקדם");
        words.add("בחירה");
        words.add("מתנות");
        words.add("חולון");
        words.add("חלקים");
        words.add("המלצה");
        words.add("השפעה");
        words.add("מגיעה");
        words.add("יתרון");
        words.add("הצהרת");
        words.add("חמישה");
        words.add("הוראה");
        words.add("הנהלת");
        words.add("יוצאת");
        words.add("חתונה");
        words.add("אלבום");
        words.add("נתוני");
        words.add("זוגות");
        words.add("להקים");
        words.add("תחושה");
        words.add("תעודת");
        words.add("החליט");
        words.add("כתיבה");
        words.add("מורכב");
        words.add("תקנון");
        words.add("נמצאו");
        words.add("תחושת");
        words.add("איפור");
        words.add("מופיע");
        words.add("ממשלת");
        words.add("מסחרי");
        words.add("הירשם");
        words.add("כלכלי");
        words.add("הצעיר");
        words.add("הכלים");
        words.add("מועצת");
        words.add("מיכאל");
        words.add("מקסים");
        words.add("שניים");
        words.add("תיאור");
        words.add("פורטל");
        words.add("קריית");
        words.add("אחראי");
        words.add("השקעה");
        words.add("ממשיך");
        words.add("אבטחה");
        words.add("עומדת");
        words.add("הבאות");
        words.add("שנייה");
        words.add("כספים");
        words.add("נכסים");
        words.add("רעננה");
        words.add("שיפור");
        words.add("הזמנה");
        words.add("מרבית");
        words.add("תנועת");
        words.add("הוצאה");
        words.add("ירקות");
        words.add("תחרות");
        words.add("מרדכי");
        words.add("הולכת");
        words.add("ידעתי");
        words.add("מתמחה");
        words.add("רשומה");
        words.add("בטוחה");
        words.add("סיכון");
        words.add("לוחות");
        words.add("הכתבה");
        words.add("רגילה");
        words.add("סיכום");
        words.add("מחירי");
        words.add("מספקת");
        words.add("דיווח");
        words.add("תאורה");
        words.add("ירידה");
        words.add("רוסיה");
        words.add("קיבוץ");
        words.add("איסור");
        words.add("מבוסס");
        words.add("דומים");
        words.add("ציטוט");
        words.add("הבהרה");
        words.add("נהיגה");
        words.add("דלתות");
        words.add("כניסת");
        words.add("עצמאי");
        words.add("שאולי");
        words.add("קניות");
        words.add("סגנון");
        words.add("זמנים");
        words.add("נעימה");
        words.add("כלשהי");
        words.add("שיטות");
        words.add("מימון");
        words.add("סוגים");
        words.add("החלטת");
        words.add("ממוצע");
        words.add("אחריו");
        words.add("שניות");
        words.add("הוסיף");
        words.add("משרדי");
        words.add("מתכון");
        words.add("עדכון");
        words.add("ברכות");
        words.add("פלילי");
        words.add("מנסים");
        words.add("מזכיר");
        words.add("בילוי");
        words.add("גבינה");
        words.add("מסוגל");
        words.add("מצוות");
        words.add("נוחות");
        words.add("בגדים");
        words.add("עשויה");
        words.add("שמירה");
        words.add("התאמה");
        words.add("סיבות");
        words.add("לענות");
        words.add("בחורה");
        words.add("האדמה");
        words.add("משתנה");
        words.add("פתיחה");
        words.add("השיטה");
        words.add("מסביר");
        words.add("תקציב");
        words.add("תכנים");
        words.add("עשיתי");
        words.add("סרטון");
        words.add("מחשבה");
        words.add("תקבלו");
        words.add("עולים");
        words.add("עליון");
        words.add("קיבלו");
        words.add("חובבן");
        words.add("הצהרה");
        words.add("עלייה");
        words.add("השראה");
        words.add("מחזור");
        words.add("ממליץ");
        words.add("קראתי");
        words.add("לפיכך");
        words.add("לילות");
        words.add("מילוי");
        words.add("הגעתי");
        words.add("נקודה");
        words.add("צפייה");
        words.add("עיסוק");
        words.add("עמותת");
        words.add("מלווה");
        words.add("חופשה");
        words.add("שניהם");
        words.add("נבחרת");
        words.add("מבנים");
        words.add("רשימה");
        words.add("מצאתם");
        words.add("עצמנו");
        words.add("עיסוי");
        words.add("שלושת");
        words.add("רוחני");
        words.add("גידול");
        words.add("ייחוס");
        words.add("עיתון");
        words.add("יהדות");
        words.add("נראית");
        words.add("דירוג");
        words.add("מסעדה");
        words.add("חייהם");
        words.add("ידיים");
        words.add("אזרחי");
        words.add("איראן");
        words.add("הקטנה");
        words.add("העסקה");
        words.add("גילוי");
        words.add("ערבים");
        words.add("יהושע");
        words.add("שמעתי");
        words.add("עישון");
        words.add("ראיון");
        words.add("מכונת");
        words.add("עלולה");
        words.add("תחילה");
        words.add("מוביל");
        words.add("בישול");
        words.add("חכמים");
        words.add("עבירה");
        words.add("החלפת");
        words.add("מוצלח");
        words.add("מנהלי");
        words.add("חשיבה");
        words.add("איננה");
        words.add("כלכלה");
        words.add("קיבלה");
        words.add("צעירה");
        words.add("הגענו");
        words.add("מורים");
        words.add("אמונה");
        words.add("חירום");
        words.add("מקבלת");
        words.add("עסקית");
        words.add("מסיבת");
        words.add("תמורת");
        words.add("נהדרת");
        words.add("כותרת");
        words.add("הקבלה");
        words.add("ינואר");
        words.add("הדפסה");
        words.add("מכירת");
        words.add("שדרות");
        words.add("ישיבת");
        words.add("קצרים");
        words.add("חוזרת");
        words.add("מיועד");
        words.add("חנוכה");
        words.add("הדגשת");
        words.add("מסתבר");
        words.add("המראה");
        words.add("שיפוץ");
        words.add("מטרות");
        words.add("סקירה");
        words.add("מופעל");
        words.add("מזרחי");
        words.add("הלכות");
        words.add("רציני");
        words.add("תלמיד");
        words.add("טענות");
        words.add("תקנות");
        words.add("לחיצה");
        words.add("זמנית");
        words.add("החנות");
        words.add("כיסוי");
        words.add("כתבתי");
        words.add("במדבר");
        words.add("לימון");
        words.add("פועלת");
        words.add("כלבים");
        words.add("תוצרת");
        words.add("מוגבל");
        words.add("תחנות");
        words.add("כפתור");
        words.add("נשימה");
        words.add("אפריל");
        words.add("השעות");
        words.add("גלילה");
        words.add("פנימי");
        words.add("הפוכה");
        words.add("הפעלה");
        words.add("אינני");
        words.add("חודשי");
        words.add("דצמבר");
        words.add("הסעות");
        words.add("אישום");
        words.add("מקומי");
        words.add("שערים");
        words.add("מסגרת");
        words.add("טיפוח");
        words.add("ריהוט");
        words.add("פיקוד");
        words.add("רכישה");
        words.add("תעופה");
        words.add("מצחיק");
        words.add("קורות");
        words.add("דוגמה");
        words.add("הודיע");
        words.add("עצמכם");
        words.add("גלריה");
        words.add("ממשלה");
        words.add("ביצים");
        words.add("טבעית");
        words.add("פיצוי");
        words.add("לבסוף");
        words.add("דבריו");
        words.add("רכבים");
        words.add("בשורה");
        words.add("מספרת");
        words.add("פינוי");
        words.add("קבצים");
        words.add("הצטרף");
        words.add("חרדים");
        words.add("עשרים");
        words.add("המתנה");
        words.add("תרומה");
        words.add("איגוד");
        words.add("דילוג");
        words.add("מיידי");
        words.add("מרשים");
        words.add("זולים");
        words.add("פגישה");
        words.add("אהרון");
        words.add("לבנים");
        words.add("שמלות");
        words.add("מוחלט");
        words.add("בצורת");
        words.add("אמורה");
        words.add("תמונת");
        words.add("חיינו");
        words.add("תוצאה");
        words.add("יציאה");
        words.add("הערכה");
        words.add("חקירה");
        words.add("מוסמך");
        words.add("עילית");
        words.add("הכשרה");
        words.add("חשמלי");
        words.add("יקרים");
        words.add("ליאור");
        words.add("מדויק");
        words.add("כביסה");
        words.add("עובדה");
        words.add("מלאים");
        words.add("העשרה");
        words.add("תחליף");
        words.add("קריאת");
        words.add("מחייב");
        words.add("פרקים");
        words.add("הכירו");
        words.add("אחרון");
        words.add("מיטות");
        words.add("צפיות");
        words.add("פנימה");
        words.add("מבינה");
        words.add("מקורי");
        words.add("קהילה");
        words.add("חשיפה");
        words.add("יחידת");
        words.add("מסיבה");
        words.add("קולות");
        words.add("קרנות");
        words.add("נותנת");
        words.add("הופכת");
        words.add("עליהן");
        words.add("סביבה");
        words.add("המשיך");
        words.add("נראים");
        words.add("חווית");
        words.add("הסכמה");
        words.add("מיזוג");
        words.add("שווים");
        words.add("הוקמה");
        words.add("תחתון");
        words.add("סגירת");
        words.add("משטרה");
        words.add("השיחה");
        words.add("הטענה");
        words.add("התקנת");
        words.add("קונים");
        words.add("מובנה");
        words.add("מחזיק");
        words.add("ריבית");
        words.add("מפתיע");
        words.add("קומות");
        words.add("הבנות");
        words.add("פירוש");
        words.add("ענקית");
        words.add("אמנים");
        words.add("מסוכן");
        words.add("חלוקת");
        words.add("שיקול");
        words.add("טכנית");
        words.add("קהילת");
        words.add("טכנאי");
        words.add("בסיסי");
        words.add("עיבוד");
        words.add("נציגי");
        words.add("מוכנה");
        words.add("עוגות");
        words.add("מפלגת");
        words.add("ראינו");
        words.add("סליחה");
        words.add("נשלחה");
        words.add("ערעור");
        words.add("תבנית");
        words.add("עקיבא");
        words.add("למדתי");
        words.add("בוטיק");
        words.add("מחפשת");
        words.add("מוסיף");
        words.add("רגשות");
        words.add("יוקרה");
        words.add("לבנון");
        words.add("מרפסת");
        words.add("קשרים");
        words.add("קטלוג");
        words.add("שידור");
        words.add("הפסקת");
        words.add("תופעה");
        words.add("ספקים");
        words.add("תיקים");
        words.add("צעדים");
        words.add("הפסקה");
        words.add("מחכים");
        words.add("מוכרת");
        words.add("תפוחי");
        words.add("בעיית");
        words.add("ציונה");
        words.add("רכיבה");
        words.add("חלקית");
        words.add("יחידה");
        words.add("ראיות");
        words.add("תאונת");
        words.add("הערים");
        words.add("תעזור");
        words.add("משאבי");
        words.add("פניות");
        words.add("אלפים");
        words.add("ראובן");
        words.add("ממרכז");
        words.add("סימני");
        words.add("מצלמה");
        words.add("יונתן");
        words.add("ירוקה");
        words.add("מצבים");
        words.add("חומות");
        words.add("ערבית");
        words.add("בדיון");
        words.add("איטום");
        words.add("מרוצה");
        words.add("כוסות");
        words.add("עמוקה");
        words.add("מילות");
        words.add("מסעדת");
        words.add("משפיע");
        words.add("פורים");
        words.add("עוסקת");
        words.add("פיקוח");
        words.add("שפירא");
        words.add("עבורך");
        words.add("זיהוי");
        words.add("חידוש");
        words.add("צפויה");
        words.add("קניין");
        words.add("חוקים");
        words.add("הסביר");
        words.add("כשרות");
        words.add("מתוקה");
        words.add("משימה");
        words.add("אבנים");
        words.add("מועצה");
        words.add("מעורב");
        words.add("פיזית");
        words.add("שמחים");
        words.add("ברקוד");
        words.add("יסודי");
        words.add("פתוחה");
        words.add("ארוחה");
        words.add("חיובי");
        words.add("נתחיל");
        words.add("מעורר");
        words.add("הוזמן");
        words.add("מעניק");
        words.add("כאבים");
        words.add("הגדרה");
        words.add("הפרשה");
        words.add("אגודת");
        words.add("חימום");
        words.add("צרכים");
        words.add("חומצה");
        words.add("שורות");
        words.add("פעילה");
        words.add("שחייה");
        words.add("תפילה");
        words.add("אבחון");
        words.add("ניתנה");
        words.add("אזורי");
        words.add("הרצאה");
        words.add("ישנים");
        words.add("הובלה");
        words.add("דורון");
        words.add("מבוגר");
        words.add("מיתוג");
        words.add("מקובל");
        words.add("חבילת");
        words.add("מעריב");
        words.add("ברירה");
        words.add("הודעת");
        words.add("חובות");
        words.add("יישום");
        words.add("לאותו");
        words.add("עבורו");
        words.add("סמכות");
        words.add("נחשבת");
        words.add("בקשות");
        words.add("אשכול");
        words.add("צריכת");
        words.add("מחברת");
        words.add("מורשת");
        words.add("שאלתי");
        words.add("שלטון");
        words.add("חטיבת");
        words.add("דרישה");
        words.add("לוואי");
        words.add("אבטחת");
        words.add("האפשר");
        words.add("יוצרת");
        words.add("סוריה");
        words.add("קירות");
        words.add("שתיים");
        words.add("הגייה");
        words.add("כותבת");
        words.add("הרחבה");
        words.add("מותאם");
        words.add("תאגיד");
        this.size =this.words.size();
        Random rnd = new Random();
        int index = rnd.nextInt(this.size);
        this.chosenWord = (String)this.words.get(index).toString().toUpperCase();
    }
    public Boolean isWordReal(String word)
    {
        return words.contains(word.toLowerCase());
    }
    public int GetSize()
    {
        return this.size;
    }
    public String GetChosenWord()
    {
        return this.chosenWord;
    }
}