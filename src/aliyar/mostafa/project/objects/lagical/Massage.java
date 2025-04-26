package aliyar.mostafa.project.objects.lagical;

public enum Massage {
    WELCOME("به نرم افزار دانشگاه خوش آمدید!"),
    GET_NUMBER_STUDENT("لطفا تعداد دانش پذیران رو مشخص کنید"),
    GET_NUMBER_TEACHER("لطفا تعداد استاد های دانشگاه رو مشخص کنید"),
    CREATE_LESSONS("چه نوع درسی میخواهید تعریف کنید" +
            "1) عمومی " +
            "2) تخصصی کامپیوتر" +
            "3)تخصصی معماری"),
    LINE("----------------------------------------------------------------------------------------------"),
    TITEL_MAIN_MENU("منو اصلی برنامه" +System.lineSeparator()+
            "1)منو امور دانشجویان" +System.lineSeparator()+
            "2) منو امور اساتید" +System.lineSeparator()+
            "3) منو درس ها"+System.lineSeparator()+
            "4) خروج"),
    NEW_LINE(System.lineSeparator()),
    STUDENT_MENU("منو امور دانشجویی " +System.lineSeparator()+
            "1) ثبت نام دانشجو" +System.lineSeparator()+
            "2) اخراج دانشجو" +System.lineSeparator()+
            "3) ویرایش اطلاعات دانشجو" +System.lineSeparator()+
            "4) نمایش لیست دانشجویان" +System.lineSeparator()+
            "0) بازگشت به منو قبل"),
    NO_CAPACITY_STUDENT("ضرفیت برای ایجاد دانشجوی جدید وجود ندارد!"),
    GET_NAME_STUDENT("لطفا نام کامل دانشجو را وارد کنید"),
    GET_COD_MELI_STUDENT("لطفا کد ملی دانشجو را وارد کنید"),
    GET_YEAR_STUDENT("لطفا سال تولد دانشجو را به میلادی وارد کنید"),
    GET_MONTH_STUDENT("لطفا ماه تولد دانشجو را وارد کنید"),
    GET_DAY_STUDENT("لطفا روز تولد دانشجو را وارد کنید"),
    CREATE_STUDENT_DONE("دانشجو با موفقیت ثبت شد!"),

    ;


    private String message;
    Massage(String massage) {
        this.message = massage;
    }
    public String getMessage() {
        return message;
    }
}
