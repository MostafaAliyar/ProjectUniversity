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
    NO_CAPACITY_TEACHER("ضرفیت برای ایجاد استاد جدید وجود ندارد!"),
    GET_NAME_STUDENT("لطفا نام کامل دانشجو را وارد کنید"),
    GET_COD_MELI_PERSON("لطفا کد ملی مخاطب را وارد کنید"),
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
    GET_DAY_TEACHER("لطفا روز تولد استاد را وارد کنید"),
    ERROR_404_PERSON("مخاطب یافت نشد دوباره سعی کنید!"),
    PERSON_MENU_DU("با اسفاده از کدام ویژگی میخواهید برای مخاطب عملیات انجام دهید" +
            System.lineSeparator()+"1) کد ملی" +
            System.lineSeparator()+ "2) نام مخاطب" +
            System.lineSeparator()+ "0)بازگشت"),
    DELETE_PERSON("مخاطب با موفقیت حذف شد!"),
    UPDATE_PERSON("اطلاعات مخاطب با موفقیت تغیر کرد!"),
    CREATE_TEACHER_DONE("استاد با موفقیت ثبت نام شد!"),
    LESSONS_MENU("منو امور دروس " +System.lineSeparator()+
            "1) ایجاد درس" +System.lineSeparator()+
            "2) حذف درس" +System.lineSeparator()+
            "3) ویرایش اطلاعات درس" +System.lineSeparator()+
            "4) نمایش لیست دروس" +System.lineSeparator()+
            "0) بازگشت به منو قبل"),
    GET_NUMBER_LESSON("چند درس برای این ترم میخواهید ارائه دهید"),
    LESSONS_SELECT_TITLE_MENU("زیر دسته کدام درس میخواهید کلاس ایجاد کنید؟" + System.lineSeparator() +
            "1) دروس عمومی" + System.lineSeparator() +
            "2) دروس تخصصی کامپیوتر" + System.lineSeparator() +
            "3)دروس تخصصی معماری" + System.lineSeparator()+
            "0)بازکشت به منو قبلی"),
    NO_CAPACITY_LESSON("ضرفیت برای ایجاد درس جدید به پایان رسیده است."),
    GET_NAME_LESSON("لطفا نام در را به صورت کامل بنویسد."),
    CREATE_LESSON_DONE("درس با موفقیت اضافه شد."),
    ERROR_404_LESSON("درسی با این نام یافت نشد!"),
    LESSONS_SELECT_UPDATE_MENU("منو تغیرات درس :" + System.lineSeparator() +
            "1) تعریف درس برای استاد" + System.lineSeparator() +
            "2) مدیریت ضرفیت کلاس" + System.lineSeparator() +
            "0)بازکشت به منو قبلی");



    private String message;
    Massage(String massage) {
        this.message = massage;
    }
    public String getMessage() {
        return message;
    }
}
