package aliyar.mostafa.project.objects.view;

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
    TEACHER_MENU("منو امور اساتید" + System.lineSeparator()+
            "1) ثبت اطلاعات استاد" +System.lineSeparator()+
            "2) حذف استاد" +System.lineSeparator()+
            "3) ویرایش اطلاعات استاد" +System.lineSeparator()+
            "4) نمایش لیست اساتید" +System.lineSeparator()+
            "0) بازگشت"),
    ERROR_INPUT("اطلاعات وارد شده اشتباه است دوباره سعی کنید!"),
    TITEL_CREATE_TEACHER("به صفحه ساخت استاد خوش آمدید !")
    , GET_NAME_TEACHER("لطفا نام استاد را به صورت کامل وارد کنید؟"),
    GET_COD_MELI_TEACHER("لطفا کد ملی استاد را وارد کنید"),
    GET_YEAR_TEACHER("لطفا سال تولد استاد را به میلادی وارد کنید"),
    GET_MONTH_TEACHER("لطفا ماه تولد استاد را وارد کنید"),
    GET_DAY_TEACHER("لطفا روز تولد استاد را وارد کنید"), ERROR_404_STUDENT("دانشجو یافت نشد دوباره سعی کنید!"),
    STUDENT_MENU_DU("با اسفاده از کدام ویژگی میخواهید برای دانشجو عملیات انجام دهید" +
            System.lineSeparator()+"1) کد ملی" +
            System.lineSeparator()+ "2) نام دانشجو" +
            System.lineSeparator()+ "0)بازگشت"), DELETE_STUDENT("دانشجو با موفقیت حذف شد!"), UPDATE_STUDENT("اطلاعات دانشجو با موفقیت تغیر کرد!");


    private String message;
    Massage(String massage) {
        this.message = massage;
    }
    public String getMessage() {
        return message;
    }
}
